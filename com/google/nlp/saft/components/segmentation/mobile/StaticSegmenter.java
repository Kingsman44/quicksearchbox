package com.google.nlp.saft.components.segmentation.mobile;

/* compiled from: PG */
public class StaticSegmenter {
    private StaticSegmenter() {
    }

    public static native boolean nativeInit(String str);

    private static native void nativeReset();

    private static native byte[] nativeTokenize(String str);
}
