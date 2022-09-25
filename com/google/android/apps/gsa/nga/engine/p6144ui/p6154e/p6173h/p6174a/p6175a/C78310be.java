package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80580n;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.be */
/* compiled from: PG */
public final /* synthetic */ class C78310be implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C78310be f215612a = new C78310be();

    private /* synthetic */ C78310be() {
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
        C80580n a = C80580n.m128209a(((C80581o) obj).f221197g);
        if (a == null) {
            a = C80580n.UNRECOGNIZED;
        }
        return a.equals(C80580n.AFTER_EXECUTION);
    }
}
