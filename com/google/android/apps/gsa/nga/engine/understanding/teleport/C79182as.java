package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.as */
/* compiled from: PG */
public final /* synthetic */ class C79182as implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f217645a;

    /* renamed from: b */
    public final /* synthetic */ int f217646b;

    public /* synthetic */ C79182as(int i, int i2) {
        this.f217645a = i;
        this.f217646b = i2;
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
        int i = this.f217645a;
        int i2 = this.f217646b;
        C80047aa aaVar = (C80047aa) obj;
        int i3 = C79204bn.f217670a;
        return aaVar.f219660d == i && aaVar.f219661e == i2;
    }
}
