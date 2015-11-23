package lesson150922;

public class Example3_Function {
	
		// Приближенное вычисление sin
		static double sin_appr(double x) {
			return x-x*x*x/6; 
		}
		
		// Приближенное вычисление cos
		public static double cos_appr(double x) {
			return 1-x*x/2; 
		}	
	
}
