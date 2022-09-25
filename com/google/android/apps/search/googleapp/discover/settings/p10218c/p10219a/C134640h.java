package com.google.android.apps.search.googleapp.discover.settings.p10218c.p10219a;

import com.google.android.libraries.search.integrations.p3015b.p3016a.C38497c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46776ct;
import com.google.common.p4580v.C60950i;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.a.h */
/* compiled from: PG */
public final class C134640h {

    /* renamed from: a */
    public static final Duration f366638a = Duration.ofSeconds(10);

    /* renamed from: b */
    public final C38497c f366639b;

    /* renamed from: c */
    public final AccountId f366640c;

    /* renamed from: d */
    public final C46175b f366641d;

    /* renamed from: e */
    public final C46723bg f366642e;

    /* renamed from: f */
    public final Executor f366643f;

    /* renamed from: g */
    public final C46776ct f366644g;

    /* renamed from: h */
    public final C60950i f366645h;

    /* renamed from: i */
    public final C46689ag f366646i = new C134634b(this);

    public C134640h(C38497c cVar, AccountId accountId, C46175b bVar, C46723bg bgVar, Executor executor, C46776ct ctVar, C60950i iVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(bgVar, "dataSources");
        C69664n.m101061g(executor, "executor");
        C69664n.m101061g(iVar, "timeSource");
        this.f366639b = cVar;
        this.f366640c = accountId;
        this.f366641d = bVar;
        this.f366642e = bgVar;
        this.f366643f = executor;
        this.f366644g = ctVar;
        this.f366645h = iVar;
    }
}
