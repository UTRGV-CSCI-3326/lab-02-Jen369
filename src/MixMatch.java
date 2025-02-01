public class MixMatch {

    public static void main(String[] args) {
        // The 8 variables of different data types
        String varString = "Hello, Java!";
        char varChar = 'A';
        short varShort = 100;
        int varInt = 214748;
        long varLong = 9223372L;
        float varFloat = 3.14f;
        double varDouble = 2.718281;
        boolean varBoolean = true;

        // Description of the data type
        System.out.println(varString + " <- String, stores a sequence of characters");
        System.out.println(varChar + " <- char, stores a single character");
        System.out.println(varShort + " <- short, stores whole numbers");
        System.out.println(varInt + " <- int, stores whole numbers");
        System.out.println(varLong + " <- long, stores whole numbers");
        System.out.println(varFloat + " <- float, stores fractional numbers up to 6-7 decimal digits");
        System.out.println(varDouble + " <- double, stores fractional numbers up to 15 decimal digits");
        System.out.println(varBoolean + " <- boolean, stores true or false values");

        // Single print method
        System.out.println("Multiple variables: " + varString + ", " + varChar + ", " + varShort + ", " + varInt + ", " + varLong + ", " + varFloat + ", " + varDouble + ", " + varBoolean);
    }
}