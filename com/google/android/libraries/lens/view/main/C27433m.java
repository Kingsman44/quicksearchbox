package com.google.android.libraries.lens.view.main;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4707j.C62500dw;
import com.google.lens.p4707j.C62502dy;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.main.m */
/* compiled from: PG */
public final /* synthetic */ class C27433m implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C27433m f75077a = new C27433m();

    private /* synthetic */ C27433m() {
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
        C58974d dVar = C27288ae.f74662a;
        int a = C62502dy.m94789a(((C62500dw) obj).f168734b);
        return a != 0 && a == 3;
    }
}
