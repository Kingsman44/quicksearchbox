package com.google.android.libraries.performance.primes.metrics.p2416j;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.x */
/* compiled from: PG */
public final /* synthetic */ class C31556x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31531ab f84968a;

    public /* synthetic */ C31556x(C31531ab abVar) {
        this.f84968a = abVar;
    }

    public final void run() {
        C31531ab abVar = this.f84968a;
        try {
            abVar.f84915f.set(abVar.f84913d.mo36966a(((C31550r) abVar.f84912c.mo27525b()).mo36980b() ? ((C31550r) abVar.f84912c.mo27525b()).mo37231c() : 0.0f));
        } catch (Throwable unused) {
            abVar.f84915f.set(abVar.f84913d.mo36966a(0.0f));
        }
    }
}
