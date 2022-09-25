package com.google.android.libraries.lens.view.p2056af;

import com.google.common.p4552o.p4563i.C59898bg;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.af.e */
/* compiled from: PG */
public final /* synthetic */ class C25075e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ long f68327a;

    /* renamed from: b */
    public final /* synthetic */ long f68328b;

    /* renamed from: c */
    public final /* synthetic */ C59898bg f68329c;

    public /* synthetic */ C25075e(long j, long j2, C59898bg bgVar) {
        this.f68327a = j;
        this.f68328b = j2;
        this.f68329c = bgVar;
    }

    public final void accept(Object obj) {
        long j = this.f68327a;
        long j2 = this.f68328b;
        ((C25083m) obj).mo30245d(Long.valueOf(j), Long.valueOf(j2), this.f68329c);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
