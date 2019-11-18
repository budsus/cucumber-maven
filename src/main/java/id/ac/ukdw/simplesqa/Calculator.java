package id.ac.ukdw.simplesqa;

/**
 *
 * @author budsus
 */
public class Calculator {
    public int add(int i, int j) {
        return i + j;
    }

    public int divide(int i, int j) {
        if(j==0)
            return 0;
        int i1 = i / j;
        return i1;
    }

    public int multiple(int i, int j) {
        return i * j;
    }    
}
