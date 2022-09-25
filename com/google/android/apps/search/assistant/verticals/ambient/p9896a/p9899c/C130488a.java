package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9899c;

import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.c.a */
/* compiled from: PG */
public final /* synthetic */ class C130488a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f357473a;

    public /* synthetic */ C130488a(C58485gu guVar) {
        this.f357473a = guVar;
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
        C58485gu guVar = this.f357473a;
        C50794cr a = C50794cr.m85938a(((C83739ak) obj).f228239h);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return guVar.contains(a);
    }
}
