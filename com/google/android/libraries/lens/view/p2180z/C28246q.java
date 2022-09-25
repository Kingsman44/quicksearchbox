package com.google.android.libraries.lens.view.p2180z;

import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.z.q */
/* compiled from: PG */
public final /* synthetic */ class C28246q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C63042fg f76896a;

    public /* synthetic */ C28246q(C63042fg fgVar) {
        this.f76896a = fgVar;
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
        C63042fg fgVar = this.f76896a;
        int i = C28229ad.f76850c;
        return C62953e.m95476a((C63042fg) obj, fgVar) > 0;
    }
}
