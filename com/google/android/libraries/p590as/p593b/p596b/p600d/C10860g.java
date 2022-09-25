package com.google.android.libraries.p590as.p593b.p596b.p600d;

import com.google.p395al.p408c.p414c.p416b.C8476as;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.d.g */
/* compiled from: PG */
public final /* synthetic */ class C10860g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C8476as f35923a;

    public /* synthetic */ C10860g(C8476as asVar) {
        this.f35923a = asVar;
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
        C8476as asVar = this.f35923a;
        return C10862i.m25884c(((Integer) obj).intValue(), asVar.f29417b, asVar.f29419d);
    }
}
