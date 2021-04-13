package edyene;

public class Exercicio02 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 10, 10, 10, 10 };
		int[] arr2 = { 10, 10, 10, 10, 10 };

		double result = (resolveMedian(arr1) + resolveMedian(arr2)) / 2;
		System.out.println(result);
	}

	public static double resolveMedian(int[] arr) {
		double median = 0;
		for (int a : arr) {
			median += a;
		}
		return (median / arr.length);
	}

}
