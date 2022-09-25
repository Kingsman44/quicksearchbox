package com.google.android.libraries.assistant.p1363c.p1380c;

import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.c.c.e */
/* compiled from: PG */
public final /* synthetic */ class C17183e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17185g f49911a;

    /* renamed from: b */
    public final /* synthetic */ Duration f49912b;

    public /* synthetic */ C17183e(C17185g gVar, Duration duration) {
        this.f49911a = gVar;
        this.f49912b = duration;
    }

    public final void run() {
        C17185g gVar = this.f49911a;
        Duration duration = this.f49912b;
        C17190l lVar = gVar.f49915a;
        duration.toMillis();
        if (lVar.f49932j == 1) {
            lVar.f49924b.mo23212b(C17191m.FALLBACK, duration);
            lVar.f49932j = 2;
        }
    }
}
