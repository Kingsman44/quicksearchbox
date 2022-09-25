package kotlinx.coroutines.p5573a;

import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.C71601bb;
import kotlinx.coroutines.C71807q;
import kotlinx.coroutines.C71809s;
import kotlinx.coroutines.p5579e.C71693aa;
import kotlinx.coroutines.p5579e.C71708ap;
import p5462h.C69714l;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.b */
/* compiled from: PG */
final class C71369b extends C71362ap {

    /* renamed from: a */
    public final C71807q f190555a;

    /* renamed from: b */
    public final int f190556b;

    public C71369b(C71807q qVar, int i) {
        this.f190555a = qVar;
        this.f190556b = i;
    }

    /* renamed from: a */
    public final Object mo62731a(Object obj) {
        return this.f190556b == 1 ? new C71348ab(obj) : obj;
    }

    /* renamed from: b */
    public final C71708ap mo62696b(Object obj, C71693aa aaVar) {
        if (this.f190555a.mo63033d(mo62731a(obj), aaVar != null ? aaVar.f191154c : null, (C69626l) null) == null) {
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
        this.f190555a.mo63040m();
    }

    /* renamed from: d */
    public final void mo62717d(C71352af afVar) {
        C69664n.m101061g(afVar, "closed");
        if (this.f190556b == 1) {
            this.f190555a.mo61338mb(new C71348ab(new C71393z(afVar.f190545a)));
        } else {
            this.f190555a.mo61338mb(C69714l.m101133a(afVar.mo62700g()));
        }
    }

    public final String toString() {
        String b = C71601bb.m104527b(this);
        int i = this.f190556b;
        return "ReceiveElement@" + b + "[receiveMode=" + i + "]";
    }
}
