#!/bin/bash
echo "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Clean *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
make clean

echo "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Configuring *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
bash configure --with-cmake --with-boot-jdk=/home/jenkins/bootjdks/jdk18 --enable-inline-types --with-native-debug-symbols=internal

echo "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Building *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
make all

echo "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Done *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
