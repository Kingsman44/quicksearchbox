package com.google.android.apps.gsa.search.core;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gcoreclient.p1763h.p1769c.C21557b;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public class GmsPackageWatcher extends C85629an {

    /* renamed from: a */
    public C69464a f229539a;

    /* renamed from: b */
    public C118561t f229540b;

    /* renamed from: c */
    private final IntentFilter f229541c;

    public GmsPackageWatcher() {
        IntentFilter intentFilter = new IntentFilter();
        this.f229541c = intentFilter;
        intentFilter.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
    }

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(17);
        mo79109a(context);
        Uri data = intent.getData();
        if (data != null) {
            String encodedSchemeSpecificPart = data.getEncodedSchemeSpecificPart();
            C21557b bVar = (C21557b) this.f229539a.mo17428b();
            if ("com.google.android.gms".equals(encodedSchemeSpecificPart) && this.f229541c.matchAction(intent.getAction())) {
                C118561t tVar = this.f229540b;
                C118522by byVar = C118522by.FETCH_OPT_IN_STATUSES;
                C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                afVar.copyOnWrite();
                C118472ag agVar = (C118472ag) afVar.instance;
                agVar.f328821a |= 1;
                agVar.f328822b = 2000;
                afVar.copyOnWrite();
                C118472ag agVar2 = (C118472ag) afVar.instance;
                agVar2.f328824d = 1;
                agVar2.f328821a |= 4;
                tVar.mo103754e(byVar, (C118472ag) afVar.build());
            }
        }
    }
}
