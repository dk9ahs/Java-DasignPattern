//2. 구체적인 전략(ConcreteStrategy)
public class Knife implements Weapon {
	
	@Override
	public void attack() {
		System.out.println("칼 공격");
	}
}
