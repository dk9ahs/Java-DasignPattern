package concrete;

import framework.Item;
import framework.ItemCreator;
import java.util.Date;

public class MpCreater extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("데이터 베이스에서 마력 회복 물약의 정보를 가져옵니다.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("데이터 베이스에서 마력 회복 물약을 새로 생성했습니다." + new Date());
	}

	@Override
	protected Item creatItem() {
		return new MpPotion();
	}
	
}
