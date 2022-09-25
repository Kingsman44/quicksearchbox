package com.google.android.apps.gsa.staticplugins.opa.worker;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3994s.p3995a.C53333k;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.common.p4522b.C58480gp;
import com.google.protobuf.MessageLite;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.ab */
/* compiled from: PG */
public final /* synthetic */ class C114255ab implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C114261ah f316813a;

    /* renamed from: b */
    public final /* synthetic */ C53333k f316814b;

    /* renamed from: c */
    public final /* synthetic */ AccountId f316815c;

    /* renamed from: d */
    public final /* synthetic */ String f316816d;

    /* renamed from: e */
    public final /* synthetic */ C58480gp f316817e;

    /* renamed from: f */
    public final /* synthetic */ C123623b f316818f;

    /* renamed from: g */
    public final /* synthetic */ MessageLite f316819g;

    /* renamed from: h */
    public final /* synthetic */ C53366lf f316820h;

    public /* synthetic */ C114255ab(C114261ah ahVar, C53333k kVar, AccountId accountId, String str, C58480gp gpVar, C123623b bVar, MessageLite messageLite, C53366lf lfVar) {
        this.f316813a = ahVar;
        this.f316814b = kVar;
        this.f316815c = accountId;
        this.f316816d = str;
        this.f316817e = gpVar;
        this.f316818f = bVar;
        this.f316819g = messageLite;
        this.f316820h = lfVar;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        C114261ah ahVar = this.f316813a;
        C53333k kVar = this.f316814b;
        AccountId accountId = this.f316815c;
        String str = this.f316816d;
        C58480gp gpVar = this.f316817e;
        C123623b bVar = this.f316818f;
        MessageLite messageLite = this.f316819g;
        C53366lf lfVar = this.f316820h;
        ahVar.f316844n.mo106289b(kVar.f139956bk, ahVar.f316834b, accountId, str, gpVar, bfVar);
        bVar.f341552d.mo106070n(bfVar, kVar.f139956bk, str, messageLite, lfVar.f140040e.getBytes(StandardCharsets.UTF_8));
    }
}
