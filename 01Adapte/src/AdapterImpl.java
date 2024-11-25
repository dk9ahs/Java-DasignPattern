//1. Adapter 인터페이스를 구현하여 클라이언트가 Math의 연산을 사용
//할 수 있도록 연결.
//2. 클라이언트는 Adapter메서드만 호출하고 내부엔 어떤 Math
//메소드가 호출되는지 신경 쓸 필요가 없음.
public class AdapterImpl implements Adapter {

//	Math math;
	
//	@Override
//	public Float twiceOf(Float f) {
//		
//		return (float) Math.twoTime(f.doubleValue());
//	}
	
	//여기서 변경하면 새로운 알고리즘을 사용할수 있다. 
	//(알고리즘을 요구사항에 맞게 사용할 수 있다.)
	@Override
	public Float twiceOf(Float f) {
		
		return Math.doubled(f.doubleValue()).floatValue();
	}
	

	@Override
	public Float halfOf(Float f) {
		
		System.out.println("절반 함수 호출 시작");
		return (float) Math.half(f.doubleValue());
	}

}
