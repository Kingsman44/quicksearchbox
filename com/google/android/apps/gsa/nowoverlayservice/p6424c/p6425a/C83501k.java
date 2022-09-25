package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.k */
/* compiled from: PG */
public final /* synthetic */ class C83501k implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227667a;

    /* renamed from: b */
    public final /* synthetic */ C83489ad f227668b;

    public /* synthetic */ C83501k(C83490ae aeVar, C83489ad adVar) {
        this.f227667a = aeVar;
        this.f227668b = adVar;
    }

    public final void run() {
        C83490ae aeVar = this.f227667a;
        C83489ad adVar = this.f227668b;
        if (aeVar.f227645d.get(adVar.f227637a) != null) {
            aeVar.f227644c.mo74236a(C83490ae.m132906b(adVar, C89849ae.ACETONE_OVERLAY_FLOW_TIMEOUT).mo83699a());
            aeVar.f227645d.remove(adVar.f227637a);
        }
    }
}
