package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.C60343p;
import com.google.common.p4552o.C60522t;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.v */
/* compiled from: PG */
public final /* synthetic */ class C83512v implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83490ae f227691a;

    /* renamed from: b */
    public final /* synthetic */ String f227692b;

    /* renamed from: c */
    public final /* synthetic */ Optional f227693c;

    public /* synthetic */ C83512v(C83490ae aeVar, String str, Optional optional) {
        this.f227691a = aeVar;
        this.f227692b = str;
        this.f227693c = optional;
    }

    public final void run() {
        C83490ae aeVar = this.f227691a;
        String str = this.f227692b;
        Optional optional = this.f227693c;
        C83489ad adVar = (C83489ad) aeVar.f227645d.get(str);
        if (adVar != null && !optional.isEmpty()) {
            C60343p pVar = adVar.f227639c;
            long seconds = ((Duration) optional.get()).getSeconds();
            pVar.copyOnWrite();
            C60522t tVar = (C60522t) pVar.instance;
            C60522t tVar2 = C60522t.f163843r;
            tVar.f163845a |= 32768;
            tVar.f163861q = seconds;
        }
    }
}
