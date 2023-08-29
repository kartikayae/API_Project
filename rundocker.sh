#!/bin/bash

export CONTAINER_NAME=kartikayae-rapidfort-assignment-container
export DOCKER_HUB_NAME=kartikayae
export IMAGE_NAME=apiproject

docker run -d --name "$CONTAINER_NAME" -p 8080:8080 "$DOCKER_HUB_NAME"/"$IMAGE_NAME"
