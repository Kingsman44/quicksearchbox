package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8469r;

import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.r.a */
/* compiled from: PG */
public final /* synthetic */ class C110915a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C110915a f308971a = new C110915a();

    private /* synthetic */ C110915a() {
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
        C58528ij ijVar = C110917c.f308973a;
        C50794cr a = C50794cr.m85938a(((C92113i) obj).f256820a.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return !ijVar.contains(a);
    }
}
