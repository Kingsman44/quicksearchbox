package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.assistant.p3897e.p3917i.p3918a.C51591nj;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.bj */
/* compiled from: PG */
public final /* synthetic */ class C112204bj implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112204bj f311497a = new C112204bj();

    private /* synthetic */ C112204bj() {
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
        C51592nk nkVar = (C51592nk) obj;
        int i = C112213bs.f311506c;
        C51591nj a = C51591nj.m86227a(nkVar.f134468e);
        if (a == null) {
            a = C51591nj.UNKNOWN_TIMER_STATUS;
        }
        if (a == C51591nj.RUNNING) {
            return true;
        }
        C51591nj a2 = C51591nj.m86227a(nkVar.f134468e);
        if (a2 == null) {
            a2 = C51591nj.UNKNOWN_TIMER_STATUS;
        }
        return a2 == C51591nj.FIRING;
    }
}
