package com.google.android.libraries.appactions.serviceengine.p11038b;

import com.google.apps.tiktok.cache.C46370ah;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.appactions.serviceengine.b.c */
/* compiled from: PG */
public final /* synthetic */ class C147884c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C147890i f398931a;

    public /* synthetic */ C147884c(C147890i iVar) {
        this.f398931a = iVar;
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
        C147890i iVar = this.f398931a;
        return iVar.f398937a.mo26870b() <= ((C46370ah) obj).f121385b + iVar.f398939c;
    }
}
