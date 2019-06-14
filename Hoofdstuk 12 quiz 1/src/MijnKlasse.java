// adjusted indentations - leon
public class MijnKlasse {
	final int x = 3;

	int berekenen(int y, int z) {
		if(y >= z) {
			return y + x;
		}
		else {
			return z + x;
		}
	}
	public static void main(String[]args)
	{
		MijnKlasse mk = new MijnKlasse();
		System.out.println(mk.berekenen(4, 6));
	}
}
