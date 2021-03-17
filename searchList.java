class Node<E> 
{ 
	E data; 
	Node<E> next; 

	Node(E data) 
  { 
    this.data = data; 
  } 
} 

class LinkedList<E> 
{ 
  Node<E> head = null; 
	int size = 0; 

	public void add(E key) 
	{ 
		if (head == null) 
    { 
			head = new Node<>(key); 
			size++; 
			return; 
		} 

		Node<E> add = new Node<>(key); 

		Node<E> temp = head; 

		while (temp.next != null) 
			temp = temp.next; 

    temp.next = add; 
		size++; 
	} 

	public int search(E key) 
	{ 

		if (head == null)  
			return -1; 

		int index = 0; 
		Node<E> temp = head; 

		while (temp != null) 
    { 
			if (temp.data == key)
				return index; 
			 
			index++; 
			temp = temp.next; 
		} 
		return -1; 
	} 
} 

public class SearchList 
{ 
	public static void main(String[] args)
	{ 
		LinkedList<Integer> a = new LinkedList<>(); 

		a.add(-6); 
		a.add(3); 
		a.add(5); 
		a.add(6); 
		a.add(7); 
		a.add(-12); 
		a.add(27); 

		int key = 7; 

		int result = a.search(key); 

		if (result == -1) 
    { 
			System.out.println("Not located."); 
		}

		else
			System.out.println("Located at index: " + result);
	} 
}
