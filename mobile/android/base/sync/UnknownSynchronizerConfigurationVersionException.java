/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.goanna.sync;

public class UnknownSynchronizerConfigurationVersionException extends
    SyncConfigurationException {
  public int badVersion;
  private static final long serialVersionUID = -8497255862099517395L;

  public UnknownSynchronizerConfigurationVersionException(int version) {
    super();
    badVersion = version;
  }
}
