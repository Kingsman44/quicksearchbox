package kotlinx.coroutines.p5582h;

import kotlinx.coroutines.C71631cd;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.h.g */
/* compiled from: PG */
public class C71767g extends C71631cd {

    /* renamed from: c */
    private final C71763c f191275c;

    public C71767g(int i, int i2, long j) {
        this.f191275c = new C71763c(i, i2, j);
    }

    /* renamed from: c */
    public final void mo63006c(Runnable runnable, C71769i iVar, boolean z) {
        C69664n.m101061g(runnable, "block");
        C69664n.m101061g(iVar, "context");
        this.f191275c.mo62998c(runnable, iVar, z);
    }

    public void close() {
        this.f191275c.mo63001f();
    }

    /* renamed from: d */
    public final void mo62766d(C69585o oVar, Runnable runnable) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(runnable, "block");
        C71763c.m104959d(this.f191275c, runnable, false, 6);
    }

    /* renamed from: e */
    public final void mo62773e(C69585o oVar, Runnable runnable) {
        C69664n.m101061g(oVar, "context");
        C71763c.m104959d(this.f191275c, runnable, true, 2);
    }
}
