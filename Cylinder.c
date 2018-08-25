#include <jni.h>
#include <stdio.h>
#include "Cylinder.h"

JNIEXPORT jdouble JNICALL Java_Cylinder_calcSurfaceArea (JNIEnv *env, jobject obj, jdouble n1, jdouble n2) {
	jdouble radius,height;
	jdouble result;

	radius = ((jdouble)n1);
	height = ((jdouble)n2);
	
	result = (2*3.14159*radius*height)+(2*3.14159*radius*radius);
	
	return result;

}

JNIEXPORT jdouble JNICALL Java_Cylinder_calcVol (JNIEnv *env, jobject obj, jdouble n1, jdouble n2) {
	jdouble radius,height;
	jdouble result;

	radius = ((jdouble)n1);
	height = ((jdouble)n2);
	
	result = 3.14159*radius*radius*height;
	
	return result;

}