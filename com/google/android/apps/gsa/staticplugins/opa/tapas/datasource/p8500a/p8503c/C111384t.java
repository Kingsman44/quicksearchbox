package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.common.p4526f.C59071e;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54773u;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.t */
/* compiled from: PG */
public final /* synthetic */ class C111384t implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f309910a;

    public /* synthetic */ C111384t(String str) {
        this.f309910a = str;
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
        String str = this.f309910a;
        C59071e eVar = C111346ao.f309833a;
        C54773u uVar = ((C54759g) obj).f143681a;
        if (uVar == null) {
            uVar = C54773u.f143704c;
        }
        return str.equals(uVar.f143706a);
    }
}
