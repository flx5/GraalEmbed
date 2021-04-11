package org.test;

/**
 * Based on https://www.graalvm.org/reference-manual/native-image/ImplementingNativeMethodsInJavaWithSVM/
 */

public class Native {
  public static void main(String[] args) {
    System.loadLibrary("nativeimpl");

    long isolateThread = createIsolate();

    System.out.println("HelloJVM " + System.getProperty("java.version") + " " + System.getProperty("java.vm.name"));

    System.out.println("2 + 40 = " + add(isolateThread, 2, 40));
    System.out.println("12 + 30 = " + add(isolateThread, 12, 30));
    System.out.println("20 + 22 = " + add(isolateThread, 20, 22));
  }

  public static void hello(boolean z, char c, byte b, short s, int i, long j, float f, double d) {
    System.err.println("Hi, I have just been called back!");
    System.err.print("With: " + z + " " + c + " " + b + " " + s);
    System.err.println(" and: " + i + " " + j + " " + f + " " + d);
  }

  private static native int add(long isolateThread, int a, int b);
  private static native long createIsolate();
}
