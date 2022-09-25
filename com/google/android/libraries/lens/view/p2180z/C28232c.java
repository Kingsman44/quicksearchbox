package com.google.android.libraries.lens.view.p2180z;

import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.z.c */
/* compiled from: PG */
public final /* synthetic */ class C28232c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C63042fg f76882a;

    public /* synthetic */ C28232c(C63042fg fgVar) {
        this.f76882a = fgVar;
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
        C63042fg fgVar = this.f76882a;
        int i = C28229ad.f76850c;
        return C62948a.m95450a(C62953e.m95480e((C63042fg) obj, fgVar), C62948a.m95457h(24)) < 0;
    }
}
