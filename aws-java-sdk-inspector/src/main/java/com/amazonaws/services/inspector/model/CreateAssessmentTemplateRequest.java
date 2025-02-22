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
public class CreateAssessmentTemplateRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN specifying the assessment target for which you want to create the
     * assessment template.
     * </p>
     */
    private String assessmentTargetArn;
    /**
     * <p>
     * The user-defined name identifying the assessment template that you want
     * to create. You can create several assessment templates for an assessment
     * target. The names of the assessment templates corresponding to a
     * particular assessment target must be unique.
     * </p>
     */
    private String assessmentTemplateName;
    /**
     * <p>
     * The duration of the assessment run in seconds. The default value is 3600
     * seconds (one hour).
     * </p>
     */
    private Integer durationInSeconds;
    /**
     * <p>
     * The ARNs specifying the rules packages that you want to attach to the
     * assessment template.
     * </p>
     */
    private java.util.List<String> rulesPackageArns;
    /**
     * <p>
     * The user-defined attributes that are assigned to every finding generated
     * by the assessment run that uses this assessment template.
     * </p>
     */
    private java.util.List<Attribute> userAttributesForFindings;

    /**
     * <p>
     * The ARN specifying the assessment target for which you want to create the
     * assessment template.
     * </p>
     * 
     * @param assessmentTargetArn
     *        The ARN specifying the assessment target for which you want to
     *        create the assessment template.
     */

    public void setAssessmentTargetArn(String assessmentTargetArn) {
        this.assessmentTargetArn = assessmentTargetArn;
    }

    /**
     * <p>
     * The ARN specifying the assessment target for which you want to create the
     * assessment template.
     * </p>
     * 
     * @return The ARN specifying the assessment target for which you want to
     *         create the assessment template.
     */

    public String getAssessmentTargetArn() {
        return this.assessmentTargetArn;
    }

    /**
     * <p>
     * The ARN specifying the assessment target for which you want to create the
     * assessment template.
     * </p>
     * 
     * @param assessmentTargetArn
     *        The ARN specifying the assessment target for which you want to
     *        create the assessment template.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAssessmentTemplateRequest withAssessmentTargetArn(
            String assessmentTargetArn) {
        setAssessmentTargetArn(assessmentTargetArn);
        return this;
    }

    /**
     * <p>
     * The user-defined name identifying the assessment template that you want
     * to create. You can create several assessment templates for an assessment
     * target. The names of the assessment templates corresponding to a
     * particular assessment target must be unique.
     * </p>
     * 
     * @param assessmentTemplateName
     *        The user-defined name identifying the assessment template that you
     *        want to create. You can create several assessment templates for an
     *        assessment target. The names of the assessment templates
     *        corresponding to a particular assessment target must be unique.
     */

    public void setAssessmentTemplateName(String assessmentTemplateName) {
        this.assessmentTemplateName = assessmentTemplateName;
    }

    /**
     * <p>
     * The user-defined name identifying the assessment template that you want
     * to create. You can create several assessment templates for an assessment
     * target. The names of the assessment templates corresponding to a
     * particular assessment target must be unique.
     * </p>
     * 
     * @return The user-defined name identifying the assessment template that
     *         you want to create. You can create several assessment templates
     *         for an assessment target. The names of the assessment templates
     *         corresponding to a particular assessment target must be unique.
     */

    public String getAssessmentTemplateName() {
        return this.assessmentTemplateName;
    }

    /**
     * <p>
     * The user-defined name identifying the assessment template that you want
     * to create. You can create several assessment templates for an assessment
     * target. The names of the assessment templates corresponding to a
     * particular assessment target must be unique.
     * </p>
     * 
     * @param assessmentTemplateName
     *        The user-defined name identifying the assessment template that you
     *        want to create. You can create several assessment templates for an
     *        assessment target. The names of the assessment templates
     *        corresponding to a particular assessment target must be unique.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAssessmentTemplateRequest withAssessmentTemplateName(
            String assessmentTemplateName) {
        setAssessmentTemplateName(assessmentTemplateName);
        return this;
    }

    /**
     * <p>
     * The duration of the assessment run in seconds. The default value is 3600
     * seconds (one hour).
     * </p>
     * 
     * @param durationInSeconds
     *        The duration of the assessment run in seconds. The default value
     *        is 3600 seconds (one hour).
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The duration of the assessment run in seconds. The default value is 3600
     * seconds (one hour).
     * </p>
     * 
     * @return The duration of the assessment run in seconds. The default value
     *         is 3600 seconds (one hour).
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * The duration of the assessment run in seconds. The default value is 3600
     * seconds (one hour).
     * </p>
     * 
     * @param durationInSeconds
     *        The duration of the assessment run in seconds. The default value
     *        is 3600 seconds (one hour).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAssessmentTemplateRequest withDurationInSeconds(
            Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * <p>
     * The ARNs specifying the rules packages that you want to attach to the
     * assessment template.
     * </p>
     * 
     * @return The ARNs specifying the rules packages that you want to attach to
     *         the assessment template.
     */

    public java.util.List<String> getRulesPackageArns() {
        return rulesPackageArns;
    }

    /**
     * <p>
     * The ARNs specifying the rules packages that you want to attach to the
     * assessment template.
     * </p>
     * 
     * @param rulesPackageArns
     *        The ARNs specifying the rules packages that you want to attach to
     *        the assessment template.
     */

    public void setRulesPackageArns(
            java.util.Collection<String> rulesPackageArns) {
        if (rulesPackageArns == null) {
            this.rulesPackageArns = null;
            return;
        }

        this.rulesPackageArns = new java.util.ArrayList<String>(
                rulesPackageArns);
    }

    /**
     * <p>
     * The ARNs specifying the rules packages that you want to attach to the
     * assessment template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRulesPackageArns(java.util.Collection)} or
     * {@link #withRulesPackageArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param rulesPackageArns
     *        The ARNs specifying the rules packages that you want to attach to
     *        the assessment template.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAssessmentTemplateRequest withRulesPackageArns(
            String... rulesPackageArns) {
        if (this.rulesPackageArns == null) {
            setRulesPackageArns(new java.util.ArrayList<String>(
                    rulesPackageArns.length));
        }
        for (String ele : rulesPackageArns) {
            this.rulesPackageArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs specifying the rules packages that you want to attach to the
     * assessment template.
     * </p>
     * 
     * @param rulesPackageArns
     *        The ARNs specifying the rules packages that you want to attach to
     *        the assessment template.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAssessmentTemplateRequest withRulesPackageArns(
            java.util.Collection<String> rulesPackageArns) {
        setRulesPackageArns(rulesPackageArns);
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every finding generated
     * by the assessment run that uses this assessment template.
     * </p>
     * 
     * @return The user-defined attributes that are assigned to every finding
     *         generated by the assessment run that uses this assessment
     *         template.
     */

    public java.util.List<Attribute> getUserAttributesForFindings() {
        return userAttributesForFindings;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every finding generated
     * by the assessment run that uses this assessment template.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every finding
     *        generated by the assessment run that uses this assessment
     *        template.
     */

    public void setUserAttributesForFindings(
            java.util.Collection<Attribute> userAttributesForFindings) {
        if (userAttributesForFindings == null) {
            this.userAttributesForFindings = null;
            return;
        }

        this.userAttributesForFindings = new java.util.ArrayList<Attribute>(
                userAttributesForFindings);
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every finding generated
     * by the assessment run that uses this assessment template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUserAttributesForFindings(java.util.Collection)} or
     * {@link #withUserAttributesForFindings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every finding
     *        generated by the assessment run that uses this assessment
     *        template.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAssessmentTemplateRequest withUserAttributesForFindings(
            Attribute... userAttributesForFindings) {
        if (this.userAttributesForFindings == null) {
            setUserAttributesForFindings(new java.util.ArrayList<Attribute>(
                    userAttributesForFindings.length));
        }
        for (Attribute ele : userAttributesForFindings) {
            this.userAttributesForFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every finding generated
     * by the assessment run that uses this assessment template.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every finding
     *        generated by the assessment run that uses this assessment
     *        template.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAssessmentTemplateRequest withUserAttributesForFindings(
            java.util.Collection<Attribute> userAttributesForFindings) {
        setUserAttributesForFindings(userAttributesForFindings);
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
        if (getAssessmentTargetArn() != null)
            sb.append("AssessmentTargetArn: " + getAssessmentTargetArn() + ",");
        if (getAssessmentTemplateName() != null)
            sb.append("AssessmentTemplateName: " + getAssessmentTemplateName()
                    + ",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: " + getDurationInSeconds() + ",");
        if (getRulesPackageArns() != null)
            sb.append("RulesPackageArns: " + getRulesPackageArns() + ",");
        if (getUserAttributesForFindings() != null)
            sb.append("UserAttributesForFindings: "
                    + getUserAttributesForFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssessmentTemplateRequest == false)
            return false;
        CreateAssessmentTemplateRequest other = (CreateAssessmentTemplateRequest) obj;
        if (other.getAssessmentTargetArn() == null
                ^ this.getAssessmentTargetArn() == null)
            return false;
        if (other.getAssessmentTargetArn() != null
                && other.getAssessmentTargetArn().equals(
                        this.getAssessmentTargetArn()) == false)
            return false;
        if (other.getAssessmentTemplateName() == null
                ^ this.getAssessmentTemplateName() == null)
            return false;
        if (other.getAssessmentTemplateName() != null
                && other.getAssessmentTemplateName().equals(
                        this.getAssessmentTemplateName()) == false)
            return false;
        if (other.getDurationInSeconds() == null
                ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null
                && other.getDurationInSeconds().equals(
                        this.getDurationInSeconds()) == false)
            return false;
        if (other.getRulesPackageArns() == null
                ^ this.getRulesPackageArns() == null)
            return false;
        if (other.getRulesPackageArns() != null
                && other.getRulesPackageArns().equals(
                        this.getRulesPackageArns()) == false)
            return false;
        if (other.getUserAttributesForFindings() == null
                ^ this.getUserAttributesForFindings() == null)
            return false;
        if (other.getUserAttributesForFindings() != null
                && other.getUserAttributesForFindings().equals(
                        this.getUserAttributesForFindings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssessmentTargetArn() == null) ? 0
                        : getAssessmentTargetArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssessmentTemplateName() == null) ? 0
                        : getAssessmentTemplateName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDurationInSeconds() == null) ? 0
                        : getDurationInSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getRulesPackageArns() == null) ? 0 : getRulesPackageArns()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getUserAttributesForFindings() == null) ? 0
                        : getUserAttributesForFindings().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssessmentTemplateRequest clone() {
        return (CreateAssessmentTemplateRequest) super.clone();
    }
}