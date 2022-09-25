package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.C60343p;
import com.google.common.p4552o.C60522t;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.z */
/* compiled from: PG */
public final /* synthetic */ class C83516z implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227701a;

    /* renamed from: b */
    public final /* synthetic */ String f227702b;

    public /* synthetic */ C83516z(C83490ae aeVar, String str) {
        this.f227701a = aeVar;
        this.f227702b = str;
    }

    public final void run() {
        C83490ae aeVar = this.f227701a;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(this.f227702b);
        if (adVar != null) {
            C60343p pVar = adVar.f227639c;
            pVar.copyOnWrite();
            C60522t tVar = (C60522t) pVar.instance;
            C60522t tVar2 = C60522t.f163843r;
            tVar.f163857m = 3;
            tVar.f163845a |= 2048;
            aeVar.mo76828d(adVar, C89849ae.ACETONE_OVERLAY_TRANSITION_COMPLETE);
        }
    }
}
