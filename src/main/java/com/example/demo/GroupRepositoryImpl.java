package com.example.demo;

public class GroupRepositoryImpl implements GroupRepository {

	@Override
	//情報
	public String selectByNo(String number) {
		String name;
		switch (number) {
		case "10000":
			name = "SS1部";
			break;
		case "10001":
			name = "SS2部";
			break;
		default:
			name = "登録されていません";
			break;
		}
		return name;
	}

}
