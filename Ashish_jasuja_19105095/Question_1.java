import java.util.*;


public class Question_1{
    public static int addition(int first,int second){
        return first+second;
    }
    public static int subtraction(int first,int second){
        return first-second;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();
        int add = addition(first,second);
        System.out.println("Addition of two number is : " + add);
        int sub = subtraction(first,second);
        System.out.println("Subtraction of two number is : "+ sub);
    }
}