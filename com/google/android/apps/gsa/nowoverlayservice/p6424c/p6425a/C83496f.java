package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.f */
/* compiled from: PG */
public final /* synthetic */ class C83496f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227657a;

    /* renamed from: b */
    public final /* synthetic */ String f227658b;

    public /* synthetic */ C83496f(C83490ae aeVar, String str) {
        this.f227657a = aeVar;
        this.f227658b = str;
    }

    public final void run() {
        C83490ae aeVar = this.f227657a;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(this.f227658b);
        if (adVar != null) {
            aeVar.mo76825F(adVar, C89849ae.ACETONE_OVERLAY_FLOW_CANCELED, 4);
        }
    }
}
