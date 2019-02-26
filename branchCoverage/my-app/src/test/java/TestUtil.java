import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void arraySizeOne(){
    assertFalse(c.compute(new int[1]));
  }

  @Test
  public void arraySizeNotOne(){
    assertFalse(c.compute(new int[2]));
  }

  @Test(expected = RuntimeException.class)
  public void arraySizeNotDivbyTwo(){
    int[] arr = {0, 1, 2};
    c.compute(arr);
  }

  @Test
  public void divisible(){
    int[] arr = {2, 1, 2};
    assertTrue(c.compute(arr));
  }

  @Test
  public void notDivisible(){
    int[] arr = {2, 3, 2};
    assertFalse(c.compute(arr));
  }
}
