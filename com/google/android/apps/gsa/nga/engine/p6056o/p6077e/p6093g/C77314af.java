package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.af */
/* compiled from: PG */
public final /* synthetic */ class C77314af implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C77314af f213232a = new C77314af();

    private /* synthetic */ C77314af() {
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
        C63775d dVar = (C63775d) obj;
        int i = C77317ai.f213235a;
        return (dVar.f172520a & 64) != 0 && !dVar.f172526g.isEmpty();
    }
}
