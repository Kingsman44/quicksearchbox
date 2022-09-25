package com.google.android.apps.gsa.staticplugins.p7648ce;

import com.google.android.apps.gsa.search.core.p6805i.C86113i;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.ae */
/* compiled from: PG */
public final /* synthetic */ class C97546ae implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C86113i f272480a;

    public /* synthetic */ C97546ae(C86113i iVar) {
        this.f272480a = iVar;
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
        C86113i iVar = this.f272480a;
        C58974d dVar = C97565ax.f272500a;
        return ((C86113i) obj).f232755e != iVar.f232755e;
    }
}
