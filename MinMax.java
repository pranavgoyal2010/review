public class MinMax {
	public static void main(String[] args){
		int[] arr = {200};
		int[] result = minMax(arr);

		System.out.println("Minimum : "+result[0]);
		System.out.println("Maximum : "+result[1]);
	}
	
	public static int[] minMax(int[] arr) {
		int min = (1<<31) - 1;
		int max = -(1<<31);

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}

		return new int[]{min, max};
	}
}
