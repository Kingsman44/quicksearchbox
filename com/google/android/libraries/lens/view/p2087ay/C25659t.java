package com.google.android.libraries.lens.view.p2087ay;

import com.google.android.libraries.lens.view.gleam.C26504ci;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.ay.t */
/* compiled from: PG */
public final /* synthetic */ class C25659t implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C25664y f69779a;

    public /* synthetic */ C25659t(C25664y yVar) {
        this.f69779a = yVar;
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
        return this.f69779a.f69792h.mo5941a((C26504ci) obj);
    }
}
