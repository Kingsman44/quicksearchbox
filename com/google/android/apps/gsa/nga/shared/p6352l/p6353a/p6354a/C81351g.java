package com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6354a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80251f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C81351g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C81351g f222662a = new C81351g();

    private /* synthetic */ C81351g() {
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
        C80251f fVar = (C80251f) obj;
        int i = C81353i.f222667c;
        return fVar != C80251f.ASSISTANT_TRIGGER_UNKNOWN;
    }
}
