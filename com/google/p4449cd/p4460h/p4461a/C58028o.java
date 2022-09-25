package com.google.p4449cd.p4460h.p4461a;

import com.google.common.base.C58887cx;
import com.google.p4449cd.p4453d.C57956b;
import com.google.p4449cd.p4453d.C57958d;
import com.google.p4449cd.p4453d.C57960f;
import com.google.p4449cd.p4454e.C57969i;
import com.google.p4449cd.p4460h.C58040b;
import java.util.concurrent.Executor;

/* renamed from: com.google.cd.h.a.o */
/* compiled from: PG */
public final class C58028o implements Executor {

    /* renamed from: a */
    private final C58040b f155135a;

    /* renamed from: b */
    private final C57960f f155136b;

    /* renamed from: c */
    private final C57969i f155137c;

    public C58028o(C58040b bVar, C57960f fVar, C57969i iVar) {
        this.f155135a = bVar;
        this.f155136b = fVar;
        this.f155137c = iVar;
    }

    public final void execute(Runnable runnable) {
        C57958d a = C57956b.m88623a();
        a.getClass();
        C57960f fVar = this.f155136b;
        C58030q qVar = new C58030q(a, runnable, fVar);
        if (fVar.mo54569d(qVar)) {
            try {
                this.f155137c.mo54575e(a);
                this.f155135a.mo54594a(a, qVar);
            } catch (Throwable th) {
                this.f155136b.mo54568c(qVar);
                C58887cx.m90980g(th);
                throw new RuntimeException(th);
            }
        }
    }
}
