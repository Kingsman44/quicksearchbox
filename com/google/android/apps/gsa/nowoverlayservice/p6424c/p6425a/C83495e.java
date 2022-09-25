package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C83495e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227655a;

    /* renamed from: b */
    public final /* synthetic */ String f227656b;

    public /* synthetic */ C83495e(C83490ae aeVar, String str) {
        this.f227655a = aeVar;
        this.f227656b = str;
    }

    public final void run() {
        C83490ae aeVar = this.f227655a;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(this.f227656b);
        if (adVar != null) {
            aeVar.mo76826I(adVar, C89885b.ACETONE_ATTACH_BAD_TOKEN_ERROR);
        }
    }
}
