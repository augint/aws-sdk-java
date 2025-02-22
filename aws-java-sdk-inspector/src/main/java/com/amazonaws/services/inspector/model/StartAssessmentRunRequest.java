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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class StartAssessmentRunRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The assessment template ARN of the assessment run that you want to start.
     * </p>
     */
    private String assessmentTemplateArn;
    /**
     * <p>
     * You can specify the name for the assessment run, or it is auto-generated
     * based on the assessment template name. Must be unique for the assessment
     * template.
     * </p>
     */
    private String assessmentRunName;

    /**
     * <p>
     * The assessment template ARN of the assessment run that you want to start.
     * </p>
     * 
     * @param assessmentTemplateArn
     *        The assessment template ARN of the assessment run that you want to
     *        start.
     */

    public void setAssessmentTemplateArn(String assessmentTemplateArn) {
        this.assessmentTemplateArn = assessmentTemplateArn;
    }

    /**
     * <p>
     * The assessment template ARN of the assessment run that you want to start.
     * </p>
     * 
     * @return The assessment template ARN of the assessment run that you want
     *         to start.
     */

    public String getAssessmentTemplateArn() {
        return this.assessmentTemplateArn;
    }

    /**
     * <p>
     * The assessment template ARN of the assessment run that you want to start.
     * </p>
     * 
     * @param assessmentTemplateArn
     *        The assessment template ARN of the assessment run that you want to
     *        start.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StartAssessmentRunRequest withAssessmentTemplateArn(
            String assessmentTemplateArn) {
        setAssessmentTemplateArn(assessmentTemplateArn);
        return this;
    }

    /**
     * <p>
     * You can specify the name for the assessment run, or it is auto-generated
     * based on the assessment template name. Must be unique for the assessment
     * template.
     * </p>
     * 
     * @param assessmentRunName
     *        You can specify the name for the assessment run, or it is
     *        auto-generated based on the assessment template name. Must be
     *        unique for the assessment template.
     */

    public void setAssessmentRunName(String assessmentRunName) {
        this.assessmentRunName = assessmentRunName;
    }

    /**
     * <p>
     * You can specify the name for the assessment run, or it is auto-generated
     * based on the assessment template name. Must be unique for the assessment
     * template.
     * </p>
     * 
     * @return You can specify the name for the assessment run, or it is
     *         auto-generated based on the assessment template name. Must be
     *         unique for the assessment template.
     */

    public String getAssessmentRunName() {
        return this.assessmentRunName;
    }

    /**
     * <p>
     * You can specify the name for the assessment run, or it is auto-generated
     * based on the assessment template name. Must be unique for the assessment
     * template.
     * </p>
     * 
     * @param assessmentRunName
     *        You can specify the name for the assessment run, or it is
     *        auto-generated based on the assessment template name. Must be
     *        unique for the assessment template.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StartAssessmentRunRequest withAssessmentRunName(
            String assessmentRunName) {
        setAssessmentRunName(assessmentRunName);
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
        if (getAssessmentTemplateArn() != null)
            sb.append("AssessmentTemplateArn: " + getAssessmentTemplateArn()
                    + ",");
        if (getAssessmentRunName() != null)
            sb.append("AssessmentRunName: " + getAssessmentRunName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAssessmentRunRequest == false)
            return false;
        StartAssessmentRunRequest other = (StartAssessmentRunRequest) obj;
        if (other.getAssessmentTemplateArn() == null
                ^ this.getAssessmentTemplateArn() == null)
            return false;
        if (other.getAssessmentTemplateArn() != null
                && other.getAssessmentTemplateArn().equals(
                        this.getAssessmentTemplateArn()) == false)
            return false;
        if (other.getAssessmentRunName() == null
                ^ this.getAssessmentRunName() == null)
            return false;
        if (other.getAssessmentRunName() != null
                && other.getAssessmentRunName().equals(
                        this.getAssessmentRunName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssessmentTemplateArn() == null) ? 0
                        : getAssessmentTemplateArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssessmentRunName() == null) ? 0
                        : getAssessmentRunName().hashCode());
        return hashCode;
    }

    @Override
    public StartAssessmentRunRequest clone() {
        return (StartAssessmentRunRequest) super.clone();
    }
}