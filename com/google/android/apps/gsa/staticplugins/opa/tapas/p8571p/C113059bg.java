package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.assistant.p3781ad.p3789d.p3791b.C48716bx;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.bg */
/* compiled from: PG */
public final /* synthetic */ class C113059bg implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C113071bs f313269a;

    /* renamed from: b */
    public final /* synthetic */ long f313270b;

    public /* synthetic */ C113059bg(C113071bs bsVar, long j) {
        this.f313269a = bsVar;
        this.f313270b = j;
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
        return ((C48716bx) obj).f126048d >= this.f313270b - this.f313269a.f313289d.mo79743a(C90063do.f249621gw);
    }
}
