public class Datatypes {
    static void main() {
        // Numeric Datatype -> byte short int long
        byte num1 = 120;
        System.out.println(120);
        short num2 = 13270;
        System.out.println(num2);
        int num3 = 50000000;
        System.out.println(num3);
        long num4 = 500000000;
        System.out.println(num4);

        // Floating DTs
        float num5 = 1.232324f; // 6 Digit precision after that it round off
        System.out.println(num5);
        double num6 = 1.2323332323232; // 15 digit precision after that it round off
        System.out.println(num6);

        // Boolean
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue);
        System.out.println(isFalse);

        // Char
        char Alphabet = 'a';
        System.out.println("My first character "+(char)(Alphabet+2));

        // Typecasting -> Implicit -> small datatype value in big -> happen itself
        byte smallDtype = 127;
        long bigDtype = smallDtype + 10000;
        System.out.println(smallDtype);
        System.out.println(bigDtype);
        // Explicit -> big datatype value in small -> condition 1 -> it fit nicely
        // condition 2 -> it not fit -> dataloss

        byte notFit = (byte)bigDtype;
        System.out.println(notFit);


    }
}
