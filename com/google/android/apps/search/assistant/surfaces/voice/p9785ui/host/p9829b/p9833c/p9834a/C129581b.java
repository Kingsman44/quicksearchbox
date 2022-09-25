package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9834a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.p4582b.C60942a;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.motion.impl.PostponableTransitionManager$postponeTransitions$1", mo61344c = "PostponableTransitionManager.kt", mo61345d = "invokeSuspend", mo61346e = {44})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.a.b */
/* compiled from: PG */
final class C129581b extends C69572j implements C69630p {

    /* renamed from: a */
    int f355658a;

    /* renamed from: b */
    final /* synthetic */ C129583d f355659b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129581b(C129583d dVar, C69577g gVar) {
        super(2, gVar);
        this.f355659b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129581b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f355658a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Duration duration = C129583d.f355665b;
            this.f355658a = 1;
            if (C60942a.m93084b(duration, this) == aVar) {
                return aVar;
            }
        }
        C59052c cVar = (C59052c) C129583d.f355666c.mo56224b();
        cVar.mo56379ah(new C59094n(38368));
        cVar.mo56386p("postpone timeout, auto start postponed transitions");
        this.f355659b.mo109117b();
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129581b(this.f355659b, gVar);
    }
}
