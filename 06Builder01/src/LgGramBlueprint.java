
//3. ConcreteBuilder (객체 생성의 세부 동작 구현)
//각 단계에서 객체의 속성을 설정하거나 특정 동작을 수행
//서로 다른 Product를 만들기 위해 ConcreteBuilder를 추가로 구현할 수 있음.

public class LgGramBlueprint extends BluePrint {

	private Computer computer;
	
	//생성자에서 기본값 설정
	public LgGramBlueprint() {
		computer = new Computer("default", "default", "default");
	}
	
	@Override
	public void setCpu() {
		computer.setCpu("i7");
	}

	@Override
	public void setRam() {
		computer.setRam("8g");
	}

	@Override
	public void setStroage() {
		computer.setStorage("256g ssg");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
