# API do correios com FEIGN

Exemplo de uso

Start da aplicação

Observação: Atualmente utilizando Java 11
- Abrir o prompt de comando e navegar até o diretório raiz do projeto
- executar o comando no prompt de comando : mvnw.cmd clean package && java -jar target\correios-consumer-0.0.1-SNAPSHOT.jar


Testando a aplicação

Pelo postman:
- Definir os parametros de autorização
- fazer uma requisição GET localhost:8080/<Código_do_objeto_de_rastreamento>
![image](https://user-images.githubusercontent.com/9707812/207958533-bfa19355-e65c-4916-a252-b0307550e2d8.png)
