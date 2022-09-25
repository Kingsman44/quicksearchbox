package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124048ad;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124086bm;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124109ch;
import com.google.android.apps.search.assistant.platform.pcp.validity.C124169r;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3994s.p3995a.C53132co;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.MessageLite;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69258x;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.ac */
/* compiled from: PG */
public final /* synthetic */ class C123812ac implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C123819aj f342035a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f342036b;

    /* renamed from: c */
    public final /* synthetic */ long f342037c;

    /* renamed from: d */
    public final /* synthetic */ AccountId f342038d;

    /* renamed from: e */
    public final /* synthetic */ C58480gp f342039e;

    public /* synthetic */ C123812ac(C123819aj ajVar, MessageLite messageLite, long j, AccountId accountId, C58480gp gpVar) {
        this.f342035a = ajVar;
        this.f342036b = messageLite;
        this.f342037c = j;
        this.f342038d = accountId;
        this.f342039e = gpVar;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        Optional optional;
        C58480gp gpVar;
        int i;
        int i2;
        C53306j jVar;
        AccountId accountId;
        C42847bf bfVar2 = bfVar;
        C123819aj ajVar = this.f342035a;
        MessageLite messageLite = this.f342036b;
        long j = this.f342037c;
        AccountId accountId2 = this.f342038d;
        C58480gp gpVar2 = this.f342039e;
        int i3 = 0;
        bfVar2.mo45931c("SharedProactiveData", C123611ad.m202943b(100002, "tips_data_id", messageLite, new byte[0], new byte[0], j), 5);
        int i4 = 100002;
        ajVar.f342055i.mo106284c(100002);
        C58485gu b = C124086bm.m203508a(ajVar.f342050d, accountId2).mo106279b(100002);
        int size = b.size();
        while (i3 < size) {
            C53306j jVar2 = (C53306j) b.get(i3);
            Optional g = C124048ad.m203471a(ajVar.f342050d, accountId2).mo106254g(jVar2, i4);
            if (!g.isPresent() || (((C69258x) g.get()).f185381a & 1) == 0) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(C124169r.m203613h(Optional.m71637of(accountId2), "tips_data_id", i4, jVar2.f139793X, C124109ch.m203531a(Instant.ofEpochMilli(ajVar.f342053g.mo26870b()), (C69258x) g.get())));
            }
            if (optional.isPresent()) {
                gpVar2.mo55395g((C124169r) optional.get());
                jVar = jVar2;
                i2 = i3;
                i = size;
                C48952az d = ((C124169r) optional.get()).mo106301d();
                accountId = accountId2;
                gpVar = gpVar2;
                bfVar2.mo45931c("ClientProactiveData", C123611ad.m202942a(jVar2, 100002, "tips_data_id", true, (C53132co) null, d, j), 5);
            } else {
                jVar = jVar2;
                i2 = i3;
                i = size;
                accountId = accountId2;
                gpVar = gpVar2;
                bfVar2.mo45931c("ClientProactiveData", C123611ad.m202942a(jVar, 100002, "tips_data_id", true, (C53132co) null, (C48952az) null, j), 5);
            }
            ajVar.f342055i.mo106283b(100002, jVar.f139793X);
            i3 = i2 + 1;
            accountId2 = accountId;
            size = i;
            gpVar2 = gpVar;
            i4 = 100002;
        }
    }
}
