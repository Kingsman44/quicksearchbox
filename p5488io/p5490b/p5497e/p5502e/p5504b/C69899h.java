package p5488io.p5490b.p5497e.p5502e.p5504b;

import java.util.Iterator;
import org.p5649d.C72639b;
import p5488io.p5490b.C70092f;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5500c.C69842a;
import p5488io.p5490b.p5497e.p5512i.C70078b;

/* renamed from: io.b.e.e.b.h */
/* compiled from: PG */
public final class C69899h extends C70092f {

    /* renamed from: b */
    final Iterable f186332b;

    public C69899h(Iterable iterable) {
        this.f186332b = iterable;
    }

    /* renamed from: e */
    public final void mo61492e(C72639b bVar) {
        try {
            Iterator it = this.f186332b.iterator();
            try {
                if (!it.hasNext()) {
                    bVar.mo61494a(C70078b.f186808a);
                    bVar.mo61499lK();
                } else if (bVar instanceof C69842a) {
                    bVar.mo61494a(new C69897f((C69842a) bVar, it));
                } else {
                    bVar.mo61494a(new C69898g(bVar, it));
                }
            } catch (Throwable th) {
                C69813f.m101292a(th);
                C70078b.m101964f(th, bVar);
            }
        } catch (Throwable th2) {
            C69813f.m101292a(th2);
            C70078b.m101964f(th2, bVar);
        }
    }
}
