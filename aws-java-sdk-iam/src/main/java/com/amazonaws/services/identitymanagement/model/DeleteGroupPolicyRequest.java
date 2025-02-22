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

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteGroupPolicyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the group that the policy
     * is embedded in.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The name identifying the policy document to delete.
     * </p>
     */
    private String policyName;

    /**
     * Default constructor for DeleteGroupPolicyRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize the
     * object after creating it.
     */
    public DeleteGroupPolicyRequest() {
    }

    /**
     * Constructs a new DeleteGroupPolicyRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param groupName
     *        The name (friendly name, not ARN) identifying the group that the
     *        policy is embedded in.
     * @param policyName
     *        The name identifying the policy document to delete.
     */
    public DeleteGroupPolicyRequest(String groupName, String policyName) {
        setGroupName(groupName);
        setPolicyName(policyName);
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the group that the policy
     * is embedded in.
     * </p>
     * 
     * @param groupName
     *        The name (friendly name, not ARN) identifying the group that the
     *        policy is embedded in.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the group that the policy
     * is embedded in.
     * </p>
     * 
     * @return The name (friendly name, not ARN) identifying the group that the
     *         policy is embedded in.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the group that the policy
     * is embedded in.
     * </p>
     * 
     * @param groupName
     *        The name (friendly name, not ARN) identifying the group that the
     *        policy is embedded in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteGroupPolicyRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The name identifying the policy document to delete.
     * </p>
     * 
     * @param policyName
     *        The name identifying the policy document to delete.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name identifying the policy document to delete.
     * </p>
     * 
     * @return The name identifying the policy document to delete.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name identifying the policy document to delete.
     * </p>
     * 
     * @param policyName
     *        The name identifying the policy document to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteGroupPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
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
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteGroupPolicyRequest == false)
            return false;
        DeleteGroupPolicyRequest other = (DeleteGroupPolicyRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteGroupPolicyRequest clone() {
        return (DeleteGroupPolicyRequest) super.clone();
    }
}