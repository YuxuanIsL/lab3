import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2(){
    int[] input1 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 1}, input1);
  }

  @Test
  public void testReversed2(){
    int[] input1 = {1, 2, 3, 4};
    int[] actualResult = ArrayExamples.reversed(input1);
    int[] expectedOutput1 = {4, 3, 2, 1};
    assertArrayEquals(expectedOutput1, actualResult);
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input2 = {1, 2, 1, 5};
    double actualResulst = ArrayExamples.averageWithoutLowest(input2);
    double expectedOutput = 3.5;
  }

  // @Test
  // public void testAverageWithoutLowest2(){

  // }


}