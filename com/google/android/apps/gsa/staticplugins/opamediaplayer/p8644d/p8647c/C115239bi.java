package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119091p;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.bi */
/* compiled from: PG */
public final /* synthetic */ class C115239bi implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f319780a;

    public /* synthetic */ C115239bi(int i) {
        this.f319780a = i;
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
        int i = this.f319780a;
        C119091p pVar = (C119091p) obj;
        return pVar.mo104164d() <= i && pVar.mo104162b() >= i;
    }
}
