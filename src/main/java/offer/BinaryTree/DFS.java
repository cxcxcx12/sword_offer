package offer.BinaryTree;

import offer.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class DFS {

    public static void dfs(TreeNode root, LinkedList<Integer> list,int count) {

        if (root!=null) {

            dfs(root.left,list,count);
            list.add(root.val);
            dfs(root.right,list,count);

        }
    }

    public static void main(String[] args) {

        LinkedList<Integer> integers = new LinkedList<>();
        TreeNode treeNode = new TreeNode(111);
        treeNode.left= new TreeNode(11);
        treeNode.right= new TreeNode(3);
        treeNode.left.left= new TreeNode(1);
        treeNode.left.right= new TreeNode(5);
        treeNode.right.left= new TreeNode(6);
        treeNode.right.right= new TreeNode(7);
        Integer integer = new Integer(15);
        dfs(treeNode,integers,integer);

    }

}
