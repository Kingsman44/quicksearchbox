package p5462h.p5466c.p5468b.p5469a;

import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;

/* renamed from: h.c.b.a.h */
/* compiled from: PG */
public abstract class C69570h extends C69563a {
    public C69570h(C69577g gVar) {
        super(gVar);
        if (gVar != null && gVar.mo61340lY() != C69586p.f185991a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    /* renamed from: lY */
    public final C69585o mo61340lY() {
        return C69586p.f185991a;
    }
}
