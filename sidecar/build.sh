mvn clean install -f java-web-app/pom.xml
docker build -f ./java-web-app/docker/Dockerfile -t java-web-app:snapshot java-web-app

docker build -f ./python-web-app/docker/Dockerfile -t python-web-app:snapshot python-web-app

mvn clean install -f sidecar-app/pom.xml
docker build -f ./sidecar-app/docker/Dockerfile -t sidecar-app:snapshot sidecar-app

