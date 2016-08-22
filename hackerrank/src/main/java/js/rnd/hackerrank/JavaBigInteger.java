package js.rnd.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Hello world!
 *
 */
public class JavaBigInteger {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in1 = br.readLine();
        String in2 = br.readLine();

        BigInteger a = new BigInteger(in1);
        BigInteger b = new BigInteger(in2);

        System.out.println(a.add(b).toString());
        System.out.println(a.multiply(b).toString());
    }
}
