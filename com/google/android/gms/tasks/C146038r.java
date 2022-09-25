package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.r */
/* compiled from: PG */
final class C146038r implements C146007ac {

    /* renamed from: a */
    public final Object f394747a = new Object();

    /* renamed from: b */
    public final C146039s f394748b;

    /* renamed from: c */
    private final Executor f394749c;

    public C146038r(Executor executor, C146039s sVar) {
        this.f394749c = executor;
        this.f394748b = sVar;
    }

    /* renamed from: c */
    public final void mo122500c(C146006ab abVar) {
        if (!abVar.mo122491j() && !((C146014aj) abVar).f394703b) {
            synchronized (this.f394747a) {
                if (this.f394748b != null) {
                    this.f394749c.execute(new C146037q(this, abVar));
                }
            }
        }
    }
}
