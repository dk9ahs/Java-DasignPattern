
public class Cat implements Cloneable{
	
	private String name;
	private Age age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public Cat copy() throws CloneNotSupportedException {
		
		Cat rat = (Cat)this.clone();
		rat.setAge(new Age(this.age.getYear(), this.age.getVlaue()));
		return rat;
	}
	
}
