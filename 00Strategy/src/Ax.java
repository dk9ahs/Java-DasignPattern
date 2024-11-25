//2. 구체적인 전략(ConcreteStrategy)
public class Ax implements Weapon {
	
	@Override
	public void attack() {
		System.out.println("도끼 공격");
	}
}
