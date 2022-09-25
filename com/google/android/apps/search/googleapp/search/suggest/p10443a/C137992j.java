package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.sources.C138366a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.j */
/* compiled from: PG */
public final /* synthetic */ class C137992j implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C138133o f375418a;

    public /* synthetic */ C137992j(C138133o oVar) {
        this.f375418a = oVar;
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
        C138133o oVar = this.f375418a;
        C58974d dVar = C138001s.f375429a;
        return ((C138366a) obj).mo114253f(oVar);
    }
}
