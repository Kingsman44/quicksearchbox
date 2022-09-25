package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.ad */
/* compiled from: PG */
public final /* synthetic */ class C110732ad implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C110732ad f308532a = new C110732ad();

    private /* synthetic */ C110732ad() {
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
        C50794cr a = C50794cr.m85938a(((C50818do) obj).f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return a == C50794cr.CALENDAR;
    }
}
