package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.ba */
/* compiled from: PG */
public final /* synthetic */ class C79432ba implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79432ba f218097a = new C79432ba();

    private /* synthetic */ C79432ba() {
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
        return C79433bb.f218098b.contains(C79570b.m127648a(((Integer) obj).intValue()));
    }
}
