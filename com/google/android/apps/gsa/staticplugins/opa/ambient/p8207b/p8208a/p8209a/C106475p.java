package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import com.google.assistant.p3886c.p3887a.C50682r;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.p */
/* compiled from: PG */
public final /* synthetic */ class C106475p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f296963a;

    public /* synthetic */ C106475p(long j) {
        this.f296963a = j;
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
        C50682r rVar = (C50682r) obj;
        return rVar.f131858d - rVar.f131857c >= Duration.ofMinutes(this.f296963a).toMillis();
    }
}
