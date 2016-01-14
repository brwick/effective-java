package org.brwick.effectivejava.ch04.item16;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created on 1/10/2016.
 * Broken - Inappropriate use of inheritance!
 */
public class BrokenInstrumentedHashSet<E> extends HashSet<E> {
  // The number of attempted element insertions
  private int addCount = 0;

  public BrokenInstrumentedHashSet() {

  }

  public BrokenInstrumentedHashSet(int initCap, float loadFactor) {
    super(initCap, loadFactor);
  }

  @Override
  public boolean add(E e) {
    addCount++;
    return super.add(e);
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    addCount += c.size();
    return super.addAll(c);
  }

  public int getAddCount() {
    return addCount;
  }
}
