package framework;

public abstract class ItemCreator {
	
	//팩토리 메소드 패턴 -> 템플릿 메소드를 사용
	//아이템 생성
	public Item create() {

		Item itme;
		//아이템 정보 확인
		requestItemsInfo();
		//아이템 생성
		itme = creatItem();
		//아이템 로그
		createItemLog();		
		
		return itme;
	}
	
	//알고리즘을 다양한 단계로 나눔..
	//아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청합니다.
	abstract protected void requestItemsInfo();
	//아이템을 생성 후 아이템 복제 등 불법을 방지하기 위해 데이터 베이스에 아이템 생성
	//정보 남김 (로그 남기기)
	abstract protected void createItemLog();
	//아이템을 생성하는 알고리즘
	abstract protected Item creatItem();
}
