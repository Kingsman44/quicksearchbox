package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a;

import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.a.h */
/* compiled from: PG */
public final /* synthetic */ class C131201h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131195b f358815a;

    public /* synthetic */ C131201h(C131195b bVar) {
        this.f358815a = bVar;
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
        C131195b bVar = this.f358815a;
        C63042fg fgVar = ((C131195b) obj).f358804c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C63042fg fgVar2 = bVar.f358804c;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        return C62953e.m95476a(fgVar, fgVar2) > 0;
    }
}
