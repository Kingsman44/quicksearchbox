package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.q */
/* compiled from: PG */
public final /* synthetic */ class C83507q implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227681a;

    /* renamed from: b */
    public final /* synthetic */ String f227682b;

    public /* synthetic */ C83507q(C83490ae aeVar, String str) {
        this.f227681a = aeVar;
        this.f227682b = str;
    }

    public final void run() {
        C83490ae aeVar = this.f227681a;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(this.f227682b);
        if (adVar != null) {
            aeVar.mo76824C(adVar, 3, 4, C89849ae.ACETONE_OVERLAY_CONTROLLER_RESUME);
        }
    }
}
