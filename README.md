user docker start mysql service
```
docker run --name my-mysql -e MYSQL_ROOT_PASSWORD=123 -e MYSQL_DATABASE='user_center' -p 3306:3306 -d mysql
```
use flyway init DB
```
mvn flyway:clean flyway:migrate
```