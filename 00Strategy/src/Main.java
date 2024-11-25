
public class Main {
	public static void main(String[] args) {
//		System.out.println("hello");
//		Ainterface ainterface = new AinterfaceImpl();
		
		//통로
//		ainterface.funcA();
		
//		AObj aObj = new AObj();
//		aObj.funAA();
		
		// 스트레티지 
		//1. 유연성 : 다양한 요구 사항에 대응 가능
		//2. 캡슐화 : 알고리즘의 세부 구현을 클라이언트에서 분리
		//				코드 의존성을 줄임
 		//3. 확장성 : 새로운 전략을 추가해도 기존 코드를 수정할 필요가 없음
		
		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Ax());
		character.attack();
	}
}
