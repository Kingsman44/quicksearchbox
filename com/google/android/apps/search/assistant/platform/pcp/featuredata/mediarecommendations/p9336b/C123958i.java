package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9336b;

import com.google.assistant.p3886c.p3887a.C50672h;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.impl.MediaRecommendationsAppSelectorImpl$getAppForPeriodicRefreshFuture$1", mo61344c = "MediaRecommendationsAppSelectorImpl.kt", mo61345d = "invokeSuspend", mo61346e = {77})
/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.i */
/* compiled from: PG */
public final class C123958i extends C69572j implements C69630p {

    /* renamed from: a */
    int f342383a;

    /* renamed from: b */
    final /* synthetic */ C123962m f342384b;

    /* renamed from: c */
    final /* synthetic */ C50672h f342385c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C123958i(C123962m mVar, C50672h hVar, C69577g gVar) {
        super(2, gVar);
        this.f342384b = mVar;
        this.f342385c = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C123958i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f342383a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C123962m mVar = this.f342384b;
            C50672h hVar = this.f342385c;
            this.f342383a = 1;
            obj = mVar.mo106218b(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C123958i(this.f342384b, this.f342385c, gVar);
    }
}
