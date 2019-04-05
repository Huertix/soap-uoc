#SOAP SERVICE UOC

Steps:
------

From de root directory:

 - ./gradlew clean test makeJar
 
 - docker image build -t soapservice:latest . --build-arg soap_server_port=8000
 
 - docker run -p 8001:8001 -e SOAP_SERVER_PORT=8001 soapservice
 