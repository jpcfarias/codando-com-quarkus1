# Meu projeto usando quarkus
nao possui front-end, use o postman ou qualquer outro parecido.

## Possui integraçao com o docker-compose
basta apenas digitar no terminal com o docker ja instalado docker-compose up ou docker-compose down 

## Dominios:
- Para gerar algum usuario aleatorio:
http://localhost:8080/gerarusuario

- Para cadastrar um usuario:
http://localhost:8080/usuario/cadastro

- Para listar ou buscar por id (para efetuar qualquer uma das requisiçoes abaixo é preciso de uma autenticaçao basica para um usuario adm):
http://localhost:8080/usuario/buscar/listar || http://localhost:8080/usuario/buscar/1

- Para cadastrar um adm é so botar o usuario como 'admin'

-exemplo de json para cadastro: {"first_name":"Josephine","email":"j.russell22@yahooo.com","username":"josephinerussell29","password":"#CAAjosephinerussellhtQ"}

## X-RapidAPI-Key
como o gerador de usuario é uma api externa que peguei no rapidAPI, crie uma conta la se nao tiver. E coloque sua X-RapidAPI-Key no application.properties

### Comandos apos inserir a X-RapidAPI-Key
-mvn clean install -DskipTests (opcional para criar o .jar)

-docker-compose build

-docker-compose up