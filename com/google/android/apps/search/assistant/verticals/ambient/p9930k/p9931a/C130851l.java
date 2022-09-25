package com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a;

import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130883x;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.a.l */
/* compiled from: PG */
public final /* synthetic */ class C130851l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C130857r f358109a;

    /* renamed from: b */
    public final /* synthetic */ C130883x f358110b;

    public /* synthetic */ C130851l(C130857r rVar, C130883x xVar) {
        this.f358109a = rVar;
        this.f358110b = xVar;
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
        C130857r rVar = this.f358109a;
        C130883x xVar = this.f358110b;
        C130856q qVar = (C130856q) obj;
        ((C58970a) ((C58970a) rVar.f358127d.mo56224b()).mo56372aa(38985)).mo56373ab(qVar.mo109837a(), xVar.mo109845b());
        return qVar.mo109837a() >= xVar.mo109845b().doubleValue();
    }
}
