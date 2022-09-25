package com.google.android.apps.search.googleapp.customtabs.p10151c;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.c.ab */
/* compiled from: PG */
public final /* synthetic */ class C133677ab implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f364121a;

    public /* synthetic */ C133677ab(C58485gu guVar) {
        this.f364121a = guVar;
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
        C59071e eVar = C133678ac.f364122a;
        return this.f364121a.contains((String) obj);
    }
}
