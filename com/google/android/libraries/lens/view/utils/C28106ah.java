package com.google.android.libraries.lens.view.utils;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.utils.ah */
/* compiled from: PG */
public final /* synthetic */ class C28106ah implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C28106ah f76505a = new C28106ah();

    private /* synthetic */ C28106ah() {
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
        return (((C56241av) obj).f149793a & 4) != 0;
    }
}
