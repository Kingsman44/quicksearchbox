package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.android.libraries.search.p3055n.C39276az;
import com.google.android.libraries.search.p3055n.p3085h.C39771d;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.n.b.b.n */
/* compiled from: PG */
public final /* synthetic */ class C39339n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C39276az f103610a;

    public /* synthetic */ C39339n(C39276az azVar) {
        this.f103610a = azVar;
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
        C39276az azVar = this.f103610a;
        C59071e eVar = C39280aa.f103467a;
        return C58890d.m90990e((String) azVar.f103458a.get(0), ((C39771d) obj).f104609b);
    }
}
