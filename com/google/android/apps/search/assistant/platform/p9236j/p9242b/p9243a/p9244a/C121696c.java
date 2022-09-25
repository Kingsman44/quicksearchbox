package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import com.google.android.apps.gsa.binaries.satin.app.aqj;
import com.google.android.apps.gsa.binaries.satin.app.aqk;
import com.google.android.apps.gsa.binaries.satin.app.aql;
import com.google.android.apps.gsa.binaries.satin.app.aqm;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33733c;
import com.google.common.p4580v.C60950i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71646cs;
import kotlinx.coroutines.p5579e.C71726h;
import p3186j$.time.Instant;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.manager.impl.InvocationDebugDataTracker$invocationListeningJob$1", mo61344c = "InvocationDebugDataTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.c */
/* compiled from: PG */
final class C121696c extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f337641a;

    /* renamed from: b */
    final /* synthetic */ C121698e f337642b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121696c(C121698e eVar, C69577g gVar) {
        super(2, gVar);
        this.f337642b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121696c) mo5194c((C69685i) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Iterable iterable;
        Map map;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C69685i iVar = (C69685i) this.f337641a;
        C121699f fVar = (C121699f) iVar.f186052a;
        C121699f fVar2 = (C121699f) iVar.f186053b;
        if (fVar2 != null) {
            if (fVar == null || (map = fVar.f337651b) == null || (iterable = map.values()) == null) {
                iterable = C69498ao.f185920a;
            }
            Collection values = fVar2.f337651b.values();
            C121698e eVar = this.f337642b;
            Set<C33733c> ab = C69540x.m100846ab(C69540x.m100829K(iterable, values));
            ReentrantLock reentrantLock = eVar.f337646c;
            reentrantLock.lock();
            try {
                ArrayList<C121691at> arrayList = new ArrayList<>();
                for (C33733c cVar : ab) {
                    C121691at atVar = (C121691at) eVar.f337647d.f337562g.get(cVar);
                    if (atVar != null) {
                        arrayList.add(atVar);
                    }
                }
                for (C121691at b : arrayList) {
                    b.mo105302b();
                }
                C121671a aVar2 = eVar.f337647d;
                eVar.f337647d = C121671a.m201066a(aVar2, false, (List) null, C69505av.m100868j(aVar2.f337562g, ab), C69540x.m100831M(eVar.f337647d.f337563h, arrayList), 63);
                reentrantLock.unlock();
                C121698e eVar2 = this.f337642b;
                Set<C33733c> ab2 = C69540x.m100846ab(C69540x.m100829K(values, iterable));
                ReentrantLock reentrantLock2 = eVar2.f337646c;
                reentrantLock2.lock();
                try {
                    ArrayList arrayList2 = new ArrayList(C69540x.m100804k(ab2, 10));
                    for (C33733c cVar2 : ab2) {
                        aqj aqj = eVar2.f337649f;
                        C71422aw awVar = eVar2.f337645b;
                        C71646cs csVar = new C71646cs(eVar2.f337648e);
                        C69664n.m101061g(awVar, "<this>");
                        arrayList2.add(new C69685i(cVar2, new C121691at(cVar2, new C71726h(awVar.mo5702lZ().plus(csVar)), (C60950i) aqj.f199884a.a.bC.mo17428b(), (aqk) aqj.f199884a.a.kf.mo17428b(), (aql) aqj.f199884a.a.kg.mo17428b(), (aqm) aqj.f199884a.a.kh.mo17428b())));
                    }
                    C121671a aVar3 = eVar2.f337647d;
                    eVar2.f337647d = C121671a.m201066a(aVar3, false, (List) null, C69505av.m100871m(aVar3.f337562g, arrayList2), (List) null, 191);
                    if (fVar == null || fVar.f337650a != fVar2.f337650a) {
                        C121698e eVar3 = this.f337642b;
                        C121700g gVar = fVar2.f337650a;
                        boolean z = fVar2.f337652c;
                        ReentrantLock reentrantLock3 = eVar3.f337646c;
                        reentrantLock3.lock();
                        try {
                            C121671a aVar4 = eVar3.f337647d;
                            List list = aVar4.f337561f;
                            Instant a = eVar3.f337644a.mo57444a();
                            C69664n.m101060f(a, "timeSource.now()");
                            eVar3.f337647d = C121671a.m201066a(aVar4, z, C69540x.m100832N(list, new C121695b(a, gVar)), (Map) null, (List) null, 207);
                            if (z) {
                                eVar3.f337648e.mo62723u((CancellationException) null);
                            }
                        } finally {
                            reentrantLock3.unlock();
                        }
                    }
                    return C69788q.f186170a;
                } finally {
                    reentrantLock2.unlock();
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121696c cVar = new C121696c(this.f337642b, gVar);
        cVar.f337641a = obj;
        return cVar;
    }
}
