package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.p4129b.p4136c.C54756d;
import com.google.p4129b.p4136c.C54757e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.au */
/* compiled from: PG */
public final /* synthetic */ class C111352au implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111366bh f309852a;

    public /* synthetic */ C111352au(C111366bh bhVar) {
        this.f309852a = bhVar;
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
        C111366bh bhVar = this.f309852a;
        int a = C54756d.m87526a(((C54757e) obj).f143673a);
        if (a == 0) {
            a = 1;
        }
        return a == bhVar.mo99117g();
    }
}
