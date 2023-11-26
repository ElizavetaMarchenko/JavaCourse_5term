
public class Main {
    public static void main(String[] args) {
        //String - class with properties: 1)final (cannot have child ); 2)immutable (objects cannot be changed after creation)
        //String contains in package java.lang
        System.out.printf("Create string s1 = 'Hello world'\n\n");
        String s1 = "Hello world";

        //method 'length'
        System.out.printf("Method 'length' returns number of elements in string (int) \nApply method 'length' for string s1\n");
        int length=s1.length();
        System.out.println("Length of s1: " +length + "\n\n");

        //method 'equals'
        System.out.printf("Create string s2 = 'Hello world'\n");
        System.out.printf("Create string s3 = 'Hello world!'\n");
        String s2 = "Hello world";
        String s3 = "Hello world!";
        System.out.printf("Method 'equals' takes string, returns true or false \n");
        boolean a = s1.equals(s2);
        boolean b = s1.equals(s3);
        System.out.println("s1 = s2: " +a);
        System.out.println("s1 = s3: " +b + "\n\n");

        // method 'charAt'
        System.out.printf("Method 'charAt' takes int, returns element in string with given number (char) \n");
        System.out.println("Fifth element of string s1: " +s1.charAt(5-1) + "\n\n");

        // method 'indexOf'
        System.out.printf("Method 'indexOf' takes char, returns number of given element in string (int) \n");
        System.out.println("First element that == 'l' in s1: " +s1.indexOf('e'));
        System.out.println("Element that == 's' in s1: " +s1.indexOf('s'));
        System.out.println("Returns -1 because there is no 's' in s1 \n\n");

        // method 'contains'
        System.out.printf("Method 'contains' takes string, checks for availability and returns true or false \n");
        System.out.printf("Create string s4 = 'one two three four five'\n");
        System.out.printf("Create string s5 = 'three'\n");
        System.out.printf("Create string s6 = 'six'\n");
        String s4 = "one two three four five";
        String s5 = "three";
        String s6 = "six";
        System.out.println("Check if there is s5 in s4: " +s4.contains(s5));
        System.out.println("Check if there is s6 in s4: " +s4.contains(s6) + "\n\n");

        //method 'substring'
        System.out.printf("Method 'substring' takes int numbers, returns necessary part of string \n");
        System.out.println("Return 'world' from s1: " +s1.substring(6,11));
        System.out.println("Return 'world' from s1 (another variant): " +s1.substring(6) + "\n\n");

        //method 'replace'
        System.out.printf("Method 'replace' takes string, returns new string with changed part \n");
        System.out.println("Change 'Hello' to 'Hi' in s1: " +s1.replace("Hello", "Hi") + "\n\n");

        //method 'getBytes'
        System.out.printf("Method 'getBytes' takes string, returns encoded string in bytes  \n");
        System.out.println("Encoded string s1 in bytes: " +s1.getBytes() + "\n\n");

        //method 'compareTo'
        System.out.printf("Method 'compareTo' takes two string, returns 0 if the argument is a string lexically equal to the given string; less than 0 if the argument is a string lexically larger than the string being compared; and a value greater than 0 if the argument is a string lexically less than this string. \n");
        System.out.printf("Create string s7 = 'Hello'\n");
        String s7 = "Hello";
        System.out.println("s2 is a string lexically equal to s1: " +s1.compareTo(s2));
        System.out.println("s3 is a string lexically larger than s1: " +s1.compareTo(s3));
        System.out.println("s7 is a string lexically less than s1: " +s1.compareTo(s7) + "\n\n");

        //method 'concat'
        System.out.printf("Method 'concat' takes array (string), returns new array (string) that contains of two ones  \n");
        System.out.printf("Create string s8 = ' How are you? '\n");
        String s8 = " How are you? ";
        System.out.println("s1+s8: " +s1.concat(s8) + "\n\n");

        //method 'indent'
        System.out.printf("Method 'indent' takes int number of spaces, returns string with n spaces  \n");
        System.out.println(" " +s1.indent(10) + "\n");

        //method 'trim'
        System.out.printf("Method 'trim' takes string with spaces in the beginning/at the end, returns string without spaces  \n");
        System.out.printf("Create string s9 = '   Hello!     '\n");
        String s9 = "   Hello!     ";
        System.out.println("s9 without spaces: " +s9.trim() + "\n\n");

        //method 'repeat'
        System.out.printf("Method 'repeat' takes string, returns string whose value is the concatenation of given string repeated count times  \n");
        System.out.printf("Create string s10 = 'Hello! '\n");
        String s10 = "Hello! ";
        System.out.println("Repeat s10 three times: " +s10.repeat(3) + "\n\n");

        //method 'toString'
        System.out.printf("Method 'toString' takes int, returns string representing the value of this int  \n");
        System.out.printf("Create int x = 151\n");
        Integer x = 151;
        System.out.println("String representing the value of this s11: " +x.toString() + "\n\n");
    }
}