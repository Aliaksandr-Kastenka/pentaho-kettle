/*!
* Copyright 2010 - 2015 Pentaho Corporation.  All rights reserved.
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
*
*/

package org.pentaho.di.repository.pur.model;

import org.pentaho.di.trans.TransMeta;

public class EETransMeta extends TransMeta implements ILockable, java.io.Serializable {

  private static final long serialVersionUID = -5959504570945456271L; /* EESOURCE: UPDATE SERIALVERUID */
  private RepositoryLock repositoryLock;

  /**
   * @return the repositoryLock
   */
  public RepositoryLock getRepositoryLock() {
    return repositoryLock;
  }

  /**
   * @param repositoryLock the repositoryLock to set
   */
  public void setRepositoryLock(RepositoryLock repositoryLock) {
    this.repositoryLock = repositoryLock;
  }
}