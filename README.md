# spring-cloud-eureka-auth

### Spring Cloud with Eureka Discovery Server

**Setup :**  
./gradlew clean build  
docker-compose up -d --build  
docker-compose up -d --scale user-service=3

**Run :**  
curl -X GET http://localhost:8080/v1/composite-user | jq


