package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.cu */
/* compiled from: PG */
public final /* synthetic */ class C112530cu implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112548dl f312098a;

    /* renamed from: b */
    public final /* synthetic */ C48634bw f312099b;

    public /* synthetic */ C112530cu(C112548dl dlVar, C48634bw bwVar) {
        this.f312098a = dlVar;
        this.f312099b = bwVar;
    }

    public final Object get() {
        C112548dl dlVar = this.f312098a;
        C48634bw bwVar = this.f312099b;
        if (!dlVar.mo99585g()) {
            return Optional.empty();
        }
        C112547dk dkVar = (C112547dk) dlVar.f312132d.get(bwVar);
        if (dkVar == null) {
            return Optional.empty();
        }
        synchronized (dkVar) {
            if (C48634bw.m85248b(dkVar.mo99571a().f125706a) != C48634bw.SIGNAL_NOT_SET) {
                if (!dkVar.mo99581k(dlVar.f312134f.mo26870b())) {
                    Optional of = Optional.m71637of(dkVar.mo99571a());
                    return of;
                }
            }
            Optional empty = Optional.empty();
            return empty;
        }
    }
}
