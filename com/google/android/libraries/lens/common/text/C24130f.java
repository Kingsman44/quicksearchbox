package com.google.android.libraries.lens.common.text;

import com.google.p4172bg.p4174b.C55735x;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.common.text.f */
/* compiled from: PG */
public final /* synthetic */ class C24130f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C24130f f65888a = new C24130f();

    private /* synthetic */ C24130f() {
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
        return ((i & 8192) == 0 && (i & 2048) == 0) ? false : true;
    }
}
