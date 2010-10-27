/*
 * Copyright 2000-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.facet.impl.invalid;

import com.intellij.util.containers.FactoryMap;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * @author nik
 */
public class InvalidFacetManagerImpl extends InvalidFacetManager {
  private Map<String, InvalidFacetType> myTypes = new FactoryMap<String, InvalidFacetType>() {
    @Override
    protected InvalidFacetType create(String key) {
      return new InvalidFacetType(key);
    }
  };

  @NotNull
  @Override
  public InvalidFacetType getOrCreateType(@NotNull String typeId) {
    return myTypes.get(typeId);
  }
}
