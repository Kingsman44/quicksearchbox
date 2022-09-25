package com.google.android.apps.search.googleapp.stampviewer.p10495g;

import com.google.android.apps.search.googleapp.discover.p10238u.C134944ae;
import com.google.android.apps.search.googleapp.discover.p10238u.C135124w;
import com.google.android.apps.search.googleapp.discover.p10238u.C135125x;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139336r;
import com.google.apps.tiktok.cache.C46406u;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46704av;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46726bj;
import com.google.apps.tiktok.dataservice.C46728bl;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53910e;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53914i;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.g.m */
/* compiled from: PG */
public final class C139409m implements C139397a {

    /* renamed from: a */
    public final Executor f379062a;

    /* renamed from: b */
    public final C53914i f379063b;

    /* renamed from: c */
    public final C46406u f379064c;

    /* renamed from: d */
    public final C60950i f379065d;

    /* renamed from: e */
    public final C139336r f379066e;

    /* renamed from: f */
    private final C46728bl f379067f;

    /* renamed from: g */
    private final C135125x f379068g;

    /* renamed from: h */
    private final C134944ae f379069h;

    /* renamed from: i */
    private final C46723bg f379070i;

    /* renamed from: j */
    private final int f379071j;

    /* renamed from: k */
    private final int f379072k;

    /* renamed from: l */
    private final int f379073l;

    public C139409m(Executor executor, C53914i iVar, C46728bl blVar, InstanceStateStoreFactory instanceStateStoreFactory, long j, long j2, long j3, C135125x xVar, C134944ae aeVar, C60950i iVar2, C46723bg bgVar, C139336r rVar) {
        this.f379062a = executor;
        this.f379063b = iVar;
        this.f379067f = blVar;
        this.f379064c = new C46406u(instanceStateStoreFactory.mo50325a("getRecommendationsResponse", C53910e.f141461b));
        this.f379068g = xVar;
        this.f379069h = aeVar;
        this.f379065d = iVar2;
        this.f379070i = bgVar;
        this.f379071j = (int) j2;
        this.f379072k = (int) j3;
        this.f379073l = (int) j;
        this.f379066e = rVar;
    }

    /* renamed from: a */
    public final C46689ag mo114946a(C58485gu guVar, int i, int i2) {
        int max = Math.max(Math.min(this.f379072k, this.f379073l - guVar.size()), 0);
        if (max <= 0 || guVar.size() - i2 > this.f379071j) {
            return new C46719bc(this.f379070i, C139403g.f379050a, "StampRecommendationsDataService#getRecommendations");
        }
        C46728bl blVar = this.f379067f;
        C135125x xVar = this.f379068g;
        C47633f g = C47633f.m84733g(C71663i.m104688a(C71803m.m105042c(xVar.f368035b, (C69585o) null, (C71424ay) null, new C135124w(xVar, (C69577g) null), 3)));
        C69664n.m101060f(g, "fun get(): PropagatedFlu…sListenableFuture()\n    )");
        C47633f a = this.f379069h.mo112084a();
        return new C46726bj(blVar, guVar, new C46704av(new C139408l(this, C47633f.m84733g(C60856cj.m92895d(g, a).mo57334a(C47810es.m84978r(new C139404h(this, guVar, i, max, g, a)), C60826bg.f164896a))), new C139401e(this), this.f379062a));
    }
}
