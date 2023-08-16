/*
 * OCPI 2.2.1
 * This API exposes endpoints to manage OCPI entities.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: ocpi@extrawest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.extrawest.ocpp.client.api;

import com.extrawest.ocpp.client.model.CredentialsDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmspCredentialsControllerApi
 */
@Ignore
public class EmspCredentialsControllerApiTest {

    private final EmspCredentialsControllerApi api = new EmspCredentialsControllerApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCredentialsTest() {
        CredentialsDTO credentialsDTO = null;
        api.deleteCredentials(credentialsDTO);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCredentialsTest() {
        CredentialsDTO response = api.getCredentials();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCredentialsTest() {
        CredentialsDTO credentialsDTO = null;
        api.postCredentials(credentialsDTO);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCredentialsTest() {
        CredentialsDTO credentialsDTO = null;
        api.putCredentials(credentialsDTO);

        // TODO: test validations
    }
    
}
