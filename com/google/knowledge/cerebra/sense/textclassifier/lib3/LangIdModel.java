package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public final class LangIdModel implements AutoCloseable {

    /* renamed from: a */
    public long f167205a;

    /* renamed from: b */
    private final AtomicBoolean f167206b = new AtomicBoolean(false);

    /* compiled from: PG */
    public final class LanguageResult {

        /* renamed from: a */
        public final String f167207a;

        /* renamed from: b */
        public final float f167208b;

        LanguageResult(String str, float f) {
            this.f167207a = str;
            this.f167208b = f;
        }
    }

    static {
        C61860b.m94501a();
    }

    public LangIdModel(int i, long j, long j2) {
        long nativeNewWithOffset = nativeNewWithOffset(i, j, j2);
        this.f167205a = nativeNewWithOffset;
        if (nativeNewWithOffset == 0) {
            throw new IllegalArgumentException("Couldn't initialize LangId from given file descriptor.");
        }
    }

    private native void nativeClose(long j);

    private native float nativeGetLangIdNoiseThreshold(long j);

    private native int nativeGetMinTextSizeInBytes(long j);

    private static native int nativeGetVersionFromFd(int i);

    private static native int nativeGetVersionWithOffset(int i, long j, long j2);

    private static native long nativeNew(int i);

    private static native long nativeNewFromPath(String str);

    private static native long nativeNewWithOffset(int i, long j, long j2);

    public final void close() {
        if (this.f167206b.compareAndSet(false, true)) {
            nativeClose(this.f167205a);
            this.f167205a = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    public float getLangIdNoiseThreshold() {
        return nativeGetLangIdNoiseThreshold(this.f167205a);
    }

    /* access modifiers changed from: package-private */
    public int getMinTextSizeInBytes() {
        return nativeGetMinTextSizeInBytes(this.f167205a);
    }

    public native LanguageResult[] nativeDetectLanguages(long j, String str);

    public native float nativeGetLangIdThreshold(long j);

    public native int nativeGetVersion(long j);
}
