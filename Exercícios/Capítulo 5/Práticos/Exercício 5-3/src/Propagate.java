public class Propagate {

	public static void main(String[] args) {
		try {
			System.out.println(reverse("Palavras"));
			System.out.println(reverse(""));
		} catch (Exception e) {
			System.out.println("EXCEÇÃO -> " + e.getMessage());
		} finally {
			System.out.println("EXECUÇÃO CONCLUÍDA!!!");
		}
	}
	
	public static String reverse(String reverter) throws Exception {
		if (reverter.length() == 0) {
			throw new Exception("Exceção lançada!!!");
		}
		
		String reverseStr = "";
		
		for (int i = reverter.length() - 1; i >= 0; --i) {
			reverseStr += reverter.charAt(i);
		}
		
		return reverseStr;
	}

}
