package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C82200ab implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ boolean f224659a;

    /* renamed from: b */
    public final /* synthetic */ Instant f224660b;

    public /* synthetic */ C82200ab(boolean z, Instant instant) {
        this.f224659a = z;
        this.f224660b = instant;
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
        boolean z = this.f224659a;
        Instant instant = this.f224660b;
        C82889ee eeVar = (C82889ee) obj;
        Duration duration = C82201ac.f224661a;
        return !z || !C82201ac.m130520c(instant, eeVar, C82201ac.f224661a);
    }
}
