#!/usr/bin/env bash

./gradlew sample-api-interface:clean
./gradlew sample-api:clean
./gradlew sample-task:clean

./gradlew sample-api:buildDocker -x test
./gradlew sample-task:buildDocker -x test

docker rmi $(docker images -f "dangling=true" -q)
