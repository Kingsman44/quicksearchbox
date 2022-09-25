package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import kotlinx.coroutines.C71422aw;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.MediaRecommendationsDataFetcher$fetchFuture$1", mo61344c = "MediaRecommendationsDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {74})
/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ag */
/* compiled from: PG */
final class C123931ag extends C69572j implements C69630p {

    /* renamed from: a */
    int f342303a;

    /* renamed from: b */
    final /* synthetic */ C123935ak f342304b;

    /* renamed from: c */
    final /* synthetic */ Optional f342305c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C123931ag(C123935ak akVar, Optional optional, C69577g gVar) {
        super(2, gVar);
        this.f342304b = akVar;
        this.f342305c = optional;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C123931ag) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f342303a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            this.f342303a = 1;
            obj = this.f342304b.mo106193a((Instant) this.f342305c.orElse(null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C123931ag(this.f342304b, this.f342305c, gVar);
    }
}
