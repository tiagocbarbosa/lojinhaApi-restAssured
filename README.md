# lojinhaApi-restAssured
My application tests the [RESTful APIs](https://www.postman.com/restless-trinity-831044/workspace/lojinha-api/overview) created by [Júlio de Lima](http://www.juliodelima.com.br/) using REST Assured.

I'm using the framework to learn it, and a challenge I faced was a interesting way to pass the body request with REST Assured without writing the JSON in the code. [Jackson Databind](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.13.1) helped me with that.

In the future I hope to add more testing scenarios to the application.

## Prerequisites
- IntelliJ IDEA
- Maven 3+
- JDK 17+

## Installation
1. Clone the repository in your machine.
2. Open it in IntelliJ.
3. Install JDK through IntelliJ in case you don't have it.

## Usage
For instance, open the [ProdutoTest](https://github.com/tiagocbarbosa/lojinhaApi-restAssured/blob/main/src/test/java/modules/produto/ProdutoTest.java) file in IntelliJ and run the tests. The IDEA's console output should look like this:

```
Process finished with exit code 0
```


## References
URL of the Lojinha API V2 REST APIs: http://165.227.93.41/lojinha/v2/

URL of the buggy Lojinha API V2 REST APIs: http://165.227.93.41/lojinha-bugada/v2/

[Swagger Editor](https://editor.swagger.io/)

[Swagger documentation of the RESTful APIs](http://165.227.93.41/lojinha/lojinha-v2.yml)

[Getting started with REST Assured](https://github.com/rest-assured/rest-assured/wiki/GettingStarted)

[Jackson Databind](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.13.1): it enables us to pass a POJO in the "body" method of the REST Assured library, for example.  

[How to write a good README file](https://www.freecodecamp.org/news/how-to-write-a-good-readme-file/)
