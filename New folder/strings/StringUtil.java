package qa.com.java.strings;

public class StringUtil {



	static int countWords(String phrase) {
		return phrase.split(" ").length;		
	}

	public static int invalidEmails(String[] array) {

		int invalid = 0;

		for (String word: array) {
			if (word.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$"))  {
				
			}else {
				invalid++;
			}
		}

		return invalid;
	}
	
	public static void validEmailsPrint(String[] array) {

		

		for (String word: array) {
			if (word.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$"))  {
				System.out.println("valid:" + word + "\n");
			}
		}

	}
	
public static void invalidEmailsPrint(String[] array) {

		

		for (String word: array) {
			if (!word.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$"))  {
				System.out.println("invalid: " + word + "\n");
			}
		}

	}
}


