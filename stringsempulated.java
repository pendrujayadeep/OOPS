package myjava;

public class stringsempulated {

	public static void main(String[] args) {
		String s1="jayadeep";
		String s2="jayadeep";
		System.out.println(s1==s2);
		
		s1=s1+"reddy";
		System.out.println(s1==s2);
		
		String s3="jayadeepreddy";
		
		
		System.out.println(s1==s3);
		


	}

}
