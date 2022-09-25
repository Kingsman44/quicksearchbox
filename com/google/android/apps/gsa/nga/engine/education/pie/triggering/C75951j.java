package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80206b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80212bf;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.j */
/* compiled from: PG */
public final /* synthetic */ class C75951j implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C75953l f210734a;

    /* renamed from: b */
    public final /* synthetic */ C75933as f210735b;

    public /* synthetic */ C75951j(C75953l lVar, C75933as asVar) {
        this.f210734a = lVar;
        this.f210735b = asVar;
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
        C80206b bVar;
        C75953l lVar = this.f210734a;
        C75933as asVar = this.f210735b;
        Map.Entry entry = (Map.Entry) obj;
        C80213bg bgVar = (C80213bg) entry.getValue();
        Instant a = lVar.f210741c.mo57444a();
        Instant instant = (Instant) asVar.mo71968c().get();
        if (bgVar.f220080b == 2) {
            bVar = (C80206b) bgVar.f220081c;
        } else {
            bVar = C80206b.f220056c;
        }
        boolean isAfter = a.isAfter(instant.plusSeconds(bVar.f220059b));
        C80212bf.m128095a(bgVar.f220080b).name();
        ((C80248co) entry.getKey()).name();
        return isAfter;
    }
}
