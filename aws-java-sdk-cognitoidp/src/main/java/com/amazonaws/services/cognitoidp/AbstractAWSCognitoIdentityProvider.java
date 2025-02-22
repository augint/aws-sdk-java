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
package com.amazonaws.services.cognitoidp;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSCognitoIdentityProvider}. Convenient
 * method forms pass through to the corresponding overload that takes a request
 * object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSCognitoIdentityProvider implements
        AWSCognitoIdentityProvider {

    protected AbstractAWSCognitoIdentityProvider() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddCustomAttributesResult addCustomAttributes(
            AddCustomAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AdminConfirmSignUpResult adminConfirmSignUp(
            AdminConfirmSignUpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void adminDeleteUser(AdminDeleteUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AdminDeleteUserAttributesResult adminDeleteUserAttributes(
            AdminDeleteUserAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AdminDisableUserResult adminDisableUser(
            AdminDisableUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AdminEnableUserResult adminEnableUser(AdminEnableUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AdminGetUserResult adminGetUser(AdminGetUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AdminResetUserPasswordResult adminResetUserPassword(
            AdminResetUserPasswordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AdminSetUserSettingsResult adminSetUserSettings(
            AdminSetUserSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AdminUpdateUserAttributesResult adminUpdateUserAttributes(
            AdminUpdateUserAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ChangePasswordResult changePassword(ChangePasswordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConfirmForgotPasswordResult confirmForgotPassword(
            ConfirmForgotPasswordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConfirmSignUpResult confirmSignUp(ConfirmSignUpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateUserPoolResult createUserPool(CreateUserPoolRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateUserPoolClientResult createUserPoolClient(
            CreateUserPoolClientRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteUser(DeleteUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteUserAttributesResult deleteUserAttributes(
            DeleteUserAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteUserPool(DeleteUserPoolRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteUserPoolClient(DeleteUserPoolClientRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeUserPoolResult describeUserPool(
            DescribeUserPoolRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeUserPoolClientResult describeUserPoolClient(
            DescribeUserPoolClientRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ForgotPasswordResult forgotPassword(ForgotPasswordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetJWKSResult getJWKS(GetJWKSRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetOpenIdConfigurationResult getOpenIdConfiguration(
            GetOpenIdConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetUserResult getUser(GetUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetUserAttributeVerificationCodeResult getUserAttributeVerificationCode(
            GetUserAttributeVerificationCodeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUserPoolClientsResult listUserPoolClients(
            ListUserPoolClientsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUserPoolsResult listUserPools(ListUserPoolsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUsersResult listUsers(ListUsersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResendConfirmationCodeResult resendConfirmationCode(
            ResendConfirmationCodeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetUserSettingsResult setUserSettings(SetUserSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SignUpResult signUp(SignUpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateUserAttributesResult updateUserAttributes(
            UpdateUserAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateUserPoolResult updateUserPool(UpdateUserPoolRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateUserPoolClientResult updateUserPoolClient(
            UpdateUserPoolClientRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public VerifyUserAttributeResult verifyUserAttribute(
            VerifyUserAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(
            com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}
