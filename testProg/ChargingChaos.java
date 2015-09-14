import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChargingChaos{
	int intL;
	public ChargingChaos(String[] args) throws FileNotFoundException{
		//få ut info tills scanner osv här, till N och L och hantera all data inläsning.
		File f = new File(args[0]);
		Scanner sc = new Scanner(f);

		sc.nextLine(); //Who cares about the amount of testcases lool

		while(sc.hasNextLine()){
			StringTokenizer st = new StringTokenizer(sc.nextLine());

			int intN = Integer.parseInt(st.nextToken());
			intL = Integer.parseInt(st.nextToken());
			Bits[] bitsCurrent = createBitArray(sc.nextLine(),intN);
			Bits[] bitsPrefered = createBitArray(sc.nextLine(),intN);
			LinkedList<Integer> testing = new LinkedList<Integer>();

			int correct=0;
			int numb=0;
			correct=recurs(bitsCurrent,bitsPrefered,numb,correct);
			if(correct==-1){
				System.out.println("NOT POSSIBLE");
			}else{
				System.out.println(correct-1);
			}
			
		}
	}


	public int recurs(Bits[] bitsCurrent, Bits[] bitsPrefered, int numb, int correct){
		boolean[] equal=new boolean[bitsCurrent.length];
		
		
		for(int i=0;i<bitsCurrent.length;i++){
			bitsCurrent[i].setBit(numb, bitsCurrent[i].getBit(numb).inverse());
			for(int j=0;j<bitsPrefered.length;j++){
				if(bitsCurrent[i].equals(bitsPrefered[j])){
					equal[i]=true;
				}
			}
		}
		boolean eq = true;
		for(int i=0;i<equal.length;i++){
			if(equal[i]==false){
				eq=false;
			}
		}
		if(eq==true){
			return correct;
		}
		if(correct==bitsCurrent.length){
			return -1;
		}
		int lowest=bitsCurrent.length;
		boolean test=false;
		for(int i=numb;i<intL;i++){
			int temp = recurs(bitsCurrent,bitsPrefered,i,correct+1);
			if(temp<lowest&&temp!=-1){
				lowest=temp;
				test=true;
			}
		}
		if(!test)
			return -1;
		return lowest;

	}

	public static boolean areAllTrue(boolean[] array)
	{
    	for(boolean b : array) if(!b) return false;
    	return true;
	}



	public Bits[] createBitArray(String nextLine,int intN){
		StringTokenizer st = new StringTokenizer(nextLine);
		Bits[] bitArray = new Bits[intN];
		for(int i = 0;i<intN;i++){
			bitArray[i] = new Bits(st.nextToken());
		}
		return bitArray;	
	}






	public static void main(String[] args) throws FileNotFoundException{
		ChargingChaos cc = new ChargingChaos(args);
	}

}