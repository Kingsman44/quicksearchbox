package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71728j;
import kotlinx.coroutines.p5579e.C71729k;
import p5462h.p5466c.C69553a;
import p5462h.p5466c.C69562b;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69579i;
import p5462h.p5466c.C69582l;
import p5462h.p5466c.C69583m;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.ao */
/* compiled from: PG */
public abstract class C71414ao extends C69553a implements C69579i {

    /* renamed from: b */
    public static final C71407an f190623b = new C71407an();

    public C71414ao() {
        super(C69579i.f185989a);
    }

    /* renamed from: b */
    public final void mo61351b(C69577g gVar) {
        C71728j jVar = (C71728j) gVar;
        do {
        } while (jVar.f191206e.f190532a == C71729k.f191208b);
        Object obj = jVar.f191206e.f190532a;
        C71808r rVar = obj instanceof C71808r ? (C71808r) obj : null;
        if (rVar != null) {
            rVar.mo63047x();
        }
    }

    /* renamed from: d */
    public abstract void mo62766d(C69585o oVar, Runnable runnable);

    /* renamed from: e */
    public void mo62773e(C69585o oVar, Runnable runnable) {
        C69664n.m101061g(oVar, "context");
        mo62766d(oVar, runnable);
    }

    /* renamed from: f */
    public boolean mo62768f(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        return true;
    }

    public final C69582l get(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        if (mVar instanceof C69562b) {
            C69562b bVar = (C69562b) mVar;
            if (!bVar.mo61333b(getKey())) {
                return null;
            }
            C69582l a = bVar.mo61332a(this);
            if (a instanceof C69582l) {
                return a;
            }
            return null;
        } else if (C69579i.f185989a == mVar) {
            return this;
        } else {
            return null;
        }
    }

    /* renamed from: lW */
    public final C69577g mo61352lW(C69577g gVar) {
        return new C71728j(this, gVar);
    }

    public final C69585o minusKey(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        if (mVar instanceof C69562b) {
            C69562b bVar = (C69562b) mVar;
            if (bVar.mo61333b(getKey()) && bVar.mo61332a(this) != null) {
                return C69586p.f185991a;
            }
        } else if (C69579i.f185989a == mVar) {
            return C69586p.f185991a;
        }
        return this;
    }

    public String toString() {
        String a = C71601bb.m104526a(this);
        String b = C71601bb.m104527b(this);
        return a + "@" + b;
    }
}
