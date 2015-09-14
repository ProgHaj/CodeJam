




//Parse * and -

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class Dijkstra {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File(args[0]);
		Scanner sc = new Scanner(f);
		String[][] values = new String{{'1','i','j','k'},
								{'i','-1','k','-j'},
								{'j','-k','-1','i'},	
								{'k','j','-i','-1'}
								};
		
		int cases=0;
		String toParse;

		while(sc.hasNextLine()){
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			
			int l = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());

			if(sc.hasNextLine()){
				toParse = sc.nextLine();
				for(int i=0;i<l;i++){
					toParse+=toParse;
				}
				for(int i=0;i<toParse.length;i++){


				}

				if(toParse.charAt(i)=='-'){

				}

				if(toParse.charAt(0)==i){}
			}


			System.out.println("Case #"+cases+": "+winner);
		}

	}	

	public static boolean parse(String ans){
		boolean parsed=false;
		char temp=null;
		char[] find = new char[]{"i","j","k"};
		int notFound=0;
		for(int i=0;i<string.length();i++){
			if(notFound<find.length()){
				char currentChar = charAt(i);
				int id=0;
				int id2=0;
				if(currentChar=='i'){
					id=1;
				}else if(currentChar=='j'){
					id=2;
				}else if(currentChar=='k'){
					id=3;
				}else{

				}
				if(temp==null){
					temp = Values[id][0];
					if(temp=='i'){
						id2=1;
					}else if(temp=='j'){
						id2=2;
					}else if(temp=='k'){
						id2=3;
					}else{

					}
				}else{
					temp = ""+Values[id2][id];
				}
				if(temp==find[notFound]){
					notFound++;
					if(notFound==4&&i+1==ans.length()){

					}
				}
			}
		}
	}


	public String parse(String parse,char lookFor){
		boolean negative=false;
		String temp="";
		ArrayList<Values> al = new ArrayList<Values>();
		int i=0;
		for(char c:parse.toCharArray()){
			if(c=='-'){
				negative=!negative;
			}
			Values v = new Values(c);
			if(i!=0){
				temp+=""+[al.get(al.size()-1).getId()][c.getId()];
			}
			al.add(c);
			i++;
		}


	}

	

}
