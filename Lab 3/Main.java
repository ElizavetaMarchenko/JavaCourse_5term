public class Main {
    public static void main(String[] args) {
        int min = 50;
        int max = 100;
        int[]arr = new int[5];
        arr[0] = 51;
        arr[1] = 40;
        arr[2] = 69;
        arr[3] = 101;
        arr[4] = 55;
        int x = 51;

        //example with !
        System.out.println("Print number, if it is larger than previous");
        for (int i = 0; i < 5; i++) {
            if (!(arr[i] < x)) {
                System.out.println(arr[i]);
                x = arr[i];
            }
        }

        for (int i = 0; i < 5; i++) {

            //example with &&
            if(min < arr[i] && arr[i] < max){
                System.out.println("Number " + arr[i] + " belongs to range 50-100");
            }

            //example with ||
           if(min > arr[i] || arr[i] > max){
                System.out.println("Number " + arr[i] + " is not in range 50-100");
            }

        }

        //example with x < y ? x : y
        System.out.println("Reset to zero all negative numbers:");
        int[]arr2 = new int[5];
        arr2[0] = -5;
        arr2[1] = 10;
        arr2[2] = -69;
        arr2[3] = -7;
        arr2[4] = 55;
        for (int i = 0; i < 5; i++) {
            System.out.println("Was: " + arr2[i]);
            arr2[i] = arr2[i] < 0 ? 0 : arr2[i];
            System.out.println("Became: " + arr2[i]);
        }


        //example with & | ^ ~
        int a = 10;
        int b = 25;
        int c = -10;
        int res1 = a & b;
        int res2 = a | b;
        int res3 = a ^ b;
        int res4 = ~a;
        int res5 = ~c;
        System.out.println("a = 10 = " + Integer.toBinaryString(a));
        System.out.println("b = 25 = " + Integer.toBinaryString(b));
        System.out.println("c = -10 = " + Integer.toBinaryString(c));
        System.out.println("a & b = " + res1 + " because  1010 & 11001 = " + Integer.toBinaryString(res1) + " = 8");
        System.out.println("a | b = " + res2 + " because  1010 | 11001 = " + Integer.toBinaryString(res2) + " = 27");
        System.out.println("a ^ b = " + res3 + " because  1010 ^ 11001 = " + Integer.toBinaryString(res3) + " = 19");

        System.out.println("~a = " + res4 + " because a = " + Integer.toBinaryString(a) + ", ~a = " + Integer.toBinaryString(res4) + " = -11");
        System.out.println("~c = " + res5 + " because c = " + Integer.toBinaryString(c) + ", ~c = " + Integer.toBinaryString(res5) + " = 9");


        //example with  >> << >>>
        int r = 125;
        System.out.println("r = 125 = " + Integer.toBinaryString(r));
        int res6 = r<<1;
        int res7 = r<<2;
        int res8 = r<<3;
        System.out.println("r << 1 = " + res6 + " because  r = " + Integer.toBinaryString(r) + " r<<1 = " + Integer.toBinaryString(res6) + " = 250");
        System.out.println("r << 2 = " + res7 + " because  r = " + Integer.toBinaryString(r) + " r<<2 = " + Integer.toBinaryString(res7) + " = 500");
        System.out.println("r << 3 = " + res8 + " because  r = " + Integer.toBinaryString(r) + " r<<3 = " + Integer.toBinaryString(res8) + " = 1000");
        int s = -125;
        int res9 = r>>2;
        int res10 = s>>2;
        System.out.println("r >> 2 = " + res9 + " because  r =  125 =" + Integer.toBinaryString(r) + " r>>2 = " + Integer.toBinaryString(res9) + " = 31");
        System.out.println("s >> 2 = " + res10 + " because  s = -125 =" + Integer.toBinaryString(s) + " s>>2 = " + Integer.toBinaryString(res10) + " = -32");
        int res11 = r>>>2;
        int res12 = s>>>2;
        System.out.println("r >>> 2 = " + res11 + " because  r = 125 = " + Integer.toBinaryString(r) + " r>>>2 = " + Integer.toBinaryString(res11) + " = 31");
        System.out.println("s >>> 2 = " + res12 + " because  s = -125 = " + Integer.toBinaryString(s) + " s>>>2 = " + Integer.toBinaryString(res12) + " = 1073741792");
    }
}