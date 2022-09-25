package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.e */
/* compiled from: PG */
public final /* synthetic */ class C111182e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C51419h f309478a;

    public /* synthetic */ C111182e(C51419h hVar) {
        this.f309478a = hVar;
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
        C51419h hVar = this.f309478a;
        C58148f fVar = (C58148f) obj;
        Optional g = C111175am.m184931g(fVar, "alarmStatus");
        Optional i = C111175am.m184933i(fVar, "scheduledTime");
        if (g.isEmpty() || i.isEmpty()) {
            return false;
        }
        if ((hVar.equals(C51419h.SCHEDULED) && ((String) g.get()).equals("Scheduled")) || (hVar.equals(C51419h.FIRING) && ((String) g.get()).equals("Fired"))) {
            return true;
        }
        if (!hVar.equals(C51419h.SNOOZED) || !((String) g.get()).equals("Snoozed")) {
            return false;
        }
        return true;
    }
}
