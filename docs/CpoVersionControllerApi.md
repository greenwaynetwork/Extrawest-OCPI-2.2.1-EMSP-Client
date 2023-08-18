# CpoVersionControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVersion**](CpoVersionControllerApi.md#getVersion) | **GET** /cpo/api/2.2.1/versions |  |
| [**getVersionDetails1**](CpoVersionControllerApi.md#getVersionDetails1) | **GET** /cpo/api/2.2.1/versions/details/{version} |  |



## getVersion

> List&lt;VersionResponseDTO&gt; getVersion()



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.CpoVersionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoVersionControllerApi apiInstance = new CpoVersionControllerApi(defaultClient);
        try {
            List<VersionResponseDTO> result = apiInstance.getVersion();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoVersionControllerApi#getVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;VersionResponseDTO&gt;**](VersionResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVersionDetails1

> VersionDetailsResponseDTO getVersionDetails1(version)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.CpoVersionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoVersionControllerApi apiInstance = new CpoVersionControllerApi(defaultClient);
        String version = "2.0"; // String | 
        try {
            VersionDetailsResponseDTO result = apiInstance.getVersionDetails1(version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoVersionControllerApi#getVersionDetails1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**|  | [enum: 2.0, 2.1, 2.1.1, 2.2, 2.2.1] |

### Return type

[**VersionDetailsResponseDTO**](VersionDetailsResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
