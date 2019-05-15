public class MaxRangeSum {
  private static String INVALID_RETURN_VALUE = "0";
  private static Integer MINIMUM_STRING_SIZE = 3;
  private int totalMaxRange;

  public MaxRangeSum() {
    // Initialize totalMaxRange to the smallest available value
    this.totalMaxRange = Integer.MIN_VALUE;
  }

  public String calculate(String input) {
    // Handle invalid inputs
    if( input == null || input.length() < MINIMUM_STRING_SIZE ) {
      return INVALID_RETURN_VALUE;
    }

    int currentMaxRange = 0;
    String[] splitInput = input.split(" ");
    int numberOfInts = Integer.parseInt(splitInput[0]);

    try {
      for (int currentIndex = 1; currentIndex <= numberOfInts; currentIndex++) {
        currentMaxRange += Integer.parseInt(splitInput[currentIndex]);
        if (this.totalMaxRange < currentIndex) {
          this.totalMaxRange = currentMaxRange;
        }
        if (currentMaxRange < 0) {
          currentMaxRange = 0;
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      // Handle case where numberOfInts causes an ArrayIndexOutOfBoundsException
      return INVALID_RETURN_VALUE;
    }

    return Integer.toString(totalMaxRange);
  }
}
