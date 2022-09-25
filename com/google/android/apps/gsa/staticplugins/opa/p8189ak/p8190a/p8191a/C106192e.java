package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8190a.p8191a;

import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C106192e implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C106203p f296359a;

    public /* synthetic */ C106192e(C106203p pVar) {
        this.f296359a = pVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C106203p pVar = this.f296359a;
        Integer num = (Integer) obj2;
        long intValue = (long) ((Integer) obj).intValue();
        boolean z = false;
        if (intValue < pVar.f296378b.mo79743a(C90037cp.f248580dB) && ((long) num.intValue()) < pVar.f296378b.mo79743a(C90037cp.f248581dC)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
