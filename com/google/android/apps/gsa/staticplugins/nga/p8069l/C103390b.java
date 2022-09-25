package com.google.android.apps.gsa.staticplugins.nga.p8069l;

import com.google.android.libraries.geller.portable.C21947am;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60945d;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.l.b */
/* compiled from: PG */
public final /* synthetic */ class C103390b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Instant f288212a;

    public /* synthetic */ C103390b(Instant instant) {
        this.f288212a = instant;
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
        Instant instant = this.f288212a;
        Map.Entry entry = (Map.Entry) obj;
        C58974d dVar = C103393e.f288216a;
        return C21947am.SYNCED.equals(entry.getValue()) && C60945d.m93099d(((Long) entry.getKey()).longValue()).isAfter(instant);
    }
}
