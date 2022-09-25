package com.google.android.apps.gsa.configuration;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public class PhenotypeBroadcastReceiver extends C74468c {

    /* renamed from: a */
    public C69464a f208546a;

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(6);
        C58976aa aaVar = C58975e.f156826a;
        mo70783a(context);
        C118561t tVar = ((C74464a) this.f208546a.mo17428b()).f208548b;
        C118522by byVar = C118522by.FETCH_CONFIGS_FROM_PHENOTYPE;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = 0;
        long j = C74464a.f208547a;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328821a |= 2;
        agVar2.f328823c = j;
        tVar.mo103754e(byVar, (C118472ag) afVar.build());
    }
}
