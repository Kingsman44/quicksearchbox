package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.am */
/* compiled from: PG */
final class C72453am implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C72517cw f192801a;

    /* renamed from: b */
    final /* synthetic */ int f192802b;

    /* renamed from: c */
    final /* synthetic */ long f192803c;

    /* renamed from: d */
    final /* synthetic */ int f192804d;

    public C72453am(C72517cw cwVar, int i, long j, int i2) {
        this.f192801a = cwVar;
        this.f192802b = i;
        this.f192803c = j;
        this.f192804d = i2;
    }

    public final void run() {
        C72517cw cwVar = this.f192801a;
        cwVar.f192963a.onRttObservation(this.f192802b, this.f192803c, this.f192804d);
    }
}
