package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9413a.p9414a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.p4632a.C61346g;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C124795i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124797k f344303a;

    /* renamed from: b */
    public final /* synthetic */ Set f344304b;

    /* renamed from: c */
    public final /* synthetic */ AccountId f344305c;

    public /* synthetic */ C124795i(C124797k kVar, Set set, AccountId accountId) {
        this.f344303a = kVar;
        this.f344304b = set;
        this.f344305c = accountId;
    }

    public final C60870cx apply(Object obj) {
        C124797k kVar = this.f344303a;
        Set set = this.f344304b;
        AccountId accountId = this.f344305c;
        String str = (String) obj;
        if (str != null) {
            return kVar.f344313f.mo19399b(C47810es.m84978r(new C124792f(kVar, str, set)));
        }
        return C60856cj.m92899h(new C61346g("Failed to get auth token", new IllegalStateException("Cannot get auth token for account id: ".concat(String.valueOf(String.valueOf(accountId))))));
    }
}
