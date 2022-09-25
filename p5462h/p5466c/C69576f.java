package p5462h.p5466c;

import com.evernote.android.state.BuildConfig;
import java.io.Serializable;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69646ac;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.c.f */
/* compiled from: PG */
public final class C69576f implements Serializable, C69585o {

    /* renamed from: a */
    private final C69585o f185986a;

    /* renamed from: b */
    private final C69582l f185987b;

    public C69576f(C69585o oVar, C69582l lVar) {
        C69664n.m101061g(oVar, "left");
        C69664n.m101061g(lVar, "element");
        this.f185986a = oVar;
        this.f185987b = lVar;
    }

    /* renamed from: a */
    private final int m100987a() {
        int i = 2;
        C69576f fVar = this;
        while (true) {
            C69585o oVar = fVar.f185986a;
            fVar = oVar instanceof C69576f ? (C69576f) oVar : null;
            if (fVar == null) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: b */
    private final boolean m100988b(C69582l lVar) {
        return C69664n.m101066l(get(lVar.getKey()), lVar);
    }

    private final Object writeReplace() {
        int a = m100987a();
        C69585o[] oVarArr = new C69585o[a];
        C69646ac acVar = new C69646ac();
        fold(C69788q.f186170a, new C69575e(oVarArr, acVar));
        if (acVar.f186025a == a) {
            return new C69573c(oVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C69576f) {
            C69576f fVar = (C69576f) obj;
            if (fVar.m100987a() == m100987a()) {
                C69576f fVar2 = this;
                while (true) {
                    if (!fVar.m100988b(fVar2.f185987b)) {
                        break;
                    }
                    C69585o oVar = fVar2.f185986a;
                    if (oVar instanceof C69576f) {
                        fVar2 = (C69576f) oVar;
                    } else {
                        C69664n.m101059e(oVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        if (fVar.m100988b((C69582l) oVar)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public final Object fold(Object obj, C69630p pVar) {
        C69664n.m101061g(pVar, "operation");
        return pVar.mo5192a(this.f185986a.fold(obj, pVar), this.f185987b);
    }

    public final C69582l get(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        C69576f fVar = this;
        while (true) {
            C69582l lVar = fVar.f185987b.get(mVar);
            if (lVar != null) {
                return lVar;
            }
            C69585o oVar = fVar.f185986a;
            if (!(oVar instanceof C69576f)) {
                return oVar.get(mVar);
            }
            fVar = (C69576f) oVar;
        }
    }

    public final int hashCode() {
        return this.f185986a.hashCode() + this.f185987b.hashCode();
    }

    public final C69585o minusKey(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        if (this.f185987b.get(mVar) != null) {
            return this.f185986a;
        }
        C69585o minusKey = this.f185986a.minusKey(mVar);
        if (minusKey == this.f185986a) {
            return this;
        }
        if (minusKey == C69586p.f185991a) {
            return this.f185987b;
        }
        return new C69576f(minusKey, this.f185987b);
    }

    public final C69585o plus(C69585o oVar) {
        return C69580j.m100993a(this, oVar);
    }

    public final String toString() {
        return "[" + ((String) fold(BuildConfig.FLAVOR, C69574d.f185983a)) + ']';
    }
}
