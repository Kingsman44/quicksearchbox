package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8510h;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.h.b */
/* compiled from: PG */
public final /* synthetic */ class C111525b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f310203a;

    public /* synthetic */ C111525b(String str) {
        this.f310203a = str;
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
        String str = this.f310203a;
        int i = C111527d.f310205g;
        return ((C113415ez) obj).mo100199L().equals(str);
    }
}
