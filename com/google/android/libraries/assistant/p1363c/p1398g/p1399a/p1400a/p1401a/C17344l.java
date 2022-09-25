package com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a;

import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.c.g.a.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C17344l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17355w f50188a;

    /* renamed from: b */
    public final /* synthetic */ C63088z f50189b;

    public /* synthetic */ C17344l(C17355w wVar, C63088z zVar) {
        this.f50188a = wVar;
        this.f50189b = zVar;
    }

    public final void run() {
        C17355w wVar = this.f50188a;
        C63088z zVar = this.f50189b;
        if (!wVar.f50204d) {
            wVar.f50201a.mo23280l(zVar);
            return;
        }
        throw new IllegalStateException("onAudioChunk called after player was released.");
    }
}
