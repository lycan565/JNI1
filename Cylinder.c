#include <jni.h>
#include <stdio.h>
#include "Cylinder.h"

JNIEXPORT jdouble JNICALL Java_Cylinder_calcSurfaceArea (JNIEnv *env, jobject obj, jdouble radius, jdouble height) {
	
	jdouble result;
	
	result = (2*3.14159*radius*height)+(2*3.14159*radius*radius);
	
	return result;

}

JNIEXPORT jdouble JNICALL Java_Cylinder_calcVol (JNIEnv *env, jobject obj, jdouble radius, jdouble height) {
	
	jdouble result;
	
	result = 3.14159*radius*radius*height;
	
	return result;

}