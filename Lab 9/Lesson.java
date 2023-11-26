public class Lesson {
    private String name;
    private int number;

    public Lesson (String name, int num) {
        this.name = name;
        this.number = num;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        System.out.println("Number of the lesson '" + name + "' is "  + number);
        return number;
    }

    public void setNumber(int age) {
        this.number = age;
    }
}