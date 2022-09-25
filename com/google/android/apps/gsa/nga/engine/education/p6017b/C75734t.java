package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.t */
/* compiled from: PG */
public final /* synthetic */ class C75734t implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C75734t f210206a = new C75734t();

    private /* synthetic */ C75734t() {
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
        return ((C75650ai) obj).mo71801e().isEmpty();
    }
}
