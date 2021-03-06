/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.client.domain;

/**
 * Example {@link AccountNumberGenerator} for clients that takes an entities
 * auto generated database id and zero fills it ensuring the identifier is
 * always of a given <code>maxLength</code>.
 */
public class ZeroPaddedAccountNumberGenerator implements AccountNumberGenerator {

    private final int maxLength;

    public ZeroPaddedAccountNumberGenerator(final int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public String generate(final Long id) {
        return String.format("%0" + this.maxLength + "d", id);
    }
}