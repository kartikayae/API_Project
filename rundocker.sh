#!/bin/bash

export CONTAINER_NAME=kartikayae-rapidfort-assignment-container
export DOCKER_HUB_NAME=kartikayae
export IMAGE_NAME=apiproject

export SRC=/src/main/resources/uploads/
export DST=/tmp/uploads/

docker run -d --name "$CONTAINER_NAME" -v "$SRC":"$DST" -p 8080:8080 "$DOCKER_HUB_NAME"/"$IMAGE_NAME"