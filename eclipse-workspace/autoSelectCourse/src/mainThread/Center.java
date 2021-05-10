package mainThread;

import java.util.HashMap;
import java.util.LinkedList;

import algorithm.AutoPickCoursesAlgorithm;

class Center {
	String[] courListRaw;

	public void run() {
		this.courListRaw = new getInputs().run();
		TransferToAdaptinveDataType TT = new TransferToAdaptinveDataType();
		String[] adaptive = TT.rawCourseListToStream(courListRaw);
		HashMap<String, Integer> courseSecCounts = TT.getCourseSecCounts();
		AutoPickCoursesAlgorithm auto = new AutoPickCoursesAlgorithm(courListRaw, adaptive, courListRaw.length,
				courseSecCounts);
		this.printResult(auto.getIdealCourseList());
	}

	private void printResult(LinkedList<String[]> result) {

		if (result.size() == 0) {
			System.out.println("\n\nError:1，对不起，您想报的课程之间一定存在时间冲突！");
			System.out.println("请尝试删除至少一门课，然后再重试，谢谢！");
			System.exit(1);
		}

		System.out.println(String.format("\n\n恭喜您！您想报的%d门课存在时间不冲突的选课方案！正在打印...\n", courListRaw.length));
		for (String[] strings : result) {
			for (String s : strings) {
				System.out.println(s);
			}
			System.out.println("=================");
		}
	}

}
