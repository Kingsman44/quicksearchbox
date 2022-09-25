package com.google.android.libraries.web.profile;

import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.profile.i */
/* compiled from: PG */
public final class C44074i {

    /* renamed from: a */
    private final AccountId f114740a;

    /* renamed from: b */
    private final C46175b f114741b;

    /* renamed from: c */
    private final Executor f114742c;

    public C44074i(AccountId accountId, C46175b bVar, Executor executor) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f114740a = accountId;
        this.f114741b = bVar;
        this.f114742c = executor;
    }

    /* renamed from: a */
    public final Profile mo47041a(C43271v vVar, C46215j jVar) {
        C69664n.m101061g(vVar, "webImplementation");
        C69664n.m101061g(jVar, "info");
        return C44061b.m77793a(vVar, jVar.f121165j.equals("incognito"), this.f114740a, C44082a.f114755a);
    }

    /* renamed from: b */
    public final C60870cx mo47042b(C43271v vVar) {
        C69664n.m101061g(vVar, "webImplementation");
        C60870cx c = this.f114741b.mo50246c(this.f114740a);
        C44073h hVar = new C44073h(this, vVar);
        return C60922j.m93044g(c, C47810es.m84963c(hVar), this.f114742c);
    }
}
