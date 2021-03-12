import java.util.Stack;

class InOrderTrav 
{
  public static void main(String[] args) 
  {
    BTree bt = new BTree();
    BTree.TNode root = new BTree.TNode("7"); 
    bt.root = root; 

    bt.root.left = new BTree.TNode("5"); 
    bt.root.left.left = new BTree.TNode("4"); 
    bt.root.left.right = new BTree.TNode("6"); 
    bt.root.right = new BTree.TNode("9"); 
    bt.root.right.left = new BTree.TNode("8");
    bt.root.right.right = new BTree.TNode("10");

    bt.inOrder();
    System.out.println();
  }
}

class BTree
{
  static class TNode
  {
    String data;
    TNode 
      left, 
      right;

    TNode(String value)
    {
      this.data = value;
      left = right = null;
    }

    boolean isLeaf()
    {
      return left == null ? right == null : false;
    }
  }

  TNode root;

  public void inOrder()
  {
    inOrder(root);
  }

  private void inOrder(TNode node)
  {
    if (node == null)
    {
      return;
    }

    inOrder(node.left);
    System.out.printf("%s ", node.data);
    inOrder(node.right);
  }
}
