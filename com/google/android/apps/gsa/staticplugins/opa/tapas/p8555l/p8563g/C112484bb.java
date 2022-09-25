package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.bb */
/* compiled from: PG */
public final /* synthetic */ class C112484bb implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112519cj f312010a;

    /* renamed from: b */
    public final /* synthetic */ C48634bw f312011b;

    public /* synthetic */ C112484bb(C112519cj cjVar, C48634bw bwVar) {
        this.f312010a = cjVar;
        this.f312011b = bwVar;
    }

    public final Object get() {
        C112519cj cjVar = this.f312010a;
        C48634bw bwVar = this.f312011b;
        if (!cjVar.mo99565h()) {
            cjVar.f312077j.mo28207g("Account Swap getSignal", new C112476au(cjVar));
            return Optional.empty();
        }
        C112518ci ciVar = (C112518ci) C112519cj.f312068a.mo105237f("signalFetchDataMap_get", cjVar.f312073f, new C112477av(cjVar, bwVar));
        if (ciVar == null || ciVar.mo99562d(cjVar.f312076i.mo26870b())) {
            return Optional.empty();
        }
        if (C48634bw.m85248b(ciVar.f312063c.f125706a) == C48634bw.SIGNAL_NOT_SET) {
            return Optional.empty();
        }
        return Optional.m71637of(ciVar.f312063c);
    }
}
