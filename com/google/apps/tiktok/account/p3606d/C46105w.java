package com.google.apps.tiktok.account.p3606d;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60934v;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.google.apps.tiktok.account.d.w */
/* compiled from: PG */
public final /* synthetic */ class C46105w implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C46107y f120994a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f120995b;

    public /* synthetic */ C46105w(C46107y yVar, AccountId accountId) {
        this.f120994a = yVar;
        this.f120995b = accountId;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C46107y yVar = this.f120994a;
        String c = C46092j.m82308c(this.f120995b);
        ArrayList arrayList = new ArrayList();
        C58800sl lA = yVar.f120999b.mo51049a().iterator();
        while (lA.hasNext()) {
            arrayList.add(yVar.mo50208a(new File((File) lA.next(), c)));
        }
        return C60856cj.m92894c(arrayList).mo57334a(new C60934v((Object) null), C60826bg.f164896a);
    }
}
