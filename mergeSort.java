class MergeSort
{
	void merge(int a[], int left, int mid, int right)
	{
		int 
      sub1 = mid - left + 1,
		  sub2 = right - mid;

		int 
      LeftArray[] = new int[sub1],
      RightArray[] = new int[sub2];

		for (int i = 0; i < sub1; ++i)
			LeftArray[i] = a[left + i];

		for (int j = 0; j < sub2; ++j)
			RightArray[j] = a[mid + 1 + j];

    int
      i = 0, 
      j = 0,
      k = left;

		while (i < sub1 && j < sub2) 
    {
			if (LeftArray[i] <= RightArray[j]) 
      {
				a[k] = LeftArray[i];
				i++;
			}

			else 
      {
				a[k] = RightArray[j];
				j++;
			}

			k++;
		}

		while (i < sub1) 
    {
			a[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < sub2) 
    {
			a[k] = RightArray[j];
			j++;
			k++;
		}
	}

	void sort(int a[], int left, int right)
	{
		if (left < right) 
    {
			int mid = left + (right - left) / 2;

			sort(a, left, mid);
			sort(a, mid + 1, right);

			merge(a, left, mid, right);
		}
	}

	static void print(int a[])
	{
		int len = a.length;

		for (int i = 0; i < len; ++i)
			System.out.print(a[i] + " ");

		System.out.println();
	}

	public static void main(String args[])
	{
		int a[] = { 9, 8, 10, 2, 3, 7};

		System.out.println("Array: ");
		print(a);

		MergeSort sample = new MergeSort();
		sample.sort(a, 0, a.length - 1);

		System.out.println("Sorted array: ");
		print(a);
	}
}