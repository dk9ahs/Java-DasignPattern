
public class Main {
	public static void main(String[] args) {
//		System.out.println("hello");
//		Ainterface ainterface = new AinterfaceImpl();
		
		//통로
//		ainterface.funcA();
		
//		AObj aObj = new AObj();
//		aObj.funAA();
		
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
