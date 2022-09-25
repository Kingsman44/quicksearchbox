package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80186ag;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80187ah;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80202aw;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80237cd;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80238ce;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80271z;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.t */
/* compiled from: PG */
public final /* synthetic */ class C103182t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C103188z f287917a;

    /* renamed from: b */
    public final /* synthetic */ C80271z f287918b;

    public /* synthetic */ C103182t(C103188z zVar, C80271z zVar2) {
        this.f287917a = zVar;
        this.f287918b = zVar2;
    }

    public final void run() {
        C103188z zVar = this.f287917a;
        C80271z zVar2 = this.f287918b;
        zVar.f287929c.mo93576p(zVar2.f220277c);
        String str = zVar2.f220277c;
        C103032a aVar = zVar.f287929c;
        C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
        C80237cd cdVar = (C80237cd) C80238ce.f220128c.createBuilder();
        C80187ah ahVar = zVar.f287927a.f220145g;
        if (ahVar == null) {
            ahVar = C80187ah.f220007e;
        }
        C80186ag agVar = (C80186ag) ahVar.toBuilder();
        agVar.copyOnWrite();
        C80187ah ahVar2 = (C80187ah) agVar.instance;
        str.getClass();
        ahVar2.f220009a |= 2;
        ahVar2.f220011c = str;
        agVar.copyOnWrite();
        C80187ah ahVar3 = (C80187ah) agVar.instance;
        str.getClass();
        ahVar3.f220009a |= 4;
        ahVar3.f220012d = str;
        C80187ah ahVar4 = zVar.f287927a.f220145g;
        if (ahVar4 == null) {
            ahVar4 = C80187ah.f220007e;
        }
        int i = ahVar4.f220010b;
        agVar.copyOnWrite();
        C80187ah ahVar5 = (C80187ah) agVar.instance;
        ahVar5.f220009a |= 1;
        ahVar5.f220010b = i + 1;
        C80187ah ahVar6 = (C80187ah) agVar.build();
        cdVar.copyOnWrite();
        C80238ce ceVar = (C80238ce) cdVar.instance;
        ahVar6.getClass();
        ceVar.f220131b = ahVar6;
        ceVar.f220130a |= 1;
        C80238ce ceVar2 = (C80238ce) cdVar.build();
        awVar.copyOnWrite();
        C80203ax axVar = (C80203ax) awVar.instance;
        ceVar2.getClass();
        axVar.f220050b = ceVar2;
        axVar.f220049a = 10;
        aVar.mo93573m((C80203ax) awVar.build());
        zVar.f287931e.mo93658c(false);
    }
}
