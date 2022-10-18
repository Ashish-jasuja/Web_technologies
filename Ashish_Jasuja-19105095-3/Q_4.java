import java.util.*;
public class Q_4 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	while(num!= 1) {
	if(num%2 ==0) {
		num /=2;
	}
	else {
		num = 3*num +1;
	}
	System.out.println(num);
	}	
}
}