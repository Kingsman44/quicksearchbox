package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.Iterator;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5497e.p5499b.C69841j;

/* renamed from: io.b.e.e.d.al */
/* compiled from: PG */
public final class C69931al extends C70120l {

    /* renamed from: a */
    final Iterable f186397a;

    public C69931al(Iterable iterable) {
        this.f186397a = iterable;
    }

    /* renamed from: q */
    public final void mo61493q(C70123o oVar) {
        try {
            Iterator it = this.f186397a.iterator();
            try {
                if (!it.hasNext()) {
                    C69829e.m101314d(oVar);
                    return;
                }
                C69930ak akVar = new C69930ak(oVar, it);
                oVar.mo26850d(akVar);
                if (!akVar.f186394d) {
                    while (!akVar.f186393c) {
                        try {
                            Object next = akVar.f186392b.next();
                            C69841j.m101337b(next, "The iterator returned a null value");
                            akVar.f186391a.mo25988lL(next);
                            if (!akVar.f186393c) {
                                try {
                                    if (!akVar.f186392b.hasNext()) {
                                        if (!akVar.f186393c) {
                                            akVar.f186391a.mo25986a();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    C69813f.m101292a(th);
                                    akVar.f186391a.mo25987b(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            C69813f.m101292a(th2);
                            akVar.f186391a.mo25987b(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                C69813f.m101292a(th3);
                C69829e.m101316g(th3, oVar);
            }
        } catch (Throwable th4) {
            C69813f.m101292a(th4);
            C69829e.m101316g(th4, oVar);
        }
    }
}
