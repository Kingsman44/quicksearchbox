package com.google.android.apps.gsa.configuration;

import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.configuration.a */
/* compiled from: PG */
public final class C74464a {

    /* renamed from: a */
    public static final long f208547a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public final C118561t f208548b;

    public C74464a(C118561t tVar) {
        this.f208548b = tVar;
    }

    /* renamed from: a */
    public final void mo70780a() {
        this.f208548b.mo103752c(C118522by.SEND_GSA_HOME_REQUEST);
        this.f208548b.mo103754e(C118522by.SEND_GSA_HOME_REQUEST, C118472ag.f328819i);
    }

    /* renamed from: b */
    public final void mo70781b() {
        C118561t tVar = this.f208548b;
        C118522by byVar = C118522by.SEND_GSA_HOME_REQUEST;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = 0;
        long j = f208547a;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328821a |= 2;
        agVar2.f328823c = j;
        tVar.mo103754e(byVar, (C118472ag) afVar.build());
    }
}
