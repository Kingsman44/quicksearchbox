package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c;

import com.google.assistant.p3803ag.p3804a.C48864g;
import com.google.assistant.p3803ag.p3804a.C48865h;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.c.f */
/* compiled from: PG */
public final /* synthetic */ class C107426f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C107426f f298961a = new C107426f();

    private /* synthetic */ C107426f() {
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
        C48865h hVar = (C48865h) obj;
        C48864g a = C48864g.m85285a(hVar.f126460d);
        if (a == null) {
            a = C48864g.TYPE_UNSPECIFIED;
        }
        return a == C48864g.START_JOURNEY && hVar.f126458b == 4;
    }
}
