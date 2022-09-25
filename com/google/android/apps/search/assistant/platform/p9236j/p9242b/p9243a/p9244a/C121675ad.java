package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import com.google.android.apps.gsa.binaries.satin.app.aqi;
import com.google.android.apps.gsa.binaries.satin.app.aqj;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.common.p4580v.C60950i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71422aw;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.manager.impl.InvocationStoreDebugDataDumper$initialize$1$coroutine$2", mo61344c = "InvocationStoreDebugDataDumper.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.ad */
/* compiled from: PG */
final class C121675ad extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f337567a;

    /* renamed from: b */
    final /* synthetic */ C121681aj f337568b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121675ad(C121681aj ajVar, C69577g gVar) {
        super(2, gVar);
        this.f337568b = ajVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121675ad) mo5194c((C69685i) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C69685i iVar = (C69685i) this.f337567a;
        Collection collection = (Collection) iVar.f186052a;
        Collection collection2 = (Collection) iVar.f186053b;
        C121681aj ajVar = this.f337568b;
        Set<C121706m> ab = C69540x.m100846ab(C69540x.m100829K(collection, collection2));
        ReentrantLock reentrantLock = ajVar.f337578c;
        reentrantLock.lock();
        try {
            ArrayList<C34053bp> arrayList = new ArrayList<>(C69540x.m100804k(ab, 10));
            for (C121706m mVar : ab) {
                arrayList.add(mVar.f337671a);
            }
            ArrayList arrayList2 = new ArrayList();
            for (C34053bp bpVar : arrayList) {
                C121698e eVar = (C121698e) ajVar.f337579d.get(bpVar);
                if (eVar != null) {
                    arrayList2.add(eVar);
                }
            }
            ajVar.f337579d = C69505av.m100868j(ajVar.f337579d, arrayList);
            ajVar.f337580e.addAll(arrayList2);
            reentrantLock.unlock();
            C121681aj ajVar2 = this.f337568b;
            Set<C121706m> ab2 = C69540x.m100846ab(C69540x.m100829K(collection2, collection));
            ReentrantLock reentrantLock2 = ajVar2.f337578c;
            reentrantLock2.lock();
            try {
                Map map = ajVar2.f337579d;
                ArrayList arrayList3 = new ArrayList(C69540x.m100804k(ab2, 10));
                for (C121706m mVar2 : ab2) {
                    C34053bp bpVar2 = mVar2.f337671a;
                    aqi aqi = ajVar2.f337581f;
                    arrayList3.add(new C69685i(bpVar2, new C121698e(mVar2, (C60950i) aqi.f199883a.a.bC.mo17428b(), (aqj) aqi.f199883a.a.ki.mo17428b(), (C71422aw) aqi.f199883a.a.H.mo17428b())));
                }
                ajVar2.f337579d = C69505av.m100871m(map, arrayList3);
                reentrantLock2.unlock();
                return C69788q.f186170a;
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121675ad adVar = new C121675ad(this.f337568b, gVar);
        adVar.f337567a = obj;
        return adVar;
    }
}
