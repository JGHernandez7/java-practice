class ReverseLL
{
  public static void main(String[] args) 
  {
    LL.Node head = new LL.Node(1); 
    LL linkedlist = new LL(head);

    linkedlist.add(new LL.Node(2)); 
    linkedlist.add(new LL.Node(3));
    linkedlist.add(new LL.Node(4));
    linkedlist.add(new LL.Node(5));
    linkedlist.add(new LL.Node(6));
    linkedlist.add(new LL.Node(7));
    
    linkedlist.print();
    
    linkedlist.reverse();
    
    linkedlist.print();
  }
}

class LL
{
  static class Node
  {
    private int data;
    private Node next;

    public Node(int data)
    {
      this.data = data;
    }

    public int data()
    {
      return data;
    }

    public Node next()
    {
      return next;
    }
  }

  private Node head;

  public LL(Node head)
  {
    this.head = head;
  }

  public void add(Node node)
  {
    Node curr = head;
    
    while (curr != null)
    {
      if (curr.next == null)
      {
        curr.next = node;
        break;
      }

      curr = curr.next;
    }
  }

  public void print()
  {
    Node node = head;

    while (node != null)
    {
      System.out.print(node.data() + " ");
      
      node = node.next();
    }

    System.out.println("");
  }

  public void reverse()
  {
    Node pivot = head, prev = null, curr = null;
    
    while (pivot != null)
    {
      curr = pivot;
      pivot = pivot.next;

      curr.next = prev;
      prev = curr;
      head = curr;
    }
  }
}