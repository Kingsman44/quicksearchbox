package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.t */
/* compiled from: PG */
final class C146040t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C146006ab f394750a;

    /* renamed from: b */
    final /* synthetic */ C146041u f394751b;

    public C146040t(C146041u uVar, C146006ab abVar) {
        this.f394751b = uVar;
        this.f394750a = abVar;
    }

    public final void run() {
        synchronized (this.f394751b.f394752a) {
            C146042v vVar = this.f394751b.f394753b;
            if (vVar != null) {
                vVar.mo18632e(this.f394750a.mo122488g());
            }
        }
    }
}
