package com.google.android.apps.search.googleapp.discover.channels;

import com.google.android.apps.search.googleapp.discover.p10238u.C134952am;
import com.google.android.apps.search.googleapp.discover.p10245w.p10246a.C135209c;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46775cs;
import com.google.apps.tiktok.dataservice.C46776ct;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4027c.p4028a.p4029a.C53846f;
import com.google.p4017at.p4027c.p4028a.p4029a.C53850j;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.ba */
/* compiled from: PG */
public final class C134139ba {

    /* renamed from: a */
    public final C46407v f365408a;

    /* renamed from: b */
    public final C53850j f365409b;

    /* renamed from: c */
    public final C71422aw f365410c;

    /* renamed from: d */
    public final C46776ct f365411d;

    /* renamed from: e */
    public final C46459k f365412e;

    /* renamed from: f */
    public final C134952am f365413f;

    /* renamed from: g */
    public final C134128aq f365414g;

    /* renamed from: h */
    private final C134184p f365415h;

    public C134139ba(C134184p pVar, C46407v vVar, C53850j jVar, C71422aw awVar, C46776ct ctVar, C46459k kVar, C134952am amVar, C134128aq aqVar) {
        C69664n.m101061g(vVar, "cache");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(ctVar, "channelMutationManager");
        C69664n.m101061g(kVar, "androidFutures");
        C69664n.m101061g(amVar, "discoverGrpcInterceptor");
        C69664n.m101061g(aqVar, "channelsCacheUpdater");
        this.f365415h = pVar;
        this.f365408a = vVar;
        this.f365409b = jVar;
        this.f365410c = awVar;
        this.f365411d = ctVar;
        this.f365412e = kVar;
        this.f365413f = amVar;
        this.f365414g = aqVar;
    }

    /* renamed from: a */
    public final C46689ag mo111577a(C134150bl blVar) {
        C69664n.m101061g(blVar, "clientChannelLookup");
        C46776ct ctVar = this.f365411d;
        C134184p pVar = this.f365415h;
        C46407v vVar = (C46407v) pVar.f365514a.mo17428b();
        vVar.getClass();
        C53846f fVar = (C53846f) pVar.f365515b.mo17428b();
        fVar.getClass();
        Executor executor = (Executor) pVar.f365516c.mo17428b();
        executor.getClass();
        C60950i iVar = (C60950i) pVar.f365517d.mo17428b();
        iVar.getClass();
        ((C134142bd) pVar.f365518e.mo17428b()).getClass();
        C134952am amVar = (C134952am) pVar.f365519f.mo17428b();
        amVar.getClass();
        C134128aq aqVar = (C134128aq) pVar.f365520g.mo17428b();
        aqVar.getClass();
        C39143kr krVar = (C39143kr) pVar.f365521h.mo17428b();
        krVar.getClass();
        blVar.getClass();
        return new C46775cs(ctVar, new C134183o(vVar, fVar, executor, iVar, amVar, aqVar, krVar, blVar));
    }

    /* renamed from: b */
    public final C60870cx mo111578b(C134150bl blVar) {
        C69664n.m101061g(blVar, "clientChannelLookup");
        return C135209c.m219302a(C71663i.m104688a(C71803m.m105042c(this.f365410c, (C69585o) null, (C71424ay) null, new C134131at(this, blVar, (C69577g) null), 3)));
    }

    /* renamed from: c */
    public final C60870cx mo111579c(C134150bl blVar) {
        C69664n.m101061g(blVar, "clientChannelLookup");
        return C135209c.m219302a(C71663i.m104688a(C71803m.m105042c(this.f365410c, (C69585o) null, (C71424ay) null, new C134134aw(this, blVar, (C69577g) null), 3)));
    }

    /* renamed from: d */
    public final Object mo111580d(C71604be beVar, C134150bl blVar, C69626l lVar, C69577g gVar) {
        return C71423ax.m104196a(new C134137az(this, blVar, beVar, lVar, (C69577g) null), gVar);
    }
}
