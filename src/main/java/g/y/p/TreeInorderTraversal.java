package g.y.p;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @see <a href="https://en.wikipedia.org/wiki/Tree_traversal">Tree Traversal Wiki</a>
 *
 */
public class TreeInorderTraversal {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		TreeNode p = root;
		while (!st.isEmpty() || p != null) {
			if (p != null) {
				st.push(p);
				p = p.left;
			} else {
				p = st.pop();
				//visit
				res.add(p.val);
				p = p.right;
			}
		}
		return res;
	}
}