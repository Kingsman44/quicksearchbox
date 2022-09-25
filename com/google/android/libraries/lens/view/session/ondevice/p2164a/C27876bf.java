package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.p2024d.C24424r;
import com.google.android.libraries.lens.ondevice.p2026f.C24472b;
import com.google.android.libraries.lens.ondevice.p2026f.C24474c;
import com.google.android.libraries.lens.ondevice.p2026f.C24490s;
import com.google.android.libraries.lens.ondevice.p2026f.C24491t;
import com.google.android.libraries.lens.ondevice.p2032i.C24523a;
import com.google.android.libraries.lens.ondevice.p2032i.C24524b;
import com.google.android.libraries.lens.ondevice.p2032i.C24525c;
import com.google.android.libraries.lens.ondevice.p2032i.C24526d;
import com.google.android.libraries.lens.ondevice.p2032i.C24527e;
import com.google.android.libraries.lens.ondevice.p2032i.C24528f;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.android.libraries.lens.ondevice.p2037n.C24814y;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27830m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.lens.p4701g.C62331d;
import com.google.lens.p4709l.p4710a.C62614b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.bf */
/* compiled from: PG */
final class C27876bf implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C24795f f75973a;

    /* renamed from: b */
    final /* synthetic */ C27877bg f75974b;

    public C27876bf(C27877bg bgVar, C24795f fVar) {
        this.f75974b = bgVar;
        this.f75973a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C27877bg.f75975a.mo56226d()).mo56382g(th)).mo56372aa(50033)).mo56386p("Engine failed to load");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C24424r rVar = (C24424r) obj;
        ((C58970a) ((C58970a) C27877bg.f75975a.mo56224b()).mo56372aa(50034)).mo56386p("Engine loaded successfully");
        if (!this.f75974b.f75979e.mo56113h()) {
            C24814y yVar = this.f75973a.f67751c;
            if (yVar == null) {
                yVar = C24814y.f67826d;
            }
            if (!yVar.f67829b.isEmpty()) {
                C24814y yVar2 = this.f75973a.f67751c;
                if (yVar2 == null) {
                    yVar2 = C24814y.f67826d;
                }
                C58833ax.m90834k(yVar2.f67829b);
            }
            C27852ai aiVar = this.f75974b.f75978d;
            C58480gp e = C58485gu.m89837e();
            C27892i iVar = aiVar.f75924e;
            C27830m b = aiVar.f75923d.mo33319c().mo33315b();
            C62614b bVar = C62614b.LOTS_FEATURE_HYBRID_TRANSLATE;
            C58836b bVar2 = C58836b.f156633a;
            C58833ax a = iVar.mo33368a(b, bVar, bVar2, bVar2, true);
            if (a.mo56113h()) {
                e.mo55395g(new C24523a(((C27891h) a.mo56107c()).mo33347d(), ((C27891h) a.mo56107c()).mo33345b()));
            }
            e.mo55395g(new C24523a(C62331d.HINT_WITH_RECONCILIATION_CASCADE, C24795f.f67747l));
            e.mo55395g(new C24523a(C62331d.EMBEDDING_CASCADE, C27898o.m51954a(aiVar.f75921b)));
            C58485gu f = e.mo55394f();
            C27877bg bgVar = this.f75974b;
            C24528f fVar = bgVar.f75976b.f67849f;
            fVar.f67189b.mo29947f(C24805p.CASCADE_DEPENDENCIES_CHECK_START, (C24808s) null);
            ArrayList arrayList = new ArrayList();
            C58801sm G = f.listIterator(0);
            while (G.hasNext()) {
                C24527e eVar = (C24527e) G.next();
                C24795f a2 = eVar.mo29936a();
                List c = fVar.f67192e.mo29999c(eVar.mo29937b());
                C24491t tVar = fVar.f67190c;
                C58495hd d = tVar.mo29916d(c);
                C24490s a3 = C24491t.m45560a(d, a2);
                C60870cx g = tVar.mo29918g(((C24472b) a3).f66985a.mo55229u());
                C24474c cVar = new C24474c(tVar, a3, d);
                C60870cx g2 = C60922j.m93044g(g, C47810es.m84963c(cVar), C60826bg.f164896a);
                C24525c cVar2 = new C24525c(eVar);
                arrayList.add(C60922j.m93044g(g2, C47810es.m84963c(cVar2), fVar.f67188a));
            }
            C60870cx e2 = C60856cj.m92896e(arrayList);
            C24526d dVar = new C24526d(fVar);
            C60870cx g3 = C60922j.m93044g(e2, C47810es.m84963c(dVar), fVar.f67188a);
            bgVar.f75979e = C58833ax.m90834k(C47638k.m84751b(g3).mo51520a(new C24524b(fVar, g3), fVar.f67188a));
        }
    }
}
