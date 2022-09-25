package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.gf */
/* compiled from: PG */
public final /* synthetic */ class C112577gf implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C112141h f312170a;

    /* renamed from: b */
    public final /* synthetic */ double f312171b;

    public /* synthetic */ C112577gf(C112141h hVar, double d) {
        this.f312170a = hVar;
        this.f312171b = d;
    }

    public final void accept(Object obj, Object obj2) {
        C112141h hVar = this.f312170a;
        double d = this.f312171b;
        String str = (String) obj;
        int i = C112585gn.f312180a;
        double floatValue = (double) ((Float) obj2).floatValue();
        Double.isNaN(floatValue);
        hVar.mo99420b(str, (float) Math.max((double) hVar.mo99419a(str), floatValue * d));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
