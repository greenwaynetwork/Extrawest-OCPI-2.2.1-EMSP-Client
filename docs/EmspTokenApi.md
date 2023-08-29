# EmspTokenApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getToken**](EmspTokenApi.md#getToken) | **GET** /emsp/api/2.2.1/tokens/{date_from}/{date_to}/{offset}/{limit} |  |
| [**postToken**](EmspTokenApi.md#postToken) | **POST** /emsp/api/2.2.1/tokens/{token_uid}/{type} |  |



## getToken

> List&lt;TokenDTO&gt; getToken(dateFrom, dateTo, offset, limit)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspTokenApi apiInstance = new EmspTokenApi(defaultClient);
        OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | 
        Integer offset = 56; // Integer | 
        Integer limit = 56; // Integer | 
        try {
            List<TokenDTO> result = apiInstance.getToken(dateFrom, dateTo, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspTokenApi#getToken");
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
| **dateFrom** | **OffsetDateTime**|  | |
| **dateTo** | **OffsetDateTime**|  | |
| **offset** | **Integer**|  | |
| **limit** | **Integer**|  | |

### Return type

[**List&lt;TokenDTO&gt;**](TokenDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postToken

> AuthorizationInfoResponseDTO postToken(tokenUid, type, locationReferencesRequestDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspTokenApi apiInstance = new EmspTokenApi(defaultClient);
        String tokenUid = "tokenUid_example"; // String | 
        String type = "type_example"; // String | 
        LocationReferencesRequestDTO locationReferencesRequestDTO = new LocationReferencesRequestDTO(); // LocationReferencesRequestDTO | 
        try {
            AuthorizationInfoResponseDTO result = apiInstance.postToken(tokenUid, type, locationReferencesRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspTokenApi#postToken");
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
| **tokenUid** | **String**|  | |
| **type** | **String**|  | |
| **locationReferencesRequestDTO** | [**LocationReferencesRequestDTO**](LocationReferencesRequestDTO.md)|  | |

### Return type

[**AuthorizationInfoResponseDTO**](AuthorizationInfoResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
