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

	public LinkedList<String[]> getIdealCourseList() {

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

	private LinkedList<String[]> Six() {
		boolean flag = false;
		String[] sortedList = new String[20];
		String courseName = "";
		int anotherCourse = 0;
		LinkedList<String[]> courseList1 = new LinkedList<>();

		for (int i = 0; i < sortedList.length; i++) {
			sortedList[i] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList2 = new LinkedList<>();

		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList3 = new LinkedList<>();

		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList4 = new LinkedList<>();

		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList5 = new LinkedList<>();

		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList6 = new LinkedList<>();
		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}
		courseList6.add(sortedList);

		LinkedList<String[]> mergedCourse1 = new LinkedList<>();

		for (int i = 0; i < courseList1.size(); i++) {
			for (int j = 0; j < courseList2.size(); j++) {
				if (this.ifConflict(courseList1.get(i), courseList2.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < courseList1.get(i).length; k++) {
						if (courseList1.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList1.get(i)[k];
						}
					}

					for (int k = 0; k < courseList2.get(j).length; k++) {
						if (courseList2.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList2.get(j)[k];
						}
					}
					mergedCourse1.add(sortedList);
				}
			}
		}

		LinkedList<String[]> mergedCourse2 = new LinkedList<>();
		for (int i = 0; i < mergedCourse1.size(); i++) {
			for (int j = 0; j < courseList3.size(); j++) {
				if (this.ifConflict(mergedCourse1.get(i), courseList3.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < mergedCourse1.get(i).length; k++) {
						if (mergedCourse1.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = mergedCourse1.get(i)[k];
						}
					}

					for (int k = 0; k < courseList3.get(j).length; k++) {
						if (courseList3.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList3.get(j)[k];
						}
					}
					mergedCourse2.add(sortedList);
				}
			}
		}

		LinkedList<String[]> mergedCourse3 = new LinkedList<>();
		for (int i = 0; i < mergedCourse2.size(); i++) {
			for (int j = 0; j < courseList4.size(); j++) {
				if (this.ifConflict(mergedCourse2.get(i), courseList4.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < mergedCourse2.get(i).length; k++) {
						if (mergedCourse2.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = mergedCourse2.get(i)[k];
						}
					}

					for (int k = 0; k < courseList4.get(j).length; k++) {
						if (courseList4.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList4.get(j)[k];
						}
					}
					mergedCourse3.add(sortedList);
				}
			}
		}

		LinkedList<String[]> mergedCourse4 = new LinkedList<>();
		for (int i = 0; i < mergedCourse3.size(); i++) {
			for (int j = 0; j < courseList5.size(); j++) {
				if (this.ifConflict(mergedCourse3.get(i), courseList5.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < mergedCourse3.get(i).length; k++) {
						if (mergedCourse3.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = mergedCourse3.get(i)[k];
						}
					}

					for (int k = 0; k < courseList5.get(j).length; k++) {
						if (courseList5.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList5.get(j)[k];
						}
					}
					mergedCourse4.add(sortedList);
				}
			}
		}

		LinkedList<String[]> mergedCourse5 = new LinkedList<>();
		for (int i = 0; i < mergedCourse4.size(); i++) {
			for (int j = 0; j < courseList6.size(); j++) {
				if (this.ifConflict(mergedCourse4.get(i), courseList6.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < mergedCourse4.get(i).length; k++) {
						if (mergedCourse4.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = mergedCourse4.get(i)[k];
						}
					}

					for (int k = 0; k < courseList6.get(j).length; k++) {
						if (courseList5.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList6.get(j)[k];
						}
					}
					mergedCourse5.add(sortedList);
				}
			}
		}

		return mergedCourse5;
	}

	private LinkedList<String[]> Five() {
		boolean flag = false;
		String[] sortedList = new String[20];
		String courseName = "";
		int anotherCourse = 0;
		LinkedList<String[]> courseList1 = new LinkedList<>();

		for (int i = 0; i < sortedList.length; i++) {
			sortedList[i] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList2 = new LinkedList<>();

		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList3 = new LinkedList<>();

		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList4 = new LinkedList<>();

		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList5 = new LinkedList<>();
		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}
		courseList5.add(sortedList);

		LinkedList<String[]> mergedCourse1 = new LinkedList<>();

		for (int i = 0; i < courseList1.size(); i++) {
			for (int j = 0; j < courseList2.size(); j++) {
				if (this.ifConflict(courseList1.get(i), courseList2.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < courseList1.get(i).length; k++) {
						if (courseList1.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList1.get(i)[k];
						}
					}

					for (int k = 0; k < courseList2.get(j).length; k++) {
						if (courseList2.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList2.get(j)[k];
						}
					}
					mergedCourse1.add(sortedList);
				}
			}
		}

		LinkedList<String[]> mergedCourse2 = new LinkedList<>();
		for (int i = 0; i < mergedCourse1.size(); i++) {
			for (int j = 0; j < courseList3.size(); j++) {
				if (this.ifConflict(mergedCourse1.get(i), courseList3.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < mergedCourse1.get(i).length; k++) {
						if (mergedCourse1.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = mergedCourse1.get(i)[k];
						}
					}

					for (int k = 0; k < courseList3.get(j).length; k++) {
						if (courseList3.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList3.get(j)[k];
						}
					}
					mergedCourse2.add(sortedList);
				}
			}
		}

		LinkedList<String[]> mergedCourse3 = new LinkedList<>();
		for (int i = 0; i < mergedCourse2.size(); i++) {
			for (int j = 0; j < courseList4.size(); j++) {
				if (this.ifConflict(mergedCourse2.get(i), courseList4.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < mergedCourse2.get(i).length; k++) {
						if (mergedCourse2.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = mergedCourse2.get(i)[k];
						}
					}

					for (int k = 0; k < courseList4.get(j).length; k++) {
						if (courseList4.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList4.get(j)[k];
						}
					}
					mergedCourse3.add(sortedList);
				}
			}
		}

		LinkedList<String[]> mergedCourse4 = new LinkedList<>();
		for (int i = 0; i < mergedCourse3.size(); i++) {
			for (int j = 0; j < courseList5.size(); j++) {
				if (this.ifConflict(mergedCourse3.get(i), courseList5.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < mergedCourse3.get(i).length; k++) {
						if (mergedCourse3.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = mergedCourse3.get(i)[k];
						}
					}

					for (int k = 0; k < courseList5.get(j).length; k++) {
						if (courseList5.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList5.get(j)[k];
						}
					}
					mergedCourse4.add(sortedList);
				}
			}
		}

		return mergedCourse4;
	}

	private LinkedList<String[]> Four() {
		boolean flag = false;
		String[] sortedList = new String[20];
		String courseName = "";
		int anotherCourse = 0;
		LinkedList<String[]> courseList1 = new LinkedList<>();

		for (int i = 0; i < sortedList.length; i++) {
			sortedList[i] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList2 = new LinkedList<>();

		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList3 = new LinkedList<>();

		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList4 = new LinkedList<>();
		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}
		courseList4.add(sortedList);

		LinkedList<String[]> mergedCourse1 = new LinkedList<>();

		for (int i = 0; i < courseList1.size(); i++) {
			for (int j = 0; j < courseList2.size(); j++) {
				if (this.ifConflict(courseList1.get(i), courseList2.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < courseList1.get(i).length; k++) {
						if (courseList1.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList1.get(i)[k];
						}
					}

					for (int k = 0; k < courseList2.get(j).length; k++) {
						if (courseList2.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList2.get(j)[k];
						}
					}
					mergedCourse1.add(sortedList);
				}
			}
		}

		LinkedList<String[]> mergedCourse2 = new LinkedList<>();
		for (int i = 0; i < mergedCourse1.size(); i++) {
			for (int j = 0; j < courseList3.size(); j++) {
				if (this.ifConflict(mergedCourse1.get(i), courseList3.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < mergedCourse1.get(i).length; k++) {
						if (mergedCourse1.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = mergedCourse1.get(i)[k];
						}
					}

					for (int k = 0; k < courseList3.get(j).length; k++) {
						if (courseList3.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList3.get(j)[k];
						}
					}
					mergedCourse2.add(sortedList);
				}
			}
		}

		LinkedList<String[]> mergedCourse3 = new LinkedList<>();
		for (int i = 0; i < mergedCourse2.size(); i++) {
			for (int j = 0; j < courseList4.size(); j++) {
				if (this.ifConflict(mergedCourse2.get(i), courseList4.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < mergedCourse2.get(i).length; k++) {
						if (mergedCourse2.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = mergedCourse2.get(i)[k];
						}
					}

					for (int k = 0; k < courseList4.get(j).length; k++) {
						if (courseList4.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList4.get(j)[k];
						}
					}
					mergedCourse3.add(sortedList);
				}
			}
		}

		return mergedCourse3;
	}

	private LinkedList<String[]> Three() {
		boolean flag = false;
		String[] sortedList = new String[20];
		String courseName = "";
		int anotherCourse = 0;
		LinkedList<String[]> courseList1 = new LinkedList<>();

		for (int i = 0; i < sortedList.length; i++) {
			sortedList[i] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList2 = new LinkedList<>();

		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList3 = new LinkedList<>();
		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}
		courseList3.add(sortedList);

		LinkedList<String[]> mergedCourse = new LinkedList<>();

		for (int i = 0; i < courseList1.size(); i++) {
			for (int j = 0; j < courseList2.size(); j++) {
				if (this.ifConflict(courseList1.get(i), courseList2.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < courseList1.get(i).length; k++) {
						if (courseList1.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList1.get(i)[k];
						}
					}

					for (int k = 0; k < courseList2.get(j).length; k++) {
						if (courseList2.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList2.get(j)[k];
						}
					}
					mergedCourse.add(sortedList);
				}
			}
		}

		LinkedList<String[]> anoMergedCourse = new LinkedList<>();
		for (int i = 0; i < mergedCourse.size(); i++) {
			for (int j = 0; j < courseList3.size(); j++) {
				if (this.ifConflict(mergedCourse.get(i), courseList3.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < mergedCourse.get(i).length; k++) {
						if (mergedCourse.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = mergedCourse.get(i)[k];
						}
					}

					for (int k = 0; k < courseList3.get(j).length; k++) {
						if (courseList3.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList3.get(j)[k];
						}
					}
					anoMergedCourse.add(sortedList);
				}
			}
		}

//		for (String[] s : anoMergedCourse) {
//			for (String s1 : s) {
//				System.out.println(s1);
//			}
//			System.out.println("--------------");
//		}

		return anoMergedCourse;
	}

	private boolean ifConflict(String[] course1, String[] course2) {
		for (int i = 0; i < course1.length; i++) {
			if (course1[i] != "NULL" && course2[i] != "NULL") {
				return true;
			}
		}
		return false;
	}

	private LinkedList<String[]> Two() {
		boolean flag = false;
		String[] sortedList = new String[20];
		String courseName = "";
		int anotherCourse = 0;
		LinkedList<String[]> courseList1 = new LinkedList<>();

		for (int i = 0; i < sortedList.length; i++) {
			sortedList[i] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}

		LinkedList<String[]> courseList2 = new LinkedList<>();

		sortedList = new String[20];
		for (int t = 0; t < sortedList.length; t++) {
			sortedList[t] = "NULL";
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
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = courseName;
		}
		courseList2.add(sortedList);

		LinkedList<String[]> mergedCourse = new LinkedList<>();

		for (int i = 0; i < courseList1.size(); i++) {
			for (int j = 0; j < courseList2.size(); j++) {
				if (this.ifConflict(courseList1.get(i), courseList2.get(j))) {
					continue;
				} else {
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}

					for (int k = 0; k < courseList1.get(i).length; k++) {
						if (courseList1.get(i)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList1.get(i)[k];
						}
					}

					for (int k = 0; k < courseList2.get(j).length; k++) {
						if (courseList2.get(j)[k].equals("NULL")) {
							continue;
						} else {
							sortedList[k] = courseList2.get(j)[k];
						}
					}
					mergedCourse.add(sortedList);
				}
			}
		}
		return mergedCourse;
	}

	private LinkedList<String[]> One() {
		boolean flag = false;
		String[] sortedList = new String[20];
		String course1 = "";
		LinkedList<String[]> mergedCourse = new LinkedList<>();

		for (int i = 0; i < sortedList.length; i++) {
			sortedList[i] = "NULL";
		}

		for (int j = 0; j < adaptive.length; j++) {
			if (flag == false) {
				if (adaptive[j].substring(0, 1).equals("X")) {
					course1 = adaptive[j].substring(1);
					flag = true;
					continue;
				}
			} else {
				if (adaptive[j].substring(0, 1).equals("X")) {
					course1 = adaptive[j].substring(1);
					mergedCourse.add(sortedList);
					sortedList = new String[20];
					for (int t = 0; t < sortedList.length; t++) {
						sortedList[t] = "NULL";
					}
					continue;
				}
			}
			sortedList[Integer.parseInt(adaptive[j])] = course1;
		}
		mergedCourse.add(sortedList);
		return mergedCourse;
	}

}
