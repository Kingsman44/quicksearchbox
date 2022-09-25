package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48663x;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.es */
/* compiled from: PG */
public final /* synthetic */ class C112411es implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f311884a;

    /* renamed from: b */
    public final /* synthetic */ int f311885b;

    public /* synthetic */ C112411es(long j, int i) {
        this.f311884a = j;
        this.f311885b = i;
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
        long j = this.f311884a;
        int i = this.f311885b;
        C121537f fVar = C112435fh.f311928a;
        return ((C48663x) obj).f125764b >= j - Duration.ofDays((long) i).toMillis();
    }
}
