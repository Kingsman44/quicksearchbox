package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.k */
/* compiled from: PG */
final class C146031k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C146032l f394736a;

    public C146031k(C146032l lVar) {
        this.f394736a = lVar;
    }

    public final void run() {
        synchronized (this.f394736a.f394737a) {
            C146033m mVar = this.f394736a.f394738b;
            if (mVar != null) {
                mVar.mo119879a();
            }
        }
    }
}
