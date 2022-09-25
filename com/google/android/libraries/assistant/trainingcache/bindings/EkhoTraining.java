package com.google.android.libraries.assistant.trainingcache.bindings;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
public class EkhoTraining implements AutoCloseable {

    /* renamed from: b */
    private static final C59071e f54361b = C59071e.m91332i("com.google.android.libraries.assistant.trainingcache.bindings.EkhoTraining");

    /* renamed from: a */
    public final AtomicLong f54362a = new AtomicLong(nativeCreate());

    private static native long nativeCreate();

    public static native long nativeCreateMaterializer(long j, String str);

    private static native void nativeDestroy(long j);

    private static native String[] nativeGetRegisteredCollections(long j);

    public static native void nativeInit(long j, byte[] bArr, byte[] bArr2);

    public final void close() {
        long andSet = this.f54362a.getAndSet(0);
        if (andSet == 0) {
            ((C59052c) ((C59052c) f54361b.mo56226d()).mo56372aa(47844)).mo56386p("Already closed.");
        } else {
            nativeDestroy(andSet);
        }
    }
}
