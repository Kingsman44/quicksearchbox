package com.google.android.apps.gsa.shared.bisto;

import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.shared.bisto.q */
/* compiled from: PG */
public final /* synthetic */ class C89678q implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C89678q f242804a = new C89678q();

    private /* synthetic */ C89678q() {
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
        C59071e eVar = C89681t.f242809a;
        return !"wired".equals(((C89680s) obj).f242808a);
    }
}
