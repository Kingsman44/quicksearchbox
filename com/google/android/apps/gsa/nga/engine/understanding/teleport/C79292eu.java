package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.eu */
/* compiled from: PG */
public final /* synthetic */ class C79292eu implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C79308fj f217780a;

    public /* synthetic */ C79292eu(C79308fj fjVar) {
        this.f217780a = fjVar;
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
        return ((C80047aa) obj).f219663g > ((double) this.f217780a.f217803a.f151c);
    }
}
