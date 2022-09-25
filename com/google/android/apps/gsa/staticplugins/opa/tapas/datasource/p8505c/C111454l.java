package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8505c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113251ad;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.c.l */
/* compiled from: PG */
public final /* synthetic */ class C111454l implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111442as f310068a;

    public /* synthetic */ C111454l(C111442as asVar) {
        this.f310068a = asVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111442as asVar = this.f310068a;
        C121537f fVar = C111442as.f310031a;
        C60870cx d = ((C113251ad) asVar.f310035d.mo27525b()).mo99927d((String) obj);
        fVar.mo105244m("getAppLabelFuture", d);
        return d;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
