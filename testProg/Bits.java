public class Bits{
	private Bit[] bits;
	public Bits(String bits){
		this.bits = new Bit[bits.length()];
		for(int i=0;i<bits.length();i++){
			this.bits[i] = new Bit(bits.charAt(i));
		}
	}

	public Bit getBit(int pos){
		return bits[pos];
	}

	public Bit[] getBits(){
		return bits;
	}
	public int length(){
		return bits.length;
	}

	public boolean equals(Bits compare){
		int equal = 0;
		if(bits.length==compare.length()){
			for(int i = 0; i<bits.length;i++){
				if(this.getBit(i).getValue()==compare.getBit(i).getValue())
					equal++;
			}
		}
		if(equal==compare.length()){
			return true;
		}
		return false;
	}
	
	public void setBit(int pos, int value){
		bits[pos].setValue(value);
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<bits.length;i++){
			sb.append(bits[i].getValue());
		}
		return sb.toString();
	}


	public class Bit{
		private int bit;
		public Bit(char bit){
			this.bit = Integer.parseInt(bit+"");
		}

		public int inverse(){
			bit = bit==0?1:0;
			return bit;
		}

		public int getValue(){
			return bit;
		}
		public void setValue(int value){
			bit=value;
		}
	}
}
