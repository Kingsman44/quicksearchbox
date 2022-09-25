package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.n */
/* compiled from: PG */
final class C146034n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C146006ab f394740a;

    /* renamed from: b */
    final /* synthetic */ C146035o f394741b;

    public C146034n(C146035o oVar, C146006ab abVar) {
        this.f394741b = oVar;
        this.f394740a = abVar;
    }

    public final void run() {
        synchronized (this.f394741b.f394742a) {
            C146036p pVar = this.f394741b.f394743b;
            if (pVar != null) {
                pVar.mo22590a(this.f394740a);
            }
        }
    }
}
