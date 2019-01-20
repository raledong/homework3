import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * author: rale
 * createdAt: 1/20/19
 * 需要运行通过所有的测试用例
 */
public class LevelTraversalTest {

    LevelTraversal levelTraversal;
    @Before
    public void before() {
        levelTraversal = new LevelTraversal();
    }
    @Test
    public void test1() {
        TreeNode root = new TreeNode();
        root.setLetter('a');

        TreeNode leftChild = new TreeNode();
        leftChild.setLetter('b');
        root.setLeftChild(leftChild);

        TreeNode rightChild = new TreeNode();
        rightChild.setLetter('c');
        root.setRightChild(rightChild);

        String result = levelTraversal.traverse(root);
        Assert.assertEquals("abc", result);
    }

}
