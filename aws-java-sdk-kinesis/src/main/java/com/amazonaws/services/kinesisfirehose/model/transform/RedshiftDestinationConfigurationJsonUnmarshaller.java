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

package com.amazonaws.services.kinesisfirehose.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RedshiftDestinationConfiguration JSON Unmarshaller
 */
public class RedshiftDestinationConfigurationJsonUnmarshaller implements
        Unmarshaller<RedshiftDestinationConfiguration, JsonUnmarshallerContext> {

    public RedshiftDestinationConfiguration unmarshall(
            JsonUnmarshallerContext context) throws Exception {
        RedshiftDestinationConfiguration redshiftDestinationConfiguration = new RedshiftDestinationConfiguration();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RoleARN", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationConfiguration.setRoleARN(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterJDBCURL", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationConfiguration.setClusterJDBCURL(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CopyCommand", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationConfiguration
                            .setCopyCommand(CopyCommandJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationConfiguration.setUsername(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationConfiguration.setPassword(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Configuration", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationConfiguration
                            .setS3Configuration(S3DestinationConfigurationJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchLoggingOptions",
                        targetDepth)) {
                    context.nextToken();
                    redshiftDestinationConfiguration
                            .setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return redshiftDestinationConfiguration;
    }

    private static RedshiftDestinationConfigurationJsonUnmarshaller instance;

    public static RedshiftDestinationConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftDestinationConfigurationJsonUnmarshaller();
        return instance;
    }
}
