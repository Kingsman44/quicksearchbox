package com.google.android.apps.gsa.staticplugins.opa.promo;

import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Instant;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneId;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.x */
/* compiled from: PG */
public final /* synthetic */ class C109947x implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109912ah f306357a;

    public /* synthetic */ C109947x(C109912ah ahVar) {
        this.f306357a = ahVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C109912ah ahVar = this.f306357a;
        if (C109945v.m183116f((C58833ax) obj, ahVar.f306247c)) {
            C118522by byVar = C118522by.OPA_NGA_PROMO_NOTIFICATION;
            int a = (int) ahVar.f306247c.mo79743a(C90037cp.f248474bB);
            LocalDateTime localDateTime = Instant.ofEpochMilli(ahVar.f306249e.mo26870b()).atZone(ZoneId.systemDefault()).mo43202c();
            ahVar.mo98253y(byVar, localDateTime.until((localDateTime.getHour() > a ? localDateTime.plusDays(1) : localDateTime).withHour(a), ChronoUnit.MILLIS));
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
