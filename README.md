# spring-cloud-eureka-auth

### Spring Cloud with Eureka Discovery Server , Netflix Ribbon Load Balancer

**Setup :**  
./gradlew clean build  
docker-compose up -d --build  
docker-compose scale composite-service=2 user-service=3

**Run :**  
curl -X GET http://localhost:8080/composite-service/user | jq  
curl -X GET http://localhost:8080/composite-service/user | jq

**Output :**  
docker-compose logs --tail='all' api-gateway  
On calling the composite service we can infer from the api-gateway logs that composite-service instances are being called in a round-robin fashion.  





