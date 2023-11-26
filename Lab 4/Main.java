public class Main {
    public static void main(String[] args) {
        System.out.print("Types that can be used with switch:\n");


        System.out.print("1) Char: ");
        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("TRUE!");
                break;
            case 'B':
                System.out.println("FALSE!");
                break;
            default:
                System.out.println("Choose another answer!");
                break;
        }


        System.out.print("2) String: ");
        String day = "Cactus";
        switch (day) {
            case "Cactus":
                System.out.println("Cactus");
                break;
            case "Palm":
                System.out.println("Palm");
                break;
            case "Coco":
                System.out.println("Coco");
                break;
            default:
                System.out.println("Choose another answer!");
        }


        System.out.print("3) Int: ");
        int valI = 1;
        switch (valI) {
            case 1:
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
            default:
                System.out.println("Choose another answer!");
                break;
        }


        System.out.print("4) Short: ");
        short valS = 2;
        switch (valS) {
            case 1:
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
            default:
                System.out.println("Choose another answer!");
                break;
        }


        System.out.print("5) Byte: ");
        byte valB = 3;
        switch (valB) {
            case 1:
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
            default:
                System.out.println("Choose another answer!");
                break;
        }


        System.out.print("6) Enum: ");
        School c;
        c = School.math;
        switch (c) {
            case biology:
                System.out.println("You choose biology!");
                break;
            case math:
                System.out.println("You choose biology!");
                break;
            case geography:
                System.out.println("You choose biology!");
                break;
            default:
                System.out.println("Choose another answer!");
                break;
        }
    }
}
enum School {
    biology,
    math,
    geography;
}

