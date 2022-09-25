package com.google.android.gms.clearcut;

/* renamed from: com.google.android.gms.clearcut.n */
/* compiled from: PG */
public final /* synthetic */ class C143661n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143673z f389491a;

    public /* synthetic */ C143661n(C143673z zVar) {
        this.f389491a = zVar;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        C143673z zVar = this.f389491a;
        zVar.f389509g.writeLock().lock();
        try {
            zVar.f389512j = null;
            zVar.f389509g.writeLock().unlock();
            zVar.mo119021e().mo119022f();
        } catch (Throwable th) {
            zVar.f389509g.writeLock().unlock();
            throw th;
        }
    }
}
