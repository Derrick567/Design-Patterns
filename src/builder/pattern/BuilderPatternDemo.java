package builder.pattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger.HamburgerBuilder()
				.setMeat("Beef")
				.setMeatCount(2)
				.setSize(2)
				.setSpicy(true)
				.setContainLettuce(false)
				.build();
		
				System.out.println(hamburger.toString());
		
	}

}
