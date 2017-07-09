package builder.pattern;

public class Hamburger {
	private String meat;
	private boolean isSpicy;
	private int size;
	private int meatCount;
	private boolean isContainLettuce;
	
	public Hamburger(String meat, boolean isSpicy, int size, int meatCount, boolean isContainLettuce) {
		super();
		this.meat = meat;
		this.isSpicy = isSpicy;
		this.size = size;
		this.meatCount = meatCount;
		this.isContainLettuce = isContainLettuce;
	}
	
	@Override
	public String toString() {
		return String.format("meat = %s , spicy = %b , size = %d , meat's count = %d , "
				+ "is contain lettuce = %b", meat, isSpicy, size, meatCount, isContainLettuce);
	}
	
	
static class HamburgerBuilder{
		
		private String meat;
		private boolean isSpicy;
		private int size;
		private int meatCount;
		private boolean isContainLettuce;
		
		public HamburgerBuilder setMeat(String meat){
			this.meat = meat;
			return this;
		}
		public HamburgerBuilder setSpicy(boolean isSpicy){
			this.isSpicy = isSpicy;
			return this;
		}
		public HamburgerBuilder setSize(int size){
			this.size = size;
			return this;
		}
		public HamburgerBuilder setMeatCount(int meatCount){
			this.meatCount = meatCount;
			return this;
		}
		public HamburgerBuilder setContainLettuce(boolean isContainLettuce){
			this.isContainLettuce = isContainLettuce;
			return this;
		}
		
		public Hamburger build(){
			return new Hamburger(meat, isSpicy, size, meatCount, isContainLettuce);
			
		}
	}
	
}
