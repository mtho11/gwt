/*
 * Copyright 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.collections;

import static com.google.gwt.collections.CollectionFactory.createMutableArray;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests mutable array implementation internal details.
 */
public class MutableArrayInternalTest extends GWTTestCase {

  @Override
  public String getModuleName() {
    return null;
  }

  public void testSetSizeNullElems() {
    MutableArray<String> b = createMutableArray();
    
    b.setSize(1, "fillValue");
    assertTrue(hasElems(b));

    b.setSize(0, null);
    assertFalse(hasElems(b));
  }
  
  public native boolean hasElems(MutableArray ma) /*-{
    return !(ma.elems === undefined) 
  }-*/;

}