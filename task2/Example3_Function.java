package lesson150922;

public class Example3_Function {
	
		// ������������ ���������� sin
		static double sin_appr(double x) {
			return x-x*x*x/6; 
		}
		
		// ������������ ���������� cos
		public static double cos_appr(double x) {
			return 1-x*x/2; 
		}	
	
}
