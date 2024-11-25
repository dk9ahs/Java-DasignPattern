package concrete;

import framework.Item;
import framework.ItemCreator;

public class Main {
	
	
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreater();
		item = creator.create();
		
		item.use();
		
		creator = new MpCreater();
		item = creator.create();
		
		item.use();
	}
}
