package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51591nj;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.ds */
/* compiled from: PG */
public final /* synthetic */ class C77247ds implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C51591nj f213096a;

    public /* synthetic */ C77247ds(C51591nj njVar) {
        this.f213096a = njVar;
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
        C51591nj njVar = this.f213096a;
        C51591nj a = C51591nj.m86227a(((C51592nk) obj).f134468e);
        if (a == null) {
            a = C51591nj.UNKNOWN_TIMER_STATUS;
        }
        return a == njVar;
    }
}
