import java.util.*;

public class Question_4 {
    public static void Swap_using_temp(int first,int second){
        int temp = first;
        first = second;
        second = temp;
        System.out.println("The First number is: " + first);
        System.out.println("The Second number is: " + second);
    }
    public static void Swap_without_using_temp(int first,int second){
        first = first+second;
        second = first-second;
        first = first-second;
        System.out.println("The First number is: " + first);
        System.out.println("The Second number is: " + second);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter Second number: ");
        int second = sc.nextInt();

        System.out.println("Enter 0 to swap using Temporary variable and 1 without Temporary variable: ");
        

        int input = sc.nextInt();
        if(input==0){
            Swap_using_temp(first, second);
        }else{
            Swap_without_using_temp(first, second);
        }
        
    }
}
