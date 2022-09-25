package com.google.android.apps.gsa.sidekick.shared.cards;

import com.google.p375ai.p378b.C7664fj;
import com.google.p375ai.p378b.C7681g;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.al */
/* compiled from: PG */
public final /* synthetic */ class C91683al implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C7681g f255680a;

    public /* synthetic */ C91683al(C7681g gVar) {
        this.f255680a = gVar;
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
        C7681g gVar = this.f255680a;
        C7681g a = C7681g.m22802a(((C7664fj) obj).f26609g);
        if (a == null) {
            a = C7681g.INVALID;
        }
        return a.equals(gVar);
    }
}
