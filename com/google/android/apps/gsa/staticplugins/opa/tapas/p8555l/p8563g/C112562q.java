package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.libraries.appactions.p11035a.C147827ac;
import com.google.android.libraries.appactions.p11035a.C147828ad;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48645f;
import com.google.protobuf.C62971cq;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.q */
/* compiled from: PG */
public final class C112562q {

    /* renamed from: a */
    private C147828ad f312155a = new C147827ac().mo124500a();

    /* renamed from: b */
    private boolean f312156b = false;

    /* renamed from: d */
    private final void m186383d(C48645f fVar) {
        C62971cq cqVar = fVar.f125728a;
        C147827ac acVar = new C147827ac();
        Collection.EL.stream(cqVar).forEach(new C112561p(acVar));
        this.f312155a = acVar.mo124500a();
    }

    /* renamed from: a */
    public final synchronized C147828ad mo99587a() {
        return this.f312155a;
    }

    /* renamed from: b */
    public final synchronized void mo99588b(C48645f fVar) {
        this.f312156b = true;
        m186383d(fVar);
    }

    /* renamed from: c */
    public final synchronized void mo99589c(C48645f fVar) {
        if (!this.f312156b) {
            m186383d(fVar);
        }
    }
}
