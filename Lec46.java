class node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree
{
    Node root;
    BinaryTree(int data)
    {
        this.root = new Node(data);
    }

    int TreeSum(Node root)
    {
        if(root == null) return 0;
        return root.data + TreeSum(root.left) + TreeSum(root.right);
    }

    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree(2);
        bt.root.left = new Node(3);
        bt.root.right = new Node(5);
        bt.root.left.right = new Node(9);
        bt.root.right.left = new Node(7);
    }
}
