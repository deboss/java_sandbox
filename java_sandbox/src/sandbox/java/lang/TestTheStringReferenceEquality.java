package sandbox.java.lang;

public class TestTheStringReferenceEquality {
	
	private static final String STR1 = "test";
	private static final String STR2 = "test";
	
	public static void main(String[] args) {
				
		areStringVariablesReferencesEqualAndHaveSameHashCode();
		areStringFinalStaticReferencesEqual();
		areLongStringsCachedAsWell();
		whatIsTheHashCodeOfAString();
		
		whatHappensDuringConcatenation();
	}


	private static void whatHappensDuringConcatenation() {
		String result = "" + "" + " " + "";
	}


	private static void whatIsTheHashCodeOfAString() {
		System.out.println("Hash code of \"\" => " + "".hashCode());
		System.out.println("Hash code of \"1\" => " + "1".hashCode());
		System.out.println("Hash code of \"X1\" => " + "X1".hashCode());
	}


	private static void areStringVariablesReferencesEqualAndHaveSameHashCode() {
		String str1 = "test";
		String str2 = "test";
		String str3 = new String("test");
		
		System.out.println("str1 = \"test\" => " + str1.hashCode());
		System.out.println("str2 = \"test\" => " + str2.hashCode());
		System.out.println("str3 = new String(\"test\") => " + str3.hashCode());
		
		System.out.println("str1 == str2 => " + (str1 == str2));
		System.out.println("str1 == str3 => " + (str1 == str3));
		
		System.out.println("str1.intern() == str2.intern() => " + (str1.intern() == str2.intern()));
		System.out.println("str1 == str2.intern() => " + (str1 == str2.intern()));
	}

	private static void areStringFinalStaticReferencesEqual() {
		System.out.println("TEST1 == TEST2 => " + (STR1 == STR2));
	}

	private static void areLongStringsCachedAsWell() {
		String str1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";
		String str2 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";

		System.out.println("str1 == str2 => " + (str1 == str2));
		System.out.println("str1.hashCode() => " + str1.hashCode());
	}
}
