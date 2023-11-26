class Class {
    private int value;

    public Class(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


public class exercise_7 {
    public static void main(String[] args) {

        Class Cl1 = new Class(1);
        Class Cl2 = new Class(2);

        System.out.println("До обмена значениями:");
        System.out.println(Cl1.getValue());
        System.out.println(Cl2.getValue());

        swap_values(Cl1, Cl2);

        System.out.println("Применили swap_values:");
        System.out.println(Cl1.getValue());
        System.out.println(Cl2.getValue());
    }

    public static void swap_values(Class a, Class b) {
        int tmp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(tmp);
    }
}

