package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80202aw;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80218bl;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80219bm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80235cb;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80236cc;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80271z;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.u */
/* compiled from: PG */
public final /* synthetic */ class C103183u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C103188z f287919a;

    /* renamed from: b */
    public final /* synthetic */ C80271z f287920b;

    public /* synthetic */ C103183u(C103188z zVar, C80271z zVar2) {
        this.f287919a = zVar;
        this.f287920b = zVar2;
    }

    public final void run() {
        C103188z zVar = this.f287919a;
        C80271z zVar2 = this.f287920b;
        C103032a aVar = zVar.f287929c;
        C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
        C80235cb cbVar = (C80235cb) C80236cc.f220124c.createBuilder();
        C80218bl blVar = (C80218bl) C80219bm.f220092c.createBuilder();
        int hashCode = zVar2.f220277c.hashCode();
        blVar.copyOnWrite();
        C80219bm bmVar = (C80219bm) blVar.instance;
        bmVar.f220094a |= 1;
        bmVar.f220095b = hashCode;
        cbVar.copyOnWrite();
        C80236cc ccVar = (C80236cc) cbVar.instance;
        C80219bm bmVar2 = (C80219bm) blVar.build();
        bmVar2.getClass();
        ccVar.f220127b = bmVar2;
        ccVar.f220126a = 2;
        awVar.copyOnWrite();
        C80203ax axVar = (C80203ax) awVar.instance;
        C80236cc ccVar2 = (C80236cc) cbVar.build();
        ccVar2.getClass();
        axVar.f220050b = ccVar2;
        axVar.f220049a = 8;
        aVar.mo93573m((C80203ax) awVar.build());
        zVar.f287931e.mo93658c(false);
    }
}
