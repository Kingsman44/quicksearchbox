package com.google.android.libraries.lens.view.p2070an;

import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.an.ap */
/* compiled from: PG */
public final /* synthetic */ class C25378ap implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C24201ad f69104a;

    public /* synthetic */ C25378ap(C24201ad adVar) {
        this.f69104a = adVar;
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
        C24201ad adVar = this.f69104a;
        C58974d dVar = C25383au.f69112a;
        return ((C25436h) obj).mo30411b(adVar);
    }
}
