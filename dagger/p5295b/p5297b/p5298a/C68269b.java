package dagger.p5295b.p5297b.p5298a;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58724pq;
import dagger.p5295b.p5297b.C68280g;
import dagger.p5295b.p5297b.C68281h;

/* renamed from: dagger.b.b.a.b */
/* compiled from: PG */
final class C68269b extends C68280g {

    /* renamed from: a */
    private final C58485gu f184631a;

    public C68269b(Iterable iterable) {
        this.f184631a = C58485gu.m89841i(iterable);
    }

    /* renamed from: a */
    public final C68281h mo51662a(Object obj) {
        C58480gp e = C58485gu.m89837e();
        C58485gu guVar = this.f184631a;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C68280g gVar = (C68280g) guVar.get(i);
            try {
                C68281h a = gVar.mo51662a(obj);
                if (a != null) {
                    e.mo55395g(a);
                }
            } catch (RuntimeException e2) {
                C68274g.m98605b(e2, gVar, obj);
            }
        }
        C58485gu f = e.mo55394f();
        if (!f.isEmpty()) {
            return ((C58724pq) f).f156474d == 1 ? new C68273f((C68281h) C58557jl.m90133n(f)) : new C68270c(f);
        }
        return C68281h.f184641b;
    }
}
