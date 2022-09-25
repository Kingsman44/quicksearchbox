package com.google.android.libraries.assistant.p1363c.p1380c;

import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.c.c.j */
/* compiled from: PG */
public final /* synthetic */ class C17188j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17189k f49920a;

    /* renamed from: b */
    public final /* synthetic */ Duration f49921b;

    public /* synthetic */ C17188j(C17189k kVar, Duration duration) {
        this.f49920a = kVar;
        this.f49921b = duration;
    }

    public final void run() {
        C17189k kVar = this.f49920a;
        Duration duration = this.f49921b;
        C17190l lVar = kVar.f49922a;
        duration.toMillis();
        if (lVar.f49932j != 3) {
            lVar.f49924b.mo23213c(C17191m.PRIMARY, duration);
            lVar.f49932j = 3;
        }
    }
}
