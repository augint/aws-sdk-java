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

package com.amazonaws.services.route53.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.XMLWriter;

/**
 * CreateHostedZoneRequest Marshaller
 */

public class CreateHostedZoneRequestMarshaller implements
        Marshaller<Request<CreateHostedZoneRequest>, CreateHostedZoneRequest> {

    public Request<CreateHostedZoneRequest> marshall(
            CreateHostedZoneRequest createHostedZoneRequest) {

        if (createHostedZoneRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateHostedZoneRequest> request = new DefaultRequest<CreateHostedZoneRequest>(
                createHostedZoneRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2013-04-01/hostedzone";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter,
                    "https://route53.amazonaws.com/doc/2013-04-01/");

            xmlWriter.startElement("CreateHostedZoneRequest");
            if (createHostedZoneRequest != null) {

                if (createHostedZoneRequest.getName() != null) {
                    xmlWriter.startElement("Name")
                            .value(createHostedZoneRequest.getName())
                            .endElement();
                }

                VPC vPC = createHostedZoneRequest.getVPC();
                if (vPC != null) {
                    xmlWriter.startElement("VPC");

                    if (vPC.getVPCRegion() != null) {
                        xmlWriter.startElement("VPCRegion")
                                .value(vPC.getVPCRegion()).endElement();
                    }

                    if (vPC.getVPCId() != null) {
                        xmlWriter.startElement("VPCId").value(vPC.getVPCId())
                                .endElement();
                    }
                    xmlWriter.endElement();
                }

                if (createHostedZoneRequest.getCallerReference() != null) {
                    xmlWriter
                            .startElement("CallerReference")
                            .value(createHostedZoneRequest.getCallerReference())
                            .endElement();
                }

                HostedZoneConfig hostedZoneConfig = createHostedZoneRequest
                        .getHostedZoneConfig();
                if (hostedZoneConfig != null) {
                    xmlWriter.startElement("HostedZoneConfig");

                    if (hostedZoneConfig.getComment() != null) {
                        xmlWriter.startElement("Comment")
                                .value(hostedZoneConfig.getComment())
                                .endElement();
                    }

                    if (hostedZoneConfig.getPrivateZone() != null) {
                        xmlWriter.startElement("PrivateZone")
                                .value(hostedZoneConfig.getPrivateZone())
                                .endElement();
                    }
                    xmlWriter.endElement();
                }

                if (createHostedZoneRequest.getDelegationSetId() != null) {
                    xmlWriter
                            .startElement("DelegationSetId")
                            .value(createHostedZoneRequest.getDelegationSetId())
                            .endElement();
                }
            }
            xmlWriter.endElement();

            request.setContent(new StringInputStream(stringWriter.getBuffer()
                    .toString()));
            request.addHeader(
                    "Content-Length",
                    Integer.toString(stringWriter.getBuffer().toString()
                            .getBytes(UTF8).length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", "application/xml");
            }
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to XML: " + t.getMessage(), t);
        }

        return request;
    }

}
