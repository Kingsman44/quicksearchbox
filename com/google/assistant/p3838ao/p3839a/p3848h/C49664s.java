package com.google.assistant.p3838ao.p3839a.p3848h;

import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.assistant.ao.a.h.s */
/* compiled from: PG */
public final /* synthetic */ class C49664s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f128179a;

    public /* synthetic */ C49664s(List list) {
        this.f128179a = list;
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
        List list = this.f128179a;
        C49663r rVar = (C49663r) obj;
        if (rVar.mo53322b().f150290a.size() < 2) {
            return false;
        }
        return list.equals(rVar.mo53321a());
    }
}
