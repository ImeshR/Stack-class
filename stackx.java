public class stackx {
    private int maxsize;
    private int top;
    private double[] stackArr;

    //Constructor
    public stackx(int x) {
        top = -1;
        maxsize = x;
        stackArr = new double[maxsize];
    }

    // Insert ELement to stack
    public void push(double x) {
        if (isFull()) {
            System.exit(1);
        } else {
            stackArr[++top] = x;
        }
    }

    // Remove element from stack
    public double pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            System.exit(1);
            return -99;

        } else {
            return stackArr[top--];
        }
    }

    // get first element from stack
    public double peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            System.exit(1);
            return -99;
        } else {
            return stackArr[top];
        }
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public Boolean isFull() {
        return top == maxsize - 1;
    }

    public static void main(String[] arg) {
        stackx stack = new stackx(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
    }

}
