package assignment;

public final class KlasseEen extends KlasseTwee {
	final int i = x + 5;

	KlasseEen() {
		System.out.print(i);
		calculateFinal();
	}
	
	//EXCEPTION: can't be executed because int is final
	void calculateFinal() {
		// remove this comment i += 5;
	}
}
