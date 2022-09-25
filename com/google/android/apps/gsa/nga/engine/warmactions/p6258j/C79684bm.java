package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.assistant.p3897e.p3917i.p3918a.C51591nj;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.bm */
/* compiled from: PG */
public final /* synthetic */ class C79684bm implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79684bm f218537a = new C79684bm();

    private /* synthetic */ C79684bm() {
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
        C51591nj a = C51591nj.m86227a(((C51592nk) obj).f134468e);
        if (a == null) {
            a = C51591nj.UNKNOWN_TIMER_STATUS;
        }
        return a.equals(C51591nj.FIRING);
    }
}
