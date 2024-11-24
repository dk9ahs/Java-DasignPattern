package com.dk9ahs.dp;

public class DefaultGameConnectHelper extends AbsCameConnectHelper {

	@Override
	protected String doSecurity(String string) {
//		System.out.println("암호화 디코드");
		System.out.println("강화된 알고리즘 디코드");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인 과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인");
		//서버에서 유저이름 유저 나이를 알 수 있다.
		//나이를 확인, 시간 확인 -> 성인이 아니고 10시가 지났다면 if 문으로 권한이 없도록
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속 단계");
		return info;
	}

}
