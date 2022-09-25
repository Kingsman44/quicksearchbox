package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.m */
/* compiled from: PG */
public final /* synthetic */ class C83503m implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227673a;

    /* renamed from: b */
    public final /* synthetic */ String f227674b;

    public /* synthetic */ C83503m(C83490ae aeVar, String str) {
        this.f227673a = aeVar;
        this.f227674b = str;
    }

    public final void run() {
        C83490ae aeVar = this.f227673a;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(this.f227674b);
        if (adVar != null) {
            aeVar.mo76828d(adVar, C89849ae.ACETONE_OVERLAY_ATTACH_NO_CREATE_DONE);
        }
    }
}
