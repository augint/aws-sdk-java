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

package com.amazonaws.services.cognitoidp.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * KeyType JSON Unmarshaller
 */
public class KeyTypeJsonUnmarshaller implements
        Unmarshaller<KeyType, JsonUnmarshallerContext> {

    public KeyType unmarshall(JsonUnmarshallerContext context) throws Exception {
        KeyType keyType = new KeyType();

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
                if (context.testExpression("kty", targetDepth)) {
                    context.nextToken();
                    keyType.setKty(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("alg", targetDepth)) {
                    context.nextToken();
                    keyType.setAlg(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("use", targetDepth)) {
                    context.nextToken();
                    keyType.setUse(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("kid", targetDepth)) {
                    context.nextToken();
                    keyType.setKid(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("n", targetDepth)) {
                    context.nextToken();
                    keyType.setN(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("e", targetDepth)) {
                    context.nextToken();
                    keyType.setE(context.getUnmarshaller(String.class)
                            .unmarshall(context));
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

        return keyType;
    }

    private static KeyTypeJsonUnmarshaller instance;

    public static KeyTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeyTypeJsonUnmarshaller();
        return instance;
    }
}
