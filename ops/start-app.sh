#!/usr/bin/env bash
set -e

pushd docker/app && ./build-image.sh
popd

pushd docker/ && docker-compose down && docker-compose up -d
popd