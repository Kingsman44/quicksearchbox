package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.p */
/* compiled from: PG */
public final /* synthetic */ class C112708p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C112665ac f312449a;

    public /* synthetic */ C112708p(C112665ac acVar) {
        this.f312449a = acVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f312449a.f312280h.mo28209i((C60870cx) ((C58881cr) obj).mo6453a(), "[Tapas] extract client event id from model extension", C112707o.f312448a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
