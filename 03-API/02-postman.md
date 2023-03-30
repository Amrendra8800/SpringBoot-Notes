# Postman

Postman is an API(application programming interface) development tool which helps to build, test and modify APIs. Almost any functionality that could be needed by any developer is encapsulated in this tool. It is used by over 5 million developers every month to make their API development easy and simple. It has the ability to make various types of HTTP requests(GET, POST, PUT, PATCH), saving environments for later use, converting the API to code for various languages(like JavaScript, Python).

![https://assets.postman.com/postman-docs/v10/intro-postman-request-selected-3-v10.jpg](https://assets.postman.com/postman-docs/v10/intro-postman-request-selected-3-v10.jpg)

If you're starting to learn about APIs and Postman, you can use a variety of channels both in and outside Postman

- **[Send your first request!](https://learning.postman.com/docs/getting-started/sending-the-first-request/)**
    
    # **Sending your first request**
    
    Postman enables you to create and send API requests. Send a request to an endpoint, retrieve data from a data source, or test an API's functionality. You don't need to enter commands in a terminal or write any code. Create a new request and select **Send**, and the API response appears right inside Postman.
    
    # **API requests defined**
    
    APIs provide a structured way for one application to access the capabilities of another application. Typically, this communication happens over the internet by way of an API server. A client application (like a mobile app) sends a request to the server, and after the request processes the server returns a response to the client.
    
    A request includes the URL of the API endpoint and an HTTP request method. The method indicates the action you want the API to perform. Here are some of the most common methods:
    
    - `GET` retrieves data from an API.
    - `POST` sends new data to an API.
    - `PATCH` and `PUT` update existing data.
    - `DELETE` removes existing data.
    
    # **Sending a request**
    
    When you're ready, open Postman and send your first request.
    
    1. Select **+** in the workbench to open a new [tab](https://learning.postman.com/docs/getting-started/navigating-postman/#tabs).
    2. Enter `postman-echo.com/get` for the request URL.
    3. Select **Send**.
    
    Postman displays the response data sent from the server in the lower pane.
    
    ![https://assets.postman.com/postman-docs/first-request-sent-v9-4.jpg](https://assets.postman.com/postman-docs/first-request-sent-v9-4.jpg)
    
    # **What happened?**
    
    In this example, Postman is acting as the client application and is communicating with an API server. Here's what happened when you selected **Send**:
    
    1. Postman sent a `GET` request to the [Postman Echo API](https://www.postman.com/postman/workspace/published-postman-templates/documentation/631643-f695cab7-6878-eb55-7943-ad88e1ccfd65?ctx=documentation) server located at `postman-echo.com`.
    2. The API server received the request, processed it, and returned a response to Postman.
    3. Postman received the response and displayed it in the **Response** pane.
    
    You used Postman to send an API request and got a response from the API server. It's okay to take a moment to sit back and reflect on how cool that is!
    
    ![https://assets.postman.com/postman-docs/anatomy-of-a-request-v8.jpg](https://assets.postman.com/postman-docs/anatomy-of-a-request-v8.jpg)
    
    # **Next steps**
    
    Now that you've sent your first request, you're ready to do more with Postman!
    
    - You can send some more requests to the Postman Echo API, a handy tool you can use to test API requests in Postman. To learn more about using the Echo API, visit the [Postman Echo API documentation](https://learning.postman.com/docs/developer/echo-api/).
    - When you're ready to learn more about building and sending requests in Postman, visit [Building requests](https://learning.postman.com/docs/sending-requests/requests/).