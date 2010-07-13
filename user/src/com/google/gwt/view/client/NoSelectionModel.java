/*
 * Copyright 2010 Google Inc.
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
package com.google.gwt.view.client;

import com.google.gwt.view.client.SelectionModel.AbstractSelectionModel;

/**
 * A selection model that does not allow selection, but fires selection change
 * events. Use this model if you want to know when a user selects an item, but
 * do not want the view to update based on the selection.
 * 
 * <p>
 * Note: This class is new and its interface subject to change.
 * </p>
 * 
 * @param <T> the record data type
 */
public class NoSelectionModel<T> extends AbstractSelectionModel<T> {

  private Object lastKey;
  private T lastSelection;

  /**
   * Gets the object that was last selected.
   * 
   * @return the last selected object
   */
  public T getLastSelectedObject() {
    return lastSelection;
  }

  public boolean isSelected(T object) {
    return false;
  }

  public void setSelected(T object, boolean selected) {
    Object key = getKey(object);
    if (selected) {
      lastSelection = object;
      lastKey = key;
    } else if (lastKey != null && lastKey.equals(key)) {
      lastSelection = null;
      lastKey = null;
    }
    scheduleSelectionChangeEvent();
  }
}