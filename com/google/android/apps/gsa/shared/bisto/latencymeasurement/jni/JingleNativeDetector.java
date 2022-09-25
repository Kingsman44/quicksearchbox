package com.google.android.apps.gsa.shared.bisto.latencymeasurement.jni;

/* compiled from: PG */
public final class JingleNativeDetector {
    private JingleNativeDetector() {
    }

    public static native int detectJingle(float[] fArr);

    public static native boolean initJingleDetector(float[] fArr, int i);

    public static native void release();
}
