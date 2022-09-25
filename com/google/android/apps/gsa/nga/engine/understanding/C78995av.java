package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.av */
/* compiled from: PG */
public final /* synthetic */ class C78995av implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C78995av f217267a = new C78995av();

    private /* synthetic */ C78995av() {
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
        return ((C58485gu) obj).isEmpty();
    }
}
