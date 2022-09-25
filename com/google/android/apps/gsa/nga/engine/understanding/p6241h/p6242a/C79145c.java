package com.google.android.apps.gsa.nga.engine.understanding.p6241h.p6242a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.h.a.c */
/* compiled from: PG */
public final /* synthetic */ class C79145c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79145c f217555a = new C79145c();

    private /* synthetic */ C79145c() {
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
        int i = C79149g.f217559b;
        return ((String) obj).length() >= 2;
    }
}
