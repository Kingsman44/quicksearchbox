package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.bl */
/* compiled from: PG */
public final /* synthetic */ class C79202bl implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ double f217668a;

    public /* synthetic */ C79202bl(double d) {
        this.f217668a = d;
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
        double d = this.f217668a;
        int i = C79204bn.f217670a;
        return Double.compare(((C80047aa) obj).f219663g, d) >= 0;
    }
}
