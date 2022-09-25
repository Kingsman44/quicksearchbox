package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.p2037n.C24778ak;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.ondevice.k.cy */
/* compiled from: PG */
public final /* synthetic */ class C24614cy implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f67347a;

    public /* synthetic */ C24614cy(String str) {
        this.f67347a = str;
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
        return ((C24778ak) obj).f67708b.equals(this.f67347a);
    }
}
