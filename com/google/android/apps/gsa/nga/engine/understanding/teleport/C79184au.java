package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.au */
/* compiled from: PG */
public final /* synthetic */ class C79184au implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80047aa f217648a;

    public /* synthetic */ C79184au(C80047aa aaVar) {
        this.f217648a = aaVar;
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
        C80047aa aaVar = this.f217648a;
        int i = C79204bn.f217670a;
        return ((C79211bu) obj).mo73834c(aaVar);
    }
}
