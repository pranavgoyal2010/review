public class Program {
	public static void main(String[] args){
		int[] arr = {20, 90, 65, 74, 36}; //Example can be any array
		int[] result = minMax(arr);
		System.out.println("Maximum: "+result[1]);
		System.out.println("Minimum: "+result[0]);
	}

	public static int[] minMax(int[] arr)
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

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
