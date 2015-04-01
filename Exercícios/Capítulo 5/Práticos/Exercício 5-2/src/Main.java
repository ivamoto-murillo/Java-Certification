public class Main {

	public static void main(String[] args) {
		int idade = 3;
		
		outer:
			while (idade <= 21) {
				idade++;
				
				if ((idade - 1) == 16) {
					System.out.println("16 anos: informe a carteira de motorista!");
					
					continue outer;
				}

				System.out.println("Outra idade.");
			}
	}

}
