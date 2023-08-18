<a href="https://www.extrawest.com/"><img src="https://drive.google.com/uc?export=view&id=1kXfNj5WfW2oSMzQR82xYBI6Bw_W8-LpK" width="20%"></a>
# Extrawest-OCPI-2.2.1-EMSP-Client

## Badges

![build](https://img.shields.io/github/actions/workflow/status/extrawest/Extrawest-OCPI-2.2.1-EMSP-Client/docker-image.yml?style=for-the-badge)
![release](https://img.shields.io/github/v/release/extrawest/Extrawest-OCPI-2.2.1-EMSP-Client?style=for-the-badge)
[![Java CI with Maven](https://github.com/extrawest/Extrawest-OCPI-2.2.1-EMSP-Client/actions/workflows/release-publish.yml/badge.svg)](https://github.com/extrawest/Extrawest-OCPI-2.2.1-EMSP-Client/actions/workflows/snapshot-publish.yml)
![contr](https://img.shields.io/github/contributors/extrawest/Extrawest-OCPI-2.2.1-EMSP-Client?style=for-the-badge)
![commits](https://img.shields.io/github/commit-activity/m/extrawest/Extrawest-OCPI-2.2.1-EMSP-Client?style=for-the-badge)
![lastcommit](https://img.shields.io/github/last-commit/extrawest/Extrawest-OCPI-2.2.1-EMSP-Client?style=for-the-badge)
![OCPI](https://img.shields.io/badge/OCPI-2.2.1-yellowgreen?style=for-the-badge)
![JDK](https://img.shields.io/badge/JDK-17-yellow?style=for-the-badge)
![social](https://img.shields.io/github/forks/extrawest/Extrawest-OCPI-2.2.1-EMSP-Client?style=for-the-badge)

## Table of Contents

- [Field of use](#field-of-use)
- [Description](#description)
- [Maven](#maven)
- [Requirements](#requirements)
- [Installation](#installation)
- [Getting Started](#getting-started)
- [Use in Spring Boot App](#using-extrawest-ocpi-221-emsp-client-in-spring-boot-application)
- [Documentation for API Endpoints](#documentation-for-api-endpoints)
- [Documentation for Models](#documentation-for-models) 
- [Documentation for Authorization](#documentation-for-authorization)
- [Recommendation](#recommendation)
- [License](#license)
- [About Extrawest.com](#about-extrawestcom)

## Field of use
This API exposes endpoints to manage OCPI entities. Open Charge Point Interface (OCPI) is an open protocol used for connections between charging station operators and service providers. Simply put, this protocol facilitates automated roaming for EV drivers between different EV charging networks.

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)* as a client library for [OCPI Server Library](https://github.com/extrawest/Extrawest-OCPI-2.2.1-EMSP-Server)

Description
=============

With this library, you can easily get started with the Open Charge-Point Interface by making calls to OCPI EMSP Server API. It is a client to OCPI eMSP Server, created using [OCPI Server Library](https://github.com/extrawest/Extrawest-OCPI-2.2.1-EMSP-Server)

Please note, this is a library and not an application, so there is no main method. 

Currently we support 2.2.1 OCPI version.

Maven
=====

Find the maven repo here: https://mvnrepository.com/artifact/com.extrawest

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.extrawest</groupId>
  <artifactId>extrawest-ocpi-2.2.1-emsp-client</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/extrawest-ocpi-2.2.1-emsp-client-0.0.1.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.extrawest.ocpp.client.invoker.*;
import com.extrawest.ocpp.client.invoker.auth.*;
import com.extrawest.ocpp.client.model.*;
import com.extrawest.ocpp.client.api.ClientInfoControllerApi;

public class ClientInfoControllerApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");
        
        ClientInfoControllerApi apiInstance = new ClientInfoControllerApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        try {
            ClientInfoDTO result = apiInstance.getHubClientInfo(countryCode, partyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientInfoControllerApi#getHubClientInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```
### Using Extrawest-OCPI-2.2.1-EMSP-Client in Spring Boot Application

1. To access the EMSP API classes, we need to configure them as beans:
```java
@Configuration
public class EmspClientConfig {

    @Bean
    public EmspTariffControllerApi emspTariffApi() {
        return new EmspTariffControllerApi(apiClient());
    }

    @Bean
    public ApiClient apiClient() {
        return new ApiClient();
    }
}
```

2. Since we configured our API classes as beans, we can freely inject them in our Spring-managed classes:
```java

@Service
public class EmspTariffServiceImpl implements  EmspTariffService {
    @Autowired
    private EmspTariffControllerApi emspTariffControllerApi;

    @Override
    public TariffDTO getTariff() {
        try {
            return emspTariffControllerApi.getTariff("countryCode", "partyId", "tariffId");
        } catch (RestClientException e) {
            throw new RuntimeException();
        }
    }
}

```

Spring Boot application, where we have tested Extrawest-OCPI-2.2.1-EMSP-Client, has below Spring dependencies. In case of library and your project dependencies versions incompatibility, try to add next spring versions into you projects:
```java
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-web</artifactId>
            <version>5.3.24</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.3.24</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>5.3.24</version>
        </dependency>
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClientInfoControllerApi* | [**getHubClientInfo**](docs/ClientInfoControllerApi.md#getHubClientInfo) | **GET** /api/2.2.1/hubClientInfo/{country_code}/{party_id} |
*ClientInfoControllerApi* | [**putHubClientInfo**](docs/ClientInfoControllerApi.md#putHubClientInfo) | **PUT** /api/2.2.1/hubClientInfo/{country_code}/{party_id} |
*CpoCdrControllerApi* | [**getCdr1**](docs/CpoCdrControllerApi.md#getCdr1) | **GET** /cpo/api/2.2.1/cdr |
*CpoChargingProfilesControllerApi* | [**deleteChargingProfile**](docs/CpoChargingProfilesControllerApi.md#deleteChargingProfile) | **DELETE** /cpo/api/2.2.1/chargingProfiles/{session_id}/{response_url} |
*CpoChargingProfilesControllerApi* | [**getChargingProfile**](docs/CpoChargingProfilesControllerApi.md#getChargingProfile) | **GET** /cpo/api/2.2.1/chargingProfiles/{session_id}/{duration}/{response_url} |
*CpoChargingProfilesControllerApi* | [**putChargingProfile1**](docs/CpoChargingProfilesControllerApi.md#putChargingProfile1) | **PUT** /cpo/api/2.2.1/chargingProfiles/{session_id} |
*CpoCommandsControllerApi* | [**postCommand**](docs/CpoCommandsControllerApi.md#postCommand) | **POST** /cpo/api/2.2.1/commands/{command} |
*CpoCredentialsControllerApi* | [**deleteCredentials1**](docs/CpoCredentialsControllerApi.md#deleteCredentials1) | **DELETE** /cpo/api/2.2.1/credentials |
*CpoCredentialsControllerApi* | [**getCredentials1**](docs/CpoCredentialsControllerApi.md#getCredentials1) | **GET** /cpo/api/2.2.1/credentials |
*CpoCredentialsControllerApi* | [**postCredentials1**](docs/CpoCredentialsControllerApi.md#postCredentials1) | **POST** /cpo/api/2.2.1/credentials |
*CpoCredentialsControllerApi* | [**putCredentials1**](docs/CpoCredentialsControllerApi.md#putCredentials1) | **PUT** /cpo/api/2.2.1/credentials |
*CpoLocationControllerApi* | [**getLocationEvseController1**](docs/CpoLocationControllerApi.md#getLocationEvseController1) | **GET** /cpo/api/2.2.1/locations |
*CpoLocationControllerApi* | [**getLocations**](docs/CpoLocationControllerApi.md#getLocations) | **GET** /cpo/api/2.2.1/locations/getLocations |
*CpoSessionsControllerApi* | [**getSessions**](docs/CpoSessionsControllerApi.md#getSessions) | **GET** /cpo/api/2.2.1/sessions |
*CpoSessionsControllerApi* | [**putChargingPreferences**](docs/CpoSessionsControllerApi.md#putChargingPreferences) | **PUT** /cpo/api/2.2.1/sessions |
*CpoTariffControllerApi* | [**getTariffs**](docs/CpoTariffControllerApi.md#getTariffs) | **GET** /cpo/api/2.2.1/tariffs |
*CpoTokensControllerApi* | [**getToken1**](docs/CpoTokensControllerApi.md#getToken1) | **GET** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} |
*CpoTokensControllerApi* | [**patchToken**](docs/CpoTokensControllerApi.md#patchToken) | **PATCH** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} |
*CpoTokensControllerApi* | [**putToken**](docs/CpoTokensControllerApi.md#putToken) | **PUT** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} |
*CpoVersionControllerApi* | [**getVersion**](docs/CpoVersionControllerApi.md#getVersion) | **GET** /cpo/api/2.2.1/versions |
*CpoVersionControllerApi* | [**getVersionDetails1**](docs/CpoVersionControllerApi.md#getVersionDetails1) | **GET** /cpo/api/2.2.1/versions/details/{version} |
*EmspCdrControllerApi* | [**getCdr**](docs/EmspCdrControllerApi.md#getCdr) | **GET** /emsp/api/2.2.1/cdr/{id} |
*EmspCdrControllerApi* | [**postCdr**](docs/EmspCdrControllerApi.md#postCdr) | **POST** /emsp/api/2.2.1/cdr |
*EmspChargingProfilesControllerApi* | [**postChargingProfile**](docs/EmspChargingProfilesControllerApi.md#postChargingProfile) | **POST** /emsp/api/2.2.1/chargingProfiles |
*EmspChargingProfilesControllerApi* | [**putChargingProfile**](docs/EmspChargingProfilesControllerApi.md#putChargingProfile) | **PUT** /emsp/api/2.2.1/chargingProfiles/{session_id} |
*EmspCredentialsControllerApi* | [**deleteCredentials**](docs/EmspCredentialsControllerApi.md#deleteCredentials) | **DELETE** /emsp/api/2.2.1/credentials |
*EmspCredentialsControllerApi* | [**getCredentials**](docs/EmspCredentialsControllerApi.md#getCredentials) | **GET** /emsp/api/2.2.1/credentials |
*EmspCredentialsControllerApi* | [**postCredentials**](docs/EmspCredentialsControllerApi.md#postCredentials) | **POST** /emsp/api/2.2.1/credentials |
*EmspCredentialsControllerApi* | [**putCredentials**](docs/EmspCredentialsControllerApi.md#putCredentials) | **PUT** /emsp/api/2.2.1/credentials |
*EmspLocationControllerApi* | [**getLocationEvseController**](docs/EmspLocationControllerApi.md#getLocationEvseController) | **GET** /emsp/api/2.2.1/locations |
*EmspLocationControllerApi* | [**patchLocation**](docs/EmspLocationControllerApi.md#patchLocation) | **PATCH** /emsp/api/2.2.1/locations |
*EmspLocationControllerApi* | [**pushLocation**](docs/EmspLocationControllerApi.md#pushLocation) | **PUT** /emsp/api/2.2.1/locations |
*EmspSessionsControllerApi* | [**getSession**](docs/EmspSessionsControllerApi.md#getSession) | **GET** /emsp/api/2.2.1/sessions |
*EmspSessionsControllerApi* | [**patchSession**](docs/EmspSessionsControllerApi.md#patchSession) | **PATCH** /emsp/api/2.2.1/sessions |
*EmspSessionsControllerApi* | [**putSession**](docs/EmspSessionsControllerApi.md#putSession) | **PUT** /emsp/api/2.2.1/sessions |
*EmspTariffControllerApi* | [**deleteTariff**](docs/EmspTariffControllerApi.md#deleteTariff) | **DELETE** /emsp/api/2.2.1/tariffs |
*EmspTariffControllerApi* | [**getTariff**](docs/EmspTariffControllerApi.md#getTariff) | **GET** /emsp/api/2.2.1/tariffs |
*EmspTariffControllerApi* | [**saveTariff**](docs/EmspTariffControllerApi.md#saveTariff) | **PUT** /emsp/api/2.2.1/tariffs |
*EmspTokenControllerApi* | [**getToken**](docs/EmspTokenControllerApi.md#getToken) | **GET** /emsp/api/2.2.1/tokens/{date_from}/{date_to}/{offset}/{limit} |
*EmspTokenControllerApi* | [**postToken**](docs/EmspTokenControllerApi.md#postToken) | **POST** /emsp/api/2.2.1/tokens/{token_uid}/{type} |
*EmspVersionControllerApi* | [**getVersionDetails**](docs/EmspVersionControllerApi.md#getVersionDetails) | **GET** /emsp/api/2.2.1/versions/details/{version} |


## Documentation for Models

- [AbstractCommand](docs/AbstractCommand.md)
- [AbstractProfileResult](docs/AbstractProfileResult.md)
- [ActiveChargingProfileRequestDTO](docs/ActiveChargingProfileRequestDTO.md)
- [AdditionalGeoLocation](docs/AdditionalGeoLocation.md)
- [AuthorizationInfoResponseDTO](docs/AuthorizationInfoResponseDTO.md)
- [BusinessDetails](docs/BusinessDetails.md)
- [CdrDTO](docs/CdrDTO.md)
- [CdrDimension](docs/CdrDimension.md)
- [CdrLocation](docs/CdrLocation.md)
- [CdrToken](docs/CdrToken.md)
- [ChargingPeriod](docs/ChargingPeriod.md)
- [ChargingPreferencesDTO](docs/ChargingPreferencesDTO.md)
- [ChargingProfile](docs/ChargingProfile.md)
- [ChargingProfilePeriod](docs/ChargingProfilePeriod.md)
- [ChargingProfileResponseDTO](docs/ChargingProfileResponseDTO.md)
- [ClientInfoDTO](docs/ClientInfoDTO.md)
- [CommandResponseDTO](docs/CommandResponseDTO.md)
- [Connector](docs/Connector.md)
- [CredentialsDTO](docs/CredentialsDTO.md)
- [CredentialsRole](docs/CredentialsRole.md)
- [DisplayText](docs/DisplayText.md)
- [EVSE](docs/EVSE.md)
- [Endpoint](docs/Endpoint.md)
- [EnergyContract](docs/EnergyContract.md)
- [EnergyMix](docs/EnergyMix.md)
- [EnergySource](docs/EnergySource.md)
- [EnvironmentalImpact](docs/EnvironmentalImpact.md)
- [ExceptionalPeriod](docs/ExceptionalPeriod.md)
- [GeoLocation](docs/GeoLocation.md)
- [Hours](docs/Hours.md)
- [Image](docs/Image.md)
- [LocationDTO](docs/LocationDTO.md)
- [LocationReferences](docs/LocationReferences.md)
- [LocationReferencesRequestDTO](docs/LocationReferencesRequestDTO.md)
- [Price](docs/Price.md)
- [PriceComponent](docs/PriceComponent.md)
- [PublishTokenType](docs/PublishTokenType.md)
- [RegularHours](docs/RegularHours.md)
- [ResponseFormat](docs/ResponseFormat.md)
- [SessionDTO](docs/SessionDTO.md)
- [SetChargingProfileRequestDTO](docs/SetChargingProfileRequestDTO.md)
- [SignedData](docs/SignedData.md)
- [SignedValue](docs/SignedValue.md)
- [StatusSchedule](docs/StatusSchedule.md)
- [Tariff](docs/Tariff.md)
- [TariffDTO](docs/TariffDTO.md)
- [TariffElement](docs/TariffElement.md)
- [TariffRestrictions](docs/TariffRestrictions.md)
- [Token](docs/Token.md)
- [TokenDTO](docs/TokenDTO.md)
- [VersionDetailsResponseDTO](docs/VersionDetailsResponseDTO.md)
- [VersionResponseDTO](docs/VersionResponseDTO.md)


## Documentation for Authorization

All endpoints do not require authorization.

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## License


[MIT License](LICENSE)

## About Extrawest.com


We are devoted to push the marked for vehicles charging forward.
There are many standards out there, we intend to implement and share them. Any help is much appreciated!

The market is in its defining state, the practices and standards we come up with now, may very well stick around for decades to come.

See our vision at https://www.extrawest.com/