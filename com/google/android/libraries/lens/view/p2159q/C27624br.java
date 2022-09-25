package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.q.br */
/* compiled from: PG */
public final /* synthetic */ class C27624br implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f75478a;

    public /* synthetic */ C27624br(List list) {
        this.f75478a = list;
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
        return C27628bv.m51420c((C24465t) obj, this.f75478a);
    }
}
