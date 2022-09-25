package com.android.p275j;

/* renamed from: com.android.j.d */
/* compiled from: PG */
final class C5192d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5206r f16482a;

    /* renamed from: b */
    final /* synthetic */ C5193e f16483b;

    public C5192d(C5193e eVar, C5206r rVar) {
        this.f16483b = eVar;
        this.f16482a = rVar;
    }

    public final void run() {
        try {
            this.f16483b.f16485a.put(this.f16482a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
