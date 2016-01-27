package org.brwick.effectivejava.ch04.item16;

import com.google.common.collect.Lists;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created on 1/10/2016.
 */
public class BrokenInstrumentedHashSetTest {

  @Test
  public void testAddAll() throws Exception {
    BrokenInstrumentedHashSet<Integer> brokenSet = new BrokenInstrumentedHashSet();
    brokenSet.addAll(Lists.newArrayList(1, 2, 3));
    assertNotSame(brokenSet.getAddCount(), 3);
    assertEquals(brokenSet.getAddCount(), 6);
  }
}
