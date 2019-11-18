package id.ac.ukdw.simplesqa;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

/**
 *
 * @author budsus
 */
public class CalculatorSteps {
private Calculator calc;
    private int result, resfinal;
    private List<List<String>> board;
    private String tombol;

    @When("^Saya lakukan (\\d+) kali (\\d+)$")
    public void sayaLakukanKali(int a, int b) {
        result = calc.multiple(a, b);
    }

    @Then("hasilnya adalah {int}")
    public void hasilnyaAdalah(int c) {
        Assert.assertEquals("Hasil operasi: ", result, c);
    }

    @When("Saya lakukan {int} dibagi {int}")
    public void sayaLakukanDibagi(int a, int b) {
        result = calc.divide(a,b);
    }

    @Given("sebuah kalkulator yang baru dihidupkan")
    public void sebuahKalkulatorYangBaruDihidupkan() {
        calc = new Calculator();
    }

    @Given("beberapa operasi awal:")
    public void beberapaOperasiAwal(DataTable table) {
        this.board = table.asLists();
        result = 0;
        for(int i=1; i < board.size(); i++) {
            List<String> row = board.get(i);
            int first = Integer.parseInt(row.get(0));
            int second = Integer.parseInt(row.get(1));
            if (row.get(2).equals("+")) {
                result += calc.add(first, second);
            }
        }
    }

    @And("Saya tekan (.)$")
    public void sayaTekan(String tombol) {
        resfinal = result;
    }

    @Then("hasil akhir adalah {int}")
    public void hasilAkhirAdalahC(int c) {
        Assert.assertEquals("Hasil operasi: ", resfinal, c);
    }

    @When("Saya tekan {string} lalu tekan {int}")
    public void sayaTekanXLaluTekanA(String tombol, int a) {
        if (tombol.equals("x")) {
            result = calc.multiple(result, a);
        } else if (tombol.equals("/")) {
            result = calc.divide(result, a);
        }
    }    
}
