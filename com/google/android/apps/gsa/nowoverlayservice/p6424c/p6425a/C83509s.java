package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.s */
/* compiled from: PG */
public final /* synthetic */ class C83509s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227685a;

    /* renamed from: b */
    public final /* synthetic */ String f227686b;

    public /* synthetic */ C83509s(C83490ae aeVar, String str) {
        this.f227685a = aeVar;
        this.f227686b = str;
    }

    public final void run() {
        C83490ae aeVar = this.f227685a;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(this.f227686b);
        if (adVar != null) {
            aeVar.mo76829e(adVar, C89849ae.ACETONE_OVERLAY_ATTACH_RECREATING_CONTROLLER);
        }
    }
}
