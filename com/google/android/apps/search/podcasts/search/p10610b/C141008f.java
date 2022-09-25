package com.google.android.apps.search.podcasts.search.p10610b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.p3635a.p3636a.C46682c;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54352be;
import com.google.p4017at.p4082j.p4083a.C54353bf;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.search.b.f */
/* compiled from: PG */
public final class C141008f {

    /* renamed from: a */
    public final C46407v f382820a;

    /* renamed from: b */
    public final C140385d f382821b;

    /* renamed from: c */
    public final C46682c f382822c;

    /* renamed from: d */
    public final C46778cv f382823d;

    /* renamed from: e */
    public final Executor f382824e;

    public C141008f(C46407v vVar, C140385d dVar, C46682c cVar, C46778cv cvVar, Executor executor) {
        C69664n.m101061g(vVar, "searchSuggestCache");
        C69664n.m101061g(dVar, "podcastsServiceManager");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f382820a = vVar;
        this.f382821b = dVar;
        this.f382822c = cVar;
        this.f382823d = cvVar;
        this.f382824e = executor;
    }

    /* renamed from: a */
    public final C46689ag mo116072a(String str) {
        C69664n.m101061g(str, "query");
        return new C141007e(str, this);
    }

    /* renamed from: b */
    public final void mo116073b() {
        C54352be beVar = (C54352be) C54353bf.f142786c.createBuilder();
        beVar.copyOnWrite();
        ((C54353bf) beVar.instance).f142788a = BuildConfig.FLAVOR;
        C62942bv build = beVar.build();
        C69664n.m101060f(build, "newBuilder().setQuery(\"\").build()");
        C60870cx b = this.f382820a.mo50342b((C54353bf) build);
        C69664n.m101060f(b, "searchSuggestCache.evict(request)");
        C140989k.m228951i(b, this.f382824e, new C141004b(this));
    }
}
