package com.google.android.apps.search.assistant.verticals.ambient.p9928j;

import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.j.i */
/* compiled from: PG */
public final /* synthetic */ class C130822i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C51419h f358067a;

    public /* synthetic */ C130822i(C51419h hVar) {
        this.f358067a = hVar;
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
        C51419h hVar = this.f358067a;
        C58148f fVar = (C58148f) obj;
        Optional c = C130836w.m213197c(fVar);
        Optional d = C130836w.m213198d(fVar);
        if (c.isEmpty() || d.isEmpty()) {
            return false;
        }
        if ((hVar.equals(C51419h.SCHEDULED) && ((String) c.get()).equals("Scheduled")) || (hVar.equals(C51419h.FIRING) && ((String) c.get()).equals("Fired"))) {
            return true;
        }
        if (!hVar.equals(C51419h.SNOOZED) || !((String) c.get()).equals("Snoozed")) {
            return false;
        }
        return true;
    }
}
