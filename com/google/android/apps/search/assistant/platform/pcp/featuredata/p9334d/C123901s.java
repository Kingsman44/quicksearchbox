package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import android.content.ContentValues;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123751br;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124048ad;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124109ch;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124116cn;
import com.google.android.apps.search.assistant.platform.pcp.validity.C124152a;
import com.google.android.apps.search.assistant.platform.pcp.validity.C124169r;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3994s.p3995a.C53132co;
import com.google.assistant.p3994s.p3995a.C53306j;
import java.util.List;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69258x;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.s */
/* compiled from: PG */
public final /* synthetic */ class C123901s implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C123904v f342226a;

    /* renamed from: b */
    public final /* synthetic */ String f342227b;

    /* renamed from: c */
    public final /* synthetic */ C123751br f342228c;

    /* renamed from: d */
    public final /* synthetic */ AccountId f342229d;

    /* renamed from: e */
    public final /* synthetic */ C53306j f342230e;

    /* renamed from: f */
    public final /* synthetic */ List f342231f;

    /* renamed from: g */
    public final /* synthetic */ int f342232g;

    public /* synthetic */ C123901s(C123904v vVar, int i, String str, C123751br brVar, AccountId accountId, C53306j jVar, List list) {
        this.f342226a = vVar;
        this.f342232g = i;
        this.f342227b = str;
        this.f342228c = brVar;
        this.f342229d = accountId;
        this.f342230e = jVar;
        this.f342231f = list;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        C48952az azVar;
        C42847bf bfVar2 = bfVar;
        C123904v vVar = this.f342226a;
        int i = this.f342232g;
        String str = this.f342227b;
        C123751br brVar = this.f342228c;
        AccountId accountId = this.f342229d;
        C53306j jVar = this.f342230e;
        List list = this.f342231f;
        long b = vVar.f342244h.mo26870b();
        ContentValues b2 = C123611ad.m202943b(i, str, brVar, C124116cn.m203542b(brVar), new byte[0], b);
        Optional g = C124048ad.m203471a(vVar.f342241e, accountId).mo106254g(jVar, i);
        if (!g.isPresent() || (((C69258x) g.get()).f185381a & 1) == 0) {
            azVar = C48952az.f126657c;
        } else {
            azVar = C124109ch.m203531a(Instant.ofEpochMilli(brVar.f341829b), (C69258x) g.get());
        }
        C124169r h = C124169r.m203613h(Optional.m71637of(accountId), brVar.f341831d, i, jVar.f139793X, azVar);
        String str2 = str;
        ContentValues a = C123611ad.m202942a(jVar, i, str2, false, (C53132co) null, ((C124152a) h).f342853e, b);
        list.add(h);
        bfVar2.mo45931c("SharedProactiveData", b2, 5);
        bfVar2.mo45931c("ClientProactiveData", a, 5);
    }
}
