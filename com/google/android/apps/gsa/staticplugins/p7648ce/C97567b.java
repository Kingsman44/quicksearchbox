package com.google.android.apps.gsa.staticplugins.p7648ce;

import com.google.android.libraries.gsa.p1864f.p1865a.p1866a.C22806b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.b */
/* compiled from: PG */
public final /* synthetic */ class C97567b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f272565a;

    public /* synthetic */ C97567b(int i) {
        this.f272565a = i;
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
        return ((C22806b) obj).f62797c == this.f272565a;
    }
}
