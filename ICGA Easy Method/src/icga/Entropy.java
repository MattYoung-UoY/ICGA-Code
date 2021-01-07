package icga;

public class Entropy {

	public static float jointH(float[][] table) {
		float res = 0;
		for(float[] arr: table) for(float p: arr) if(p > 0 && p <= 1) res += p * log2(p);
		return -res;
	}
	
	private static float log2(float N) {
		return (float) (Math.log(N) / Math.log(2));
	}
	
}
