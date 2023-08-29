# API Project

## Project Overview
REST API based web app for uploading and analyzing file information and metadata. This web server is built in Spring Boot, backed by Gradle and Java, containerized through docker images and manifested the web server through Kubernetes, and automated through the GitHub Actions pipeline.

## Prerequisites
1. JAVA 17 - [Corretto](https://aws.amazon.com/corretto/).  
The Amazon Corretto 17 distribution is used for this project as it fits perfectly in the JAVA setup workflow for GitHub Actions. If you plan on using the same pipeline, some other options can be found [here](https://github.com/actions/setup-java#supported-distributions).

2. Spring Boot - [Initializer](https://start.spring.io/)  
It is an amazing spring tool that lets the user choose the Java version, build type, and many dependencies to choose from to initialize a project.

3. Docker - [Docker Desktop](https://www.docker.com/products/docker-desktop/)  
An essential tool to build and analyze docker images and containers.

4. Kubernetes - [Minikube and Kubectl](https://kubernetes.io/docs/tasks/tools/)  
Both can be downloaded from the above link and are essential as minikube provides a single node cluster to check and test out the docker images formed.

## API Description
The REST API lets the user upload a file on the web server and in turn, get the metadata for the file.  
_The POST_ Method allows posting of the resource to the web server.

### How to run this API locally?
1. All the prerequisites must be checked off before pulling the git repository to a local machine.
2. Pull the repository to a local machine.
3. Run './gradlew build'.
4. Once the build succeeds, the jar file is created by Gradle in the 'build/libs/' directory.
5. Run the jar file - 'java -jar path/to/jar-file'. The program must be running by now.
6. The file uploaded would be in src/main/resources/uploads directory.

### To dockerize
1. To dockerize this web app, a docker image needs to be created.
2. Run 'bash rundocker.sh'.

### To run Kubernetes Cluster and deploy service
1. Install minikube and kubectl.
2. Start the cluster by running 'minikube start' and check the status by 'minikube status'.
3. Once it is up and running, run 'kubectl apply -f deployment.yaml'.
4. Run 'kubectl apply -f service.yaml'.
5. Get the pod by 'kubectl get pods' and expose the deployment by 'kubectl expose deployment ${service name}'.
