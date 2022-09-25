package p5462h.p5466c.p5468b.p5469a;

import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69579i;
import p5462h.p5466c.C69582l;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.c.b.a.c */
/* compiled from: PG */
public abstract class C69565c extends C69563a {

    /* renamed from: s */
    public final C69585o f185974s;

    /* renamed from: t */
    public transient C69577g f185975t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69565c(C69577g gVar) {
        super(gVar);
        C69585o lY = gVar != null ? gVar.mo61340lY() : null;
        this.f185974s = lY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo61337i() {
        C69577g gVar = this.f185975t;
        if (!(gVar == null || gVar == this)) {
            C69582l lVar = mo61340lY().get(C69579i.f185989a);
            C69664n.m101058d(lVar);
            ((C69579i) lVar).mo61351b(gVar);
        }
        this.f185975t = C69564b.f185973a;
    }

    /* renamed from: lY */
    public C69585o mo61340lY() {
        C69585o oVar = this.f185974s;
        C69664n.m101058d(oVar);
        return oVar;
    }

    public C69565c(C69577g gVar, C69585o oVar) {
        super(gVar);
        this.f185974s = oVar;
    }
}
