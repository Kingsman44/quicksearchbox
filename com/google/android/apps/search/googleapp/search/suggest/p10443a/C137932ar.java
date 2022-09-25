package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.ar */
/* compiled from: PG */
public final /* synthetic */ class C137932ar implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C137932ar f375272a = new C137932ar();

    private /* synthetic */ C137932ar() {
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
        C138034az a = C138034az.m224336a(((C138030av) obj).f375545i);
        if (a == null) {
            a = C138034az.NONE;
        }
        return a == C138034az.COMPLETE_SERVER;
    }
}
