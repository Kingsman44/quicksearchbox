package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69497an;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.manager.impl.InvocationDebugDataTracker$invocationListeningJob$2", mo61344c = "InvocationDebugDataTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.d */
/* compiled from: PG */
final class C121697d extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C121698e f337643a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121697d(C121698e eVar, C69577g gVar) {
        super(3, gVar);
        this.f337643a = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C121697d(this.f337643a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C121698e eVar = this.f337643a;
        ReentrantLock reentrantLock = eVar.f337646c;
        reentrantLock.lock();
        try {
            for (C121691at b : eVar.f337647d.f337562g.values()) {
                b.mo105302b();
            }
            C121671a aVar2 = eVar.f337647d;
            eVar.f337647d = C121671a.m201066a(aVar2, false, (List) null, C69497an.f185919a, C69540x.m100831M(aVar2.f337563h, aVar2.f337562g.values()), 63);
            reentrantLock.unlock();
            return C69788q.f186170a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
