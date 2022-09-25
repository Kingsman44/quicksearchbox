package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C83486aa implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227629a;

    /* renamed from: b */
    public final /* synthetic */ String f227630b;

    public /* synthetic */ C83486aa(C83490ae aeVar, String str) {
        this.f227629a = aeVar;
        this.f227630b = str;
    }

    public final void run() {
        C83490ae aeVar = this.f227629a;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(this.f227630b);
        if (adVar != null) {
            aeVar.mo76824C(adVar, 4, 3, C89849ae.ACETONE_OVERLAY_CONTROLLER_PAUSE);
        }
    }
}
