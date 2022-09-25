package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.p9351a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.p9351a.C124248k;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.c.a.g */
/* compiled from: PG */
public final /* synthetic */ class C124244g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124248k f343047a;

    /* renamed from: b */
    public final /* synthetic */ String f343048b;

    /* renamed from: c */
    public final /* synthetic */ AccountId f343049c;

    /* renamed from: d */
    public final /* synthetic */ C32849cq f343050d;

    public /* synthetic */ C124244g(C124248k kVar, String str, AccountId accountId, C32849cq cqVar) {
        this.f343047a = kVar;
        this.f343048b = str;
        this.f343049c = accountId;
        this.f343050d = cqVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124248k kVar = this.f343047a;
        String str = this.f343048b;
        AccountId accountId = this.f343049c;
        C32849cq cqVar = this.f343050d;
        if (kVar.f343061e.containsKey(str)) {
            ((C59052c) ((C59052c) C124248k.f343057a.mo56226d()).mo56372aa(36132)).mo56389s("Context access session for id: %s is already connected.", str);
            return C60866ct.f164955a;
        }
        kVar.f343061e.put(str, ((C124248k.C124249a) C47245e.m84045a(kVar.f343058b, C124248k.C124249a.class, accountId)).mo106350eV().mo38218a("CrossDevice", cqVar, new C124247j(kVar, str)));
        return C60866ct.f164955a;
    }
}
