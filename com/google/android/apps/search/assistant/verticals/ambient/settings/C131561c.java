package com.google.android.apps.search.assistant.verticals.ambient.settings;

import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.settings.c */
/* compiled from: PG */
public final /* synthetic */ class C131561c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131561c f359451a = new C131561c();

    private /* synthetic */ C131561c() {
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
        C58528ij ijVar = C131567i.f359464a;
        C50794cr a = C50794cr.m85938a(((C50818do) obj).f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return C131567i.f359464a.contains(a);
    }
}
