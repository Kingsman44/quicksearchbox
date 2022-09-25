package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.Callable;
import p5488io.p5490b.C70122n;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5497e.p5499b.C69841j;

/* renamed from: io.b.e.e.d.bl */
/* compiled from: PG */
public final class C69958bl {
    /* renamed from: a */
    public static boolean m101667a(C70122n nVar, C70123o oVar, C69822d dVar) {
        if (!(nVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) nVar).call();
            if (call == null) {
                C69829e.m101314d(oVar);
                return true;
            }
            try {
                C70122n nVar2 = (C70122n) dVar.mo25875a(call);
                C69841j.m101337b(nVar2, "The mapper returned a null ObservableSource");
                if (nVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) nVar2).call();
                        if (call2 == null) {
                            C69829e.m101314d(oVar);
                            return true;
                        }
                        C69957bk bkVar = new C69957bk(oVar, call2);
                        oVar.mo26850d(bkVar);
                        bkVar.run();
                    } catch (Throwable th) {
                        C69813f.m101292a(th);
                        C69829e.m101316g(th, oVar);
                        return true;
                    }
                } else {
                    nVar2.mo61539p(oVar);
                }
                return true;
            } catch (Throwable th2) {
                C69813f.m101292a(th2);
                C69829e.m101316g(th2, oVar);
                return true;
            }
        } catch (Throwable th3) {
            C69813f.m101292a(th3);
            C69829e.m101316g(th3, oVar);
            return true;
        }
    }
}
