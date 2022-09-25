package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bd */
/* compiled from: PG */
public final /* synthetic */ class C111866bd implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111866bd f310855a = new C111866bd();

    private /* synthetic */ C111866bd() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C113408es esVar = (C113408es) obj;
        C121537f fVar = C111877bo.f310873a;
        C113407er b = esVar.mo100119b();
        b.mo100096f(C113339cj.m187495c(C113339cj.m187496d((C58485gu) Collection.EL.stream(esVar.mo100053o()).map(C111874bl.f310870a).collect(C58370cn.f155946a))));
        return b.mo100091a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
