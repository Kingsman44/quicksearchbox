package com.google.android.libraries.p590as.p593b.p596b;

import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.n */
/* compiled from: PG */
public final /* synthetic */ class C10952n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10879g f36071a;

    public /* synthetic */ C10952n(C10879g gVar) {
        this.f36071a = gVar;
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
        C10879g gVar = this.f36071a;
        C10882h hVar = (C10882h) obj;
        C58974d dVar = C10812ap.f35848a;
        if ((gVar.f35960a & 1) != 0) {
            return hVar.mo19289g().toLanguageTag().equals(gVar.f35961b);
        }
        return true;
    }
}
