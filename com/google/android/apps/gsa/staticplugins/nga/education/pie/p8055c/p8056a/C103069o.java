package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.p8056a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.C103097o;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.a.o */
/* compiled from: PG */
public final /* synthetic */ class C103069o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80248co f287694a;

    public /* synthetic */ C103069o(C80248co coVar) {
        this.f287694a = coVar;
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
        C80248co coVar = this.f287694a;
        C58974d dVar = C103076v.f287703a;
        return ((C103097o) obj).mo93607b() == coVar;
    }
}
