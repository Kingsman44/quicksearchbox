package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.p10603b.C140962c;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54309am;
import com.google.p4017at.p4082j.p4083a.C54398cx;
import com.google.p4017at.p4082j.p4083a.C54400cz;
import com.google.p4017at.p4082j.p4083a.C54402da;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.Map;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.n.s */
/* compiled from: PG */
public final class C140690s {

    /* renamed from: a */
    public final C139997j f382096a;

    /* renamed from: b */
    public final C46407v f382097b;

    /* renamed from: c */
    public final C46407v f382098c;

    /* renamed from: d */
    public final C46407v f382099d;

    /* renamed from: e */
    public final C140385d f382100e;

    /* renamed from: f */
    private final Executor f382101f;

    /* renamed from: g */
    private final C140459au f382102g;

    /* renamed from: h */
    private final C140962c f382103h;

    public C140690s(C139997j jVar, Executor executor, C46407v vVar, C46407v vVar2, C46407v vVar3, C140385d dVar, C140459au auVar, C140962c cVar) {
        C69664n.m101061g(jVar, "entityCache");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(vVar, "homeFeedCache");
        C69664n.m101061g(vVar2, "discoverFeedCache");
        C69664n.m101061g(vVar3, "discoverTabsCache");
        C69664n.m101061g(dVar, "podcastsServiceManager");
        C69664n.m101061g(auVar, "syncablePreferencesManager");
        this.f382096a = jVar;
        this.f382101f = executor;
        this.f382097b = vVar;
        this.f382098c = vVar2;
        this.f382099d = vVar3;
        this.f382100e = dVar;
        this.f382102g = auVar;
        this.f382103h = cVar;
    }

    /* renamed from: f */
    public static final void m228473f(Map map, C63113l lVar) {
        if (!map.containsKey(lVar.f170373g)) {
            String str = lVar.f170373g;
            C69664n.m101060f(str, "show.feedUrl");
            C54398cx cxVar = (C54398cx) C54402da.f142888d.createBuilder();
            cxVar.copyOnWrite();
            ((C54402da) cxVar.instance).f142890a = C54400cz.m87376a(3);
            cxVar.copyOnWrite();
            lVar.getClass();
            ((C54402da) cxVar.instance).f142891b = lVar;
            map.put(str, cxVar);
        }
    }

    /* renamed from: h */
    private final C60870cx m228474h() {
        C60870cx b = this.f382102g.mo115677b();
        C60870cx d = this.f382102g.mo115679d();
        return C47638k.m84751b(b, d).mo51520a(new C140678g(b, d), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo115828a(String str) {
        C60870cx b = this.f382102g.mo115677b();
        C60870cx d = this.f382102g.mo115679d();
        return C47638k.m84751b(b, d).mo51520a(new C140677f(str, b, d), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo115829b() {
        C60870cx h = m228474h();
        C60870cx c = C140989k.m228945c(h, new C140684m(this));
        mo115833g(C140989k.m228944b(c, C140682k.f382086a));
        return C140989k.m228945c(c, new C140683l(this, h, c));
    }

    /* renamed from: c */
    public final C60870cx mo115830c() {
        return C140989k.m228945c(this.f382103h.mo116047c(), new C140686o(this));
    }

    /* renamed from: d */
    public final C60870cx mo115831d() {
        return C140989k.m228945c(m228474h(), new C140688q(this));
    }

    /* renamed from: e */
    public final C60870cx mo115832e() {
        C60870cx e = this.f382097b.mo50345e(C54309am.f142677a);
        C69664n.m101060f(e, "homeFeedCache.getIfPrese…est.getDefaultInstance())");
        return e;
    }

    /* renamed from: g */
    public final void mo115833g(C60870cx cxVar) {
        C69664n.m101061g(cxVar, "feed");
        C46459k.m82829b(C140989k.m228947e(cxVar, this.f382101f, new C140689r(this)), "Failed to update entities from feed.", new Object[0]);
    }
}
