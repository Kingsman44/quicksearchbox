package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.t */
/* compiled from: PG */
public final /* synthetic */ class C83510t implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227687a;

    /* renamed from: b */
    public final /* synthetic */ String f227688b;

    public /* synthetic */ C83510t(C83490ae aeVar, String str) {
        this.f227687a = aeVar;
        this.f227688b = str;
    }

    public final void run() {
        C83490ae aeVar = this.f227687a;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(this.f227688b);
        if (adVar != null) {
            aeVar.mo76829e(adVar, C89849ae.ACETONE_OVERLAY_ATTACHED_TO_WINDOW);
        }
    }
}
