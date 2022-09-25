package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.assistant.p3860as.C49801o;
import com.google.p4479cg.C58077i;
import com.google.p4479cg.p4480a.C58068e;
import p3186j$.time.LocalDate;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.aw */
/* compiled from: PG */
public final /* synthetic */ class C130759aw implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ LocalDate f357967a;

    public /* synthetic */ C130759aw(LocalDate localDate) {
        this.f357967a = localDate;
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
        LocalDate localDate = this.f357967a;
        int i = C130771bh.f357984a;
        C58077i a = C58077i.m88832a(((C49801o) obj).f128640a);
        if (a == null) {
            a = C58077i.DAY_OF_WEEK_UNSPECIFIED;
        }
        return C58068e.m88825c(a) == localDate.getDayOfWeek();
    }
}
