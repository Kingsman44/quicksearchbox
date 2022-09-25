package com.google.android.apps.gsa.staticplugins.p7686co.p7689c;

import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.c.c */
/* compiled from: PG */
public final /* synthetic */ class C98258c implements C86091a {

    /* renamed from: a */
    public final /* synthetic */ C118561t f274356a;

    public /* synthetic */ C98258c(C118561t tVar) {
        this.f274356a = tVar;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        C118561t tVar = this.f274356a;
        C59071e eVar = C98264i.f274366a;
        if (z) {
            C118522by byVar = C118522by.PROACTIVE_CONSISTENCY_CHECK;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            long j = C98264i.f274367b;
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 2;
            agVar.f328823c = j;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328821a |= 8;
            agVar2.f328825e = true;
            tVar.mo103754e(byVar, (C118472ag) afVar.build());
        }
    }
}
