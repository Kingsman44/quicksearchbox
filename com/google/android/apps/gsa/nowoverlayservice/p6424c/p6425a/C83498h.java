package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.h */
/* compiled from: PG */
public final /* synthetic */ class C83498h implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227661a;

    /* renamed from: b */
    public final /* synthetic */ String f227662b;

    public /* synthetic */ C83498h(C83490ae aeVar, String str) {
        this.f227661a = aeVar;
        this.f227662b = str;
    }

    public final void run() {
        C83490ae aeVar = this.f227661a;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(this.f227662b);
        if (adVar != null) {
            aeVar.mo76829e(adVar, C89849ae.ACETONE_OVERLAY_ATTACH_RESTORE_SAVED_STATE);
        }
    }
}
