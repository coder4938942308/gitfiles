package qa.com.java.strings;

public class StringMain {

	
	
	public static void main(String args[]) {
		
		
		String str1 =  "hello how are you";
		
		System.out.println("number of words in this string: "+ StringUtil.countWords(str1)+ "\n"); // string to array of each word
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------"+"\n");
		String[] Strings =   { "abc_gmail.com", "abcd*()@gmail.com", "abcd@gmail.com", "test_123@gmail.com", "1234@#$@gmail.com"};
		
		System.out.println("number of invalid emails " + StringUtil.invalidEmails(Strings)+ "\n");
		System.out.println("number of valid emails " + (Strings.length -StringUtil.invalidEmails(Strings))+ "\n");
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------"+"\n");
		
		StringUtil.validEmailsPrint(Strings);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------"+"\n");
		
		StringUtil.invalidEmailsPrint(Strings);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------"+"\n");
	}
	
	
	
		
	}

