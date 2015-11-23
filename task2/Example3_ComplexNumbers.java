package lesson150922;

public class Example3_ComplexNumbers extends Example3_Function{

		double[] complex_number;
		
		Example3_ComplexNumbers(double x,double y) {
			complex_number = new double[] {x,y};
		}
		
		
		void print(){
			System.out.println("("+complex_number[0]+" "+complex_number[1]+")");
		}
		
		// Нахождение суммы двух комплексных чисел
		public static Example3_ComplexNumbers complex_sum(Example3_ComplexNumbers z1, Example3_ComplexNumbers z2) {
			return new Example3_ComplexNumbers(z1.complex_number[0]+z2.complex_number[0],z1.complex_number[1]+z2.complex_number[1]);
		}
		
		// Комплексная экспонента, создаваемая на основе функций приближенного вычисления sin и cos, 
		// наследуемых из класса Example3_Function
		public static Example3_ComplexNumbers complex_exp(double x) {
			return new Example3_ComplexNumbers(cos_appr(x),sin_appr(x));
		}
	}
