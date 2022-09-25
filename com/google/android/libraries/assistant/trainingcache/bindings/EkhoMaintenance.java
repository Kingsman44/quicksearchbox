package com.google.android.libraries.assistant.trainingcache.bindings;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67349m;
import com.google.speech.p5228m.C67351o;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
public class EkhoMaintenance implements AutoCloseable {

    /* renamed from: a */
    private static final C59071e f54357a = C59071e.m91332i("com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaintenance");

    /* renamed from: b */
    private final AtomicLong f54358b = new AtomicLong(nativeCreate());

    private static native byte[] nativeCleanUp(long j);

    private static native void nativeClear(long j);

    private static native long nativeCreate();

    private static native void nativeDestroy(long j);

    private static native byte[] nativeGetCacheMetrics(long j);

    private static native byte[] nativeGetLastCleanupCycleSummary(long j);

    private static native void nativeInit(long j, byte[] bArr);

    /* renamed from: a */
    public final C67349m mo24635a() {
        return (C67349m) C19438a.m37131a(nativeGetCacheMetrics(this.f54358b.get()), C67349m.f183060c);
    }

    /* renamed from: b */
    public final C67351o mo24636b() {
        return (C67351o) C19438a.m37131a(nativeCleanUp(this.f54358b.get()), C67351o.f183066g);
    }

    /* renamed from: c */
    public final void mo24637c(C67270aa aaVar) {
        nativeInit(this.f54358b.get(), aaVar.toByteArray());
    }

    public final void close() {
        long andSet = this.f54358b.getAndSet(0);
        if (andSet == 0) {
            ((C59052c) ((C59052c) f54357a.mo56226d()).mo56372aa(47843)).mo56386p("Already closed.");
        } else {
            nativeDestroy(andSet);
        }
    }
}
