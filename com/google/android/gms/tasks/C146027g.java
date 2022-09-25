package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.g */
/* compiled from: PG */
final class C146027g implements C146007ac {

    /* renamed from: a */
    public final C146025e f394728a;

    /* renamed from: b */
    public final C146014aj f394729b;

    /* renamed from: c */
    private final Executor f394730c;

    public C146027g(Executor executor, C146025e eVar, C146014aj ajVar) {
        this.f394730c = executor;
        this.f394728a = eVar;
        this.f394729b = ajVar;
    }

    /* renamed from: c */
    public final void mo122500c(C146006ab abVar) {
        this.f394730c.execute(new C146026f(this, abVar));
    }
}
