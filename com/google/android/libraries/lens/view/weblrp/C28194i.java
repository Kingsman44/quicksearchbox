package com.google.android.libraries.lens.view.weblrp;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.weblrp.i */
/* compiled from: PG */
public final class C28194i implements Predicate {

    /* renamed from: a */
    private boolean f76726a;

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
        if (((String) obj).equals("about:blank")) {
            this.f76726a = true;
        }
        return !this.f76726a;
    }
}
