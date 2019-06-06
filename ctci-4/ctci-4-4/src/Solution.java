import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        /* create empty list of lists that will be returned */
        List<List<Integer>> sol = new LinkedList<>();
        if (root == null) return sol;

        /* Create empty queue to hold level nodes */
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();

        /* Initialize tempList and nodeQueue with */
        nodeQueue.add(root);

        /* other helper variables */
        int levelSize;
        TreeNode tempNode;
        List<Integer> tempList;

        while (nodeQueue.size() != 0) {
            tempList = new LinkedList<>();
            levelSize = nodeQueue.size();
            for (int i = 0; i < levelSize; i++) {
                tempNode = nodeQueue.poll();
                if (tempNode.left != null) nodeQueue.add(tempNode.left);
                if (tempNode.right != null) nodeQueue.add(tempNode.right);
                tempList.add(tempNode.val);
            }
            sol.add(tempList);
        }
        return sol;
    }
}