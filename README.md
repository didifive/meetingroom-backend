# Crie seu gerenciador de salas de reuniões com Java e Angular

## Digital Innovation One
### Bootcamp "Java Developer"

Projeto desenvolvido com instruções de [Kamila Santos] na trilha de estudo do Bootcamp "Java Developer" da [dio.me].

<p align="center">
	<img alt="Repository language count" src="https://img.shields.io/github/languages/count/didifive/meetingroom-backend">
    <a href="https://www.linkedin.com/in/luis-carlos-zancanela/">
        <img alt="Made by Didi" src="https://img.shields.io/badge/made%20by-Didi-blue">
    </a>	
    <a href="https://github.com/didifive/meetingroom-backend/commits/master">
        <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/didifive/meetingroom-backend?color=blue">
    </a>
    <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen?color=blue">
</p>

<p align="center">
	<a href="https://dev.java/">
	  <img alt="Java" src="https://img.shields.io/static/v1?color=red&label=Dev&message=Java&style=for-the-badge&logo=Java">
	</a>
</p>

Link da base utilizada neste projeto: [Kamilahsantos/Crud-Spring-liveCoding-Dio].

Abaixo seguem modificações feitas em relação ao projeto base:
* Foi utilizado a versão 17 do Java;
* Adicionado o arquivo `system.properties` com a versão do Java para que o projeto possa ser carregado corretamente no [Heroku];
* Na classe "Room" foi adicionado o atributo `link` e anotações lombok `@AllArgsConstructor`, `@NoArgsConstructor` e `@Setter`;
* Na classe "ErrorDetails" foi utilizado a anotação lombok `@Getter`;
* Na classe "RoomController" o método `createRoom()` foi alterado para que o mesmo retorne o HTTP Status "201 Created";
* Adicionada a dependência [Springdoc OpenAPI UI] para disponibilizar Swagger;
* Para o projeto funcionar com o frontend hospedado no Netlify, foi necessário adicionar o domínio `https://meetingroomclient.netlify.app` em `@CrossOrigin` na classe `RoomController`. 

---

#### Endpoints criados na API: 
* Criar sala de reuniao: `POST` `/api/v1/rooms`
* Listar todas as salas: `GET` `/api/v1/rooms`
* Buscar uma sala pelo Id: `GET` `/api/v1/rooms/{id}`
* Atualizar uma sala pelo Id: `PUT` `/api/v1/rooms/{id}`
* Excluir uma sala pelo id: `DELETE` `/api/v1/rooms/{Id}`

Para testar localmente os Endpoints, foi adicionado ao projeto uma coleção do Postman que já possuí modelos e testes de requisições HTTP. O arquivo está na pasta [postman](https://github.com/didifive/meetingroom-backend/tree/master/postman)

Link para acessar Swagger no projeto carregado localmente: `http://localhost:8082/swagger-ui.html`

Link para acessar Swagger no projeto no [Heroku]: [https://meetingroom-backend.herokuapp.com/swagger-ui.html](https://meetingroom-backend.herokuapp.com/swagger-ui.html)

---

#### Frontend em Angular para este projeto: 
* Repositório: [didifive/meetingroom-client]
* Link Projeto Online: https://meetingroomclient.netlify.app/  
[![Netlify Status](https://api.netlify.com/api/v1/badges/53c4dc7a-b520-4621-9e9f-c94b3178c337/deploy-status)](https://app.netlify.com/sites/meetingroomclient/deploys)

---

Link do projeto disponível online no [Heroku]: [https://meetingroom-backend.herokuapp.com](https://meetingroom-backend.herokuapp.com/api/v1/rooms)  
_Observação: Quando o projeto fica sem receber requisições por um tempo, automaticamente o Heroku coloca ele em modo dormir (sleepy), portanto caso ocorra erro de timeout, basta tentar novamente que deve estar ativo._

---

Links Interessantes:
* [Java 17 - Documentation]
* [IntelliJ]
* [spring]
* [spring initializr]
* [Heroku]
* [Netlify]
* [Jakarta Validation]
* [Lombok]
* [Maven]
* [H2 Database]
* [Springdoc OpenAPI UI]


[dio.me]: https://dio.me/
[Kamila Santos]: https://www.linkedin.com/in/kamila-santos-oliveira/
[Kamilahsantos/Crud-Spring-liveCoding-Dio]: https://github.com/Kamilahsantos/Crud-Spring-liveCoding-Dio
[Heroku]: https://www.heroku.com/
[Jakarta Validation]: https://beanvalidation.org/
[Lombok]: https://projectlombok.org/
[Java 17 - Documentation]: https://docs.oracle.com/en/java/javase/17/
[IntelliJ]: https://www.jetbrains.com/pt-br/idea/
[Maven]: https://maven.apache.org/
[H2 Database]: https://h2database.com/
[spring initializr]: https://start.spring.io/
[spring]: https://spring.io/
[didifive/meetingroom-client]: https://github.com/didifive/meetingroom-client
[Springdoc OpenAPI UI]: https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui/1.5.12
[Netlify]:https://www.netlify.com/