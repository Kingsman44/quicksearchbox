package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48601aq;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.m */
/* compiled from: PG */
public final /* synthetic */ class C112558m implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112560o f312148a;

    public /* synthetic */ C112558m(C112560o oVar) {
        this.f312148a = oVar;
    }

    public final Object get() {
        C112560o oVar = this.f312148a;
        Optional k = oVar.f312151b.mo99540k();
        if (k.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of((C58528ij) Stream.CC.concat(Collection.EL.stream(oVar.f312152c.mo79745c(C90063do.f249591gS)), Collection.EL.stream(((C48601aq) k.get()).f125612a)).collect(C58370cn.f155947b));
    }
}
