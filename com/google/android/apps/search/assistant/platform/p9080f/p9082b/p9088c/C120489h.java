package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.C120392a;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.assistant.p2511d.C32550m;
import com.google.android.libraries.search.assistant.p2511d.C32552o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47630c;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p5462h.C69596e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.impl.AudioInputImpl$openNewSession$1", mo61344c = "AudioInputImpl.kt", mo61345d = "invokeSuspend", mo61346e = {106, 111})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.h */
/* compiled from: PG */
final class C120489h extends C69572j implements C69630p {

    /* renamed from: a */
    Object f335088a;

    /* renamed from: b */
    int f335089b;

    /* renamed from: c */
    final /* synthetic */ C120498q f335090c;

    /* renamed from: d */
    private /* synthetic */ Object f335091d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120489h(C120498q qVar, C69577g gVar) {
        super(2, gVar);
        this.f335090c = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120489h) mo5194c((C32552o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C32552o oVar;
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f335089b;
        if (i == 0) {
            C69714l.m101134b(obj);
            C32552o oVar2 = (C32552o) this.f335091d;
            C32534ai aiVar = new C32534ai(this.f335090c.f335124f);
            C47630c a = this.f335090c.f335120b.mo104744a(new C120488g(aiVar));
            C69664n.m101060f(a, "backend.open(buffer::enqueue)");
            C71604be a2 = C32550m.m60364a(a, oVar2);
            this.f335090c.f335130l.mo38849b(new C120485d(aiVar));
            C71803m.m105043d(oVar2, (C69585o) null, (C71424ay) null, new C120486e(this.f335090c, a2, aiVar, (C69577g) null), 3);
            this.f335091d = oVar2;
            this.f335088a = aiVar;
            this.f335089b = 1;
            Object a3 = a2.mo62825a(this);
            if (a3 == aVar) {
                return aVar;
            }
            oVar = oVar2;
            obj = a3;
            obj2 = aiVar;
        } else if (i == 1) {
            obj2 = this.f335088a;
            oVar = (C32552o) this.f335091d;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            throw new C69596e();
        }
        C69664n.m101060f(obj, "backendSessionAsync.await()");
        C120483b bVar = new C120483b((C32534ai) obj2, (C120392a) obj);
        C71803m.m105043d(oVar, (C69585o) null, (C71424ay) null, new C120487f(this.f335090c, bVar, (C69577g) null), 3);
        this.f335091d = null;
        this.f335088a = null;
        this.f335089b = 2;
        if (oVar.mo38144b(bVar, this) == aVar) {
            return aVar;
        }
        throw new C69596e();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120489h hVar = new C120489h(this.f335090c, gVar);
        hVar.f335091d = obj;
        return hVar;
    }
}
