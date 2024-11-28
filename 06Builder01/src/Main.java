
public class Main {

	public static void main(String[] args) {
		//Builder Pattern 
		//복잡한 단계를 거쳐야 생성되는 객체의 구현을 서브 클래스에게 넘겨주는 패턴
		
		//설계도를 바탕으로 만드는 과정
		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGramBlueprint());
		
//		factory.setBlueprint(new MacAirBlueprint());
//		factory.setBlueprint(new SonyBlueprint());
		
//		Computer computer = factory.makeAndGet();
		
		factory.make();
		
		Computer computer = factory.getComputer();
		
//		Computer computer = new Computer("i7", "16g", "256g ssd");
		
		System.out.println(computer.toString()); 
		
	}
}
