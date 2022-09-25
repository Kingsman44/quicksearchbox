package dagger.p5295b.p5297b.p5298a;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58724pq;
import dagger.p5295b.p5297b.C68276c;
import dagger.p5295b.p5297b.C68277d;
import dagger.p5295b.p5297b.C68281h;

/* renamed from: dagger.b.b.a.c */
/* compiled from: PG */
final class C68270c extends C68281h {

    /* renamed from: a */
    private final C58485gu f184632a;

    public C68270c(C58485gu guVar) {
        this.f184632a = guVar;
    }

    /* renamed from: a */
    public final C68276c mo51661a(C68277d dVar) {
        C58480gp e = C58485gu.m89837e();
        C58485gu guVar = this.f184632a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C68281h hVar = (C68281h) guVar.get(i2);
            try {
                C68276c a = hVar.mo51661a(dVar);
                if (a != null) {
                    e.mo55395g(a);
                }
            } catch (RuntimeException e2) {
                C68274g.m98607d(e2, hVar, dVar);
            }
        }
        C58485gu f = e.mo55394f();
        if (!f.isEmpty()) {
            return ((C58724pq) f).f156474d == 1 ? new C68271d((C68276c) C58557jl.m90133n(f)) : new C68268a(f);
        }
        return C68276c.f184637e;
    }
}
