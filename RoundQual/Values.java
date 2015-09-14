public class Values{
	char v;
	int id;
	boolean isNegative=false;
	Values(char v){
		this.v = v;
		
		if(v=='1'){
			id=0;
		}else if(v=='i'{
			id=1;
		}else if(v=='j'){
			id=2;
		}else if(v=='k'){
			id=3;
		}

	}

	public char getValue(){
		return v;
	}

	public int getId(){
		return id;
	}

} 