
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
