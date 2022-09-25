package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.p5918a.C74880z;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.dd */
/* compiled from: PG */
public final /* synthetic */ class C77232dd implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C77232dd f213072a = new C77232dd();

    private /* synthetic */ C77232dd() {
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
        return ((Duration) obj).compareTo(C74880z.f209081a) <= 0;
    }
}
