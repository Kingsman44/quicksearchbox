package com.google.android.libraries.assistant.p1363c.p1380c;

import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.c.c.b */
/* compiled from: PG */
public final /* synthetic */ class C17180b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17181c f49906a;

    /* renamed from: b */
    public final /* synthetic */ Duration f49907b;

    public /* synthetic */ C17180b(C17181c cVar, Duration duration) {
        this.f49906a = cVar;
        this.f49907b = duration;
    }

    public final void run() {
        C17181c cVar = this.f49906a;
        Duration duration = this.f49907b;
        C17190l lVar = cVar.f49908a;
        duration.toMillis();
        int i = lVar.f49932j;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                lVar.f49924b.mo23211a(C17191m.AUDIO_SESSION, duration);
            } else if (i2 == 1) {
                if (lVar.f49931i != null) {
                    lVar.f49924b.mo23213c(C17191m.AUDIO_SESSION, lVar.f49931i);
                } else {
                    lVar.f49924b.mo23213c(C17191m.AUDIO_SESSION, duration);
                }
            }
            lVar.f49932j = 3;
            return;
        }
        throw null;
    }
}
