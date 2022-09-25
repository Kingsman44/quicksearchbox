package com.google.android.apps.search.googleapp.discover.p10238u;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60866ct;
import com.google.p4017at.p4027c.p4028a.p4029a.C53852l;
import com.google.p4017at.p4027c.p4031b.p4035b.p4036a.C53883b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import java.util.concurrent.Executor;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.ff */
/* compiled from: PG */
public final class C135086ff {

    /* renamed from: a */
    public final C53883b f367916a;

    /* renamed from: b */
    public final C53852l f367917b;

    /* renamed from: c */
    public final C134980bl f367918c;

    /* renamed from: d */
    public final String f367919d = "/httpservice/retry/InteractiveDiscoverAgaService/FeedQuery";

    /* renamed from: e */
    public final String f367920e = "/httpservice/noretry/DiscoverAgaNewsFullCoverageService/FeedQuery";

    /* renamed from: f */
    public final String f367921f = "/httpservice/retry/InteractiveDiscoverAgaChannelsService/FeedQuery";

    /* renamed from: g */
    public final String f367922g = "/httpservice/noretry/BackgroundDiscoverAgaService/FeedQuery";

    /* renamed from: h */
    public final boolean f367923h;

    /* renamed from: i */
    public final boolean f367924i;

    /* renamed from: j */
    public final boolean f367925j;

    /* renamed from: k */
    public final C134952am f367926k;

    /* renamed from: l */
    public final C69585o f367927l;

    /* renamed from: m */
    public final boolean f367928m;

    /* renamed from: n */
    private final boolean f367929n;

    /* renamed from: o */
    private final C42876ab f367930o;

    /* renamed from: p */
    private final Executor f367931p;

    public C135086ff(C53883b bVar, C53852l lVar, C134980bl blVar, boolean z, boolean z2, boolean z3, C134952am amVar, boolean z4, C42876ab abVar, Executor executor, C69585o oVar, boolean z5) {
        C69664n.m101061g(amVar, "discoverGrpcInterceptor");
        C69664n.m101061g(abVar, "lastFeedRequestStore");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f367916a = bVar;
        this.f367917b = lVar;
        this.f367918c = blVar;
        this.f367923h = z;
        this.f367924i = z2;
        this.f367925j = z3;
        this.f367926k = amVar;
        this.f367929n = z4;
        this.f367930o = abVar;
        this.f367931p = executor;
        this.f367927l = oVar;
        this.f367928m = z5;
    }

    /* renamed from: a */
    public final C135050dx mo112120a(C57259bn bnVar) {
        C135090fj cnVar = (this.f367923h || C134992bx.m218910a()) ? new C135012cn(new C135054ea(this, (C69577g) null)) : new C135016cr(new C135056ec(this, (C69577g) null));
        C135051dy dyVar = C135051dy.f367780a;
        C135034dh dhVar = C135034dh.STANDARD;
        C37258g gVar = C37182a.f97769aA;
        C69664n.m101060f(gVar, "DISCOVER_BACKGROUND_FEED_REQUEST_START");
        return new C135050dx(bnVar, (C57252bg) null, BuildConfig.FLAVOR, dyVar, dhVar, gVar, cnVar, true);
    }

    /* renamed from: b */
    public final C47633f mo112121b(C135022cx cxVar, C57303dd ddVar) {
        if (!this.f367929n) {
            C47633f g = C47633f.m84733g(C60866ct.f164955a);
            C69664n.m101060f(g, "immediateFuture(null)");
            return g;
        }
        C47633f g2 = C47633f.m84733g(this.f367930o.mo46039a(new C135085fe(cxVar, ddVar), this.f367931p));
        C69664n.m101060f(g2, "requestType: LastRequest…ghtExecutor\n      )\n    )");
        return g2;
    }
}
