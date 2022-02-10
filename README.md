# lojinhaApi-restAssured
My application tests the [RESTful APIs](https://www.postman.com/restless-trinity-831044/workspace/lojinha-api/overview) created by [Júlio de Lima](http://www.juliodelima.com.br/) using REST Assured.

I'm using the framework to learn it. A challenge I faced was a interesting way to pass the body request with REST Assured without writing the JSON in the code. [Jackson Databind](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.13.1) helped me with that.

In the future I hope to add more testing scenarios to the application.

## References
URL of the Lojinha API V2 REST APIs: http://165.227.93.41/lojinha/v2/

URL of the buggy Lojinha API V2 REST APIs: http://165.227.93.41/lojinha-bugada/v2/

[Swagger Editor](https://editor.swagger.io/)

[Swagger documentation of the RESTful APIs](http://165.227.93.41/lojinha/lojinha-v2.yml)

[Getting started with REST Assured](https://github.com/rest-assured/rest-assured/wiki/GettingStarted)

[Jackson Databind](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.13.1): it enables us to pass a POJO in the "body" method of the REST Assured library, for example.  
