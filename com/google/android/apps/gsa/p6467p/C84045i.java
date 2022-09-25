package com.google.android.apps.gsa.p6467p;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6884y.C87379h;
import com.google.android.apps.search.googleapp.incognito.education.p10326b.C136259a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;

/* renamed from: com.google.android.apps.gsa.p.i */
/* compiled from: PG */
public final /* synthetic */ class C84045i implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C84053q f228922a;

    /* renamed from: b */
    public final /* synthetic */ C87379h f228923b;

    /* renamed from: c */
    public final /* synthetic */ C23052c f228924c;

    /* renamed from: d */
    public final /* synthetic */ C84041e f228925d;

    /* renamed from: e */
    public final /* synthetic */ AccountId f228926e;

    /* renamed from: f */
    public final /* synthetic */ int f228927f;

    public /* synthetic */ C84045i(C84053q qVar, C87379h hVar, C23052c cVar, C84041e eVar, int i, AccountId accountId) {
        this.f228922a = qVar;
        this.f228923b = hVar;
        this.f228924c = cVar;
        this.f228925d = eVar;
        this.f228927f = i;
        this.f228926e = accountId;
    }

    public final void run() {
        C84053q qVar = this.f228922a;
        C87379h hVar = this.f228923b;
        C23052c cVar = this.f228924c;
        C84041e eVar = this.f228925d;
        int i = this.f228927f;
        AccountId accountId = this.f228926e;
        hVar.mo81039g(cVar, 24963, new C84046j(qVar, eVar, hVar, i));
        C136259a aVar = qVar.f228938a;
        Intent intent = new Intent();
        intent.addFlags(8454144);
        intent.setClassName(aVar.f371065a, "com.google.android.apps.search.googleapp.incognito.education.IncognitoTransparentActivity");
        C45963aa.m82131a(intent, accountId);
        hVar.mo81040h(intent, 24963);
    }
}
