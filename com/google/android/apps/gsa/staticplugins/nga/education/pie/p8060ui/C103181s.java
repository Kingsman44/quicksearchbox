package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80186ag;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80187ah;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80202aw;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80209bc;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80210bd;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80271z;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.s */
/* compiled from: PG */
public final /* synthetic */ class C103181s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C103188z f287915a;

    /* renamed from: b */
    public final /* synthetic */ C80271z f287916b;

    public /* synthetic */ C103181s(C103188z zVar, C80271z zVar2) {
        this.f287915a = zVar;
        this.f287916b = zVar2;
    }

    public final void run() {
        C103188z zVar = this.f287915a;
        zVar.f287929c.mo93574n(this.f287916b.f220277c);
        C103032a aVar = zVar.f287929c;
        C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
        C80209bc bcVar = (C80209bc) C80210bd.f220065c.createBuilder();
        C80187ah ahVar = zVar.f287927a.f220145g;
        if (ahVar == null) {
            ahVar = C80187ah.f220007e;
        }
        C80186ag agVar = (C80186ag) ahVar.toBuilder();
        C80187ah ahVar2 = zVar.f287927a.f220145g;
        if (ahVar2 == null) {
            ahVar2 = C80187ah.f220007e;
        }
        int i = ahVar2.f220010b;
        agVar.copyOnWrite();
        C80187ah ahVar3 = (C80187ah) agVar.instance;
        ahVar3.f220009a |= 1;
        ahVar3.f220010b = i + 1;
        C80187ah ahVar4 = (C80187ah) agVar.build();
        bcVar.copyOnWrite();
        C80210bd bdVar = (C80210bd) bcVar.instance;
        ahVar4.getClass();
        bdVar.f220068b = ahVar4;
        bdVar.f220067a |= 1;
        C80210bd bdVar2 = (C80210bd) bcVar.build();
        awVar.copyOnWrite();
        C80203ax axVar = (C80203ax) awVar.instance;
        bdVar2.getClass();
        axVar.f220050b = bdVar2;
        axVar.f220049a = 11;
        aVar.mo93573m((C80203ax) awVar.build());
        zVar.f287931e.mo93658c(false);
    }
}
