#!/usr/bin/env bash

eval $(minikube docker-env)

semanticVersion=0.0.1
version=$semanticVersion

#./gradlew sample-gw:clean
./gradlew sample-web:clean
./gradlew sample-api-interface:clean
./gradlew sample-api:clean
#./gradlew sample-task:clean

#./gradlew sample-gw:buildDocker -x test
./gradlew sample-web:buildDocker -x test
./gradlew sample-api:buildDocker -x test
#./gradlew sample-task:buildDocker -x test

#docker tag jcconf-2019-sample/sample-gw:0.0.1 jianminhuang/sample-gw:$version
#docker tag jcconf-2019-sample/sample-web:0.0.1 jianminhuang/sample-web:$version
#docker tag jcconf-2019-sample/sample-api:0.0.1 jianminhuang/sample-api:$version
#docker tag jcconf-2019-sample/sample-task:0.0.1 jianminhuang/sample-task:$version
#
#docker push jianminhuang/sample-gw:$version
#docker push jianminhuang/sample-web:$version
#docker push jianminhuang/sample-api:$version
#docker push jianminhuang/sample-task:$version

#docker rmi $(docker images -f "dangling=true" -q)
