import java.util.Date;

public class CheckGC {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Total JVM Memory: " + rt.totalMemory());
		
		Date d = null;
		
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 10000; i++) {
				d = new Date();
				d = null;
			}
			
			System.out.println("After Memory = " + rt.freeMemory());
			
			rt.gc();
			
			System.out.println("After GC Memory = " + rt.freeMemory());
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
}