package com.google.android.apps.gsa.nga.engine.understanding.p6239f;

import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f.a */
/* compiled from: PG */
public final /* synthetic */ class C79114a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79114a f217506a = new C79114a();

    private /* synthetic */ C79114a() {
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
        int i = ((C63775d) obj).f172520a;
        return (i & 4) == 0 && (i & 64) == 0;
    }
}
