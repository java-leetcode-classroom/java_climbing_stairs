public class Solution {
  public int climbStairs(int n) {
    if (n <= 3) {
      return n;
    }
    int prevTwo = 2;
    int prevOne = 3;
    int ways = 0;
    for (int stairs = 4; stairs <= n; stairs++) {
      ways = prevTwo + prevOne;
      prevTwo = prevOne;
      prevOne = ways;
    }
    return ways;
  }
}
