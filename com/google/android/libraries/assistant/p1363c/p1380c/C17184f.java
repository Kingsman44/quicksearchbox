package com.google.android.libraries.assistant.p1363c.p1380c;

import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.c.c.f */
/* compiled from: PG */
public final /* synthetic */ class C17184f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17185g f49913a;

    /* renamed from: b */
    public final /* synthetic */ Duration f49914b;

    public /* synthetic */ C17184f(C17185g gVar, Duration duration) {
        this.f49913a = gVar;
        this.f49914b = duration;
    }

    public final void run() {
        C17185g gVar = this.f49913a;
        Duration duration = this.f49914b;
        C17190l lVar = gVar.f49915a;
        duration.toMillis();
        int i = lVar.f49932j;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new AssertionError("Impossible State: ".concat(i != 1 ? i != 2 ? "DONE" : "USER_SPEAKING" : "INITIAL"));
                }
            } else if (duration.minus(lVar.f49930h).compareTo(lVar.f49925c) > 0 && lVar.f49931i != null) {
                lVar.f49924b.mo23213c(C17191m.FALLBACK, lVar.f49931i);
                lVar.f49932j = 3;
            }
        } else if (duration.compareTo(lVar.f49926d) > 0) {
            lVar.f49924b.mo23211a(C17191m.FALLBACK, duration);
            lVar.f49932j = 3;
        }
    }
}
