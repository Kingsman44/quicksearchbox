package com.google.p4449cd.p4460h.p4461a;

import com.google.common.base.C58887cx;
import com.google.p4449cd.p4451b.C57938a;
import com.google.p4449cd.p4453d.C57957c;
import com.google.p4449cd.p4453d.C57960f;
import com.google.p4449cd.p4460h.C58040b;
import java.util.concurrent.Executor;

/* renamed from: com.google.cd.h.a.g */
/* compiled from: PG */
public final class C58020g implements Executor {

    /* renamed from: a */
    private final C58040b f155116a;

    /* renamed from: b */
    private final C57957c f155117b;

    /* renamed from: c */
    private final C57938a f155118c;

    /* renamed from: d */
    private final C57960f f155119d;

    /* renamed from: e */
    private final long f155120e;

    public C58020g(C58040b bVar, C57957c cVar, C57938a aVar, C57960f fVar, long j) {
        this.f155116a = bVar;
        this.f155117b = cVar;
        this.f155118c = aVar;
        this.f155119d = fVar;
        this.f155120e = j;
    }

    public final void execute(Runnable runnable) {
        C58019f fVar = new C58019f(runnable, this.f155119d);
        if (!this.f155119d.mo54569d(fVar)) {
            fVar.mo54562a();
            return;
        }
        try {
            this.f155116a.mo54594a(C58013ai.m88768a(runnable.getClass(), this.f155117b, this.f155118c, this.f155120e), fVar);
        } catch (Throwable th) {
            this.f155119d.mo54568c(fVar);
            C58887cx.m90980g(th);
            throw new AssertionError(th);
        }
    }
}
