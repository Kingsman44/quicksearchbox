package kotlinx.coroutines.p5574b.p5575a;

import java.util.ArrayList;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.C71601bb;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5573a.C71363aq;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.g */
/* compiled from: PG */
public abstract class C71450g implements C71431ac {

    /* renamed from: a */
    public final C69585o f190676a;

    /* renamed from: b */
    public final int f190677b;

    /* renamed from: c */
    public final C71387t f190678c;

    public C71450g(C69585o oVar, int i, C71387t tVar) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        this.f190676a = oVar;
        this.f190677b = i;
        this.f190678c = tVar;
        boolean z = C71600ba.f191036a;
    }

    /* renamed from: h */
    public static /* synthetic */ Object m104241h(C71450g gVar, C71588o oVar, C69577g gVar2) {
        Object a = C71423ax.m104196a(new C71448e(oVar, gVar, (C69577g) null), gVar2);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C71450g mo62793b(C69585o oVar, int i, C71387t tVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Object mo62794c(C71361ao aoVar, C69577g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo62795d() {
        return null;
    }

    /* renamed from: e */
    public C71363aq mo62796e(C71422aw awVar) {
        C69664n.m101061g(awVar, "scope");
        C69585o oVar = this.f190676a;
        int i = this.f190677b;
        return C71360an.m104023b(awVar, oVar, i == -3 ? -2 : i, this.f190678c, C71424ay.ATOMIC, new C71449f(this, (C69577g) null));
    }

    /* renamed from: f */
    public C71587n mo62797f() {
        return null;
    }

    /* renamed from: mo */
    public final C71587n mo62783mo(C69585o oVar, int i, C71387t tVar) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        boolean z = C71600ba.f191036a;
        C69585o plus = oVar.plus(this.f190676a);
        if (tVar == C71387t.SUSPEND) {
            int i2 = this.f190677b;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i2;
            }
            tVar = this.f190678c;
        }
        if (C69664n.m101066l(plus, this.f190676a) && i == this.f190677b && tVar == this.f190678c) {
            return this;
        }
        return mo62793b(plus, i, tVar);
    }

    /* renamed from: mp */
    public Object mo38165mp(C71588o oVar, C69577g gVar) {
        return m104241h(this, oVar, gVar);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d = mo62795d();
        if (d != null) {
            arrayList.add(d);
        }
        C69585o oVar = this.f190676a;
        if (oVar != C69586p.f185991a) {
            new StringBuilder("context=").append(oVar);
            arrayList.add("context=".concat(String.valueOf(oVar)));
        }
        int i = this.f190677b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        if (this.f190678c != C71387t.SUSPEND) {
            C71387t tVar = this.f190678c;
            new StringBuilder("onBufferOverflow=").append(tVar);
            arrayList.add("onBufferOverflow=".concat(String.valueOf(tVar)));
        }
        String a = C71601bb.m104526a(this);
        String ag = C69540x.m100851ag(arrayList, ", ", (CharSequence) null, (CharSequence) null, (C69626l) null, 62);
        return a + "[" + ag + "]";
    }
}
