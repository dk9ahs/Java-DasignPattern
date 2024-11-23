
public class Main {
	
	public static void main(String[] args) {
		
		Adaper adaper = new AdaperImpl();
		
		System.out.println(adaper.twiceOf(100f));
		System.out.println(adaper.halfOf(100f));
		
	}
}
