FROM openjdk:8-jre-alpine

ADD build/libs/soapservice.jar /opt/
WORKDIR /opt

ARG soap_server_port
ENV SOAP_SERVER_PORT=${soap_server_port}

EXPOSE ${SOAP_SERVER_PORT}/tcp

CMD java -jar soapservice.jar
