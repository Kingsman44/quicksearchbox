package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.bo */
/* compiled from: PG */
public final /* synthetic */ class C79205bo implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f217672a;

    /* renamed from: b */
    public final /* synthetic */ int f217673b;

    public /* synthetic */ C79205bo(int i, int i2) {
        this.f217672a = i;
        this.f217673b = i2;
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
        C80047aa aaVar = (C80047aa) obj;
        return aaVar.f219660d >= this.f217672a && aaVar.f219661e <= this.f217673b;
    }
}
