package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34422l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.C69685i;
import p5462h.C69788q;
import p5462h.p5463a.C69514bd;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.a.a.p */
/* compiled from: PG */
final class C34370p extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C34358d f91370a;

    /* renamed from: b */
    final /* synthetic */ C34372r f91371b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34370p(C34358d dVar, C34372r rVar) {
        super(0);
        this.f91370a = dVar;
        this.f91371b = rVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        Object e;
        Object d;
        C59052c cVar = (C59052c) C34372r.f91376a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.Connections");
        String str = ((C34366l) this.f91370a).f91354b;
        cVar.mo56379ah(new C59094n(51355));
        cVar.mo56389s("Connection(%s) completed.", str);
        C34373s sVar = this.f91371b.f91377b;
        C34358d dVar = this.f91370a;
        ReentrantLock reentrantLock = sVar.f91382c;
        reentrantLock.lock();
        try {
            C71548cy cyVar = sVar.f91383d;
            do {
                e = cyVar.mo62784e();
                d = C69514bd.m100890d((Set) e, dVar);
            } while (!cyVar.mo62808g(e, d));
            if (d == null) {
                C69664n.m101065k("afterChange");
                d = C69788q.f186170a;
            }
            C69685i iVar = new C69685i(e, d);
            Set set = (Set) iVar.f186053b;
            C59052c cVar2 = (C59052c) C34373s.f91380a.mo56224b();
            cVar2.mo56378ag(C58975e.f156826a, "TRG.Connections");
            String str2 = ((C34366l) dVar).f91354b;
            int size = set.size();
            cVar2.mo56379ah(new C59094n(51357));
            cVar2.mo56352E("Connection(%s) removed, total(%d).", str2, size);
            if ((!((Set) iVar.f186052a).isEmpty()) && set.isEmpty()) {
                C34422l lVar = sVar.f91381b;
                Set<C71643cp> set2 = lVar.f91474d;
                if (set2 != null) {
                    for (C71643cp u : set2) {
                        u.mo62723u((CancellationException) null);
                    }
                    lVar.f91474d = null;
                } else {
                    throw new IllegalStateException("Inconsistent 'onLastClientDisconnected' event.");
                }
            }
            reentrantLock.unlock();
            return C69788q.f186170a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
