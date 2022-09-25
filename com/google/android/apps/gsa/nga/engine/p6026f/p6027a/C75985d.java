package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.d */
/* compiled from: PG */
public final /* synthetic */ class C75985d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C75985d f210793a = new C75985d();

    private /* synthetic */ C75985d() {
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
        return ((String) obj).startsWith("user_defined_action_settings#");
    }
}
