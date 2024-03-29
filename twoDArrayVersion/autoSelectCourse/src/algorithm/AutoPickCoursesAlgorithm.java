package algorithm;

import java.util.HashMap;
import java.util.LinkedList;

public class AutoPickCoursesAlgorithm {
	private String[] adaptive;
	private int num;

	public AutoPickCoursesAlgorithm(String[] courseListRaw, String[] adaptive, int num,
			HashMap<String, Integer> courseSecCounts) {
		super();
		this.adaptive = adaptive;
		this.num = num;
	}

	public LinkedList<String[][]> getIdealCourseList() {

		if (num == 1) {
			return One();
		} else if (num == 2) {
			return Two();
		} else if (num == 3) {
			return Three();
		} else if (num == 4) {
			return Four();
		} else if (num == 5) {
			return Five();
		} else if (num == 6) {
			return Six();
		} else if (num < 1) {
			System.out.println("\nError :2,所选的课程数量未定义，请保持所选的课程数量在1-6门之间！");
			System.exit(2);
		} else {
			System.out.println("\nError :3, 所选的课程数量未定义，请检查是否报名超过6门课，并保持所选的课程数量在1-6门之间！");
			System.exit(3);
		}
		return new LinkedList<>();
	}

	private LinkedList<String[][]> Six() {
		boolean flag = false;
		String[][] sortedList = new String[22][5];
		String courseName = "";
		int anotherCourse = 0;
		LinkedList<String[][]> courseList1 = new LinkedList<>();

		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 5; j++) {
				sortedList[i][j] = "NULL";
			}
		}

		for (int j = 0; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						anotherCourse = j;
						flag = false;
						courseList1.add(sortedList);
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList1.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList2 = new LinkedList<>();

		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 5; j++) {
				sortedList[i][j] = "NULL";
			}
		}
		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList2.add(sortedList);
						anotherCourse = j;
						flag = false;
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList2.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList3 = new LinkedList<>();

		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int k = 0; k < 5; k++) {
				sortedList[i][k] = "NULL";
			}
		}

		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;

					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList3.add(sortedList);
						anotherCourse = j;
						flag = false;
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList3.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList4 = new LinkedList<>();

		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int k = 0; k < 5; k++) {
				sortedList[i][k] = "NULL";
			}
		}
		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList4.add(sortedList);
						anotherCourse = j;
						flag = false;
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList4.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList5 = new LinkedList<>();

		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int k = 0; k < 5; k++) {
				sortedList[i][k] = "NULL";
			}
		}

		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;

					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList5.add(sortedList);
						anotherCourse = j;
						flag = false;
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList5.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList6 = new LinkedList<>();
		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int k = 0; k < 5; k++) {
				sortedList[i][k] = "NULL";
			}
		}
		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList6.add(sortedList);
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList6.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}
		courseList6.add(sortedList);

		LinkedList<String[][]> mergedCourse1 = new LinkedList<>();

		for (int i = 0; i < courseList1.size(); i++) {
			for (int j = 0; j < courseList2.size(); j++) {
				if (this.ifConflict(courseList1.get(i), courseList2.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList1.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList1.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList2.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList2.get(j)[x][y];
							}
						}
					}
					mergedCourse1.add(sortedList);
				}
			}
		}

		LinkedList<String[][]> mergedCourse2 = new LinkedList<>();
		for (int i = 0; i < mergedCourse1.size(); i++) {
			for (int j = 0; j < courseList3.size(); j++) {
				if (this.ifConflict(mergedCourse1.get(i), courseList3.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (mergedCourse1.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = mergedCourse1.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList3.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList3.get(j)[x][y];
							}
						}
					}

					mergedCourse2.add(sortedList);
				}
			}
		}

		LinkedList<String[][]> mergedCourse3 = new LinkedList<>();
		for (int i = 0; i < mergedCourse2.size(); i++) {
			for (int j = 0; j < courseList4.size(); j++) {
				if (this.ifConflict(mergedCourse2.get(i), courseList4.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (mergedCourse2.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = mergedCourse2.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList4.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList4.get(j)[x][y];
							}
						}
					}

					mergedCourse3.add(sortedList);
				}
			}
		}

		LinkedList<String[][]> mergedCourse4 = new LinkedList<>();
		for (int i = 0; i < mergedCourse3.size(); i++) {
			for (int j = 0; j < courseList5.size(); j++) {
				if (this.ifConflict(mergedCourse3.get(i), courseList5.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (mergedCourse3.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = mergedCourse3.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList5.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList5.get(j)[x][y];
							}
						}
					}

					mergedCourse4.add(sortedList);
				}
			}
		}

		LinkedList<String[][]> mergedCourse5 = new LinkedList<>();
		for (int i = 0; i < mergedCourse4.size(); i++) {
			for (int j = 0; j < courseList6.size(); j++) {
				if (this.ifConflict(mergedCourse4.get(i), courseList6.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}
					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (mergedCourse4.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = mergedCourse4.get(i)[x][y];
							}
						}
					}
					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList6.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList6.get(j)[x][y];
							}
						}
					}
					mergedCourse5.add(sortedList);
				}
			}
		}

		return mergedCourse5;
	}

	private LinkedList<String[][]> Five() {
		boolean flag = false;
		String[][] sortedList = new String[22][5];
		String courseName = "";
		int anotherCourse = 0;
		LinkedList<String[][]> courseList1 = new LinkedList<>();

		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 5; j++) {
				sortedList[i][j] = "NULL";
			}
		}

		for (int j = 0; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						anotherCourse = j;
						flag = false;
						courseList1.add(sortedList);
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList1.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList2 = new LinkedList<>();

		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 5; j++) {
				sortedList[i][j] = "NULL";
			}
		}
		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList2.add(sortedList);
						anotherCourse = j;
						flag = false;
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList2.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList3 = new LinkedList<>();

		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int k = 0; k < 5; k++) {
				sortedList[i][k] = "NULL";
			}
		}

		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;

					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList3.add(sortedList);
						anotherCourse = j;
						flag = false;
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList3.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList4 = new LinkedList<>();

		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int k = 0; k < 5; k++) {
				sortedList[i][k] = "NULL";
			}
		}
		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList4.add(sortedList);
						anotherCourse = j;
						flag = false;
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList4.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList5 = new LinkedList<>();
		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int k = 0; k < 5; k++) {
				sortedList[i][k] = "NULL";
			}
		}
		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList5.add(sortedList);
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList5.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}
		courseList5.add(sortedList);

		LinkedList<String[][]> mergedCourse1 = new LinkedList<>();

		for (int i = 0; i < courseList1.size(); i++) {
			for (int j = 0; j < courseList2.size(); j++) {
				if (this.ifConflict(courseList1.get(i), courseList2.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList1.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList1.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList2.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList2.get(j)[x][y];
							}
						}
					}
					mergedCourse1.add(sortedList);
				}
			}
		}

		LinkedList<String[][]> mergedCourse2 = new LinkedList<>();
		for (int i = 0; i < mergedCourse1.size(); i++) {
			for (int j = 0; j < courseList3.size(); j++) {
				if (this.ifConflict(mergedCourse1.get(i), courseList3.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (mergedCourse1.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = mergedCourse1.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList3.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList3.get(j)[x][y];
							}
						}
					}

					mergedCourse2.add(sortedList);
				}
			}
		}

		LinkedList<String[][]> mergedCourse3 = new LinkedList<>();
		for (int i = 0; i < mergedCourse2.size(); i++) {
			for (int j = 0; j < courseList4.size(); j++) {
				if (this.ifConflict(mergedCourse2.get(i), courseList4.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (mergedCourse2.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = mergedCourse2.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList4.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList4.get(j)[x][y];
							}
						}
					}

					mergedCourse3.add(sortedList);
				}
			}
		}

		LinkedList<String[][]> mergedCourse4 = new LinkedList<>();
		for (int i = 0; i < mergedCourse3.size(); i++) {
			for (int j = 0; j < courseList5.size(); j++) {
				if (this.ifConflict(mergedCourse3.get(i), courseList5.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}
					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (mergedCourse3.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = mergedCourse3.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList5.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList5.get(j)[x][y];
							}
						}
					}
					mergedCourse4.add(sortedList);
				}
			}
		}

		return mergedCourse4;
	}

	private LinkedList<String[][]> Four() {
		boolean flag = false;
		String[][] sortedList = new String[22][5];
		String courseName = "";
		int anotherCourse = 0;
		LinkedList<String[][]> courseList1 = new LinkedList<>();

		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 5; j++) {
				sortedList[i][j] = "NULL";
			}
		}

		for (int j = 0; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						anotherCourse = j;
						flag = false;
						courseList1.add(sortedList);
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList1.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList2 = new LinkedList<>();

		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 5; j++) {
				sortedList[i][j] = "NULL";
			}
		}
		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList2.add(sortedList);
						anotherCourse = j;
						flag = false;
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList2.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList3 = new LinkedList<>();

		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int k = 0; k < 5; k++) {
				sortedList[i][k] = "NULL";
			}
		}

		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;

					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList3.add(sortedList);
						anotherCourse = j;
						flag = false;
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList3.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList4 = new LinkedList<>();
		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int k = 0; k < 5; k++) {
				sortedList[i][k] = "NULL";
			}
		}
		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList4.add(sortedList);
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList4.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}
		courseList4.add(sortedList);

		LinkedList<String[][]> mergedCourse1 = new LinkedList<>();

		for (int i = 0; i < courseList1.size(); i++) {
			for (int j = 0; j < courseList2.size(); j++) {
				if (this.ifConflict(courseList1.get(i), courseList2.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList1.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList1.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList2.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList2.get(j)[x][y];
							}
						}
					}
					mergedCourse1.add(sortedList);
				}
			}
		}

		LinkedList<String[][]> mergedCourse2 = new LinkedList<>();
		for (int i = 0; i < mergedCourse1.size(); i++) {
			for (int j = 0; j < courseList3.size(); j++) {
				if (this.ifConflict(mergedCourse1.get(i), courseList3.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (mergedCourse1.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = mergedCourse1.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList3.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList3.get(j)[x][y];
							}
						}
					}

					mergedCourse2.add(sortedList);
				}
			}
		}

		LinkedList<String[][]> mergedCourse3 = new LinkedList<>();
		for (int i = 0; i < mergedCourse2.size(); i++) {
			for (int j = 0; j < courseList4.size(); j++) {
				if (this.ifConflict(mergedCourse2.get(i), courseList4.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (mergedCourse2.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = mergedCourse2.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList4.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList4.get(j)[x][y];
							}
						}
					}
					mergedCourse3.add(sortedList);
				}
			}
		}
