package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.resources.audioinput.AudioInputDebugDataTracker$1", mo61344c = "AudioInputDebugDataTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.c */
/* compiled from: PG */
final class C121787c extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f337964a;

    /* renamed from: b */
    final /* synthetic */ C121792h f337965b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121787c(C121792h hVar, C69577g gVar) {
        super(2, gVar);
        this.f337965b = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121787c) mo5194c((C121759ah) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C121759ah ahVar = (C121759ah) this.f337964a;
        C121792h hVar = this.f337965b;
        ReentrantLock reentrantLock = hVar.f337990b;
        reentrantLock.lock();
        try {
            if (C69664n.m101066l(ahVar, C121766ao.f337925a)) {
                hVar.f337991c.f337969a = C121792h.m201213b(hVar.f337989a);
            } else if (C69664n.m101066l(ahVar, C121775ax.f337941a)) {
                hVar.f337991c.f337970b = C121792h.m201213b(hVar.f337989a);
            } else if (C69664n.m101066l(ahVar, C121774aw.f337940a)) {
                hVar.f337991c.f337971c = C121792h.m201213b(hVar.f337989a);
            } else if (C69664n.m101066l(ahVar, C121778b.f337948a)) {
                hVar.f337991c.f337972d = C121792h.m201213b(hVar.f337989a);
            } else if (C69664n.m101066l(ahVar, C121751a.f337863a)) {
                hVar.f337991c.f337973e = C121792h.m201213b(hVar.f337989a);
            } else if (ahVar instanceof C121765an) {
                List list = hVar.f337991c.f337974f;
                Instant b = C121792h.m201213b(hVar.f337989a);
                C69664n.m101060f(b, "clock.now()");
                C121765an anVar = (C121765an) ahVar;
                list.add(new C121788d(b, anVar.f337923a, anVar.f337924b));
            } else if (ahVar instanceof C121777az) {
                C121777az azVar = (C121777az) ahVar;
                if (hVar.f337991c.f337975g.containsKey(Integer.valueOf(azVar.f337944b))) {
                    reentrantLock.unlock();
                    return C69788q.f186170a;
                }
                Map map = hVar.f337991c.f337975g;
                int i = azVar.f337944b;
                Integer valueOf = Integer.valueOf(i);
                Instant instant = azVar.f337943a;
                Instant b2 = C121792h.m201213b(hVar.f337989a);
                C69664n.m101060f(b2, "clock.now()");
                map.put(valueOf, new C121790f(i, instant, b2, azVar.f337945c, azVar.f337946d, azVar.f337947e));
            } else if (ahVar instanceof C121780bb) {
                List list2 = hVar.f337991c.f337976h;
                C121780bb bbVar = (C121780bb) ahVar;
                Instant instant2 = bbVar.f337950a;
                Instant b3 = C121792h.m201213b(hVar.f337989a);
                C69664n.m101060f(b3, "clock.now()");
                list2.add(new C121791g(instant2, b3, bbVar.f337951b));
            } else if (ahVar instanceof C121779ba) {
                C121790f fVar = (C121790f) hVar.f337991c.f337975g.get(Integer.valueOf(((C121779ba) ahVar).f337949a));
                if (fVar == null) {
                    reentrantLock.unlock();
                    return C69788q.f186170a;
                }
                fVar.f337977a = C121792h.m201213b(hVar.f337989a);
            } else if (ahVar instanceof C121786bh) {
                C121790f fVar2 = (C121790f) hVar.f337991c.f337975g.get(Integer.valueOf(((C121786bh) ahVar).f337963a));
                if (fVar2 == null) {
                    reentrantLock.unlock();
                    return C69788q.f186170a;
                }
                fVar2.f337978b = C121792h.m201213b(hVar.f337989a);
            } else if (ahVar instanceof C121785bg) {
                C121790f fVar3 = (C121790f) hVar.f337991c.f337975g.get(Integer.valueOf(((C121785bg) ahVar).f337962a));
                if (fVar3 == null) {
                    reentrantLock.unlock();
                    return C69788q.f186170a;
                }
                fVar3.f337979c = C121792h.m201213b(hVar.f337989a);
            }
            return C69788q.f186170a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121787c cVar = new C121787c(this.f337965b, gVar);
        cVar.f337964a = obj;
        return cVar;
    }
}
