package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a;

import com.google.assistant.p3886c.C50794cr;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.a.l */
/* compiled from: PG */
public final /* synthetic */ class C131205l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131195b f358819a;

    public /* synthetic */ C131205l(C131195b bVar) {
        this.f358819a = bVar;
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
        C131195b bVar = this.f358819a;
        C131195b bVar2 = (C131195b) obj;
        if ((bVar.f358802a & 4) == 0) {
            C50794cr a = C50794cr.m85938a(bVar2.f358803b);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            C50794cr a2 = C50794cr.m85938a(bVar.f358803b);
            if (a2 == null) {
                a2 = C50794cr.UNDEFINED;
            }
            if (!a.equals(a2)) {
                return true;
            }
            return false;
        } else if (bVar2.f358805d != bVar.f358805d) {
            return true;
        } else {
            return false;
        }
    }
}
