import com.henry.Solution3;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;


public class L2022211945_3_Test {
    private Solution3 solution = new Solution3();

    /**
     * 测试目的：验证输入为 [1, 2, 3] 时，是否能正确返回最大的整除子集 [1, 2] 或 [1, 3]。
     * 测试用例：输入为 [1, 2, 3]。
     */
    @Test
    public void testLargestDivisibleSubset_Case1() {
        int[] nums = {1, 2, 3};
        List<Integer> result = solution.largestDivisibleSubset(nums);
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
    }

    /**
     * 测试目的：验证输入为 [1, 2, 4, 8] 时，是否能正确返回最大的整除子集 [1, 2, 4, 8]。
     * 测试用例：输入为 [1, 2, 4, 8]。
     */
    @Test
    public void testLargestDivisibleSubset_Case2() {
        int[] nums = {1, 2, 4, 8};
        List<Integer> result = solution.largestDivisibleSubset(nums);
        assertEquals(4, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(4));
        assertTrue(result.contains(8));
    }

    /**
     * 测试目的：验证输入为 [1, 2, 4, 8, 16, 32, 64, 25, 26, 29, 10, 90, 50, 77] 时，是否能正确返回最大的整除子集 [1, 2, 4, 8, 16, 32, 64]。
     * 测试用例：输入为 [1, 2, 4, 8, 16, 32, 64]。
     */
    @Test
    //随意测试
    public void testLargestDivisibleSubset2() {
        int[] nums = {1, 2, 4, 8, 16, 32, 64, 25, 26, 29, 10, 90, 50, 77};
        List<Integer> result = solution.largestDivisibleSubset(nums);
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(4));
        assertTrue(result.contains(8));
        assertTrue(result.contains(16));
        assertTrue(result.contains(32));
        assertTrue(result.contains(64));
    }
}



