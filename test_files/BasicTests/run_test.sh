#!/bin/bash
JAVA_DEV_HOME="../../build/linux-x86_64-server-release/images/jdk/"

$JAVA_DEV_HOME/bin/javac -XDenablePrimitiveClasses BT2.java
$JAVA_DEV_HOME/bin/java -XX:ValueTypeFlatteningThreshold=99999 -Xjit:debugCounters={InlineStatistics*},staticDebugCounters={InlineStatistics*},count=0 BT2