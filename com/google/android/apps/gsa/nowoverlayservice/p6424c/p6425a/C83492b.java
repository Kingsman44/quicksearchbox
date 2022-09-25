package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.C60343p;
import com.google.common.p4552o.C60522t;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C83492b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227647a;

    /* renamed from: b */
    public final /* synthetic */ String f227648b;

    /* renamed from: c */
    public final /* synthetic */ String f227649c;

    public /* synthetic */ C83492b(C83490ae aeVar, String str, String str2) {
        this.f227647a = aeVar;
        this.f227648b = str;
        this.f227649c = str2;
    }

    public final void run() {
        C83490ae aeVar = this.f227647a;
        String str = this.f227648b;
        String str2 = this.f227649c;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(str);
        if (adVar != null) {
            C60343p pVar = adVar.f227639c;
            pVar.copyOnWrite();
            C60522t tVar = (C60522t) pVar.instance;
            C60522t tVar2 = C60522t.f163843r;
            str2.getClass();
            tVar.f163845a |= 128;
            tVar.f163853i = str2;
            aeVar.mo76828d(adVar, C89849ae.ACETONE_OVERLAY_HEADER_BINDING_COMPLETE);
        }
    }
}
