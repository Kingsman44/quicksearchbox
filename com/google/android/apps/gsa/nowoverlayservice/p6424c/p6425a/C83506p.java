package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.C60343p;
import com.google.common.p4552o.C60522t;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.p */
/* compiled from: PG */
public final /* synthetic */ class C83506p implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227679a;

    /* renamed from: b */
    public final /* synthetic */ String f227680b;

    public /* synthetic */ C83506p(C83490ae aeVar, String str) {
        this.f227679a = aeVar;
        this.f227680b = str;
    }

    public final void run() {
        C83489ad adVar = (C83489ad) this.f227679a.f227645d.get(this.f227680b);
        if (adVar != null) {
            C60343p pVar = adVar.f227639c;
            pVar.copyOnWrite();
            C60522t tVar = (C60522t) pVar.instance;
            C60522t tVar2 = C60522t.f163843r;
            tVar.f163845a |= 256;
            tVar.f163854j = true;
        }
    }
}
