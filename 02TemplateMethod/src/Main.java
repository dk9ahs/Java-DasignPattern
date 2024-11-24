import com.dk9ahs.dp.AbsCameConnectHelper;
import com.dk9ahs.dp.DefaultGameConnectHelper;

public class Main {
	
	public static void main(String[] args) {
		
		AbsCameConnectHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("아이디 암호 등 접속 정보");
	}
}
 