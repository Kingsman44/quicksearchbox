package dagger.p5295b.p5297b.p5298a;

import dagger.p5295b.p5297b.C68276c;

/* renamed from: dagger.b.b.a.d */
/* compiled from: PG */
final class C68271d extends C68276c {

    /* renamed from: a */
    private final C68276c f184633a;

    public C68271d(C68276c cVar) {
        this.f184633a = cVar;
    }

    /* renamed from: a */
    public final void mo54578a(Throwable th) {
        try {
            this.f184633a.mo54578a(th);
        } catch (RuntimeException e) {
            C68274g.m98606c(e, this.f184633a, "failed", th);
        }
    }

    /* renamed from: b */
    public final void mo51658b() {
        try {
            this.f184633a.mo51658b();
        } catch (RuntimeException e) {
            C68274g.m98608e(e, this.f184633a, "requested");
        }
    }

    /* renamed from: c */
    public final void mo54579c(Object obj) {
        try {
            this.f184633a.mo54579c(obj);
        } catch (RuntimeException e) {
            C68274g.m98606c(e, this.f184633a, "succeeded", obj);
        }
    }

    /* renamed from: d */
    public final void mo51659d() {
        try {
            this.f184633a.mo51659d();
        } catch (RuntimeException e) {
            C68274g.m98608e(e, this.f184633a, "methodFinished");
        }
    }

    /* renamed from: e */
    public final void mo51660e() {
        try {
            this.f184633a.mo51660e();
        } catch (RuntimeException e) {
            C68274g.m98608e(e, this.f184633a, "methodStarting");
        }
    }

    /* renamed from: f */
    public final void mo54580f() {
        try {
            this.f184633a.mo54580f();
        } catch (RuntimeException e) {
            C68274g.m98608e(e, this.f184633a, "ready");
        }
    }
}
