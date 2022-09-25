package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.ad */
/* compiled from: PG */
public final /* synthetic */ class C111166ad implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111166ad f309449a = new C111166ad();

    private /* synthetic */ C111166ad() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            return Optional.m71637of(Long.valueOf(C111175am.f309459d.mo63595a((String) obj)));
        } catch (IllegalArgumentException e) {
            C59104x c = C111175am.f309456a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeskclockSignal");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(27123)).mo56386p("Could not parse time");
            return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
