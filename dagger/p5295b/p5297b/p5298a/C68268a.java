package dagger.p5295b.p5297b.p5298a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import dagger.p5295b.p5297b.C68276c;

/* renamed from: dagger.b.b.a.a */
/* compiled from: PG */
final class C68268a extends C68276c {

    /* renamed from: a */
    private final C58485gu f184630a;

    public C68268a(C58485gu guVar) {
        this.f184630a = guVar;
    }

    /* renamed from: a */
    public final void mo54578a(Throwable th) {
        C58485gu lD = this.f184630a.mo55401lD();
        int size = lD.size();
        for (int i = 0; i < size; i++) {
            C68276c cVar = (C68276c) lD.get(i);
            try {
                cVar.mo54578a(th);
            } catch (RuntimeException e) {
                C68274g.m98606c(e, cVar, "failed", th);
            }
        }
    }

    /* renamed from: b */
    public final void mo51658b() {
        C58485gu guVar = this.f184630a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C68276c cVar = (C68276c) guVar.get(i2);
            try {
                cVar.mo51658b();
            } catch (RuntimeException e) {
                C68274g.m98608e(e, cVar, "requested");
            }
        }
    }

    /* renamed from: c */
    public final void mo54579c(Object obj) {
        C58485gu lD = this.f184630a.mo55401lD();
        int size = lD.size();
        for (int i = 0; i < size; i++) {
            C68276c cVar = (C68276c) lD.get(i);
            try {
                cVar.mo54579c(obj);
            } catch (RuntimeException e) {
                C68274g.m98606c(e, cVar, "succeeded", obj);
            }
        }
    }

    /* renamed from: d */
    public final void mo51659d() {
        C58485gu lD = this.f184630a.mo55401lD();
        int size = lD.size();
        for (int i = 0; i < size; i++) {
            C68276c cVar = (C68276c) lD.get(i);
            try {
                cVar.mo51659d();
            } catch (RuntimeException e) {
                C68274g.m98608e(e, cVar, "methodFinished");
            }
        }
    }

    /* renamed from: e */
    public final void mo51660e() {
        C58485gu guVar = this.f184630a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C68276c cVar = (C68276c) guVar.get(i2);
            try {
                cVar.mo51660e();
            } catch (RuntimeException e) {
                C68274g.m98608e(e, cVar, "methodStarting");
            }
        }
    }

    /* renamed from: f */
    public final void mo54580f() {
        C58485gu guVar = this.f184630a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C68276c cVar = (C68276c) guVar.get(i2);
            try {
                cVar.mo54580f();
            } catch (RuntimeException e) {
                C68274g.m98608e(e, cVar, "ready");
            }
        }
    }
}
