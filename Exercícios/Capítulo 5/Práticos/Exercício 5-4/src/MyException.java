public class MyException {

	public static void main(String[] args) {
		try {
			checkFood("Chocolate");
		} catch (BadFoodException e) {
			System.out.println("Alimento meio bosta identificado!!!");
		}
	}
	
	public static void checkFood(String food) throws BadFoodException {
		if (food.equals("Abacate")) {
			throw new BadFoodException();
		} else {
			System.out.println("Alimento top da balada!!!");
		}
	}
	
}
