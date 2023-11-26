class Stack {
    private int[] arr;
    private int last;
    private int stack_size;

    public Stack(int size) {
        arr = new int[size];
        stack_size = size;
        last = -1;
    }

    public void push(int x) {
        if (overflow()) {
            System.out.println("Unpossible! Overflow. Cannot add element\n");
            System.exit(-1);
        }

        System.out.println("Insert: " + x);
        arr[++last] = x;
    }

    private boolean overflow() {
        return last == stack_size - 1;
    }

    public int pop() {
        if (!isEmpty()) {
            System.out.println("Delete: " + arr[last]);
            return arr[last--];
        }
        else {
            System.out.println("Unpossible! No elements");
            return -1;
        }
    }

    private boolean isEmpty() {
        return last == -1;
    }

    public int size() {
        return last + 1;
    }

    public int last_elem() {
        if (!isEmpty()) {
            return arr[last];
        }
        else {
            System.exit(-1);
            return -1;
        }
    }
}

class exercise_6 {
    public static void main (String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.pop();
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Find out stack size: " + stack.size());
        stack.push(4);
        stack.push(5);
        //stack.push(6); //exeption and exit
        System.out.println("Find out last element: " + stack.last_elem());
    }
}