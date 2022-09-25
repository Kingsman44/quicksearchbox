package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a;

import com.google.android.apps.gsa.binaries.satin.app.ank;
import com.google.android.apps.gsa.binaries.satin.app.aqs;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34155aa;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34412b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34418h;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34419i;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34420j;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34422l;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34426p;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34427q;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34428r;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34429s;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34435y;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69677g;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69514bd;
import p5462h.p5463a.p5464a.C69483q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.connections.impl.TriggeringConnectionManagerImpl$connect$1", mo61344c = "TriggeringConnectionManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {38})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.a.a.q */
/* compiled from: PG */
public final class C34371q extends C69572j implements C69630p {

    /* renamed from: a */
    int f91372a;

    /* renamed from: b */
    final /* synthetic */ C34372r f91373b;

    /* renamed from: c */
    final /* synthetic */ C71587n f91374c;

    /* renamed from: d */
    private /* synthetic */ Object f91375d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34371q(C34372r rVar, C71587n nVar, C69577g gVar) {
        super(2, gVar);
        this.f91373b = rVar;
        this.f91374c = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34371q) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object e;
        Object f;
        C34429s sVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91372a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f91375d;
            String format = String.format("connection-%07d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f91373b.f91378c.f91331a.getAndIncrement())}, 1));
            C69664n.m101060f(format, "format(this, *args)");
            ank ank = this.f91373b.f91379d;
            C34366l lVar = new C34366l(format, aoVar, (AccountId) ank.f199089a.b.f198239e.mo17428b(), (C46175b) ank.f199089a.b.f198398h.mo17428b(), (C34356b) ank.f199089a.b.f198027a.f199197aV.mo17428b(), (C69585o) ank.f199089a.a.fs.mo17428b(), (aqs) ank.f199089a.a.ji.mo17428b());
            C34373s sVar2 = this.f91373b.f91377b;
            ReentrantLock reentrantLock = sVar2.f91382c;
            reentrantLock.lock();
            try {
                C71548cy cyVar = sVar2.f91383d;
                do {
                    e = cyVar.mo62784e();
                    f = C69514bd.m100892f((Set) e, lVar);
                } while (!cyVar.mo62808g(e, f));
                if (f == null) {
                    C69664n.m101065k("afterChange");
                    f = C69788q.f186170a;
                }
                C69685i iVar = new C69685i(e, f);
                Set set = (Set) iVar.f186053b;
                C59052c cVar = (C59052c) C34373s.f91380a.mo56224b();
                cVar.mo56378ag(C58975e.f156826a, "TRG.Connections");
                String str = lVar.f91354b;
                int size = set.size();
                cVar.mo56379ah(new C59094n(51356));
                cVar.mo56352E("New connection(%s) added, total(%d).", str, size);
                if ((!set.isEmpty()) && ((Set) iVar.f186052a).isEmpty()) {
                    C34422l lVar2 = sVar2.f91381b;
                    if (lVar2.f91474d == null) {
                        C69483q qVar = new C69483q();
                        for (C34412b bVar : lVar2.f91471a) {
                            C34420j jVar = bVar.f91463b;
                            if (jVar instanceof C34418h) {
                                sVar = lVar2.f91472b;
                            } else if (jVar instanceof C34419i) {
                                sVar = new C34435y((C34155aa) lVar2.f91475e.f199896a.a.a.f202920gF.mo17428b(), (C34419i) jVar);
                            } else {
                                throw new C69677g();
                            }
                            C34428r rVar = new C34428r(bVar, sVar);
                            C71422aw awVar = lVar2.f91473c;
                            C69664n.m101061g(awVar, "scope");
                            qVar.add(C71594u.m104517d(C71477ah.m104295b(C71536cm.m104384b(rVar.f91496d, new C34426p(rVar, (C69577g) null)), new C34427q(rVar, (C69577g) null)), awVar));
                        }
                        qVar.f185913a.mo61117j();
                        lVar2.f91474d = qVar;
                    } else {
                        throw new IllegalStateException("Inconsistent 'onFirstClientConnected' event.");
                    }
                }
                reentrantLock.unlock();
                C71594u.m104517d(C71486aq.m104308b(C71477ah.m104295b(C71536cm.m104384b(this.f91374c, new C34367m(lVar, (C69577g) null)), new C34368n(aoVar, (C69577g) null)), new C34369o(format, (C69577g) null)), aoVar);
                C34370p pVar = new C34370p(lVar, this.f91373b);
                this.f91372a = 1;
                if (C71360an.m104022a(aoVar, pVar, this) == aVar) {
                    return aVar;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34371q qVar = new C34371q(this.f91373b, this.f91374c, gVar);
        qVar.f91375d = obj;
        return qVar;
    }
}
