# ItemsApi

All URIs are relative to *&lt;to be set&gt;*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemsIdGet**](ItemsApi.md#itemsIdGet) | **GET** /items/{id} | Get a Single Item details by passing it&#x27;s ID
[**itemsIdPut**](ItemsApi.md#itemsIdPut) | **PUT** /items/{id} | 
[**itemsPost**](ItemsApi.md#itemsPost) | **POST** /items | 

<a name="itemsIdGet"></a>
# **itemsIdGet**
> GetItemDetailsResp itemsIdGet(id, entityId, clientURN, applianceToken, systemCode, countryCode, clientCode, clientGroupCode, channelCode, clientUserId, clientPassword)

Get a Single Item details by passing it&#x27;s ID

get Item details by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ItemsApi apiInstance = new ItemsApi();
String id = "id_example"; // String | description of parameter passed
String entityId = "entityId_example"; // String | description of parameter passed
String clientURN = "clientURN_example"; // String | description of parameter passed
String applianceToken = "applianceToken_example"; // String | description of parameter passed
String systemCode = "systemCode_example"; // String | description of parameter passed
String countryCode = "countryCode_example"; // String | description of parameter passed
String clientCode = "clientCode_example"; // String | description of parameter passed
String clientGroupCode = "clientGroupCode_example"; // String | description of parameter passed
String channelCode = "channelCode_example"; // String | description of parameter passed
String clientUserId = "clientUserId_example"; // String | description of parameter passed
String clientPassword = "clientPassword_example"; // String | description of parameter passed
try {
    GetItemDetailsResp result = apiInstance.itemsIdGet(id, entityId, clientURN, applianceToken, systemCode, countryCode, clientCode, clientGroupCode, channelCode, clientUserId, clientPassword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| description of parameter passed |
 **entityId** | **String**| description of parameter passed |
 **clientURN** | **String**| description of parameter passed |
 **applianceToken** | **String**| description of parameter passed |
 **systemCode** | **String**| description of parameter passed |
 **countryCode** | **String**| description of parameter passed |
 **clientCode** | **String**| description of parameter passed |
 **clientGroupCode** | **String**| description of parameter passed |
 **channelCode** | **String**| description of parameter passed |
 **clientUserId** | **String**| description of parameter passed |
 **clientPassword** | **String**| description of parameter passed |

### Return type

[**GetItemDetailsResp**](GetItemDetailsResp.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="itemsIdPut"></a>
# **itemsIdPut**
> UpdateItemResp itemsIdPut(body, entityId, clientURN, applianceToken, systemCode, countryCode, clientCode, clientGroupCode, channelCode, clientUserId, clientPassword, id)



updates an item by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ItemsApi apiInstance = new ItemsApi();
UpdateItemReq body = new UpdateItemReq(); // UpdateItemReq | 
String entityId = "entityId_example"; // String | description of parameter passed
String clientURN = "clientURN_example"; // String | description of parameter passed
String applianceToken = "applianceToken_example"; // String | description of parameter passed
String systemCode = "systemCode_example"; // String | description of parameter passed
String countryCode = "countryCode_example"; // String | description of parameter passed
String clientCode = "clientCode_example"; // String | description of parameter passed
String clientGroupCode = "clientGroupCode_example"; // String | description of parameter passed
String channelCode = "channelCode_example"; // String | description of parameter passed
String clientUserId = "clientUserId_example"; // String | description of parameter passed
String clientPassword = "clientPassword_example"; // String | description of parameter passed
String id = "id_example"; // String | description of parameter passed
try {
    UpdateItemResp result = apiInstance.itemsIdPut(body, entityId, clientURN, applianceToken, systemCode, countryCode, clientCode, clientGroupCode, channelCode, clientUserId, clientPassword, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateItemReq**](UpdateItemReq.md)|  |
 **entityId** | **String**| description of parameter passed |
 **clientURN** | **String**| description of parameter passed |
 **applianceToken** | **String**| description of parameter passed |
 **systemCode** | **String**| description of parameter passed |
 **countryCode** | **String**| description of parameter passed |
 **clientCode** | **String**| description of parameter passed |
 **clientGroupCode** | **String**| description of parameter passed |
 **channelCode** | **String**| description of parameter passed |
 **clientUserId** | **String**| description of parameter passed |
 **clientPassword** | **String**| description of parameter passed |
 **id** | **String**| description of parameter passed |

### Return type

[**UpdateItemResp**](UpdateItemResp.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="itemsPost"></a>
# **itemsPost**
> CreateItemResp itemsPost(body, entityId, clientURN, applianceToken, systemCode, countryCode, clientCode, clientGroupCode, channelCode, clientUserId, clientPassword)



creates Item

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ItemsApi apiInstance = new ItemsApi();
CreateItemReq body = new CreateItemReq(); // CreateItemReq | 
String entityId = "entityId_example"; // String | description of parameter passed
String clientURN = "clientURN_example"; // String | description of parameter passed
String applianceToken = "applianceToken_example"; // String | description of parameter passed
String systemCode = "systemCode_example"; // String | description of parameter passed
String countryCode = "countryCode_example"; // String | description of parameter passed
String clientCode = "clientCode_example"; // String | description of parameter passed
String clientGroupCode = "clientGroupCode_example"; // String | description of parameter passed
String channelCode = "channelCode_example"; // String | description of parameter passed
String clientUserId = "clientUserId_example"; // String | description of parameter passed
String clientPassword = "clientPassword_example"; // String | description of parameter passed
try {
    CreateItemResp result = apiInstance.itemsPost(body, entityId, clientURN, applianceToken, systemCode, countryCode, clientCode, clientGroupCode, channelCode, clientUserId, clientPassword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateItemReq**](CreateItemReq.md)|  |
 **entityId** | **String**| description of parameter passed |
 **clientURN** | **String**| description of parameter passed |
 **applianceToken** | **String**| description of parameter passed |
 **systemCode** | **String**| description of parameter passed |
 **countryCode** | **String**| description of parameter passed |
 **clientCode** | **String**| description of parameter passed |
 **clientGroupCode** | **String**| description of parameter passed |
 **channelCode** | **String**| description of parameter passed |
 **clientUserId** | **String**| description of parameter passed |
 **clientPassword** | **String**| description of parameter passed |

### Return type

[**CreateItemResp**](CreateItemResp.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

