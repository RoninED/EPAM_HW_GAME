import creatures.utils.AbstractCreature;
import creatures.utils.DataOfCreatures;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        BigInteger bigInt = BigInteger.valueOf(1);
        ByteArrayInputStream in = new ByteArrayInputStream(bigInt.toByteArray());
        System.setIn(in);

        Integer s = new Scanner(System.in).nextInt();

        System.out.println(s);


    }
}
