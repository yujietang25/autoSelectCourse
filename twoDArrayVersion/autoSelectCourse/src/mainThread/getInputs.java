package mainThread;

import java.util.Scanner;

class getInputs {
	public String[] run() throws NumberFormatException {
		Scanner scan = new Scanner(System.in);
		System.out.print("您想报几门课？");
		int num = Integer.parseInt(scan.nextLine());
		String[] courseList = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.print("请输入想选课的详细名字：(eecs1012, math1013)");
			courseList[i] = scan.nextLine();
		}
		scan.close();
		return courseList;
	}
}
