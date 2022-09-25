package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a;

import com.google.assistant.p3886c.C50794cr;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.a.e */
/* compiled from: PG */
public final /* synthetic */ class C131198e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C50794cr f358810a;

    public /* synthetic */ C131198e(C50794cr crVar) {
        this.f358810a = crVar;
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
        C50794cr crVar = this.f358810a;
        C131195b bVar = (C131195b) obj;
        int i = bVar.f358802a;
        if ((i & 4) != 0 || (i & 1) == 0) {
            return false;
        }
        C50794cr a = C50794cr.m85938a(bVar.f358803b);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        if (a.equals(crVar)) {
            return true;
        }
        return false;
    }
}
