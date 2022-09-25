package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83765h;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.p.h */
/* compiled from: PG */
final class C110883h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f308896a;

    /* renamed from: b */
    final /* synthetic */ boolean f308897b;

    /* renamed from: c */
    final /* synthetic */ List f308898c;

    /* renamed from: d */
    final /* synthetic */ C110886k f308899d;

    public C110883h(C110886k kVar, long j, boolean z, List list) {
        this.f308899d = kVar;
        this.f308896a = j;
        this.f308897b = z;
        this.f308898c = list;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) this.f308899d.f308909e.mo56226d()).mo56372aa(26815)).mo56386p("Failed to get current displayed calendar, and skipped the calendar flight dedup logging.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (!((List) Collection.EL.stream(((C83765h) obj).f228312a).map(C110882g.f308895a).collect(Collectors.toList())).contains(Long.valueOf(this.f308896a))) {
            this.f308899d.f308908d.mo109917ao("FLIGHT_CALENDAR_CARD_COUNTER_EN");
            if (this.f308897b) {
                this.f308899d.f308908d.mo109917ao("DUPLICATE_CALENDAR_CARD_COUNTER_EN");
            } else if (!this.f308898c.isEmpty()) {
                this.f308899d.f308908d.mo109917ao("HAS_FLIGHT_WHEN_CALENDAR_DEDUP_FAILS_COUNTER_EN");
            } else {
                this.f308899d.f308908d.mo109917ao("MISSING_FLIGHT_CARD_COUNTER_EN");
            }
        }
    }
}
