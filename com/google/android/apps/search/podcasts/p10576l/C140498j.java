package com.google.android.apps.search.podcasts.p10576l;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3614c.C46194e;
import com.google.apps.tiktok.account.p3606d.C46094l;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.l.j */
/* compiled from: PG */
public final class C140498j {

    /* renamed from: a */
    public final C42876ab f381594a;

    /* renamed from: b */
    public final C46094l f381595b;

    /* renamed from: c */
    public final C46194e f381596c;

    /* renamed from: d */
    public final Executor f381597d;

    /* renamed from: e */
    public final List f381598e = new ArrayList();

    /* renamed from: f */
    private final boolean f381599f;

    public C140498j(C42876ab abVar, C46094l lVar, C46194e eVar, Executor executor, boolean z) {
        C69664n.m101061g(abVar, "devicePreferencesStore");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f381594a = abVar;
        this.f381595b = lVar;
        this.f381596c = eVar;
        this.f381597d = executor;
        this.f381599f = z;
    }

    /* renamed from: a */
    public final C60870cx mo115697a() {
        return C47633f.m84733g(this.f381594a.mo46042d()).mo51516i(new C140492d(this), this.f381597d).mo51514f(Throwable.class, new C140493e(this), this.f381597d);
    }

    /* renamed from: b */
    public final void mo115698b(AccountId accountId) {
        C69664n.m101061g(accountId, "accountId");
        C46459k.m82829b(this.f381594a.mo46039a(new C140496h(accountId), this.f381597d), "Couldn't save accountId", new Object[0]);
        if (this.f381599f) {
            for (C69615a a : this.f381598e) {
                a.mo5672a();
            }
        }
    }
}
