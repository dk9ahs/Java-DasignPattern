
public class Main {

	public static void main(String[] args) {
		//동일한 인스턴스 값을 가짐
		SystemSpeaker  speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker  speaker2 = SystemSpeaker.getInstance();
		System.out.println(speaker1 == speaker2); // true
		
		//5,5
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(11);
		//11,11
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());

		speaker2.setVolume(22);
		//22,22
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());

		
	}
}
