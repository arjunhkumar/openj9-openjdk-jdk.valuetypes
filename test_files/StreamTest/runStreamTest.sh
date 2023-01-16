#!/bin/bash
JAVA_DEV_HOME="/home/arjun/Softwares/jdk_20/jdk/"
#JAVA_DEV_HOME="/home/arjun/Workspaces/openj9_valuetypes_dev/build/linux-x86_64-server-release/images/jdk/"

if [ -d "./compile_dir" ];
    then
        rm -r ./compile_dir
fi

mkdir "compile_dir"
cp -r "src/." "compile_dir/"
cd "compile_dir/"

$JAVA_DEV_HOME/bin/javac -XDenablePrimitiveClasses StreamTest.java
$JAVA_DEV_HOME/bin/java -XX:ValueTypeFlatteningThreshold=100 StreamTest
