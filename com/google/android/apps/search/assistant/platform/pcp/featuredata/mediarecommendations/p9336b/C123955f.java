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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.impl.MediaRecommendationsAppSelectorImpl$getAppForMediaSessionPausedFuture$1", mo61344c = "MediaRecommendationsAppSelectorImpl.kt", mo61345d = "invokeSuspend", mo61346e = {164})
/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.f */
/* compiled from: PG */
public final class C123955f extends C69572j implements C69630p {

    /* renamed from: a */
    int f342375a;

    /* renamed from: b */
    final /* synthetic */ C123962m f342376b;

    /* renamed from: c */
    final /* synthetic */ C50672h f342377c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C123955f(C123962m mVar, C50672h hVar, C69577g gVar) {
        super(2, gVar);
        this.f342376b = mVar;
        this.f342377c = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C123955f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f342375a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C123962m mVar = this.f342376b;
            C50672h hVar = this.f342377c;
            this.f342375a = 1;
            obj = mVar.mo106217a(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C123955f(this.f342376b, this.f342377c, gVar);
    }
}
