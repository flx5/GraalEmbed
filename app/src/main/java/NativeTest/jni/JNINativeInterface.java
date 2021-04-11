package NativeTest.jni;

import org.graalvm.nativeimage.c.CContext;
import org.graalvm.nativeimage.c.struct.CField;
import org.graalvm.nativeimage.c.struct.CStruct;
import org.graalvm.word.PointerBase;

@CContext(JNIHeaderDirectives.class)
@CStruct(value = "JNINativeInterface_", addStructKeyword = true)
public interface JNINativeInterface extends PointerBase {
  @CField
  GetMethodId getGetStaticMethodID();

  @CField
  CallStaticVoidMethod getCallStaticVoidMethodA();
}
