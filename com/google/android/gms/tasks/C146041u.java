package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.u */
/* compiled from: PG */
final class C146041u implements C146007ac {

    /* renamed from: a */
    public final Object f394752a = new Object();

    /* renamed from: b */
    public final C146042v f394753b;

    /* renamed from: c */
    private final Executor f394754c;

    public C146041u(Executor executor, C146042v vVar) {
        this.f394754c = executor;
        this.f394753b = vVar;
    }

    /* renamed from: c */
    public final void mo122500c(C146006ab abVar) {
        if (abVar.mo122491j()) {
            synchronized (this.f394752a) {
                if (this.f394753b != null) {
                    this.f394754c.execute(new C146040t(this, abVar));
                }
            }
        }
    }
}
