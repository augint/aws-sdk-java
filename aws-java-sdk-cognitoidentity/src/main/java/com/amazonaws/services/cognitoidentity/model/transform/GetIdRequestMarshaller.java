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

package com.amazonaws.services.cognitoidentity.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * GetIdRequest Marshaller
 */
public class GetIdRequestMarshaller implements
        Marshaller<Request<GetIdRequest>, GetIdRequest> {

    public Request<GetIdRequest> marshall(GetIdRequest getIdRequest) {

        if (getIdRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<GetIdRequest> request = new DefaultRequest<GetIdRequest>(
                getIdRequest, "AmazonCognitoIdentity");
        request.addHeader("X-Amz-Target", "AWSCognitoIdentityService.GetId");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (getIdRequest.getAccountId() != null) {
                jsonGenerator.writeFieldName("AccountId").writeValue(
                        getIdRequest.getAccountId());
            }
            if (getIdRequest.getIdentityPoolId() != null) {
                jsonGenerator.writeFieldName("IdentityPoolId").writeValue(
                        getIdRequest.getIdentityPoolId());
            }

            java.util.Map<String, String> loginsMap = getIdRequest.getLogins();
            if (loginsMap != null) {
                jsonGenerator.writeFieldName("Logins");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> loginsMapValue : loginsMap
                        .entrySet()) {
                    if (loginsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(loginsMapValue.getKey());

                        jsonGenerator.writeValue(loginsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", jsonGenerator.getContentType());
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
