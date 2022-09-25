package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71706an;
import kotlinx.coroutines.p5579e.C71715aw;
import p5462h.C69685i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69579i;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.ec */
/* compiled from: PG */
public final class C71747ec extends C71706an {

    /* renamed from: b */
    private final ThreadLocal f191230b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71747ec(C69585o oVar, C69577g gVar) {
        super(oVar.get(C71748ed.f191231a) == null ? oVar.plus(C71748ed.f191231a) : oVar, gVar);
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(gVar, "uCont");
        this.f191230b = new ThreadLocal();
        if (!(gVar.mo61340lY().get(C69579i.f185989a) instanceof C71414ao)) {
            Object b = C71715aw.m104856b(oVar, (Object) null);
            C71715aw.m104857c(oVar, b);
            mo62989S(oVar, b);
        }
    }

    /* renamed from: S */
    public final void mo62989S(C69585o oVar, Object obj) {
        C69664n.m101061g(oVar, "context");
        this.f191230b.set(new C69685i(oVar, obj));
    }

    /* renamed from: T */
    public final boolean mo62990T() {
        if (this.f191230b.get() == null) {
            return false;
        }
        this.f191230b.set((Object) null);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ma */
    public final void mo62685ma(Object obj) {
        C69685i iVar = (C69685i) this.f191230b.get();
        C71747ec ecVar = null;
        if (iVar != null) {
            C71715aw.m104857c((C69585o) iVar.f186052a, iVar.f186053b);
            this.f191230b.set((Object) null);
        }
        Object a = C71400ag.m104164a(obj, this.f191173e);
        C69577g gVar = this.f191173e;
        C69585o lY = gVar.mo61340lY();
        Object b = C71715aw.m104856b(lY, (Object) null);
        if (b != C71715aw.f191181a) {
            ecVar = C71405al.m104172c(gVar, lY, b);
        }
        try {
            this.f191173e.mo61338mb(a);
            if (ecVar == null || ecVar.mo62990T()) {
                C71715aw.m104857c(lY, b);
            }
        } catch (Throwable th) {
            if (ecVar == null || ecVar.mo62990T()) {
                C71715aw.m104857c(lY, b);
            }
            throw th;
        }
    }
}
