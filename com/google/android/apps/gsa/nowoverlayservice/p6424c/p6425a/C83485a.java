package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.C60343p;
import com.google.common.p4552o.C60522t;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C83485a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227626a;

    /* renamed from: b */
    public final /* synthetic */ String f227627b;

    /* renamed from: c */
    public final /* synthetic */ int f227628c;

    public /* synthetic */ C83485a(C83490ae aeVar, String str, int i) {
        this.f227626a = aeVar;
        this.f227627b = str;
        this.f227628c = i;
    }

    public final void run() {
        C83490ae aeVar = this.f227626a;
        String str = this.f227627b;
        int i = this.f227628c;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(str);
        if (adVar != null) {
            aeVar.mo76825F(adVar, C89849ae.ACETONE_OVERLAY_FLOW_CANCELED, 7);
            return;
        }
        C83489ad a = aeVar.mo76827a(str, C83490ae.f227643b);
        C60343p pVar = a.f227639c;
        pVar.copyOnWrite();
        C60522t tVar = (C60522t) pVar.instance;
        C60522t tVar2 = C60522t.f163843r;
        tVar.f163858n = C83490ae.m132904E(i) - 1;
        tVar.f163845a |= 4096;
        aeVar.mo76829e(a, C89849ae.ACETONE_OPEN_OVERLAY_START);
    }
}
