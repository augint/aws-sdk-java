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

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * VpcPeeringConnectionVpcInfo StAX Unmarshaller
 */
public class VpcPeeringConnectionVpcInfoStaxUnmarshaller implements
        Unmarshaller<VpcPeeringConnectionVpcInfo, StaxUnmarshallerContext> {

    public VpcPeeringConnectionVpcInfo unmarshall(
            StaxUnmarshallerContext context) throws Exception {
        VpcPeeringConnectionVpcInfo vpcPeeringConnectionVpcInfo = new VpcPeeringConnectionVpcInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return vpcPeeringConnectionVpcInfo;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("cidrBlock", targetDepth)) {
                    vpcPeeringConnectionVpcInfo
                            .setCidrBlock(StringStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    vpcPeeringConnectionVpcInfo
                            .setOwnerId(StringStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    vpcPeeringConnectionVpcInfo.setVpcId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return vpcPeeringConnectionVpcInfo;
                }
            }
        }
    }

    private static VpcPeeringConnectionVpcInfoStaxUnmarshaller instance;

    public static VpcPeeringConnectionVpcInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpcPeeringConnectionVpcInfoStaxUnmarshaller();
        return instance;
    }
}
