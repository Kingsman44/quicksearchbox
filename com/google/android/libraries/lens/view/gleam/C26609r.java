package com.google.android.libraries.lens.view.gleam;

import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.gleam.r */
/* compiled from: PG */
public final /* synthetic */ class C26609r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ float f72539a;

    public /* synthetic */ C26609r(float f) {
        this.f72539a = f;
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
        float f = this.f72539a;
        C58974d dVar = C26633u.f72632a;
        return ((Float) obj).floatValue() > f;
    }
}
