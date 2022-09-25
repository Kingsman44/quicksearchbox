package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.C60343p;
import com.google.common.p4552o.C60522t;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.x */
/* compiled from: PG */
public final /* synthetic */ class C83514x implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227696a;

    /* renamed from: b */
    public final /* synthetic */ String f227697b;

    /* renamed from: c */
    public final /* synthetic */ boolean f227698c;

    public /* synthetic */ C83514x(C83490ae aeVar, String str, boolean z) {
        this.f227696a = aeVar;
        this.f227697b = str;
        this.f227698c = z;
    }

    public final void run() {
        C83490ae aeVar = this.f227696a;
        String str = this.f227697b;
        boolean z = this.f227698c;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(str);
        if (adVar != null) {
            C60343p pVar = adVar.f227639c;
            int i = true != z ? 3 : 2;
            pVar.copyOnWrite();
            C60522t tVar = (C60522t) pVar.instance;
            C60522t tVar2 = C60522t.f163843r;
            tVar.f163857m = i - 1;
            tVar.f163845a |= 2048;
            aeVar.mo76828d(adVar, C89849ae.ACETONE_OVERLAY_TRANSITION_COMPLETE);
        }
    }
}
