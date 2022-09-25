package com.google.android.apps.gsa.opa.smartspace.p6458g;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.g.a */
/* compiled from: PG */
public final /* synthetic */ class C83789a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C83789a f228367a = new C83789a();

    private /* synthetic */ C83789a() {
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
        int i = C83791c.f228369e;
        C50818do doVar = ((C83741am) obj).f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return a == C50794cr.AIR_QUALITY && doVar.f132305b;
    }
}
