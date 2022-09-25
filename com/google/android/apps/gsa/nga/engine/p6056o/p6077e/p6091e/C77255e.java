package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.e */
/* compiled from: PG */
public final /* synthetic */ class C77255e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C51419h f213105a;

    public /* synthetic */ C77255e(C51419h hVar) {
        this.f213105a = hVar;
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
        C51419h hVar = this.f213105a;
        int i = C77276w.f213129a;
        C51419h a = C51419h.m86180a(((C51473j) obj).f134097f);
        if (a == null) {
            a = C51419h.UNKNOWN_ALARM_STATUS;
        }
        return a == hVar;
    }
}
