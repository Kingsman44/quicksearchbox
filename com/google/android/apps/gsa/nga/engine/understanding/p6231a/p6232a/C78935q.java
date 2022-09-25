package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import com.google.android.apps.gsa.nga.engine.au.av;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.q */
/* compiled from: PG */
public final /* synthetic */ class C78935q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ av f217174a;

    public /* synthetic */ C78935q(av avVar) {
        this.f217174a = avVar;
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
        return this.f217174a.c((String) obj).f117b != null;
    }
}
