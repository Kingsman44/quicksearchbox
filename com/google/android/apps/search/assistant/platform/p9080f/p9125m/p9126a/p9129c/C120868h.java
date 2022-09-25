package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.h */
/* compiled from: PG */
public final /* synthetic */ class C120868h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f336075a;

    public /* synthetic */ C120868h(String str) {
        this.f336075a = str;
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
        return !this.f336075a.equals((String) obj);
    }
}
