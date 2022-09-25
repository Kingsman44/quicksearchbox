package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9899c;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j.C106569c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j.C106570d;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.C130477a;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9898b.C130487g;
import com.google.android.apps.search.assistant.verticals.ambient.p9902b.p9903a.C130536e;
import com.google.android.apps.search.assistant.verticals.ambient.p9902b.p9903a.C130544m;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.c.l */
/* compiled from: PG */
public final class C130499l implements C130477a {

    /* renamed from: a */
    public final C58974d f357490a;

    /* renamed from: b */
    public final C130487g f357491b;

    /* renamed from: c */
    public final ExecutorService f357492c;

    /* renamed from: d */
    public final C131258a f357493d;

    /* renamed from: e */
    public final C130544m f357494e;

    /* renamed from: f */
    private final Set f357495f;

    /* renamed from: g */
    private final boolean f357496g;

    public C130499l(C130603a aVar, C130544m mVar, C130487g gVar, ExecutorService executorService, Set set, C131258a aVar2, boolean z) {
        this.f357490a = aVar.mo109740b(this);
        this.f357494e = mVar;
        this.f357491b = gVar;
        this.f357492c = executorService;
        this.f357495f = set;
        this.f357493d = aVar2;
        this.f357496g = z;
    }

    /* renamed from: a */
    public final C60870cx mo109707a(C106596h hVar, C53715bm bmVar) {
        int a;
        if (!this.f357496g) {
            return C60866ct.f164955a;
        }
        if (bmVar.f141023a == 13) {
            C106570d dVar = (C106570d) bmVar.f141024b;
            if ((dVar.f297156a & 1) == 0 || (a = C106569c.m177345a(dVar.f297157b)) == 0 || a != 2) {
                return C60866ct.f164955a;
            }
        }
        C58485gu d = this.f357493d.mo110138d();
        C130544m mVar = this.f357494e;
        C60870cx b = mVar.f357599f.mo51512b(new C130536e(mVar), mVar.f357598e);
        C130498k kVar = new C130498k(d);
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(kVar), this.f357492c);
        C130490c cVar = new C130490c(this, hVar, bmVar);
        ExecutorService executorService = this.f357492c;
        C60870cx e = C60856cj.m92896e((Iterable) Collection.EL.stream(this.f357495f).map(new C130492e(this, hVar, bmVar)).collect(C58370cn.f155946a));
        C130493f fVar = C130493f.f357483a;
        C60870cx f = C60856cj.m92897f(C60922j.m93045h(g, C47810es.m84966f(cVar), executorService), C60922j.m93044g(e, C47810es.m84963c(fVar), this.f357492c));
        C130491d dVar2 = C130491d.f357479a;
        C60870cx g2 = C60922j.m93044g(f, C47810es.m84963c(dVar2), this.f357492c);
        C130489b bVar = new C130489b(this, hVar);
        return C60922j.m93045h(g2, C47810es.m84966f(bVar), this.f357492c);
    }
}
