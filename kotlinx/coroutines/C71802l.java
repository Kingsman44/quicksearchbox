package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import p5462h.p5473f.p5474a.C69630p;

/* renamed from: kotlinx.coroutines.l */
/* compiled from: PG */
public final /* synthetic */ class C71802l {
    /* renamed from: a */
    public static final Object m105039a(C69630p pVar) {
        Thread currentThread = Thread.currentThread();
        ThreadLocal threadLocal = C71687dw.f191139a;
        C71619bt a = C71687dw.m104785a();
        C71786j jVar = new C71786j(C71405al.m104171b(C71634cg.f191075a, a), currentThread, a);
        jVar.mo62684m(C71424ay.DEFAULT, jVar, pVar);
        C71619bt btVar = jVar.f191308b;
        if (btVar != null) {
            btVar.mo62846n(false);
        }
        while (!Thread.interrupted()) {
            try {
                C71619bt btVar2 = jVar.f191308b;
                long k = btVar2 != null ? btVar2.mo62843k() : Long.MAX_VALUE;
                if (!jVar.mo62875x()) {
                    LockSupport.parkNanos(jVar, k);
                } else {
                    Object b = C71666db.m104742b(jVar.mo62913mh());
                    C71396ac acVar = b instanceof C71396ac ? (C71396ac) b : null;
                    if (acVar == null) {
                        return b;
                    }
                    throw acVar.f190604b;
                }
            } finally {
                C71619bt btVar3 = jVar.f191308b;
                if (btVar3 != null) {
                    btVar3.mo62844l(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        jVar.mo62907M(interruptedException);
        throw interruptedException;
    }
}
