package lesson150922;


public class Example3_Construction_main {
	public static void main(String[] args) {
		
		double x = 0.3;
		
		// ������������ ���������� sin � cos
		System.out.println(Example3_Function.sin_appr(x));
		System.out.println(Example3_Function.cos_appr(x));
		
		// �������� � ����� �� ����� ���� ����������� �����
		Example3_ComplexNumbers z1 = new Example3_ComplexNumbers(1,2);
		Example3_ComplexNumbers z2 = new Example3_ComplexNumbers(3,4);
		z1.print();
		z2.print();
		
		// ����� �� ����� ����� ���� ����������� �����
		Example3_ComplexNumbers z3 = Example3_ComplexNumbers.complex_sum(z1, z2);
		z3.print();
		
		// ���������� ����������� ���������� �� x
		Example3_ComplexNumbers z4 = Example3_ComplexNumbers.complex_exp(x);
		z4.print();
		
	}
}
