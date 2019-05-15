import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxRangeSumTest {
  private MaxRangeSum maxRangeSum;

  @Before
  public void setUp() {
    maxRangeSum = new MaxRangeSum();
  }

  @Test
  public void exampleTest_HappyPath() {
    Assert.assertEquals(maxRangeSum.calculate("10 7 -3 -10 4 2 8 -2 4 -5 -6"), "16");
  }

  @Test
  public void myTest_nullInput() {
    Assert.assertEquals(maxRangeSum.calculate(null), "0");
  }

  @Test
  public void myTest_invalidCharacterCountInput() {
    String oneCharInvalid = "1";
    String twoCharInvalid = "1 ";
    Assert.assertEquals(maxRangeSum.calculate(oneCharInvalid), "0");
    Assert.assertEquals(maxRangeSum.calculate(twoCharInvalid), "0");
  }

  @Test
  public void myTest_invalidNumberOfIntsValueInput() {
    Assert.assertEquals(maxRangeSum.calculate("3 7 -3"), "0");
  }
}
