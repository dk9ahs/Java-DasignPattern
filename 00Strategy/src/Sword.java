//2. 구체적인 전략(ConcreteStrategy)
public class Sword implements Weapon {

	@Override
	public void attack() {
		
		System.out.println("검 공격");
	}

}
