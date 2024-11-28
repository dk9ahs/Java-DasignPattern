
//4. Director (생성 과정을 관리)
//Director는 전체 과정을 순차적으로 실행하며 객체 생성의 흐름을 제어

public class ComputerFactory {
	
	private BluePrint print;

	// 설계도를 설정
	public void setBlueprint(BluePrint print) {
		this.print = print;
	}

	// 설계도를 바탕으로 Product를 생성
	public void make() {
		
		print.setCpu();
		print.setRam();
		print.setStroage();
	}

	// 생성된 Product를 반환
	public Computer getComputer() {

		return print.getComputer();
	}
	

	
}
