package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.o */
/* compiled from: PG */
final class C146035o implements C146007ac {

    /* renamed from: a */
    public final Object f394742a = new Object();

    /* renamed from: b */
    public final C146036p f394743b;

    /* renamed from: c */
    private final Executor f394744c;

    public C146035o(Executor executor, C146036p pVar) {
        this.f394744c = executor;
        this.f394743b = pVar;
    }

    /* renamed from: c */
    public final void mo122500c(C146006ab abVar) {
        synchronized (this.f394742a) {
            if (this.f394743b != null) {
                this.f394744c.execute(new C146034n(this, abVar));
            }
        }
    }
}
