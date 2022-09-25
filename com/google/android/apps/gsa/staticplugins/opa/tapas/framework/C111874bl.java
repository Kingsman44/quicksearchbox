package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4535g.C59203do;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bl */
/* compiled from: PG */
public final /* synthetic */ class C111874bl implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111874bl f310870a = new C111874bl();

    private /* synthetic */ C111874bl() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C113415ez ezVar = (C113415ez) obj;
        C121537f fVar = C111877bo.f310873a;
        C113414ey h = ezVar.mo100208h();
        h.mo100163h(Math.max(C59203do.f157270a, Math.min(1.0d, ezVar.mo100202b())));
        return h.mo100156a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
