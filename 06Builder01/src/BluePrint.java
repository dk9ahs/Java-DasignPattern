
//2. Builder (객체 생성 과정을 단계별로 정의)

public abstract class BluePrint {
	
	//각 속성을 설정하는 추상 메서드
	abstract public void setCpu();
	abstract public void setRam();
	abstract public void setStroage();
	
	//최종 생성된 Product 반환
	abstract public Computer getComputer();
}
