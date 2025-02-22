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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeImportImageTasksRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeImportImageTasks.
 * </p>
 */
public class DescribeImportImageTasksRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeImportImageTasksRequest> {

    /**
     * <p>
     * A list of import image task IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> importTaskIds;
    /**
     * <p>
     * A token that indicates the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * One or more filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * A list of import image task IDs.
     * </p>
     * 
     * @return A list of import image task IDs.
     */

    public java.util.List<String> getImportTaskIds() {
        if (importTaskIds == null) {
            importTaskIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return importTaskIds;
    }

    /**
     * <p>
     * A list of import image task IDs.
     * </p>
     * 
     * @param importTaskIds
     *        A list of import image task IDs.
     */

    public void setImportTaskIds(java.util.Collection<String> importTaskIds) {
        if (importTaskIds == null) {
            this.importTaskIds = null;
            return;
        }

        this.importTaskIds = new com.amazonaws.internal.SdkInternalList<String>(
                importTaskIds);
    }

    /**
     * <p>
     * A list of import image task IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setImportTaskIds(java.util.Collection)} or
     * {@link #withImportTaskIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param importTaskIds
     *        A list of import image task IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeImportImageTasksRequest withImportTaskIds(
            String... importTaskIds) {
        if (this.importTaskIds == null) {
            setImportTaskIds(new com.amazonaws.internal.SdkInternalList<String>(
                    importTaskIds.length));
        }
        for (String ele : importTaskIds) {
            this.importTaskIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of import image task IDs.
     * </p>
     * 
     * @param importTaskIds
     *        A list of import image task IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeImportImageTasksRequest withImportTaskIds(
            java.util.Collection<String> importTaskIds) {
        setImportTaskIds(importTaskIds);
        return this;
    }

    /**
     * <p>
     * A token that indicates the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the next page of results.
     * </p>
     * 
     * @return A token that indicates the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the next page of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeImportImageTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To
     *        retrieve the remaining results, make another call with the
     *        returned <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To
     *        retrieve the remaining results, make another call with the
     *        returned <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeImportImageTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * 
     * @return One or more filters.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * 
     * @param filters
     *        One or more filters.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(
                filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or
     * {@link #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeImportImageTasksRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * 
     * @param filters
     *        One or more filters.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeImportImageTasksRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeImportImageTasksRequest> getDryRunRequest() {
        Request<DescribeImportImageTasksRequest> request = new DescribeImportImageTasksRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getImportTaskIds() != null)
            sb.append("ImportTaskIds: " + getImportTaskIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImportImageTasksRequest == false)
            return false;
        DescribeImportImageTasksRequest other = (DescribeImportImageTasksRequest) obj;
        if (other.getImportTaskIds() == null ^ this.getImportTaskIds() == null)
            return false;
        if (other.getImportTaskIds() != null
                && other.getImportTaskIds().equals(this.getImportTaskIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null
                && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getImportTaskIds() == null) ? 0 : getImportTaskIds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImportImageTasksRequest clone() {
        return (DescribeImportImageTasksRequest) super.clone();
    }
}