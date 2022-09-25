package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131080c;
import com.google.assistant.p3886c.p3887a.C50682r;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C130989ac implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C50682r f358380a;

    public /* synthetic */ C130989ac(C50682r rVar) {
        this.f358380a = rVar;
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
        C50682r rVar = this.f358380a;
        C131080c cVar = (C131080c) obj;
        return !cVar.mo110042b().isBefore(Instant.ofEpochMilli(rVar.f131857c)) && !cVar.mo110043c().isAfter(Instant.ofEpochMilli(rVar.f131858d));
    }
}
