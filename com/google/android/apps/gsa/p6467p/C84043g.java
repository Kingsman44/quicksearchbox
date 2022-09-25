package com.google.android.apps.gsa.p6467p;

import com.google.android.apps.gsa.search.core.p6884y.C87379h;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.p.g */
/* compiled from: PG */
public final /* synthetic */ class C84043g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C84053q f228915a;

    /* renamed from: b */
    public final /* synthetic */ C22871g f228916b;

    /* renamed from: c */
    public final /* synthetic */ C87379h f228917c;

    /* renamed from: d */
    public final /* synthetic */ C23052c f228918d;

    /* renamed from: e */
    public final /* synthetic */ C84041e f228919e;

    /* renamed from: f */
    public final /* synthetic */ int f228920f;

    public /* synthetic */ C84043g(C84053q qVar, C22871g gVar, C87379h hVar, C23052c cVar, C84041e eVar, int i) {
        this.f228915a = qVar;
        this.f228916b = gVar;
        this.f228917c = hVar;
        this.f228918d = cVar;
        this.f228919e = eVar;
        this.f228920f = i;
    }

    public final C60870cx apply(Object obj) {
        C84053q qVar = this.f228915a;
        C22871g gVar = this.f228916b;
        C87379h hVar = this.f228917c;
        C23052c cVar = this.f228918d;
        C84041e eVar = this.f228919e;
        int i = this.f228920f;
        C84052p pVar = (C84052p) obj;
        pVar.getClass();
        AccountId b = pVar.mo77497b();
        if (!pVar.mo77496a().f371059b) {
            return C47633f.m84733g(gVar.mo28207g("Launch modal on Event Bus", new C84045i(qVar, hVar, cVar, eVar, i, b)));
        }
        eVar.mo77504b();
        qVar.mo77507b(hVar, i, eVar);
        return C60866ct.f164955a;
    }
}
