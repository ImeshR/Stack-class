class Stack{
    
    private int top;
    private int maxsize;
    private int[] stackArray;

    Stack(int s){
        top = -1;
        maxsize = s;
        stackArray  = new int[maxsize];
    }

    //insert data 
    public void push(int x){
        if(isFull()){
            System.out.println("Array Is Full");
        }else{
            stackArray[++top] = x;
        }
    }

    //remove 
    public int pop(){
        if(isEmpty()){
            System.out.println("Array is Empty");
        }
        return stackArray[top--];
        
    }

    //peek 
    public int peek(){
        if(isEmpty()){
            System.out.println("Array is empty");
        }
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == (maxsize - 1));
    }

}