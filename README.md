# API Project

## Project Overview
REST API based web app for uploading and analyzing file information and metadata. This web server is built in Spring Boot, backed by Gradle and Java, containerized through docker images and manifested the web server through kubernetes, and automated through the Github Actions pipeline.

## Prerequisites
1. JAVA 17 - [Corretto]("https://aws.amazon.com/corretto/")
The Amazon Corretto 17 distribution is used for this project as it fits perfectly in the JAVA setup workflow for Github Actions. If you plan on using the same pipeline, some other options can be found here. [distros]("https://github.com/actions/setup-java#supported-distributions.").

2. Spring Boot - [Initializer]("https://start.spring.io/")
It is an amazing spring initializer which let's the user choose the java version, build type and many dependencies to choose from to initialize a project.

3. Docker - [Docker Desktop]("https://www.docker.com/products/docker-desktop/")
Essesntial tool to build and analyze docker images and containers.

4. Kubernetes - [Minikube and Kubectl]("https://kubernetes.io/docs/tasks/tools/")
Both can be downloaded from the above link and are essential as minikube provides single node cluster to check and test out the docker images formed.

## API Description
The REST API let's the user upload an file on the web server and in turn get the metadata for the file.
_The POST_ Method allows to post the resource to the web server.
