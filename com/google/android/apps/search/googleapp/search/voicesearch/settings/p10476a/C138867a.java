package com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a;

import com.google.common.p4522b.C58495hd;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.a.a */
/* compiled from: PG */
public final /* synthetic */ class C138867a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f377739a;

    public /* synthetic */ C138867a(C58495hd hdVar) {
        this.f377739a = hdVar;
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
        return this.f377739a.containsKey((String) obj);
    }
}
