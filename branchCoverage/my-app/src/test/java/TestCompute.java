import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

  @Test
  public void mqSizeZero() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(c.mq.size()).thenReturn(0);
    assertEquals(-1, c.countNumberOfOccurrences(""));
  }

  @Test
  public void mqNotZero() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(c.mq.size()).thenReturn(3);
    assertEquals(0, c.countNumberOfOccurrences(""));
  }
}
