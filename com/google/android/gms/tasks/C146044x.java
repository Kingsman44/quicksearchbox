package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.x */
/* compiled from: PG */
final class C146044x implements C146007ac, C146042v, C146039s, C146033m {

    /* renamed from: a */
    public final C146005aa f394757a;

    /* renamed from: b */
    public final C146014aj f394758b;

    /* renamed from: c */
    private final Executor f394759c;

    public C146044x(Executor executor, C146005aa aaVar, C146014aj ajVar) {
        this.f394759c = executor;
        this.f394757a = aaVar;
        this.f394758b = ajVar;
    }

    /* renamed from: a */
    public final void mo119879a() {
        this.f394758b.mo122511y();
    }

    /* renamed from: c */
    public final void mo122500c(C146006ab abVar) {
        this.f394759c.execute(new C146043w(this, abVar));
    }

    /* renamed from: d */
    public final void mo18633d(Exception exc) {
        this.f394758b.mo122507u(exc);
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        this.f394758b.mo122508v(obj);
    }
}
