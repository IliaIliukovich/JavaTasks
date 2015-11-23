package lesson150922;


public class Example3_Construction_main {
	public static void main(String[] args) {
		
		double x = 0.3;
		
		// Приближенное вычисление sin и cos
		System.out.println(Example3_Function.sin_appr(x));
		System.out.println(Example3_Function.cos_appr(x));
		
		// Создание и вывод на экран двух комплексных чисел
		Example3_ComplexNumbers z1 = new Example3_ComplexNumbers(1,2);
		Example3_ComplexNumbers z2 = new Example3_ComplexNumbers(3,4);
		z1.print();
		z2.print();
		
		// Вывод на экран суммы двух комплексных чисел
		Example3_ComplexNumbers z3 = Example3_ComplexNumbers.complex_sum(z1, z2);
		z3.print();
		
		// Нахождение комплексной экспоненты от x
		Example3_ComplexNumbers z4 = Example3_ComplexNumbers.complex_exp(x);
		z4.print();
		
	}
}
