package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8460k;

import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.k.h */
/* compiled from: PG */
public final class C110723h implements C86091a {

    /* renamed from: a */
    private static final Duration f308520a = Duration.ofMinutes(2);

    /* renamed from: b */
    private final C118561t f308521b;

    /* renamed from: c */
    private final C83794j f308522c;

    public C110723h(C118561t tVar, C83794j jVar) {
        this.f308521b = tVar;
        this.f308522c = jVar;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (!this.f308522c.mo77178p()) {
            C58976aa aaVar = C58975e.f156826a;
            C118561t tVar = this.f308521b;
            C118522by byVar = C118522by.SMARTSPACE_REMINDER_UPDATE;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            long millis = f308520a.toMillis();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 1;
            agVar.f328822b = millis;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328821a |= 2;
            agVar2.f328823c = 60000;
            tVar.mo103754e(byVar, (C118472ag) afVar.build());
        }
    }
}
