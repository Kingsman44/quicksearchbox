package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.surface.mediarecommendations.MediaRecommendationsSuggestionProducer$produceSmartspaceCard$2$producedMediaCard$1", mo61344c = "MediaRecommendationsSuggestionProducer.kt", mo61345d = "invokeSuspend", mo61346e = {172})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.ao */
/* compiled from: PG */
final class C131383ao extends C69572j implements C69630p {

    /* renamed from: a */
    int f359152a;

    /* renamed from: b */
    final /* synthetic */ C131386ar f359153b;

    /* renamed from: c */
    final /* synthetic */ C17692f f359154c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131383ao(C131386ar arVar, C17692f fVar, C69577g gVar) {
        super(2, gVar);
        this.f359153b = arVar;
        this.f359154c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C131383ao) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f359152a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C131386ar arVar = this.f359153b;
            C17692f fVar = this.f359154c;
            this.f359152a = 1;
            obj = C71803m.m105040a(arVar.f359163c, new C131382an(arVar, fVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C131383ao(this.f359153b, this.f359154c, gVar);
    }
}
