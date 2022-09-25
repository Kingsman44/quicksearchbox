package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8190a.p8191a;

import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C106188a implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C106203p f296352a;

    public /* synthetic */ C106188a(C106203p pVar) {
        this.f296352a = pVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C106203p pVar = this.f296352a;
        Integer num = (Integer) obj2;
        long intValue = (long) ((Integer) obj).intValue();
        boolean z = false;
        if (intValue < pVar.f296378b.mo79743a(C90037cp.f248587de) && ((long) num.intValue()) < pVar.f296378b.mo79743a(C90037cp.f248586dd) && pVar.f296378b.mo79746e(C90053de.f248946M)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
