package com.google.android.apps.search.assistant.verticals.p9880a.p9888e.p9889a;

import com.google.common.p4522b.C58495hd;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.e.a.q */
/* compiled from: PG */
public final /* synthetic */ class C130375q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f357296a;

    public /* synthetic */ C130375q(C58495hd hdVar) {
        this.f357296a = hdVar;
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
        return this.f357296a.containsKey((String) obj);
    }
}
