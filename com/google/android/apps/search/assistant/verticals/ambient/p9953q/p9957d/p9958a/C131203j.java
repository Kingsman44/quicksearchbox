package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a;

import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.a.j */
/* compiled from: PG */
public final /* synthetic */ class C131203j implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C63042fg f358817a;

    public /* synthetic */ C131203j(C63042fg fgVar) {
        this.f358817a = fgVar;
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
        C63042fg fgVar = this.f358817a;
        C63042fg fgVar2 = ((C131195b) obj).f358804c;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        return C62953e.m95476a(fgVar, fgVar2) <= 0;
    }
}
