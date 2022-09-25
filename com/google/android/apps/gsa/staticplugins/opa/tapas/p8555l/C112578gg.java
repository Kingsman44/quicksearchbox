package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.gg */
/* compiled from: PG */
public final /* synthetic */ class C112578gg implements Function {

    /* renamed from: a */
    public final /* synthetic */ C112141h f312172a;

    public /* synthetic */ C112578gg(C112141h hVar) {
        this.f312172a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        double floatValue = (double) (((Float) entry.getValue()).floatValue() * this.f312172a.mo99419a((String) entry.getKey()));
        Double.isNaN(floatValue);
        return Double.valueOf(1.0d - floatValue);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
