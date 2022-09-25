package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.C60343p;
import com.google.common.p4552o.C60522t;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.d */
/* compiled from: PG */
public final /* synthetic */ class C83494d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227652a;

    /* renamed from: b */
    public final /* synthetic */ String f227653b;

    /* renamed from: c */
    public final /* synthetic */ int f227654c;

    public /* synthetic */ C83494d(C83490ae aeVar, String str, int i) {
        this.f227652a = aeVar;
        this.f227653b = str;
        this.f227654c = i;
    }

    public final void run() {
        C83490ae aeVar = this.f227652a;
        String str = this.f227653b;
        int i = this.f227654c;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(str);
        if (adVar == null) {
            adVar = aeVar.mo76827a(str, C83490ae.f227643b);
        } else if (!((C60522t) adVar.f227639c.instance).f163856l) {
            aeVar.mo76825F(adVar, C89849ae.ACETONE_OVERLAY_FLOW_CANCELED, 6);
            return;
        }
        C60343p pVar = adVar.f227639c;
        pVar.copyOnWrite();
        C60522t tVar = (C60522t) pVar.instance;
        C60522t tVar2 = C60522t.f163843r;
        tVar.f163858n = C83490ae.m132904E(i) - 1;
        tVar.f163845a |= 4096;
        aeVar.mo76829e(adVar, C89849ae.ACETONE_CLOSE_OVERLAY_START);
    }
}
