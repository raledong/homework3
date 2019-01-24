import java.util.LinkedList;
import java.util.Queue;

/**
 * author: rale
 * createdAt: 1/20/19
 * 对树节点的水平遍历
 * 难度：HARD
 */
public class LevelTraversal {

    /**
     *  对传入的树的根节点进行水平遍历
     *  如树的结构为：
     *      a
     *     / \
     *    b   c
     *    则返回的字符串为abc
     *
     *    涉及知识点：
     *    1.水平遍历（Level Traversal)
     *    2.StringBuilder与String
     *    3.队列（Queue）
     */
    public String traverse(TreeNode root) {
        if (root == null) {
            return "";
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            result.append(current.getLetter());

            if (current.getLeftChild() != null) {
                queue.offer(current.getLeftChild());
            }

            if (current.getRightChild() != null) {
                queue.offer(current.getRightChild());
            }
        }
        return result.toString();
    }
}
