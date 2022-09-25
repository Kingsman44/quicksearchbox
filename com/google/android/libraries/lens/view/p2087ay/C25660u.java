package com.google.android.libraries.lens.view.p2087ay;

import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.ay.u */
/* compiled from: PG */
public final /* synthetic */ class C25660u implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f69780a;

    public /* synthetic */ C25660u(long j) {
        this.f69780a = j;
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
        long j = this.f69780a;
        C26504ci ciVar = (C26504ci) obj;
        C58974d dVar = C25664y.f69785a;
        return j == 0 || j == ciVar.f72215i.mo33666i();
    }
}
