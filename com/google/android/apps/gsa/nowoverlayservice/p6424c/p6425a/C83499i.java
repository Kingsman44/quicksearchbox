package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.i */
/* compiled from: PG */
public final /* synthetic */ class C83499i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227663a;

    /* renamed from: b */
    public final /* synthetic */ String f227664b;

    public /* synthetic */ C83499i(C83490ae aeVar, String str) {
        this.f227663a = aeVar;
        this.f227664b = str;
    }

    public final void run() {
        C83490ae aeVar = this.f227663a;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(this.f227664b);
        if (adVar != null) {
            aeVar.mo76828d(adVar, C89849ae.ACETONE_OVERLAY_ATTACHED_IN_BACKGROUND_MODE);
        }
    }
}
