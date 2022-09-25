package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.common.p4552o.afi;
import com.google.common.p4552o.agh;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bi */
/* compiled from: PG */
public final /* synthetic */ class C79759bi implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79759bi f218688a = new C79759bi();

    private /* synthetic */ C79759bi() {
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
        afi afi = ((agh) obj).f158640j;
        if (afi == null) {
            afi = afi.f158536i;
        }
        return afi.f158539b;
    }
}
