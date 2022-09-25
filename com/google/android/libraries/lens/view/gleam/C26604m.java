package com.google.android.libraries.lens.view.gleam;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.gleam.m */
/* compiled from: PG */
public final /* synthetic */ class C26604m implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C26604m f72533a = new C26604m();

    private /* synthetic */ C26604m() {
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
        return (((C56320r) obj).f150094a & 16) != 0;
    }
}
