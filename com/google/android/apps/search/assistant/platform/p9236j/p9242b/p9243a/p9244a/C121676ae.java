package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69497an;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.manager.impl.InvocationStoreDebugDataDumper$initialize$1$coroutine$3", mo61344c = "InvocationStoreDebugDataDumper.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.ae */
/* compiled from: PG */
final class C121676ae extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C121681aj f337569a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121676ae(C121681aj ajVar, C69577g gVar) {
        super(3, gVar);
        this.f337569a = ajVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C121676ae(this.f337569a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C121681aj ajVar = this.f337569a;
        ReentrantLock reentrantLock = ajVar.f337578c;
        reentrantLock.lock();
        try {
            ajVar.f337580e.addAll(ajVar.f337579d.values());
            ajVar.f337579d = C69497an.f185919a;
            reentrantLock.unlock();
            return C69788q.f186170a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
