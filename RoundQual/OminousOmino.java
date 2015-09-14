import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class OminousOmino {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File(args[0]);
		Scanner sc = new Scanner(f);

		int testCases;
		int cases=0;
		if(sc.hasNextLine()){
			testCases = Integer.parseInt(sc.nextLine());
		}

		while(sc.hasNextLine()){
			cases++;
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			
			int dimension = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int lower,higher;
			if(x<y){
				lower=x;
				higher=y;
			}else{
				lower=y;
				higher=x;
			}
			String winner="";
			String w1 = "GABRIEL";
			String w2 = "RICHARD";
			if((lower*higher)%dimension==0){
				if(higher>=dimension&&lower>=dimension-1){
					winner=w1;
				}else{
					winner=w2;
				}

				
			}else{
				winner=w2;
			}
			System.out.println("Case #"+cases+": "+winner);
		}

	}	



	

}
