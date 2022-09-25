package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.C74723ca;
import com.google.android.apps.gsa.nga.api.a.ab;
import com.google.android.apps.gsa.nga.api.a.ad;
import com.google.android.apps.gsa.nga.api.p5883a.C74676cj;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.p2904c.C37672hs;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.an */
/* compiled from: PG */
public final /* synthetic */ class C81397an implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C81400aq f222755a;

    /* renamed from: b */
    public final /* synthetic */ C37672hs f222756b;

    /* renamed from: c */
    public final /* synthetic */ int f222757c;

    public /* synthetic */ C81397an(C81400aq aqVar, C37672hs hsVar, int i) {
        this.f222755a = aqVar;
        this.f222756b = hsVar;
        this.f222757c = i;
    }

    public final void run() {
        C81400aq aqVar = this.f222755a;
        C37672hs hsVar = this.f222756b;
        int i = this.f222757c;
        C74723ca caVar = aqVar.f222764c;
        ab createBuilder = ad.d.createBuilder();
        createBuilder.copyOnWrite();
        hsVar.getClass();
        createBuilder.instance.c = hsVar;
        createBuilder.copyOnWrite();
        ad adVar = createBuilder.instance;
        adVar.b = Integer.valueOf(C74676cj.m120747b(i));
        adVar.a = 7;
        caVar.mo71095d(createBuilder.build());
    }
}
