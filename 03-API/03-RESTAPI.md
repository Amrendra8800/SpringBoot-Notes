# Rest API

## What is REST API

REST API is a way for two systems to talk to each other over the internet. It stands for Representational State Transfer Application Programming Interface.

Think of a REST API as a waiter in a restaurant. Just like how a waiter takes your order and communicates with the kitchen to bring your food, a REST API allows one system (such as a website or mobile app) to request data or perform actions from another system (such as a database or server). The API acts as the intermediary between the two systems, taking the request, sending it to the correct place, and returning the response back to the first system.

REST APIs use a standard set of rules and protocols, such as HTTP, to send and receive data and perform actions. This makes it possible for different systems to understand each other and work together seamlessly, even if they were built by different companies or use different technologies.

In summary, a REST API is a way for different systems to communicate and exchange data over the internet in a flexible, scalable, and easy-to-use manner.

A REST API uses HTTP requests to GET, POST, PUT, DELETE data, and it provides responses in a format such as JSON or XML. REST APIs are used to access and manipulate resources (data entities) exposed by a server, and they can be consumed by a variety of client applications, including web browsers, mobile apps, and third-party systems.

REST APIs are a common way to create, retrieve, update, and delete resources over the internet, and they can be used for a wide range of applications, such as e-commerce, social media, and data analysis. REST APIs provide a flexible, scalable, and easy-to-use solution for exchanging data between systems and performing operations over the internet.

## Understanding REST Principals

The principles of REST (Representational State Transfer) are a set of guidelines that help in designing and developing scalable, flexible and maintainable Web APIs. The key principles of REST are:

1. Client-Server architecture: The client and server should be separate and independent components, where the client initiates the request and the server provides the response.
2. Statelessness: RESTful APIs should not maintain any client context on the server between requests. This means that every request from the client should contain all the information required to process the request.
3. Cacheability: The responses from REST APIs should be cacheable, meaning they can be stored and reused to reduce the response time and network usage.
4. Layered System: REST APIs should be designed to work as a layered system, where each layer can be optimized, maintained, and updated independently without affecting the other layers.
5. Uniform Interface: The REST API should use a uniform interface for communication, such as HTTP and its methods (GET, POST, PUT, DELETE), HTTP status codes, and URI structure.
6. Representations: The data sent and received by REST APIs should be in a format that is easily transferable, such as JSON or XML.

By adhering to these principles, REST APIs can provide a scalable and flexible solution for exchanging data and performing operations over the internet.

## Understanding RESTful API naming convention

RESTful API naming conventions refer to the rules and guidelines for naming resources, endpoints, and URIs (Uniform Resource Identifiers) in a REST API. Good naming conventions can improve the readability, maintainability, and scalability of REST APIs. Here are some best practices for RESTful API naming conventions:

1. Resource Naming: Resources should be named in plural form, such as "users" or "tasks". Singular names can be ambiguous and lead to confusion.
2. Endpoint Naming: Endpoints should be named based on the HTTP methods they support, such as "GET /users" or "POST /tasks".
3. URI Structure: URIs should be structured hierarchically, with the resource name representing the first level and the specific resource identifier representing the second level, such as "/users/{id}" or "/tasks/{id}".
4. HTTP Methods: HTTP methods (GET, POST, PUT, DELETE) should be used consistently and as per their intended purpose, for example, GET for retrieving resources, POST for creating new resources, PUT for updating resources, and DELETE for deleting resources.
5. Filtering and Sorting: Resources should support filtering and sorting based on the parameters passed in the URL, such as "/users?sort=name" or "/tasks?completed=true".
6. Versioning: API versions should be specified in the URI, such as "/v1/users" or "/v2/tasks", to allow for backward compatibility and future updates.

By following these naming conventions, RESTful APIs can provide a clear and consistent structure for accessing resources and performing operations.

---

