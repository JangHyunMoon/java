package array;

public class Test4 {

	public static void main(String[] args) {
		int i, j, count = 0;
		double sum = 0, avg;
		int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, 
				{45, 26, 72, 23}};
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = sum / count;
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
	}

}
