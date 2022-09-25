package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.resources.assistdata.AssistDataDebugDataTracker$1", mo61344c = "AssistDataDebugDataTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.a.a */
/* compiled from: PG */
final class C121724a extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f337762a;

    /* renamed from: b */
    final /* synthetic */ C121727d f337763b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121724a(C121727d dVar, C69577g gVar) {
        super(2, gVar);
        this.f337763b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121724a) mo5194c((C121728e) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C121728e eVar = (C121728e) this.f337762a;
        C121727d dVar = this.f337763b;
        ReentrantLock reentrantLock = dVar.f337772b;
        reentrantLock.lock();
        try {
            C121725b bVar = dVar.f337773c;
            List list = bVar.f337768e;
            Instant a = dVar.f337771a.mo57444a();
            C69664n.m101060f(a, "timeSource.now()");
            List N = C69540x.m100832N(list, new C121726c(a, eVar));
            C33514d dVar2 = bVar.f337764a;
            boolean z = bVar.f337765b;
            boolean z2 = bVar.f337766c;
            boolean z3 = bVar.f337767d;
            C69664n.m101061g(N, "events");
            dVar.f337773c = new C121725b(dVar2, z, z2, z3, N);
            reentrantLock.unlock();
            return C69788q.f186170a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121724a aVar = new C121724a(this.f337763b, gVar);
        aVar.f337762a = obj;
        return aVar;
    }
}
