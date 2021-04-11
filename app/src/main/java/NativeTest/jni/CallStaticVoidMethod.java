package NativeTest.jni;

import org.graalvm.nativeimage.c.function.CFunctionPointer;
import org.graalvm.nativeimage.c.function.InvokeCFunctionPointer;

public interface CallStaticVoidMethod extends CFunctionPointer {
  @InvokeCFunctionPointer
  void call(JNIEnvironment env, JClass cls, JMethodID methodid, JValue args);
}
