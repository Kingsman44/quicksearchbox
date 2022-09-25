package com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a;

/* renamed from: com.google.android.libraries.assistant.c.g.a.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C17343k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17355w f50187a;

    public /* synthetic */ C17343k(C17355w wVar) {
        this.f50187a = wVar;
    }

    public final void run() {
        C17355w wVar = this.f50187a;
        if (!wVar.f50204d) {
            wVar.f50201a.mo23279k();
            return;
        }
        throw new IllegalStateException("onAudioEnd called after player was released.");
    }
}
