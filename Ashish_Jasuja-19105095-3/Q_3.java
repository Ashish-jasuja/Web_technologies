import java.util.*;
public class Q_3 {
public static void main(String args[]) {
	String[] str = {"Pratik" , "Shivam" , "Bhavuk" , "Sahil"};  //Input Array Of Strings
	for(int i =0; i<str.length; i++) {
		for(int j =i+1 ; j< str.length; j++) {
			if(str[i].compareTo(str[j]) > 0) {
				String temp = str[i];
				str[i] = str[j];
				str[j] = temp;
			}
		}
	}
	System.out.println(Arrays.toString(str));
}
}