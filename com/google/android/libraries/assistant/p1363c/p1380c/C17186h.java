package com.google.android.libraries.assistant.p1363c.p1380c;

import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.c.c.h */
/* compiled from: PG */
public final /* synthetic */ class C17186h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17189k f49916a;

    /* renamed from: b */
    public final /* synthetic */ Duration f49917b;

    public /* synthetic */ C17186h(C17189k kVar, Duration duration) {
        this.f49916a = kVar;
        this.f49917b = duration;
    }

    public final void run() {
        C17189k kVar = this.f49916a;
        Duration duration = this.f49917b;
        C17190l lVar = kVar.f49922a;
        duration.toMillis();
        if (lVar.f49932j == 1) {
            lVar.f49924b.mo23212b(C17191m.PRIMARY, duration);
            lVar.f49932j = 2;
        }
    }
}
