package com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a;

import p3186j$.util.function.Predicate;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.h.a.a.c */
/* compiled from: PG */
public final class C17593c implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ Predicate f50699a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f50700b;

    public C17593c(Predicate predicate, C70862aj ajVar) {
        this.f50699a = predicate;
        this.f50700b = ajVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f50700b.mo20121a();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        this.f50700b.mo20122b(th);
    }

    /* renamed from: c */
    public final void mo20123c(Object obj) {
        try {
            if (this.f50699a.test(obj)) {
                this.f50700b.mo20123c(obj);
            }
        } catch (Throwable th) {
            this.f50700b.mo20122b(th);
        }
    }
}
