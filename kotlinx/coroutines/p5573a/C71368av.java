package kotlinx.coroutines.p5573a;

import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.C71601bb;
import kotlinx.coroutines.C71807q;
import kotlinx.coroutines.C71809s;
import kotlinx.coroutines.p5579e.C71693aa;
import kotlinx.coroutines.p5579e.C71708ap;
import p5462h.C69714l;
import p5462h.C69788q;

/* renamed from: kotlinx.coroutines.a.av */
/* compiled from: PG */
public final class C71368av extends C71366at {

    /* renamed from: a */
    public final C71807q f190553a;

    /* renamed from: b */
    private final Object f190554b;

    public C71368av(Object obj, C71807q qVar) {
        this.f190554b = obj;
        this.f190553a = qVar;
    }

    /* renamed from: a */
    public final Object mo62695a() {
        return this.f190554b;
    }

    /* renamed from: d */
    public final void mo62698d(C71352af afVar) {
        this.f190553a.mo61338mb(C69714l.m101133a(afVar.mo62701h()));
    }

    /* renamed from: mm */
    public final C71708ap mo62702mm(C71693aa aaVar) {
        if (this.f190553a.mo63032a(C69788q.f186170a, aaVar != null ? aaVar.f191154c : null) == null) {
            return null;
        }
        boolean z = C71600ba.f191036a;
        if (aaVar != null) {
            aaVar.f191154c.mo62937k(aaVar);
        }
        return C71809s.f191342a;
    }

    /* renamed from: mn */
    public final void mo62703mn() {
        this.f190553a.mo63040m();
    }

    public final String toString() {
        String a = C71601bb.m104526a(this);
        String b = C71601bb.m104527b(this);
        Object obj = this.f190554b;
        return a + "@" + b + "(" + obj + ")";
    }
}
