# “Облачное хранилище”

## Запуск приложения GalaxyCloud с помощью файла docker-compose.yml (Dockerfile) (frontendApp + backendApp + postgres)
1. Клонируем проект на свой ПК [git@github.com:Papamozhet1991/skovorodkodiplom2.git](https://github.com/mySkillsKit/GalaxyCloud.git)
2. Запускаем приложение [Docker Desktop](https://www.docker.com/products/docker-desktop/);
3. Запускаем терминал в папке `/Diplom2` и собираем jar архив с нашим Spring REST приложением:
4. ```mvn clean package -Dskiptests``` or ```mvn clean package -Dmaven.test.skip```
5. Собирать jar файл также можно с помощью IntelliJ IDEA
6. После успешной сборки в папке будет находиться jar файл:`/Diplom2/target/skovorodkodiplom-0.0.1-SNAPSHOT.jar`
7. В терминале выполнить команду по сборке images и containers:
8. ```docker-compose up```
9. В докере запустятся 3 приложения: 
 - Backend App Java 11 -> ```http://localhost:8080```
 - Frontend App Node 15 -> ```http://localhost:8090```
 - Database Postgres 14 -> ```http://localhost:5432```
10. Запуск тестов: `mvn test` 

## Документация и проверить app можно c помощью swagger:
### ```http://localhost:8080/swagger-ui/index.html```
### ```http://localhost:8080/v3/api-docs```

## Для тестирования backend + postgres нужно авторизовать пользователя:
 - Отправить POST запрос `http://localhost:8080/login`
 - JSON -> `{
"login": "user@test.com",
"password": "Qwerty1234"
}`
 - Полученный в ответ auth-token ввести в окно `Authorize` 

## Если в Базе Данных postgres нет этого пользователя, то нужно создать пользователя 
- Отправить POST запрос `http://localhost:8080/users/create`
- JSON -> `{
  "login": "user@test.com",
  "password": "Qwerty1234"
  }`

## Для тестирования frontend + backend + postgres нужно перейти по ссылке и ввести:
### `http://localhost:8090/login`
### логин `user@test.com` 
### пароль: `Qwerty1234`

- Выход из приложения: в терминале нажать "Ctrl+C"
- Удаление Docker контейнера: ```docker-compose down```


`http://localhost:8080/users/create`

`{
"login": "admin@test.com",
"password": "Qwerty1111"
}`

`{
"login": "admin@test.com",
"password": "$2a$12$pBqGg4hhFmlYJuRCNadI3ehWlX6EnLdpHgQRnkIinsh6rIPm6ZbyC"
}`
