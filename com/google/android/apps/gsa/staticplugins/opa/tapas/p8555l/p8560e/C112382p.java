package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48668ac;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.research.p5181a.p5187e.C66366p;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.p */
/* compiled from: PG */
public final /* synthetic */ class C112382p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C112382p f311817a = new C112382p();

    private /* synthetic */ C112382p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C121537f fVar = C112312ag.f311669a;
        String str = (String) C58557jl.m90133n(((C66366p) obj).f180457c);
        try {
            return C48668ac.m85255a(str);
        } catch (IllegalArgumentException e) {
            C59104x c = C112312ag.f311670b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ReflectionOnline");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(27664)).mo56389s("Unexpected predictor: '%s'", str);
            return C48668ac.UNSPECIFIED_REFLECTION_PREDICTOR;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
