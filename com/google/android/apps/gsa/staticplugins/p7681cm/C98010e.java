package com.google.android.apps.gsa.staticplugins.p7681cm;

import com.google.common.base.C58890d;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.e */
/* compiled from: PG */
public final /* synthetic */ class C98010e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f273673a;

    public /* synthetic */ C98010e(String str) {
        this.f273673a = str;
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
        return C58890d.m90990e(this.f273673a, ((C8506p) obj).f29514b);
    }
}
