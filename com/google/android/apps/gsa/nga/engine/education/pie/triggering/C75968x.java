package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80183ad;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.x */
/* compiled from: PG */
public final /* synthetic */ class C75968x implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C75970z f210769a;

    /* renamed from: b */
    public final /* synthetic */ Instant f210770b;

    public /* synthetic */ C75968x(C75970z zVar, Instant instant) {
        this.f210769a = zVar;
        this.f210770b = instant;
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
        C80183ad adVar;
        C75970z zVar = this.f210769a;
        Instant instant = this.f210770b;
        Instant a = zVar.f210772a.f210626e.mo57444a();
        C80213bg bgVar = (C80213bg) ((Map.Entry) obj).getValue();
        if (bgVar.f220080b == 5) {
            adVar = (C80183ad) bgVar.f220081c;
        } else {
            adVar = C80183ad.f220000d;
        }
        return a.isAfter(instant.plusSeconds(adVar.f220004c));
    }
}
