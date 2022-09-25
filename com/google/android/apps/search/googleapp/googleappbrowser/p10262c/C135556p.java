package com.google.android.apps.search.googleapp.googleappbrowser.p10262c;

import p3186j$.util.function.Predicate;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.c.p */
/* compiled from: PG */
final class C135556p implements Predicate {

    /* renamed from: a */
    public static final C135556p f369250a = new C135556p();

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

    public final /* bridge */ /* synthetic */ boolean test(Object obj) {
        C135547g gVar = (C135547g) obj;
        C69664n.m101061g(gVar, "firstRunState");
        return gVar.f369236b;
    }
}
