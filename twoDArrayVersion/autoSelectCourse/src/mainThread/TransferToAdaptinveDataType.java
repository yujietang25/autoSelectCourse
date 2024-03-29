package mainThread;

import java.util.Arrays;
import java.util.HashMap;

import database.DataBase;

public class TransferToAdaptinveDataType {
	private HashMap<String, Integer> courseSecCounts = new HashMap<String, Integer>();

	public String[] rawCourseListToStream(String[] rawCourseList) {
		int counter = 0;
		int numOfSlelction = rawCourseList.length;
		String[] adaptive = new String[650];
		for (int i = 0; i < numOfSlelction; i++) {
			if (rawCourseList[i].equals("chem1000")) {
				for (int j = 0; j < DataBase.chem1000SecA.length; j++) {
					adaptive[counter] = DataBase.chem1000SecA[j];
					++counter;
				}
				for (int j = 0; j < DataBase.chem1000SecB.length; j++) {
					adaptive[counter] = DataBase.chem1000SecB[j];
					++counter;
				}
				for (int j = 0; j < DataBase.chem1000SecN.length; j++) {
					adaptive[counter] = DataBase.chem1000SecN[j];
					++counter;
				}
				for (int j = 0; j < DataBase.chem1000SecC.length; j++) {
					adaptive[counter] = DataBase.chem1000SecC[j];
					++counter;
				}
				this.courseSecCounts.put("chem1000", 4);
			}
			if (rawCourseList[i].equals("eecs1012")) {
				for (int j = 0; j < DataBase.eecs1012SecD.length; j++) {
					adaptive[counter] = DataBase.eecs1012SecD[j];
					++counter;
				}
				for (int j = 0; j < DataBase.eecs1012SecC.length; j++) {
					adaptive[counter] = DataBase.eecs1012SecC[j];
					++counter;
				}
				for (int j = 0; j < DataBase.eecs1012SecB.length; j++) {
					adaptive[counter] = DataBase.eecs1012SecB[j];
					++counter;
				}
				for (int j = 0; j < DataBase.eecs1012SecA.length; j++) {
					adaptive[counter] = DataBase.eecs1012SecA[j];
					++counter;
				}
				this.courseSecCounts.put("eecs1012", 4);
			}
			if (rawCourseList[i].equals("math2030")) {
				for (int j = 0; j < DataBase.math2030SecF.length; j++) {
					adaptive[counter] = DataBase.math2030SecF[j];
					++counter;
				}
				for (int j = 0; j < DataBase.math2030SecO.length; j++) {
					adaptive[counter] = DataBase.math2030SecO[j];
					++counter;
				}
				for (int j = 0; j < DataBase.math2030SecA.length; j++) {
					adaptive[counter] = DataBase.math2030SecA[j];
					++counter;
				}
				this.courseSecCounts.put("math2030", 3);
			}
			if (rawCourseList[i].equals("math1013")) {
				for (int j = 0; j < DataBase.math1013SecA.length; j++) {
					adaptive[counter] = DataBase.math1013SecA[j];
					++counter;
				}
				for (int j = 0; j < DataBase.math1013SecR.length; j++) {
					adaptive[counter] = DataBase.math1013SecR[j];
					++counter;
				}
				for (int j = 0; j < DataBase.math1013SecD.length; j++) {
					adaptive[counter] = DataBase.math1013SecD[j];
					++counter;
				}
				for (int j = 0; j < DataBase.math1013SecF.length; j++) {
					adaptive[counter] = DataBase.math1013SecF[j];
					++counter;
				}
				for (int j = 0; j < DataBase.math1013SecL.length; j++) {
					adaptive[counter] = DataBase.math1013SecL[j];
					++counter;
				}
				this.courseSecCounts.put("math1013", 5);
			}
			if (rawCourseList[i].equals("econ1010")) {
				for (int j = 0; j < DataBase.econ1010SecG.length; j++) {
					adaptive[counter] = DataBase.econ1010SecG[j];
					++counter;
				}
				for (int j = 0; j < DataBase.econ1010SecM.length; j++) {
					adaptive[counter] = DataBase.econ1010SecM[j];
					++counter;
				}
				for (int j = 0; j < DataBase.econ1010SecT.length; j++) {
					adaptive[counter] = DataBase.econ1010SecT[j];
					++counter;
				}
				this.courseSecCounts.put("econ1010", 3);
			}
			if (rawCourseList[i].equals("eecs2030")) {
				for (int j = 0; j < DataBase.eecs2030SecM.length; j++) {
					adaptive[counter] = DataBase.eecs2030SecM[j];
					++counter;
				}
				for (int j = 0; j < DataBase.eecs2030SecT.length; j++) {
					adaptive[counter] = DataBase.eecs2030SecT[j];
					++counter;
				}
				for (int j = 0; j < DataBase.eecs2030SecL.length; j++) {
					adaptive[counter] = DataBase.eecs2030SecL[j];
					++counter;
				}
				this.courseSecCounts.put("econ1010", 3);
			}
		}

		for (int i = 0; i < adaptive.length; i++) {
			if (adaptive[i] == null) {
				adaptive = Arrays.copyOf(adaptive, i);
				break;
			}
		}

//		for (String string : adaptive) {
//			System.out.println(string);
//		}
		return adaptive;
	}

	public HashMap<String, Integer> getCourseSecCounts() {
		return courseSecCounts;
	}

}
