package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80251f;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.h */
/* compiled from: PG */
public final /* synthetic */ class C75841h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f210459a;

    public /* synthetic */ C75841h(Set set) {
        this.f210459a = set;
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
        return this.f210459a.contains((C80251f) obj);
    }
}
