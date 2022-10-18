public class Q_1{
public static int stringCompare(String s1 , String s2) {
	for(int i =0 ; i<s1.length() && i<s2.length(); i++) {
		if((int)s1.charAt(i) == (int)s2.charAt(i)) {
			continue;
		}
		else {
			return (int)s1.charAt(i)  - (int)s2.charAt(i);
		}
	}
	
	if(s1.length() != s2.length()) {
		return s1.length() - s2.length();
	}
	else {
	return 0;
	}
}
	
public static void main(String args[]) {
	String first = "Ashish";           //Input First String

	String second = "AshishJasuja";      //Input Second String
	System.out.println(stringCompare(first , second));
}
}