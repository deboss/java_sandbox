package sandbox.java.lang;

public class TestTheStringReferenceEquality {
	
	private static final String TEST1 = "test";
	private static final String TEST2 = "test";
	
	public static void main(String[] args) {
				
		areStringVariablesReferencesEqualAndHaveSameHashCode();
		areStringFinalStaticReferencesEqual();
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
		System.out.println("TEST1 == TEST2 => " + (TEST1 == TEST2));
		
	}
}
