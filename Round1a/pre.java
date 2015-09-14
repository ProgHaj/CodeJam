import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.LinkedList;


public class pre{
	public pre(String[] args) throws FileNotFoundException{
		File f = new File(args[0]);
		Scanner sc = new Scanner(f);
		
		
		int cases=0;
		if(sc.hasNextLine()){
			sc.nextLine();
		}
		while(sc.hasNextLine()){
			cases++;
			sc.nextLine();
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			LinkedList<Integer> temp = new LinkedList<Integer>();
			while(st.hasMoreTokens()){
				temp.add(Integer.parseInt(st.nextToken()));
			}
			int previous=0;
			int current=0;
			int times=0;
			int eaten=0;
			int plated=0;
			int highest=0;
			int secondHighest=0;
			for(int i:temp){

				if(i<previous){
					eaten+=previous-i;
					plated=previous-i;
				}else if(i>previous){
					
				}	
				
				times++;
				
				if(previous>highest){
					highest=plated;

				}
				current=i-previous;
				previous =i;
				

			}
			int rate=highest;
			int result=0;
			for(int i:temp){
				int test = i-rate;
				int and=0;
				if(test<0){
					and=rate+test;
				}else{
					and=rate;
				}

				result+=and;

			}
			if(!(current>=0)){
				
				result-=temp.getLast();
			}
			System.out.println("Case #"+cases+" "+eaten+" "+result);
		}
	}


	
	public static void main(String[] args) throws FileNotFoundException {
		pre run = new pre(args);
	}

}
