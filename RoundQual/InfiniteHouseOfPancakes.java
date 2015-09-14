import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;


public class InfiniteHouseOfPancakes {

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
			int startUsers = Integer.parseInt(sc.nextLine());
			if(sc.hasNextLine()){
				int minutes=0, maxPancakes=0;
				StringTokenizer st = new StringTokenizer(sc.nextLine());
				ArrayList<Integer> pancakesList = new ArrayList<Integer>();
				while(st.hasMoreTokens()){
					int temp = Integer.parseInt(st.nextToken());
					pancakesList.add(temp);
				}
				
				Collections.sort(pancakesList,Collections.reverseOrder());
				int highest = pancakesList.get(0);
				int maxHighest = highest;
				int maxTimes = highest/2;
				int times = 0;
				boolean cont=true;

				while(times<maxTimes&&cont){


					if(pancakesList.size()>=maxTimes){
						if(pancakesList.get(maxTimes-1)==highest)
							cont=false;
					}
					if(cont==true){
						pancakesList.remove(0);
						pancakesList.add(highest/2);
						pancakesList.add(highest-highest/2);
						Collections.sort(pancakesList,Collections.reverseOrder());
						times++;
						highest=pancakesList.get(0);
						maxTimes = highest/2;
					}

				}
				if(highest+times<=maxHighest){
					minutes+=highest+times;
				}else{
					minutes=maxHighest;
				}
				System.out.println("Case #"+cases+": "+minutes);
			}
		}
	}
}
