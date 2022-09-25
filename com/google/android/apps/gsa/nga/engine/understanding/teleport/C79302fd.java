package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.fd */
/* compiled from: PG */
public final /* synthetic */ class C79302fd implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C79298f f217796a;

    public /* synthetic */ C79302fd(C79298f fVar) {
        this.f217796a = fVar;
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
        return aaVar.f219660d == 0 && aaVar.f219661e == this.f217796a.mo73864j().length();
    }
}
