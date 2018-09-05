# JNI1

Used for calculating a cylinder's surface area and volume from input of radius and height using JNI

CLI command to run JNI program(for my pc):
javac Cylinder.java
javac -h . Cylinder.java
x86_64-w64-mingw32-gcc -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -shared -o Cylinder.dll Cylinder.c
java Cylinder
