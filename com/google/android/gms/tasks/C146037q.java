package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.tasks.q */
/* compiled from: PG */
final class C146037q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C146006ab f394745a;

    /* renamed from: b */
    final /* synthetic */ C146038r f394746b;

    public C146037q(C146038r rVar, C146006ab abVar) {
        this.f394746b = rVar;
        this.f394745a = abVar;
    }

    public final void run() {
        synchronized (this.f394746b.f394747a) {
            C146039s sVar = this.f394746b.f394748b;
            if (sVar != null) {
                Exception f = this.f394745a.mo122487f();
                C143919bh.m233958a(f);
                sVar.mo18633d(f);
            }
        }
    }
}
