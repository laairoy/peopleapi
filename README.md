## Sistema de gerenciamento de pessoas em API REST com Spring Boot
Pequeno sistema de gerenciamento de pessoas desenvolvido através de uma API REST, criada com Spring Boot.
Desenvolvido durante o Spread Java Bootcamp, na plataforma [DIO](https://dio.me) 

### Executando o projeto
Para executar o projeto no terminal, digitar o comando:

```shell
./mvnw spring-boot:run
```

Para fazer as requisições do programa, acessar o endereço:
```
http://localhost:8080/api/v1/people
```

### Requisições que podem ser feitas:

#### GET
```
http://localhost:8080/api/v1/people
```

#### GET (BY ID)
```
http://localhost:8080/api/v1/people/{id}
```

#### POST
```
http://localhost:8080/api/v1/people
```
- Corpo da requisição, exemplo:

```json
{
    	"firstName": "Jose",
    	"lastName": "Aristides",
    	"cpf": "011.011.111-11",
    	"birthDate": "2001-10-10",
	"phones": [
        	{
            		"type": "MOBILE",
            		"number": "5542999999999"
        	}
    	]
}
```

#### PUT

```
http://localhost:8080/api/v1/people/{id}
```

- Corpo da requisição, exemplo:

```json
{
    	"id": 1,
    	"firstName": "Jose",
    	"lastName": "Aristides",
    	"cpf": "011.011.111-11",
    	"birthDate": "2001-10-10",
    	"phones": [
        	{
            		"id": 1,
            		"type": "MOBILE",
            		"number": "5542999999999"
        	}
    	]
}
```

#### DELETE

```
http://localhost:8080/api/v1/people/{id}
```

