package com.google.android.libraries.mdi.download.delta.vcdiff;

import android.util.Log;

/* compiled from: PG */
public final class VcDiffFileDecoder {

    /* renamed from: a */
    public static final boolean f79466a = m54212b();

    VcDiffFileDecoder() {
    }

    /* renamed from: a */
    public static boolean m54211a(String str, String str2, String str3) {
        if (f79466a) {
            try {
                return nativeDecoder(str, str2, str3);
            } catch (UnsatisfiedLinkError e) {
                throw new IllegalStateException(e);
            }
        } else {
            throw new IllegalStateException("Native vcdiff library failed to initialize");
        }
    }

    /* renamed from: b */
    static boolean m54212b() {
        try {
            Log.d("VcDiffFileDecoder", "Start to load vcdiffjni.so");
            System.loadLibrary("vcdiffjni");
            return true;
        } catch (SecurityException | UnsatisfiedLinkError e) {
            Log.e("VcDiffFileDecoder", "Unable to load vcdiffjni.so", e);
            return false;
        }
    }

    private static native boolean nativeDecoder(String str, String str2, String str3);
}
