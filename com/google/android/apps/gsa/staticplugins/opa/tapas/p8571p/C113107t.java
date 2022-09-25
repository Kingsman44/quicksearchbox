package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.assistant.p3781ad.p3789d.p3791b.C48716bx;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.t */
/* compiled from: PG */
public final /* synthetic */ class C113107t implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C113110w f313384a;

    public /* synthetic */ C113107t(C113110w wVar) {
        this.f313384a = wVar;
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
        return Duration.between(Instant.ofEpochMilli(((C48716bx) obj).f126048d), Instant.ofEpochMilli(this.f313384a.f313391e.mo26870b())).compareTo(C113110w.f313389c) < 0;
    }
}
