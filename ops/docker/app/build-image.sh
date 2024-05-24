#!/usr/bin/env bash
set -e

TAG=${1:-wg/app:0.0.1-SNAPSHOT}

pushd ../../../ && ./gradlew --build-cache build && popd

cp ../../../build/libs/micronaut_web_app-0.1-all.jar app.jar

docker build --network host -t $TAG .

rm app.jar