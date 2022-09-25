package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131656f;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4541l.C59326i;
import java.nio.charset.Charset;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bw */
/* compiled from: PG */
public final /* synthetic */ class C124097bw implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C124099by f342748a;

    /* renamed from: b */
    public final /* synthetic */ C123623b f342749b;

    /* renamed from: c */
    public final /* synthetic */ int f342750c;

    /* renamed from: d */
    public final /* synthetic */ C53190es f342751d;

    /* renamed from: e */
    public final /* synthetic */ AccountId f342752e;

    /* renamed from: f */
    public final /* synthetic */ Instant f342753f;

    /* renamed from: g */
    public final /* synthetic */ C58480gp f342754g;

    public /* synthetic */ C124097bw(C124099by byVar, C123623b bVar, int i, C53190es esVar, AccountId accountId, Instant instant, C58480gp gpVar) {
        this.f342748a = byVar;
        this.f342749b = bVar;
        this.f342750c = i;
        this.f342751d = esVar;
        this.f342752e = accountId;
        this.f342753f = instant;
        this.f342754g = gpVar;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        C124099by byVar = this.f342748a;
        C123623b bVar = this.f342749b;
        int i = this.f342750c;
        C53190es esVar = this.f342751d;
        AccountId accountId = this.f342752e;
        Instant instant = this.f342753f;
        C58480gp gpVar = this.f342754g;
        String c = C131656f.m214101c(esVar);
        C59326i iVar = C59326i.f157517e;
        byte[] byteArray = esVar.toByteArray();
        bVar.f341552d.mo106070n(bfVar, i, c, esVar, iVar.mo56837l(byteArray, byteArray.length).getBytes(Charset.defaultCharset()));
        byVar.f342758c.mo106290c(i, byVar.f342756a, accountId, C131656f.m214101c(esVar), instant, gpVar, bfVar);
    }
}
