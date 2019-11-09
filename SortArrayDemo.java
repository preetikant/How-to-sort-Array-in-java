//Ascending order
class SortArrayDemo{
	public static void main(String[] args) {
		int[] arr1 = {12,87,9,36,45,10};	
		for (int i=0;i<arr1.length ;i++ ) {
			for (int j=i+1;j<arr1.length ;j++ ) {
				if(arr1[i]<arr1[j])
				{
					int temp = arr1[i];
					 arr1[i] = arr1[j];
					 arr1[j]=temp;
				}				
			}
		}
		for (int k=0;k<arr1.length ;k++ ) {
			System.out.println(arr1[k]);
		}
			
	}
}