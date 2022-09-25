package com.google.android.libraries.assistant.trainingcache.bindings;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67305bi;
import com.google.speech.p5228m.C67359w;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
public class EkhoEventReader implements AutoCloseable {

    /* renamed from: a */
    private static final C59071e f54355a = C59071e.m91332i("com.google.android.libraries.assistant.trainingcache.bindings.EkhoEventReader");

    /* renamed from: b */
    private final AtomicLong f54356b = new AtomicLong(nativeCreate());

    private static native long nativeCreate();

    private static native void nativeDestroy(long j);

    private static native byte[][] nativeGetRemainingEkhoEvents(long j);

    private static native void nativeInit(long j, byte[] bArr, byte[] bArr2);

    private static native byte[][] nativeNextEkhoEvents(long j, int i);

    /* renamed from: a */
    public final List mo24632a(int i) {
        return C19438a.m37132b(nativeNextEkhoEvents(this.f54356b.get(), i), C67359w.f183087d);
    }

    /* renamed from: b */
    public final void mo24633b(C67270aa aaVar, C67305bi biVar) {
        byte[] bArr;
        long j = this.f54356b.get();
        byte[] byteArray = aaVar.toByteArray();
        if (biVar == null) {
            bArr = null;
        } else {
            bArr = biVar.toByteArray();
        }
        nativeInit(j, byteArray, bArr);
    }

    public final void close() {
        long andSet = this.f54356b.getAndSet(0);
        if (andSet == 0) {
            ((C59052c) ((C59052c) f54355a.mo56226d()).mo56372aa(47842)).mo56386p("Already closed.");
        } else {
            nativeDestroy(andSet);
        }
    }
}
