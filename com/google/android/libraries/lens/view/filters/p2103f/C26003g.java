package com.google.android.libraries.lens.view.filters.p2103f;

import androidx.core.app.C1820g;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.f.g */
/* compiled from: PG */
public final /* synthetic */ class C26003g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C26005i f70655a;

    public /* synthetic */ C26003g(C26005i iVar) {
        this.f70655a = iVar;
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
        return C1820g.m4992b(this.f70655a.f70658a, (String) obj);
    }
}