//		for (String[][] strings : mergedCourse) {
//		for (String[] strings2 : strings) {
//			for (String strings3 : strings2) {
//				System.out.print(String.format("%-15s", strings3));
//			}
//			System.out.println();
//		}
//		System.out.println("+++++++++++++++++++++++");
//	}
		return mergedCourse3;
	}

	private LinkedList<String[][]> Three() {
		boolean flag = false;
		String[][] sortedList = new String[22][5];
		String courseName = "";
		int anotherCourse = 0;
		LinkedList<String[][]> courseList1 = new LinkedList<>();

		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 5; j++) {
				sortedList[i][j] = "NULL";
			}
		}

		for (int j = 0; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						anotherCourse = j;
						flag = false;
						courseList1.add(sortedList);
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList1.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList2 = new LinkedList<>();

		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 5; j++) {
				sortedList[i][j] = "NULL";
			}
		}
		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList2.add(sortedList);
						anotherCourse = j;
						flag = false;
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList2.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList3 = new LinkedList<>();

		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int k = 0; k < 5; k++) {
				sortedList[i][k] = "NULL";
			}
		}
		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList3.add(sortedList);
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList3.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}
		courseList3.add(sortedList);

		LinkedList<String[][]> mergedCourse = new LinkedList<>();

		for (int i = 0; i < courseList1.size(); i++) {
			for (int j = 0; j < courseList2.size(); j++) {
				if (this.ifConflict(courseList1.get(i), courseList2.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList1.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList1.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList2.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList2.get(j)[x][y];
							}
						}
					}
					mergedCourse.add(sortedList);
				}
			}
		}

		LinkedList<String[][]> anoMergedCourse = new LinkedList<>();
		for (int i = 0; i < mergedCourse.size(); i++) {
			for (int j = 0; j < courseList3.size(); j++) {
				if (this.ifConflict(mergedCourse.get(i), courseList3.get(j))) {
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (mergedCourse.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = mergedCourse.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList3.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList3.get(j)[x][y];
							}
						}
					}

					anoMergedCourse.add(sortedList);
				}
			}
		}

		return anoMergedCourse;
	}

	private boolean ifConflict(String[] course1, String[] course2) {
		return false;
	}

	private boolean ifConflict(String[][] course1, String[][] course2) {
		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 5; j++) {
				if (course1[i][j] != "NULL" && course2[i][j] != "NULL") {
					return true;
				}
			}
		}
		return false;

	}

	private LinkedList<String[][]> Two() {
		boolean flag = false;
		String[][] sortedList = new String[22][5];
		String courseName = "";
		int anotherCourse = 0;
		LinkedList<String[][]> courseList1 = new LinkedList<>();

		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 5; j++) {
				sortedList[i][j] = "NULL";
			}
		}

		for (int j = 0; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						anotherCourse = j;
						flag = false;
						courseList1.add(sortedList);
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList1.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}

		LinkedList<String[][]> courseList2 = new LinkedList<>();

		sortedList = new String[22][5];
		for (int i = 0; i < 22; i++) {
			for (int k = 0; k < 5; k++) {
				sortedList[i][k] = "NULL";
			}
		}

		for (int j = anotherCourse; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					if (!courseName.substring(0, 11).equals(adaptive[j].substring(1, 12))) {
						courseList2.add(sortedList);
						break;
					}
					courseName = adaptive[j].substring(1);
					courseList2.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}
		courseList2.add(sortedList);

		LinkedList<String[][]> mergedCourse = new LinkedList<>();
		for (int i = 0; i < courseList1.size(); i++) {
			for (int j = 0; j < courseList2.size(); j++) {
				if (this.ifConflict(courseList1.get(i), courseList2.get(j))) {
//					System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
					continue;
				} else {
					sortedList = new String[22][5];
					for (int t = 0; t < 22; t++) {
						for (int k = 0; k < 5; k++) {
							sortedList[t][k] = "NULL";
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList1.get(i)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList1.get(i)[x][y];
							}
						}
					}

					for (int x = 0; x < 22; x++) {
						for (int y = 0; y < 5; y++) {
							if (courseList2.get(j)[x][y].equals("NULL")) {
								continue;
							} else {
								sortedList[x][y] = courseList2.get(j)[x][y];
							}
						}
					}
					mergedCourse.add(sortedList);
				}
			}
		}
//		for (String[][] strings : mergedCourse) {
//			for (String[] strings2 : strings) {
//				for (String strings3 : strings2) {
//					System.out.print(String.format("%-15s", strings3));
//				}
//				System.out.println();
//			}
//			System.out.println("+++++++++++++++++++++++");
//		}

		return mergedCourse;
	}

	private LinkedList<String[][]> One() {
		boolean flag = false;
		String[][] sortedList = new String[22][5];
		String courseName = "";
		LinkedList<String[][]> mergedCourse = new LinkedList<>();

		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 5; j++) {
				sortedList[i][j] = "NULL";
			}
		}

		for (int j = 0; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					courseName = adaptive[j].substring(1);
					mergedCourse.add(sortedList);
					sortedList = new String[22][5];
					for (int i = 0; i < 22; i++) {
						for (int k = 0; k < 5; k++) {
							sortedList[i][k] = "NULL";
						}
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j].substring(0, 2))][Integer
					.parseInt(adaptive[j].substring(3, 4))] = courseName;
		}
		mergedCourse.add(sortedList);
		return mergedCourse;
	}

}
