package algorithm;

import java.util.*;

//version 1: traverse
public class Selection1 {
	public ArrayList<Integer> preorderTraversal(TreeNode root)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		traverse(root, result);
		return result;
	}
	
	//��rootΪ����preorder����result����
	private void traverse(TreeNode root, ArrayList<Integer> result)
	{
		if(root == null)
		{
			return;
		}
		
		result.add(root.val);
		traverse(root.left, result);
		traverse(root.right, result);
	}
}

public class Selection2 {
	public ArrayList<Integer> preorderTraversal(TreeNode root)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		// null or leaf
		if(root == null)
		{
			return result;
		}

		// divide
		ArrayList<Integer> left = preorderTraversal(root.left);
		ArrayList<Integer> right = preorderTraversal(root.right);

		//conquer
		result.add(root.val);
		result.addAll(left);
		result.addAll(right);
		return result;
	}
}


