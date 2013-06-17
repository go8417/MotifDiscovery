

public class MotifDiscovery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] dataSeqs = DataIO.ReadDataSp(Res.drFiles);
		double profile[][] = Meme.EM(5, dataSeqs);
		for(double[] profileLine: profile) System.out.println(profileLine.toString());
	}
 }
