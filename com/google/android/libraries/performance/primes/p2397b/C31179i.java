package com.google.android.libraries.performance.primes.p2397b;

/* renamed from: com.google.android.libraries.performance.primes.b.i */
/* compiled from: PG */
final class C31179i extends ThreadLocal {

    /* renamed from: a */
    final /* synthetic */ C31180j f84049a;

    public C31179i(C31180j jVar) {
        this.f84049a = jVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        C31181k kVar = new C31181k();
        Thread currentThread = Thread.currentThread();
        synchronized (this.f84049a.f84051b) {
            this.f84049a.f84051b.put(currentThread, kVar);
        }
        return kVar;
    }
}
