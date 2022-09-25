package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8510h;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.h.a */
/* compiled from: PG */
public final /* synthetic */ class C111524a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f310201a;

    /* renamed from: b */
    public final /* synthetic */ double f310202b;

    public /* synthetic */ C111524a(String str, double d) {
        this.f310201a = str;
        this.f310202b = d;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        String str = this.f310201a;
        double d = this.f310202b;
        C113415ez ezVar = (C113415ez) obj;
        int i = C111527d.f310205g;
        return ezVar.mo100199L().equals(str) && ezVar.mo100202b() < d;
    }
}
