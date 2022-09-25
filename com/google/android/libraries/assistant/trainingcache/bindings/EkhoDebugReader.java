package com.google.android.libraries.assistant.trainingcache.bindings;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.MessageLite;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67359w;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
public final class EkhoDebugReader implements AutoCloseable {

    /* renamed from: a */
    private static final C59071e f54353a = C59071e.m91332i("com.google.android.libraries.assistant.trainingcache.bindings.EkhoDebugReader");

    /* renamed from: b */
    private final AtomicLong f54354b = new AtomicLong(nativeCreate());

    private static native long nativeCreate();

    private static native void nativeDestroy(long j);

    private static native byte[][] nativeGetAllEkhoEvents(long j);

    private static native byte[][] nativeGetAllEventsFromTable(long j, String str);

    private static native byte[][] nativeGetAllSessions(long j);

    private static native void nativeInit(long j, byte[] bArr);

    /* renamed from: a */
    public final List mo24628a() {
        return C19438a.m37132b(nativeGetAllEkhoEvents(this.f54354b.get()), C67359w.f183087d);
    }

    /* renamed from: b */
    public final List mo24629b(String str, MessageLite messageLite) {
        return C19438a.m37132b(nativeGetAllEventsFromTable(this.f54354b.get(), str), messageLite);
    }

    /* renamed from: c */
    public final void mo24630c(C67270aa aaVar) {
        nativeInit(this.f54354b.get(), aaVar.toByteArray());
    }

    public final void close() {
        long andSet = this.f54354b.getAndSet(0);
        if (andSet == 0) {
            ((C59052c) ((C59052c) f54353a.mo56226d()).mo56372aa(47841)).mo56386p("Already closed.");
        } else {
            nativeDestroy(andSet);
        }
    }
}
