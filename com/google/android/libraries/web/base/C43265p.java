package com.google.android.libraries.web.base;

import com.google.android.libraries.web.coordinator.C43727a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.base.p */
/* compiled from: PG */
public final class C43265p {
    /* renamed from: a */
    public static final C43264o m76349a(AccountId accountId, WebConfig webConfig) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(webConfig, "config");
        C43264o oVar = new C43264o();
        C68324h.m98669f(oVar);
        C47247a.m84047b(oVar, accountId);
        C43727a.m77221a(oVar, webConfig);
        return oVar;
    }
}
