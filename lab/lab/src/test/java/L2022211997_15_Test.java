import java.util.Scanner;

import org.example.Solution15;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class L2022211997_15_Test {

    private final Solution15 solution = new Solution15();

    /**
     * 测试相同版本号的情况。
     * 测试用例: version1 = "1.0", version2 = "1.0"
     * 期望返回值: 0
     */
    @Test
    public void testEqualVersions() {
        assertEquals(0, solution.compareVersion("1.0", "1.0"));
    }

    /**
     * 测试 version1 大于 version2 的情况。
     * 测试用例: version1 = "1.2", version2 = "1.1"
     * 期望返回值: 1
     */
    @Test
    public void testVersion1Greater() {
        assertEquals(1, solution.compareVersion("1.2", "1.1"));
    }

    /**
     * 测试 version1 小于 version2 的情况。
     * 测试用例: version1 = "1.0", version2 = "1.1"
     * 期望返回值: -1
     */
    @Test
    public void testVersion1Less() {
        assertEquals(-1, solution.compareVersion("1.0", "1.1"));
    }

    /**
     * 测试不同长度的版本号。
     * 测试用例: version1 = "1.0.0", version2 = "1"
     * 期望返回值: 0
     */
    @Test
    public void testDifferentLengthVersions() {
        assertEquals(0, solution.compareVersion("1.0.0", "1"));
    }

    /**
     * 测试 version1 包含多个部分而 version2 为单一部分。
     * 测试用例: version1 = "1.0.1", version2 = "1"
     * 期望返回值: 1
     */
    @Test
    public void testMultiplePartsVersion1Greater() {
        assertEquals(1, solution.compareVersion("1.0.1", "1"));
    }

    /**
     * 测试包含数字0的情况。
     * 测试用例: version1 = "0.1", version2 = "1.0"
     * 期望返回值: -1
     */
    @Test
    public void testVersionWithZero() {
        assertEquals(-1, solution.compareVersion("0.1", "1.0"));
    }

    /**
     * 测试复杂版本号。
     * 测试用例: version1 = "1.2.3", version2 = "1.2.3.4"
     * 期望返回值: -1
     */
    @Test
    public void testComplexVersions() {
        assertEquals(-1, solution.compareVersion("1.2.3", "1.2.3.4"));
    }
}


   

