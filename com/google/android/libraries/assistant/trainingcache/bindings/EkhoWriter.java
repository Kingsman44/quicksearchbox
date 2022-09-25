package com.google.android.libraries.assistant.trainingcache.bindings;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5228m.C67270aa;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
public class EkhoWriter implements AutoCloseable {

    /* renamed from: b */
    private static final C59071e f54363b = C59071e.m91332i("com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter");

    /* renamed from: a */
    public final AtomicLong f54364a = new AtomicLong(nativeCreate());

    public static native void nativeBeginSession(long j, int i);

    private static native void nativeCacheEvent(long j, int i, int i2, byte[] bArr, String str, byte[] bArr2);

    public static native void nativeClearAsync(long j);

    private static native long nativeCreate();

    private static native void nativeDestroy(long j);

    public static native void nativeDisableWriting(long j);

    public static native void nativeEnableWriting(long j);

    public static native void nativeEndSession(long j, int i);

    public static native void nativeFlushAndWait(long j);

    private static native void nativeFlushAsync(long j);

    private static native String[] nativeGetSchemaNames(long j);

    private static native void nativeInit(long j, byte[] bArr);

    public static native boolean nativeIsInitialized(long j);

    private static native boolean nativeIsWritingEnabled(long j);

    public static native void nativeResetPolicyConfig(long j, byte[] bArr);

    public static native void nativeResetRuntimeParams(long j, byte[] bArr);

    /* renamed from: a */
    public final void mo24643a(C19439b bVar) {
        long j = this.f54364a.get();
        int i = bVar.f54368c - 1;
        int i2 = bVar.f54369d;
        int i3 = i2 - 1;
        if (i2 != 0) {
            nativeCacheEvent(j, i, i3, bVar.f54367b, (String) null, (byte[]) null);
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo24644b(C67270aa aaVar) {
        nativeInit(this.f54364a.get(), aaVar.toByteArray());
    }

    public final void close() {
        long andSet = this.f54364a.getAndSet(0);
        if (andSet == 0) {
            ((C59052c) ((C59052c) f54363b.mo56226d()).mo56372aa(47845)).mo56386p("Already closed.");
        } else {
            nativeDestroy(andSet);
        }
    }
}
