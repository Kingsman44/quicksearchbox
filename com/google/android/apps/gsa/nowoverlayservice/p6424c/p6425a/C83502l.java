package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.C60343p;
import com.google.common.p4552o.C60522t;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.l */
/* compiled from: PG */
public final /* synthetic */ class C83502l implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227669a;

    /* renamed from: b */
    public final /* synthetic */ String f227670b;

    /* renamed from: c */
    public final /* synthetic */ float f227671c;

    /* renamed from: d */
    public final /* synthetic */ int f227672d;

    public /* synthetic */ C83502l(C83490ae aeVar, String str, float f, int i) {
        this.f227669a = aeVar;
        this.f227670b = str;
        this.f227671c = f;
        this.f227672d = i;
    }

    public final void run() {
        C83490ae aeVar = this.f227669a;
        String str = this.f227670b;
        float f = this.f227671c;
        int i = this.f227672d;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(str);
        if (adVar != null) {
            C60343p pVar = adVar.f227639c;
            pVar.copyOnWrite();
            C60522t tVar = (C60522t) pVar.instance;
            C60522t tVar2 = C60522t.f163843r;
            tVar.f163845a |= 16384;
            tVar.f163860p = (double) f;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                C60343p pVar2 = adVar.f227639c;
                pVar2.copyOnWrite();
                C60522t tVar3 = (C60522t) pVar2.instance;
                tVar3.f163859o = 0;
                tVar3.f163845a |= 8192;
            } else if (i2 == 1) {
                C60343p pVar3 = adVar.f227639c;
                pVar3.copyOnWrite();
                C60522t tVar4 = (C60522t) pVar3.instance;
                tVar4.f163859o = 1;
                tVar4.f163845a |= 8192;
            } else if (i2 == 2) {
                C60343p pVar4 = adVar.f227639c;
                pVar4.copyOnWrite();
                C60522t tVar5 = (C60522t) pVar4.instance;
                tVar5.f163859o = 2;
                tVar5.f163845a |= 8192;
            } else if (i2 == 3) {
                C60343p pVar5 = adVar.f227639c;
                pVar5.copyOnWrite();
                C60522t tVar6 = (C60522t) pVar5.instance;
                tVar6.f163859o = 3;
                tVar6.f163845a |= 8192;
            }
        }
    }
}
