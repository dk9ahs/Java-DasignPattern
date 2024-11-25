
public class Main {
	
	public static void main(String[] args) {
		
		//1. 클라이언트는 Adapter 인터페이스만 알고 있음
		//2. AdapterImpl는 Adaper인터페이스를 구현하여, 
		//내부적으로 Math메서드를 사용 (강화된 알고리즘, 기존 알고리즘 선택가능)
		//3. 런타임 시 새로운 알고리즘이 추가되거나, 기존 알고리즘을 대체해야 한다면 
		//AdapterImpl만 수정하면 됨.
		Adapter adapter = new AdapterImpl();
		
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(80f));
		
	}
}
 