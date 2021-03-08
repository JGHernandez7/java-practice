class InsertionSort 
{
	
	void sort(int a[])
	{
		int n = a.length;
		for (int i = 1; i < n; ++i) 
    {
			int curr = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > curr) 
      {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = curr;
		}
	}

	static void printArray(int a[])
	{
		int n = a.length;
		for (int i = 0; i < n; ++i)
			System.out.print(a[i] + " ");

		System.out.println();
	}
	
	public static void main(String args[])
	{
		int a[] = { 25, 56, 23, 10, 9};

		InsertionSort x = new InsertionSort();
		x.sort(a);

		printArray(a);
	}
}