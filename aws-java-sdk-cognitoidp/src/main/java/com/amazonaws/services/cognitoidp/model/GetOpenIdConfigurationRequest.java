/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to get the Open ID configuration.
 * </p>
 */
public class GetOpenIdConfigurationRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool where you want to get Open ID
     * configuration information.
     * </p>
     */
    private String userPoolId;

    /**
     * <p>
     * The user pool ID for the user pool where you want to get Open ID
     * configuration information.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to get Open ID
     *        configuration information.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to get Open ID
     * configuration information.
     * </p>
     * 
     * @return The user pool ID for the user pool where you want to get Open ID
     *         configuration information.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to get Open ID
     * configuration information.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to get Open ID
     *        configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetOpenIdConfigurationRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpenIdConfigurationRequest == false)
            return false;
        GetOpenIdConfigurationRequest other = (GetOpenIdConfigurationRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        return hashCode;
    }

    @Override
    public GetOpenIdConfigurationRequest clone() {
        return (GetOpenIdConfigurationRequest) super.clone();
    }
}