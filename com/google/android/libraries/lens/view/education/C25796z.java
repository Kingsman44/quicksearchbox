package com.google.android.libraries.lens.view.education;

import com.google.lens.p4707j.C62500dw;
import com.google.lens.p4707j.C62502dy;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.education.z */
/* compiled from: PG */
public final /* synthetic */ class C25796z implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C25796z f70075a = new C25796z();

    private /* synthetic */ C25796z() {
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
        int a = C62502dy.m94789a(((C62500dw) obj).f168734b);
        return a != 0 && a == 3;
    }
}
