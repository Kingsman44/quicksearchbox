package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80484i;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.cv */
/* compiled from: PG */
public final /* synthetic */ class C79799cv implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79799cv f218781a = new C79799cv();

    private /* synthetic */ C79799cv() {
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
        C58528ij ijVar = C79802cy.f218791a;
        C80478c a = C80478c.m128173a(((C80484i) obj).f220944f);
        if (a == null) {
            a = C80478c.UNRECOGNIZED;
        }
        return ijVar.contains(a);
    }
}
