package com.google.android.libraries.lens.view.utils;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.utils.d */
/* compiled from: PG */
public final /* synthetic */ class C28114d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C28114d f76511a = new C28114d();

    private /* synthetic */ C28114d() {
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
        return (((C56320r) obj).f150094a & 64) != 0;
    }
}
