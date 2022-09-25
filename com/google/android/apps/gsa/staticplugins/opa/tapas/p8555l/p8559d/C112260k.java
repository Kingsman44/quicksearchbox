package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8559d;

import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48663x;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.d.k */
/* compiled from: PG */
public final /* synthetic */ class C112260k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f311567a;

    /* renamed from: b */
    public final /* synthetic */ int f311568b;

    public /* synthetic */ C112260k(long j, int i) {
        this.f311567a = j;
        this.f311568b = i;
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
        long j = this.f311567a;
        int i = this.f311568b;
        int i2 = C112267r.f311582f;
        return ((C48663x) obj).f125764b >= j - Duration.ofDays((long) i).toMillis();
    }
}
