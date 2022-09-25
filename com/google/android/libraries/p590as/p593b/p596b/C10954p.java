package com.google.android.libraries.p590as.p593b.p596b;

import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.speech.p5218j.C66964g;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.p */
/* compiled from: PG */
public final /* synthetic */ class C10954p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10879g f36073a;

    public /* synthetic */ C10954p(C10879g gVar) {
        this.f36073a = gVar;
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
        C10879g gVar = this.f36073a;
        C10882h hVar = (C10882h) obj;
        C58974d dVar = C10812ap.f35848a;
        if ((gVar.f35960a & 4) == 0) {
            return true;
        }
        C58528ij f = hVar.mo19288f();
        C66964g a = C66964g.m97396a(gVar.f35963d);
        if (a == null) {
            a = C66964g.UNKNOWN;
        }
        return f.contains(a);
    }
}
