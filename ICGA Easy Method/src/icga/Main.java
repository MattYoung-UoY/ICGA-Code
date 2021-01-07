package icga;

public class Main {

	public static void main(String[] args) {
		float[][] pxy = {
				{((float) 1/8), ((float) 1/16), ((float) 1/32), ((float) 1/32)},
				{((float) 1/16), ((float) 1/8), ((float) 1/32), ((float) 1/32)},
				{((float) 1/16), ((float) 1/16), ((float) 1/16), ((float) 1/16)},
				{((float) 1/4), 0, 0, 0},
		};
		
		System.out.println(Entropy.jointH(pxy));
	}
	
}
