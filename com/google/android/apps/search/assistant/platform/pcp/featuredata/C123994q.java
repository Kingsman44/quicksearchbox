package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import android.content.ContentValues;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j;
import com.google.android.apps.search.assistant.platform.pcp.validity.C124169r;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.q */
/* compiled from: PG */
public final /* synthetic */ class C123994q implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ ContentValues f342460a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f342461b;

    /* renamed from: c */
    public final /* synthetic */ Optional f342462c;

    /* renamed from: d */
    public final /* synthetic */ AccountId f342463d;

    /* renamed from: e */
    public final /* synthetic */ String f342464e;

    /* renamed from: f */
    public final /* synthetic */ long f342465f;

    /* renamed from: g */
    public final /* synthetic */ C58480gp f342466g;

    public /* synthetic */ C123994q(ContentValues contentValues, C58485gu guVar, Optional optional, AccountId accountId, String str, long j, C58480gp gpVar) {
        this.f342460a = contentValues;
        this.f342461b = guVar;
        this.f342462c = optional;
        this.f342463d = accountId;
        this.f342464e = str;
        this.f342465f = j;
        this.f342466g = gpVar;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        int i;
        C58480gp gpVar;
        ContentValues contentValues = this.f342460a;
        C58485gu guVar = this.f342461b;
        Optional optional = this.f342462c;
        AccountId accountId = this.f342463d;
        String str = this.f342464e;
        long j = this.f342465f;
        C58480gp gpVar2 = this.f342466g;
        bfVar.mo45931c("SharedProactiveData", contentValues, 5);
        int size = guVar.size();
        int i2 = 0;
        while (i2 < size) {
            C53306j jVar = (C53306j) guVar.get(i2);
            if (optional.isPresent()) {
                C48952az azVar = (C48952az) optional.get();
                C124169r h = C124169r.m203613h(Optional.m71637of(accountId), str, 100005, jVar.f139793X, azVar);
                i = i2;
                gpVar = gpVar2;
                C124124j.m203548b(jVar, str, 100005, azVar, false, j, bfVar);
                gpVar.mo55395g(h);
            } else {
                i = i2;
                gpVar = gpVar2;
                C124124j.m203548b(jVar, str, 100005, (C48952az) null, true, j, bfVar);
            }
            i2 = i + 1;
            C42847bf bfVar2 = bfVar;
            gpVar2 = gpVar;
        }
    }
}
