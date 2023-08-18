# CpoTariffControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTariffs**](CpoTariffControllerApi.md#getTariffs) | **GET** /cpo/api/2.2.1/tariffs |  |



## getTariffs

> List&lt;TariffDTO&gt; getTariffs(dateFrom, dateTo, offset, limit)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.CpoTariffControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoTariffControllerApi apiInstance = new CpoTariffControllerApi(defaultClient);
        OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | 
        Integer offset = 0; // Integer | 
        Integer limit = 56; // Integer | 
        try {
            List<TariffDTO> result = apiInstance.getTariffs(dateFrom, dateTo, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoTariffControllerApi#getTariffs");
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
| **dateFrom** | **OffsetDateTime**|  | [optional] |
| **dateTo** | **OffsetDateTime**|  | [optional] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**List&lt;TariffDTO&gt;**](TariffDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
