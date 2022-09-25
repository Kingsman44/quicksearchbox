package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.C74723ca;
import com.google.android.apps.gsa.nga.api.a.ab;
import com.google.android.apps.gsa.nga.api.a.ad;
import com.google.android.apps.gsa.nga.api.p5883a.C74679dm;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.p2904c.C37672hs;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.ao */
/* compiled from: PG */
public final /* synthetic */ class C81398ao implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C81400aq f222758a;

    /* renamed from: b */
    public final /* synthetic */ C37672hs f222759b;

    /* renamed from: c */
    public final /* synthetic */ int f222760c;

    public /* synthetic */ C81398ao(C81400aq aqVar, C37672hs hsVar, int i) {
        this.f222758a = aqVar;
        this.f222759b = hsVar;
        this.f222760c = i;
    }

    public final void run() {
        C81400aq aqVar = this.f222758a;
        C37672hs hsVar = this.f222759b;
        int i = this.f222760c;
        C74723ca caVar = aqVar.f222764c;
        ab createBuilder = ad.d.createBuilder();
        createBuilder.copyOnWrite();
        hsVar.getClass();
        createBuilder.instance.c = hsVar;
        createBuilder.copyOnWrite();
        ad adVar = createBuilder.instance;
        adVar.b = Integer.valueOf(C74679dm.m120752b(i));
        adVar.a = 6;
        caVar.mo71095d(createBuilder.build());
    }
}