Find a public API that offers the kind of information you want to access. Make sure it is well documented and maintained. Some sites that offer many APIS are [ProgrammableWeb](https://www.programmableweb.com/), [AnyApi](https://any-api.com/), and [public.apis.zone](https://public.apis.zone/)

---

## Understanding JSON and request body using JSON

JSON (JavaScript Object Notation) is a lightweight data format that is used for exchanging data between systems. It is easy for humans to read and write and easy for machines to parse and generate. JSON uses a structure of key-value pairs to represent data, where each key is a string and each value can be a string, number, boolean, array, or another JSON object.

In a REST API, JSON is often used as the format for sending data in a request body. When making a POST, PUT, or PATCH request, the client sends data to the server in the request body, which is typically encoded in JSON format. This allows the client to send complex data structures, such as arrays or nested objects, to the server for processing.

For example, consider a REST API that allows a client to create a new user account. The client might send a request to the server with the following request body encoded in JSON format:

```json
perlCopy code
{
  "username": "example_user",
  "email": "example_user@example.com",
  "password": "secret_password"
}
```

The server would receive the JSON-encoded request body, parse it, and process the request to create a new user account with the specified username, email, and password.

In summary, JSON is a widely used data format in REST APIs, and it is commonly used for encoding complex data structures in a request body. The use of JSON allows for a flexible and easy-to-use solution for exchanging data between systems.

## Understanding request headers

Request headers are a key component of HTTP requests in a REST API. They provide additional information about the request, such as the content type, authentication credentials, or preferred language.

Request headers are sent as part of an HTTP request, and they provide the server with information about the request context, such as the type of request, the format of the request body, or the client's preferred response format.

Here are some common request headers that are used in REST APIs:

1. Content-Type: This header specifies the format of the request body, such as JSON or XML. For example, a request with a Content-Type header set to "application/json" indicates that the request body is encoded in JSON format.
2. Authorization: This header is used to send authentication credentials, such as an API key or a bearer token, to the server. The server can then use the credentials to verify the identity of the client and grant or deny access to protected resources.
3. Accept: This header specifies the preferred format of the response body, such as JSON or XML. The server can use this header to determine the format of the response, based on the client's preference.
4. User-Agent: This header provides information about the client that is making the request, such as the name and version of the client software. The server can use this information to better understand the client and provide a more appropriate response.
5. Referer: This header specifies the URL of the previous page that the client was on, if the request is a result of following a link from another page.

In summary, request headers provide additional information about the context and context of an HTTP request, and they are used by the server to process the request and provide a suitable response. By using request headers, REST APIs can provide a more flexible and customizable solution for exchanging data and performing operations over the internet.

## Understanding query parameters

Query parameters are a key component of REST APIs, and they are used to provide additional information about the request, such as filtering, sorting, or pagination criteria. Query parameters are added to the URL as a set of key-value pairs, separated by an "&" symbol.

For example, consider a REST API that returns a list of products. The client might want to filter the results to only include products that are in stock, and sort the results by price. To do this, the client could send a GET request to the following URL:

```bash

https://api.example.com/products?inStock=true&sortBy=price
```

The server would receive the request and extract the query parameters from the URL. The server would then use the query parameters to filter the results to only include products that are in stock and sort the results by price. The server would then return a response to the client with the filtered and sorted list of products.

In this example, the query parameters "inStock=true" and "sortBy=price" provide additional information about the request to the server, allowing the server to provide a more customized response.

In summary, query parameters are a key component of REST APIs, and they are used to provide additional information about the request, such as filtering, sorting, or pagination criteria. Query parameters are added to the URL as key-value pairs, and the server uses the query parameters to process the request and provide a suitable response.

**Example :** 

The parameters can be chained on, one right after the other with an ampersand(`&`) separating them. The specific order of the parameters do not matter.

Query strings vary among APIs. So again, it is always important to reference the documentation to understand what the capabilities are. With larger API databases, common query string parameters include `limit`, `offset`, and `page`. Limit provides the number of resources/instances you want returned, while offset dictates where to start the count from. They are often used in conjunction with each other as with the following example from the Pokemon API.

```
https://pokeapi.co/api/v2/pokemon/?limit=7&offset=24
```

Following the `?` the query string is `limit=7&offset=24`. This is asking the Pokemon API to send back seven Pokemon instances, beginning at number 25.

![https://miro.medium.com/max/1120/1*_S7XwbxAHlbZB-KcY2UbRQ.png](https://miro.medium.com/max/1120/1*_S7XwbxAHlbZB-KcY2UbRQ.png)

The API information is returned in a simple JSON format with links to the specific endpoints to get a specific Pokemon’s information.

Page is similar to limit & offset, except that there is already a built in limit on how many instances are rendered and the developer just needs a page parameter to access the next/previous set of data. The following example from the Rick & Morty API, has a built in limit which shows 20 characters per page.

```
https://rickandmortyapi.com/api/character/?page=2
```

![https://miro.medium.com/max/1120/1*LvxGM8ApMcZNE5g6BEl3NA.png](https://miro.medium.com/max/1120/1*LvxGM8ApMcZNE5g6BEl3NA.png)

*Brief cameo of Aqua Morty and Aqua Rick from* S01E10 “Close Rick-counters of the Rick Kind”*.*

As can be seen in the image above, the second page of the Rick and Morty API, only displays characters with ids 21–40. As the page number increases or decreases, the characters displayed will change to the next or previous 20.

While limiting the number of response instances can be very helpful, some APIs have the ability to form query strings using attributes of the instances. The possible queries are always listed in the documentation. The Rick and Morty API, allows queries based on several character attributes including name, status, species, type, and gender, which can be used like so:

```
https://rickandmortyapi.com/api/character/?status=alive&gender=male&name=pick
```

This endpoint searches through all the characters within the API with a status of alive, a gender of male, *and* a name which contains pick. The result is the following.

![https://miro.medium.com/max/1120/1*SNKDpkkR36nXSXhEswXKyw.png](https://miro.medium.com/max/1120/1*SNKDpkkR36nXSXhEswXKyw.png)

## Reading Material

- [https://betterprogramming.pub/restful-api-design-step-by-step-guide-2f2c9f9fcdbf](https://betterprogramming.pub/restful-api-design-step-by-step-guide-2f2c9f9fcdbf)
- [https://betterprogramming.pub/how-i-built-a-rest-api-using-google-sheets-5bbf356b01f0](https://betterprogramming.pub/how-i-built-a-rest-api-using-google-sheets-5bbf356b01f0)
- [https://codeburst.io/this-is-how-easy-it-is-to-create-a-rest-api-8a25122ab1f3](https://codeburst.io/this-is-how-easy-it-is-to-create-a-rest-api-8a25122ab1f3)