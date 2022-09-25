package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ah */
/* compiled from: PG */
public final /* synthetic */ class C79171ah implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f217633a;

    /* renamed from: b */
    public final /* synthetic */ int f217634b;

    public /* synthetic */ C79171ah(int i, int i2) {
        this.f217633a = i;
        this.f217634b = i2;
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
        int i = this.f217633a;
        int i2 = this.f217634b;
        C80047aa aaVar = (C80047aa) obj;
        int i3 = C79204bn.f217670a;
        return aaVar.f219660d == i && aaVar.f219661e == i2;
    }
}
