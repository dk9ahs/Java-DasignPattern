 
public class Main {

	public static void main(String[] args) {
		//가독성 & 많은 멤버 변수
		
		//멤버 변수가 잘못들어갈수있기때문에 -> builder
//		Computer computer = new Computer("255gssg", "i7", "8g");
		
		Computer computer = ComputerBuilder 
//			.start()
//			.setCpu("i7")
			.startWhtitCpu("i7")
			.setRam("8g")
//			.setStorge("256g ssg")
			.build();
		
		System.out.println(computer.toString());
			
	}
}
