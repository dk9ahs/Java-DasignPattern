
public class AObj {
	
	Ainterface ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImpl();
	}
	
	public void funAA() {
		
		//~ 기능이 필요합니다.. 개발해주세요
//		System.out.println("AAA");
//		System.out.println("AAA");
		
		//위임한다 델리게이트
		//특정 객체의 기능을 사용하기 위해 다른 객체의 기능을 사용하는 것
		ainterface.funcA();
		ainterface.funcA();
		
		
		
	}
}
