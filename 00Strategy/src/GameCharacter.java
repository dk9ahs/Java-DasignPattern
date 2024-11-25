//3. Context 클래스(Character)
public class GameCharacter {
	
	//추상적인 접근점
	private Weapon weapon;
	
	//변경 가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if (weapon == null) {
			System.out.println("맨손 공격");
		} else {
			//공격이라는 기능을 위임..
			//델리게이트
			weapon.attack();
		}
	}
}
