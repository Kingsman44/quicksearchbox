package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113291bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.be */
/* compiled from: PG */
public final /* synthetic */ class C111867be implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111867be f310856a = new C111867be();

    private /* synthetic */ C111867be() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C121537f fVar = C111877bo.f310873a;
        return (C113291bp) ((C113408es) obj).mo100120c().get(C48670ae.SUGGESTION_GROUP_HOME_AUTOMATION);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
