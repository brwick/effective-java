package org.brwick.effectivejava.ch04.item16;

import com.google.common.collect.Lists;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created on 1/10/2016.
 */
public class BrokenInstrumentedHashSetTest {

  @Test
  public void testAddAll() throws Exception {
    BrokenInstrumentedHashSet<Integer> brokenSet = new BrokenInstrumentedHashSet();
    brokenSet.addAll(Lists.newArrayList(1, 2, 3));
    Assert.assertNotSame(brokenSet.getAddCount(), 3);
    Assert.assertEquals(brokenSet.getAddCount(), 6);
  }
}
