import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private  Solution sol = new Solution();
  @Test
  void climbStairsExamples1() {
    assertEquals(2, sol.climbStairs(2));
  }
  @Test
  void climbStairsExamples2() {
    assertEquals(3, sol.climbStairs(3));
  }
  @Test
  void climbStairsExamples3() {
    assertEquals(5, sol.climbStairs(4));
  }
}