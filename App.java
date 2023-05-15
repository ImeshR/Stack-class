import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        int size;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of array : ");
        size = sc.nextInt();

        Stack obj = new Stack(size);
        
        for(int i = 0 ; i < size; i++){
            int num;
            System.out.println("Enter number :");
            num = sc.nextInt();

            obj.push(num);
        }

        for (int i = 0 ; i < size; i++){
            System.out.println(obj.pop());
        }
    }

}
