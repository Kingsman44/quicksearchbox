package kotlinx.coroutines.p5573a;

import kotlinx.coroutines.C71417ar;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.ao */
/* compiled from: PG */
public final class C71361ao extends C71390w implements C71422aw, C71367au {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71361ao(C69585o oVar, C71389v vVar) {
        super(oVar, vVar);
        C69664n.m101061g(oVar, "parentContext");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo62681j(Throwable th, boolean z) {
        C69664n.m101061g(th, "cause");
        if (!this.f190597b.mo62727D(th) && !z) {
            C71417ar.m104192b(this.f190536a, th);
        }
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo62682k(Object obj) {
        C69664n.m101061g((C69788q) obj, "value");
        this.f190597b.mo62727D((Throwable) null);
    }
}
