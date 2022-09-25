package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.bk */
/* compiled from: PG */
public final /* synthetic */ class C112205bk implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112205bk f311498a = new C112205bk();

    private /* synthetic */ C112205bk() {
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
        C51473j jVar = (C51473j) obj;
        int i = C112213bs.f311506c;
        C51419h a = C51419h.m86180a(jVar.f134097f);
        if (a == null) {
            a = C51419h.UNKNOWN_ALARM_STATUS;
        }
        if (a == C51419h.SCHEDULED) {
            return true;
        }
        int i2 = jVar.f134097f;
        C51419h a2 = C51419h.m86180a(i2);
        if (a2 == null) {
            a2 = C51419h.UNKNOWN_ALARM_STATUS;
        }
        if (a2 == C51419h.FIRING) {
            return true;
        }
        C51419h a3 = C51419h.m86180a(i2);
        if (a3 == null) {
            a3 = C51419h.UNKNOWN_ALARM_STATUS;
        }
        return a3 == C51419h.SNOOZED;
    }
}
