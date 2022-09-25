package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3781ad.p3789d.p3791b.C48716bx;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.r */
/* compiled from: PG */
public final /* synthetic */ class C113105r implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C113105r f313382a = new C113105r();

    private /* synthetic */ C113105r() {
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
        C121537f fVar = C113110w.f313387a;
        C48674ai a = C48674ai.m85261a(((C48716bx) obj).f126050f);
        if (a == null) {
            a = C48674ai.UNKNOWN;
        }
        return a == C48674ai.GEMINI;
    }
}
