#!/bin/bash

cf push pubs-api -p build/libs/gs-spring-boot-0.1.0.jar -b https://github.com/cloudfoundry/java-buildpack.git