package com.google.android.apps.gsa.staticplugins.p7374ag;

import com.google.android.apps.gsa.staticplugins.p7374ag.C93829j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.h */
/* compiled from: PG */
public final /* synthetic */ class C93827h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93829j f262073a;

    public /* synthetic */ C93827h(C93829j jVar) {
        this.f262073a = jVar;
    }

    public final C60870cx apply(Object obj) {
        C93829j jVar = this.f262073a;
        AccountId accountId = (AccountId) obj;
        return C47633f.m84733g(((C93829j.C93830a) C47245e.m84045a(jVar.f262076b, C93829j.C93830a.class, accountId)).mo88184gv().mo46989a()).mo51516i(new C93825f(jVar, accountId), jVar.f262079e);
    }
}
