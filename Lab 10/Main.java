public class Main {
    public static void main(String[] args) {
        try {
            Triple<Double> triple = new Triple<Double>(1.7, 5.0, -16.8);
            System.out.println( triple.getFirst() + ", " + triple.getSecond() + ", " + triple.getThird());
            System.out.println("Min: " + triple.min());
            System.out.println("Max: " + triple.max());
            System.out.println("Mean: " + triple.mean());
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
        System.out.println("\n");

        try {
            Triple<String> triple = new Triple<String>("A", "B", "C");
            System.out.println( triple.getFirst() + ", " + triple.getSecond() + ", " + triple.getThird());
            System.out.println("Min: " + triple.min());
            System.out.println("Max: " + triple.max());
            System.out.println("Mean: " + triple.mean());
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
    };
};