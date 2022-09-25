package com.google.android.libraries.lens.view.session;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.session.an */
/* compiled from: PG */
public final /* synthetic */ class C27751an implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ float f75753a;

    public /* synthetic */ C27751an(float f) {
        this.f75753a = f;
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
        float f = this.f75753a;
        int i = C27761ax.f75765b;
        return ((Float) obj).floatValue() > f;
    }
}
