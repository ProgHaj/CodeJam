public class PancakeChooser{
	public int pancakeSpliter(int pancake){
		return pancakes(pancake)-1;
	}

	private int pancakes(int pancake){
		if(pancake<4){
			return 1;
		}
		int amount=0;
		int onePancake = pancake/2;
		amount += pancakes(onePancake);
		amount += pancakes(pancake-onePancake);
		return amount;
	}
}