package com.google.android.libraries.lens.common.text;

import com.google.p4172bg.p4174b.C55735x;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.common.text.h */
/* compiled from: PG */
public final /* synthetic */ class C24132h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C24132h f65890a = new C24132h();

    private /* synthetic */ C24132h() {
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
        int i = ((C55735x) obj).f147085a;
        return ((i & 16384) == 0 && (i & 4096) == 0) ? false : true;
    }
}
