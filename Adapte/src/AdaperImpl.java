
public class AdaperImpl implements Adaper{
	
	@Override
	public Float twiceOf(Float f) {
		return (float) Math.twoTime(f.doubleValue());
	}
	
	@Override
	public Float halfOf(java.lang.Float f) {
		return (float) Math.half(f.doubleValue());
	}
	
}
