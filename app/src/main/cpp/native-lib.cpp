#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_timurya829_myapplication_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Нет настроения? Усталость? Или просто хочется приободрения?";
    return env->NewStringUTF(hello.c_str());
}
