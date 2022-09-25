package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8240f.p8241a;

import com.google.assistant.p3860as.C49801o;
import com.google.p4479cg.C58077i;
import com.google.p4479cg.p4480a.C58068e;
import p3186j$.time.LocalDate;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.f.a.g */
/* compiled from: PG */
public final /* synthetic */ class C106681g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ LocalDate f297353a;

    public /* synthetic */ C106681g(LocalDate localDate) {
        this.f297353a = localDate;
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
        LocalDate localDate = this.f297353a;
        C58077i a = C58077i.m88832a(((C49801o) obj).f128640a);
        if (a == null) {
            a = C58077i.DAY_OF_WEEK_UNSPECIFIED;
        }
        return C58068e.m88825c(a) == localDate.getDayOfWeek();
    }
}
