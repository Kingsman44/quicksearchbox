package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9413a.p9414a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.p4632a.C61346g;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C124796j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124797k f344306a;

    /* renamed from: b */
    public final /* synthetic */ Set f344307b;

    public /* synthetic */ C124796j(C124797k kVar, Set set) {
        this.f344306a = kVar;
        this.f344307b = set;
    }

    public final C60870cx apply(Object obj) {
        C124797k kVar = this.f344306a;
        Set set = this.f344307b;
        if (!"google".equals(((C46108a) obj).mo50210b().f121165j)) {
            return C60856cj.m92900i(Optional.empty());
        }
        AccountId accountId = kVar.f344309b;
        C47558bi a = C47831fm.m85006a("Fetching authorization token");
        try {
            C60870cx h = C60922j.m93045h(kVar.f344311d.mo50215b(accountId), C47810es.m84966f(new C124795i(kVar, set, accountId)), kVar.f344312e);
            a.mo51417a(h);
            C60870cx h2 = C60846c.m92879h(C60922j.m93044g(h, C47810es.m84963c(C124793g.f344301a), C60826bg.f164896a), C61346g.class, C47810es.m84966f(C124794h.f344302a), C60826bg.f164896a);
            a.close();
            return h2;
        } catch (Throwable th) {
            C124791e.m204573a(th, th);
        }
        throw th;
    }
}
