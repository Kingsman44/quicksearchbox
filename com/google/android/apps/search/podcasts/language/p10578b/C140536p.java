package com.google.android.apps.search.podcasts.language.p10578b;

import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.p3635a.p3636a.C46682c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4017at.p4082j.p4083a.C54313aq;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.b.p */
/* compiled from: PG */
public final class C140536p {

    /* renamed from: a */
    public final C46407v f381691a;

    /* renamed from: b */
    public final C140385d f381692b;

    /* renamed from: c */
    public final C46682c f381693c;

    /* renamed from: d */
    public final Executor f381694d;

    /* renamed from: e */
    public final C54313aq f381695e;

    /* renamed from: f */
    private final C46128f f381696f;

    /* renamed from: g */
    private final AccountId f381697g;

    public C140536p(C46407v vVar, C140385d dVar, C46682c cVar, C46128f fVar, AccountId accountId, Executor executor) {
        C69664n.m101061g(vVar, "languageCache");
        C69664n.m101061g(dVar, "podcastsServiceManager");
        C69664n.m101061g(fVar, "gcoreAccountName");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f381691a = vVar;
        this.f381692b = dVar;
        this.f381693c = cVar;
        this.f381696f = fVar;
        this.f381697g = accountId;
        this.f381694d = executor;
        C54313aq aqVar = C54313aq.f142682a;
        C69664n.m101060f(aqVar, "getDefaultInstance()");
        this.f381695e = aqVar;
    }

    /* renamed from: a */
    public final C60870cx mo115719a() {
        C60870cx b = this.f381696f.mo50215b(this.f381697g);
        C140533m mVar = new C140533m(this);
        return C60922j.m93045h(b, C47810es.m84966f(mVar), this.f381694d);
    }

    /* renamed from: b */
    public final C60870cx mo115720b() {
        return C140989k.m228947e(this.f381696f.mo50215b(this.f381697g), this.f381694d, new C140535o(this));
    }
}
