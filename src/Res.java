import java.util.Hashtable;


public class Res {
	static String[] drFiles = {"dm01r", "dm02r", "dm03r", "dm04r", "dm05r", "dm06r"};
	static String extensionOfFile = ".fasta";
	static String filePath = "Real\\";
	static char[] bases = {'A','T','G','C'};
	static Hashtable<Character, Integer> basesMap;
	
	public static void PutBasesVal(){
		basesMap = new Hashtable<Character, Integer>();
		for(int i = 0; i< bases.length; i++) basesMap.put(bases[i], i);
	}
}
