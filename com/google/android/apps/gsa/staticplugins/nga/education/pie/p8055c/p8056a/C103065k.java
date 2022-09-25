package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.p8056a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.a.k */
/* compiled from: PG */
public final /* synthetic */ class C103065k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80213bg f287690a;

    public /* synthetic */ C103065k(C80213bg bgVar) {
        this.f287690a = bgVar;
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
        C80213bg bgVar = this.f287690a;
        C58974d dVar = C103076v.f287703a;
        return ((C80213bg) obj).f220082d.contentEquals(bgVar.f220082d);
    }
}
