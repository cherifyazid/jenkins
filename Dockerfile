FROM ubuntu:latest
RUN apt-get update
RUN apt-get install -y ssh openssh-server iputils-ping default-jdk curl
RUN service ssh start
CMD bash