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

package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents information about the AWS Key Management Service (AWS KMS) key
 * used to encrypt data in the artifact store.
 * </p>
 */
public class EncryptionKey implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS KMS key.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of AWS KMS key, such as a customer master key.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ID of the AWS KMS key.
     * </p>
     * 
     * @param id
     *        The ID of the AWS KMS key.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the AWS KMS key.
     * </p>
     * 
     * @return The ID of the AWS KMS key.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the AWS KMS key.
     * </p>
     * 
     * @param id
     *        The ID of the AWS KMS key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EncryptionKey withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of AWS KMS key, such as a customer master key.
     * </p>
     * 
     * @param type
     *        The type of AWS KMS key, such as a customer master key.
     * @see EncryptionKeyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of AWS KMS key, such as a customer master key.
     * </p>
     * 
     * @return The type of AWS KMS key, such as a customer master key.
     * @see EncryptionKeyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of AWS KMS key, such as a customer master key.
     * </p>
     * 
     * @param type
     *        The type of AWS KMS key, such as a customer master key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EncryptionKeyType
     */

    public EncryptionKey withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of AWS KMS key, such as a customer master key.
     * </p>
     * 
     * @param type
     *        The type of AWS KMS key, such as a customer master key.
     * @see EncryptionKeyType
     */

    public void setType(EncryptionKeyType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of AWS KMS key, such as a customer master key.
     * </p>
     * 
     * @param type
     *        The type of AWS KMS key, such as a customer master key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EncryptionKeyType
     */

    public EncryptionKey withType(EncryptionKeyType type) {
        setType(type);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionKey == false)
            return false;
        EncryptionKey other = (EncryptionKey) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null
                && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionKey clone() {
        try {
            return (EncryptionKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
