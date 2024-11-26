
public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012, 11));
		
		//navi 주소값 = cookie 주소값 (얕은 복사)
		Cat cookie = navi;
		//이름 변경시 navi도 cookie로 변경됨.
		cookie.setName("cookie"); 
		
		System.out.println(navi.getName());
		System.out.println(cookie.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(cookie.getAge().getYear());
		
		//주소값이 아닌 navi가 가진 값들을 복사하면 (깊은 복사)
		navi.setName("navi");
		Cat yo = navi.copy();
		yo.setName("yo");
		
//		yo.setAge(new Age(2013, 10));
		
		yo.getAge().setYear(2013);
		yo.getAge().setVlaue(10);
		
		//이름은 깊은 복사가 이루어짐
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		//깊은 복사가 안됨 -> copy메소드 변경시 깊은 복사가 이루어짐
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		
		System.out.println(navi.getAge().getVlaue());
		System.out.println(yo.getAge().getVlaue());
		
	}
}
