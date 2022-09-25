package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3994s.p3995a.C53228gc;
import com.google.assistant.p3994s.p3995a.C53238gm;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4522b.C58480gp;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.a */
/* compiled from: PG */
public final /* synthetic */ class C123798a implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C123910h f341990a;

    /* renamed from: b */
    public final /* synthetic */ C123623b f341991b;

    /* renamed from: c */
    public final /* synthetic */ C53245gt f341992c;

    /* renamed from: d */
    public final /* synthetic */ AccountId f341993d;

    /* renamed from: e */
    public final /* synthetic */ C58480gp f341994e;

    public /* synthetic */ C123798a(C123910h hVar, C123623b bVar, C53245gt gtVar, AccountId accountId, C58480gp gpVar) {
        this.f341990a = hVar;
        this.f341991b = bVar;
        this.f341992c = gtVar;
        this.f341993d = accountId;
        this.f341994e = gpVar;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        C123910h hVar = this.f341990a;
        C123623b bVar = this.f341991b;
        C53245gt gtVar = this.f341992c;
        AccountId accountId = this.f341993d;
        C58480gp gpVar = this.f341994e;
        C53228gc gcVar = (C53228gc) gtVar.toBuilder();
        gcVar.copyOnWrite();
        C53245gt gtVar2 = (C53245gt) gcVar.instance;
        gtVar2.f139578l = null;
        gtVar2.f139567a &= -513;
        C62942bv build = gcVar.build();
        C53228gc gcVar2 = (C53228gc) gtVar.toBuilder();
        gcVar2.copyOnWrite();
        C53245gt gtVar3 = (C53245gt) gcVar2.instance;
        gtVar3.f139578l = null;
        gtVar3.f139567a &= -513;
        bVar.f341552d.mo106070n(bfVar, 1, "weather_current", build, C123910h.m203208d(gcVar2.build()));
        hVar.f342261d.mo106289b(1, hVar.f342259b, accountId, "weather_current", gpVar, bfVar);
        if ((gtVar.f139567a & 512) != 0) {
            C53228gc gcVar3 = (C53228gc) C53245gt.f139564n.createBuilder();
            C53238gm gmVar = gtVar.f139578l;
            if (gmVar == null) {
                gmVar = C53238gm.f139535e;
            }
            gcVar3.copyOnWrite();
            C53245gt gtVar4 = (C53245gt) gcVar3.instance;
            gmVar.getClass();
            gtVar4.f139578l = gmVar;
            gtVar4.f139567a |= 512;
            C53245gt gtVar5 = (C53245gt) gcVar3.build();
            bVar.f341552d.mo106070n(bfVar, 100007, "weather_alert_current", gtVar5, C123910h.m203208d(gtVar5));
            hVar.f342261d.mo106289b(100007, hVar.f342259b, accountId, "weather_alert_current", gpVar, bfVar);
        }
    }
}
