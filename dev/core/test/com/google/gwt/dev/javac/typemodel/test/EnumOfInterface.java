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
package com.google.gwt.dev.javac.typemodel.test;

/**
 * Enumerated type used in the
 * {@link com.google.gwt.core.ext.typeinfo.JEnumTypeTest}.
 */
public enum EnumOfInterface implements EnumInterface {
  @TestAnnotation("A")
  A {
    @TestAnnotation("A getExtra")
    @Override
    public String getExtra() {
      return "A extra";
    }
  },

  B;

  // Default just returns null
  public String getExtra() {
    return null;
  }
}
