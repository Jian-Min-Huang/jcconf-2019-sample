#!/usr/bin/env bash

docker-compose -f docker/local/docker-compose.yml down
docker-compose -f docker/local/docker-compose.yml up -d
