package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.C60343p;
import com.google.common.p4552o.C60522t;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C83487ab implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227631a;

    /* renamed from: b */
    public final /* synthetic */ String f227632b;

    /* renamed from: c */
    public final /* synthetic */ boolean f227633c;

    /* renamed from: d */
    public final /* synthetic */ int f227634d;

    /* renamed from: e */
    public final /* synthetic */ boolean f227635e;

    /* renamed from: f */
    public final /* synthetic */ boolean f227636f;

    public /* synthetic */ C83487ab(C83490ae aeVar, String str, boolean z, int i, boolean z2, boolean z3) {
        this.f227631a = aeVar;
        this.f227632b = str;
        this.f227633c = z;
        this.f227634d = i;
        this.f227635e = z2;
        this.f227636f = z3;
    }

    public final void run() {
        C83490ae aeVar = this.f227631a;
        String str = this.f227632b;
        boolean z = this.f227633c;
        int i = this.f227634d;
        boolean z2 = this.f227635e;
        boolean z3 = this.f227636f;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(str);
        if (adVar != null) {
            C60343p pVar = adVar.f227639c;
            pVar.copyOnWrite();
            C60522t tVar = (C60522t) pVar.instance;
            C60522t tVar2 = C60522t.f163843r;
            boolean z4 = true;
            tVar.f163845a |= 1;
            tVar.f163846b = z;
            if (i == 0) {
                aeVar.mo76828d(adVar, C89849ae.ACETONE_OVERLAY_ATTACHED_NOOP_MODE);
                return;
            }
            int i2 = i & 1;
            boolean z5 = (i & 4) != 0;
            boolean z6 = (i & 2) != 0;
            boolean z7 = (i & 8) != 0;
            C60343p pVar2 = adVar.f227639c;
            pVar2.copyOnWrite();
            C60522t tVar3 = (C60522t) pVar2.instance;
            tVar3.f163845a |= 2;
            if (1 != i2) {
                z4 = false;
            }
            tVar3.f163847c = z4;
            pVar2.copyOnWrite();
            C60522t tVar4 = (C60522t) pVar2.instance;
            tVar4.f163845a |= 4;
            tVar4.f163848d = z5;
            pVar2.copyOnWrite();
            C60522t tVar5 = (C60522t) pVar2.instance;
            tVar5.f163845a |= 8;
            tVar5.f163849e = z6;
            pVar2.copyOnWrite();
            C60522t tVar6 = (C60522t) pVar2.instance;
            tVar6.f163845a |= 16;
            tVar6.f163850f = z7;
            pVar2.copyOnWrite();
            C60522t tVar7 = (C60522t) pVar2.instance;
            tVar7.f163845a |= 32;
            tVar7.f163851g = z2;
            pVar2.copyOnWrite();
            C60522t tVar8 = (C60522t) pVar2.instance;
            tVar8.f163845a |= 64;
            tVar8.f163852h = z3;
        }
    }
}
