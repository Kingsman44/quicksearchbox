package com.google.android.libraries.search.p2992d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.p4632a.C61346g;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.d.f */
/* compiled from: PG */
public final /* synthetic */ class C38295f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38296g f101454a;

    /* renamed from: b */
    public final /* synthetic */ Set f101455b;

    /* renamed from: c */
    public final /* synthetic */ boolean f101456c;

    /* renamed from: d */
    public final /* synthetic */ AccountId f101457d;

    public /* synthetic */ C38295f(C38296g gVar, Set set, boolean z, AccountId accountId) {
        this.f101454a = gVar;
        this.f101455b = set;
        this.f101456c = z;
        this.f101457d = accountId;
    }

    public final C60870cx apply(Object obj) {
        C38296g gVar = this.f101454a;
        Set set = this.f101455b;
        boolean z = this.f101456c;
        AccountId accountId = this.f101457d;
        String str = (String) obj;
        if (str != null) {
            return gVar.f101463f.mo19399b(C47810es.m84978r(new C38293d(gVar, str, z, set)));
        }
        return C60856cj.m92899h(new C61346g("Failed to get auth token", new IllegalStateException("Cannot get auth token for account id: ".concat(String.valueOf(String.valueOf(accountId))))));
    }
}
