package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.j */
/* compiled from: PG */
public final /* synthetic */ class C83500j implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227665a;

    /* renamed from: b */
    public final /* synthetic */ String f227666b;

    public /* synthetic */ C83500j(C83490ae aeVar, String str) {
        this.f227665a = aeVar;
        this.f227666b = str;
    }

    public final void run() {
        C83490ae aeVar = this.f227665a;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(this.f227666b);
        if (adVar != null) {
            aeVar.mo76825F(adVar, C89849ae.ACETONE_OVERLAY_FLOW_CANCELED, 5);
        }
    }
}
