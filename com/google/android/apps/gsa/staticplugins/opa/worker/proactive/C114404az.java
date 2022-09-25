package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.az */
/* compiled from: PG */
public final /* synthetic */ class C114404az implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114418bj f317220a;

    public /* synthetic */ C114404az(C114418bj bjVar) {
        this.f317220a = bjVar;
    }

    public final C60870cx apply(Object obj) {
        AccountId accountId = (AccountId) obj;
        C60870cx b = this.f317220a.f317262h.mo50282b(accountId);
        C114403ay ayVar = new C114403ay(accountId);
        return C60922j.m93044g(b, C47810es.m84963c(ayVar), C60826bg.f164896a);
    }
}
