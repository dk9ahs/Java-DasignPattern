
public class SystemSpeaker {

	//static 여러 번 호출해도 instance는 하나만 존재
	//private 싱글톤 패턴의 핵심을 지키기 위한 접근 제어
	static private SystemSpeaker instance;
	private int volume;
	
	//private 생성자 - new SystemSpeaker()로 객체를 생성하지 못하도록 제한
	//오직 getInstance() 메서드로만 생성
	private SystemSpeaker() {
		 volume = 5;
	}
	
	public static SystemSpeaker getInstance() {
		if(instance == null) {
			//시스템 스피커와 연결되도록..
			instance = new SystemSpeaker();
			System.out.println("새로 생성");
		}else {
			System.out.println("이미 생성");
		}
		return instance;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
