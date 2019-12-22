#!/usr/bin/env bash

semanticVersion=0.0.1
version=$semanticVersion

./gradlew sample-api-interface:clean
./gradlew sample-api:clean
./gradlew sample-task:clean

./gradlew sample-api:buildDocker -x test
./gradlew sample-task:buildDocker -x test

docker tag jcconf-2019-sample/sample-api:0.0.1 jianminhuang/sample-api:$version
docker tag jcconf-2019-sample/sample-task:0.0.1 jianminhuang/sample-task:$version

docker push jianminhuang/sample-api:$version
docker push jianminhuang/sample-task:$version

docker rmi $(docker images -f "dangling=true" -q)
