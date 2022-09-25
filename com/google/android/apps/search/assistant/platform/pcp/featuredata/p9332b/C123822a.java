package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9332b;

import android.content.ContentValues;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j;
import com.google.android.apps.search.assistant.platform.pcp.validity.C124169r;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.b.a */
/* compiled from: PG */
public final /* synthetic */ class C123822a implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ ContentValues f342058a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f342059b;

    /* renamed from: c */
    public final /* synthetic */ String f342060c;

    /* renamed from: d */
    public final /* synthetic */ C48952az f342061d;

    /* renamed from: e */
    public final /* synthetic */ long f342062e;

    /* renamed from: f */
    public final /* synthetic */ C58480gp f342063f;

    public /* synthetic */ C123822a(ContentValues contentValues, AccountId accountId, String str, C48952az azVar, long j, C58480gp gpVar) {
        this.f342058a = contentValues;
        this.f342059b = accountId;
        this.f342060c = str;
        this.f342061d = azVar;
        this.f342062e = j;
        this.f342063f = gpVar;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        ContentValues contentValues = this.f342058a;
        AccountId accountId = this.f342059b;
        String str = this.f342060c;
        C48952az azVar = this.f342061d;
        long j = this.f342062e;
        C58480gp gpVar = this.f342063f;
        bfVar.mo45931c("SharedProactiveData", contentValues, 5);
        C124169r h = C124169r.m203613h(Optional.m71637of(accountId), str, 100009, 39, azVar);
        C124124j.m203548b(C53306j.BLUECHIP_SMARTSPACE_TNG, str, 100009, azVar, false, j, bfVar);
        gpVar.mo55395g(h);
    }
}
