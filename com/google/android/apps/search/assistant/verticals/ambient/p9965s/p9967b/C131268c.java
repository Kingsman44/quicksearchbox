package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9967b;

import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.assistant.p3886c.C50794cr;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.b.c */
/* compiled from: PG */
public final /* synthetic */ class C131268c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131268c f358919a = new C131268c();

    private /* synthetic */ C131268c() {
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
        C50794cr a = C50794cr.m85938a(((C83739ak) obj).f228239h);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return !a.equals(C50794cr.AT_STORE_COMBINED_CARD);
    }
}
