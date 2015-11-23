package lesson150922;

public class Example7_Variation {

	static class House {
		
		static void build(){}
		
	}
	
	static class EnglishHouse extends House {
		
		static void build_with_garden() {
			build();
			makegarden();
		}

		static void makegarden() {}
		
	}
}
