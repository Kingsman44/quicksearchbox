package kotlinx.coroutines.p5573a;

import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.C71601bb;
import kotlinx.coroutines.C71807q;
import kotlinx.coroutines.C71809s;
import kotlinx.coroutines.p5579e.C71693aa;
import kotlinx.coroutines.p5579e.C71708ap;
import kotlinx.coroutines.p5579e.C71742x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.c */
/* compiled from: PG */
final class C71370c extends C71362ap {

    /* renamed from: a */
    public final C71346a f190557a;

    /* renamed from: b */
    public final C71807q f190558b;

    public C71370c(C71346a aVar, C71807q qVar) {
        this.f190557a = aVar;
        this.f190558b = qVar;
    }

    /* renamed from: b */
    public final C71708ap mo62696b(Object obj, C71693aa aaVar) {
        C71807q qVar = this.f190558b;
        C71742x xVar = aaVar != null ? aaVar.f191154c : null;
        C71377j jVar = this.f190557a.f190537a;
        if (qVar.mo63033d(true, xVar, (C69626l) null) == null) {
            return null;
        }
        boolean z = C71600ba.f191036a;
        if (aaVar != null) {
            aaVar.f191154c.mo62937k(aaVar);
        }
        return C71809s.f191342a;
    }

    /* renamed from: c */
    public final void mo62697c(Object obj) {
        this.f190557a.f190538b = obj;
        this.f190558b.mo63040m();
    }

    /* renamed from: d */
    public final void mo62717d(C71352af afVar) {
        Object obj;
        C69664n.m101061g(afVar, "closed");
        if (afVar.f190545a == null) {
            obj = this.f190558b.mo63032a(false, (Object) null);
        } else {
            obj = this.f190558b.mo63034e(afVar.mo62700g());
        }
        if (obj != null) {
            this.f190557a.f190538b = afVar;
            this.f190558b.mo63040m();
        }
    }

    public final String toString() {
        return "ReceiveHasNext@".concat(String.valueOf(C71601bb.m104527b(this)));
    }
}
