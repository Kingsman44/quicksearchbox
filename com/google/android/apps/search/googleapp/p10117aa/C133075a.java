package com.google.android.apps.search.googleapp.p10117aa;

import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.aa.a */
/* compiled from: PG */
public final /* synthetic */ class C133075a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Instant f362833a;

    public /* synthetic */ C133075a(Instant instant) {
        this.f362833a = instant;
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
        Instant instant = this.f362833a;
        int i = C133117d.f362907a;
        C63042fg fgVar = ((C133125j) obj).f362929i;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        return Instant.ofEpochMilli(C62953e.m95478c(fgVar)).compareTo(instant) <= 0;
    }
}
