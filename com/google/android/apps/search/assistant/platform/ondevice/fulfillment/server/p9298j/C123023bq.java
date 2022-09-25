package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.common.p4580v.C60950i;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.bq */
/* compiled from: PG */
final class C123023bq {

    /* renamed from: a */
    public final Duration f340570a;

    /* renamed from: b */
    private final C60950i f340571b;

    /* renamed from: c */
    private Instant f340572c;

    public C123023bq(C60950i iVar, Duration duration) {
        this.f340571b = iVar;
        this.f340570a = duration;
        this.f340572c = iVar.mo57444a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized Duration mo105829a() {
        return this.f340570a.minus(Duration.between(this.f340572c, this.f340571b.mo57444a()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo105830b() {
        this.f340572c = this.f340571b.mo57444a();
    }
}
