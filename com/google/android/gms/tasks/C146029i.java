package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.i */
/* compiled from: PG */
final class C146029i implements C146007ac, C146042v, C146039s, C146033m {

    /* renamed from: a */
    public final C146025e f394733a;

    /* renamed from: b */
    public final C146014aj f394734b;

    /* renamed from: c */
    private final Executor f394735c;

    public C146029i(Executor executor, C146025e eVar, C146014aj ajVar) {
        this.f394735c = executor;
        this.f394733a = eVar;
        this.f394734b = ajVar;
    }

    /* renamed from: a */
    public final void mo119879a() {
        this.f394734b.mo122511y();
    }

    /* renamed from: c */
    public final void mo122500c(C146006ab abVar) {
        this.f394735c.execute(new C146028h(this, abVar));
    }

    /* renamed from: d */
    public final void mo18633d(Exception exc) {
        this.f394734b.mo122507u(exc);
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        this.f394734b.mo122508v(obj);
    }
}
