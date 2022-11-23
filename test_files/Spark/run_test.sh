#!/bin/bash
JAVA_DEV_HOME="/home/arjun/Working_Directory/OpenJ9/Containers/openj9_valuetypes_dev/build/linux-x86_64-server-release/images/jdk/bin/java"

# $JAVA_DEV_HOME/bin/javac -XDenablePrimitiveClasses BT2.java
$JAVA_DEV_HOME -XX:ValueTypeFlatteningThreshold=99999 -cp Spark_Benchmark-1.0.jar:gson-2.8.5.jar in.ac.iitmandi.compl.Main ./dataset/movies.json
