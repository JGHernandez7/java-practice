import java.util.Stack;

class PreOrderTrav 
{
  public static void main(String[] args){
    BTree bt = new BTree();
    BTree.TNode root = new BTree.TNode("7");
    bt.root = root;

    bt.root.left = new BTree.TNode("8");
    bt.root.left.left = new BTree.TNode("9");
    bt.root.left.right = new BTree.TNode("10");
    bt.root.right = new BTree.TNode("11");
    bt.root.right.right = new BTree.TNode("12");

    bt.preOrder();
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

  public void preOrder()
  {
    preOrder(root);
  }

  private void preOrder(TNode node)
  {
    if (node == null)
    {
      return;
    }

    System.out.printf("%s ", node.data);
    preOrder(node.left); 
    preOrder(node.right);
  }
}