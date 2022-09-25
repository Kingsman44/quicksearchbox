package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.l */
/* compiled from: PG */
final class C146032l implements C146007ac {

    /* renamed from: a */
    public final Object f394737a = new Object();

    /* renamed from: b */
    public final C146033m f394738b;

    /* renamed from: c */
    private final Executor f394739c;

    public C146032l(Executor executor, C146033m mVar) {
        this.f394739c = executor;
        this.f394738b = mVar;
    }

    /* renamed from: c */
    public final void mo122500c(C146006ab abVar) {
        if (((C146014aj) abVar).f394703b) {
            synchronized (this.f394737a) {
                if (this.f394738b != null) {
                    this.f394739c.execute(new C146031k(this));
                }
            }
        }
    }
}
