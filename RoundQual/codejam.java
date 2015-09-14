import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class StandingOvation {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File(args[0]);
		Scanner sc = new Scanner(f);
		int maxShy;
		int needed=0;
		while(sc.hasNextLine()){
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			maxShy=Integer.parseInt(st.nextToken());
			String temp = st.nextToken();
			for(int i=0;i<maxShy;i++){
				if(Integer.parseInt(temp.charAt(i)+"")==0){
					needed++;
				}
			}
		}

	}

}
