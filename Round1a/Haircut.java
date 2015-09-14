import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Haircut{
	public Haircut(String[] args) throws FileNotFoundException{
		File f = new File(args[0]);
		Scanner sc = new Scanner(f);
		
		
		int cases=0;
		if(sc.hasNextLine()){
			sc.nextLine();
		}
		while(sc.hasNextLine()){
			cases++;
			int nbrOfBarberers;
			int position;
			Queue<Barberer> notWorking = new LinkedList<Barberer>();
			LinkedList<Barberer> barberers = new LinkedList<Barberer>();
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			nbrOfBarberers = Integer.parseInt(st.nextToken());
			position = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(sc.nextLine());
			int mod=1;
			for(int i=0;i<nbrOfBarberers;i++){

				Barberer b = new Barberer(i+1,Integer.parseInt(st.nextToken()));
				barberers.add(b);
				notWorking.add(b);
				if(b.time!=mod){
					mod*=b.time;
				}
			}
		
				position=position%mod;
			Barberer cutter=null;
			int times=0;

			while(position!=0&&cutter==null){
				times++;
				while(!notWorking.isEmpty()){
					Barberer b=(Barberer)notWorking.remove();
					position--;
					if(position==0){
						cutter=b;
					}
				}
				Barberer.permaTime++;
				for(Barberer b:barberers){
					if(b.timeUp()){
						notWorking.add(b);
					}
				}
			}

			if(cutter==null){
				cutter = (Barberer)notWorking.remove();
			}



			System.out.println("Case #"+cases+": "+cutter.id);
		}
	}


	
	public static void main(String[] args) throws FileNotFoundException {
		Haircut run = new Haircut(args);
	}

	public static class Barberer{
		static int permaTime=0;
		int id,time;
		public Barberer(int id, int time){
			this.id=id;
			this.time=time;
		}

		public boolean timeUp(){
			return permaTime%time==0;
		}

	}

}
