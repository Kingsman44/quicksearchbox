package com.google.android.libraries.elements.p1714d;

import android.os.Looper;
import android.util.SparseArray;
import com.facebook.litho.C6138bs;
import com.facebook.litho.C6405o;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21240aj;
import com.google.android.libraries.elements.interfaces.C21241ak;
import com.google.android.libraries.elements.interfaces.C21242al;
import com.google.android.libraries.elements.interfaces.C21243am;
import com.google.android.libraries.elements.interfaces.C21244an;
import com.google.android.libraries.elements.interfaces.C21245ao;
import com.google.android.libraries.elements.interfaces.C21246ap;
import com.google.android.libraries.elements.interfaces.C21247aq;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21261bd;
import com.google.android.libraries.elements.p1714d.p1719e.C20996ab;
import com.google.android.libraries.elements.p1714d.p1719e.C21011aq;
import com.google.android.libraries.elements.p1714d.p1719e.C21059u;
import com.google.android.libraries.elements.p1714d.p1719e.C21060v;
import com.google.android.libraries.elements.p1714d.p1719e.C21061w;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58729pv;
import com.google.protos.youtube.elements.C66156ca;
import com.google.protos.youtube.elements.C66192df;
import com.youtube.p5283a.p5284a.C68043af;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.elements.d.br */
/* compiled from: PG */
public final class C20834br implements C21248ar {

    /* renamed from: b */
    private static final boolean f58366b = Boolean.getBoolean("force_elements_view_materialization");

    /* renamed from: A */
    private boolean f58367A = false;

    /* renamed from: B */
    private boolean f58368B = false;

    /* renamed from: a */
    public C6405o f58369a;

    /* renamed from: c */
    private final Object f58370c = new Object();

    /* renamed from: d */
    private final boolean f58371d;

    /* renamed from: e */
    private final boolean f58372e;

    /* renamed from: f */
    private final C66192df f58373f;

    /* renamed from: g */
    private final C21261bd f58374g;

    /* renamed from: h */
    private List f58375h;

    /* renamed from: i */
    private List f58376i;

    /* renamed from: j */
    private List f58377j;

    /* renamed from: k */
    private List f58378k;

    /* renamed from: l */
    private List f58379l;

    /* renamed from: m */
    private List f58380m;

    /* renamed from: n */
    private List f58381n;

    /* renamed from: o */
    private List f58382o;

    /* renamed from: p */
    private List f58383p;

    /* renamed from: q */
    private List f58384q;

    /* renamed from: r */
    private List f58385r;

    /* renamed from: s */
    private List f58386s;

    /* renamed from: t */
    private List f58387t;

    /* renamed from: u */
    private List f58388u;

    /* renamed from: v */
    private C68043af f58389v;

    /* renamed from: w */
    private SparseArray f58390w;

    /* renamed from: x */
    private Map f58391x;

    /* renamed from: y */
    private boolean f58392y = false;

    /* renamed from: z */
    private boolean f58393z = false;

    public C20834br(C66192df dfVar, C21261bd bdVar, boolean z, boolean z2) {
        this.f58373f = dfVar;
        this.f58374g = bdVar;
        this.f58371d = z;
        this.f58372e = z2;
    }

    /* renamed from: A */
    private final void m39135A(C6405o oVar) {
        C68043af afVar = this.f58389v;
        if (afVar != null && (oVar instanceof C21075f)) {
            ((C21075f) oVar).f59078a.f59201f = afVar;
        }
    }

    /* renamed from: B */
    private final void m39136B() {
        if (this.f58367A) {
            throw new IllegalStateException("Element already built!");
        }
    }

    /* renamed from: d */
    public static void m39137d() {
        C58838bb.m90884s(Looper.getMainLooper() == Looper.myLooper(), "The code must run on UI thread.");
    }

    /* renamed from: E */
    public final C6405o mo25928E() {
        C6405o oVar = this.f58369a;
        oVar.getClass();
        return oVar;
    }

    /* renamed from: b */
    public final C6407q mo25929b(C6411u uVar) {
        C20861cl clVar;
        C6407q a;
        C66192df dfVar;
        synchronized (this.f58370c) {
            m39136B();
            C21261bd bdVar = this.f58374g;
            if (!(bdVar == null || (dfVar = this.f58373f) == null)) {
                mo25948v(new C20830bn(bdVar, dfVar));
                mo25940n(new C20831bo(bdVar, dfVar));
                synchronized (this.f58370c) {
                    if (mo25933g()) {
                        mo25943q(new C20832bp(bdVar, dfVar));
                    }
                    if (mo25932f()) {
                        mo25941o(new C20833bq(bdVar, dfVar));
                    }
                }
            }
            this.f58367A = true;
            if (!this.f58368B || this.f58371d) {
                C6405o oVar = this.f58369a;
                oVar.getClass();
                m39135A(oVar);
                clVar = oVar;
            } else {
                C6405o oVar2 = this.f58369a;
                oVar2.getClass();
                m39135A(oVar2);
                List list = this.f58382o;
                if (list != null && !list.isEmpty() && (oVar2 instanceof C21075f)) {
                    ((C21075f) oVar2).f59078a.f59202g = true;
                }
                C20861cl clVar2 = new C20861cl();
                clVar2.mo25968c(uVar, new C20863cn());
                clVar2.f58481a.f58500a = oVar2.mo13259a();
                clVar2.f58482d.set(0);
                List list2 = this.f58375h;
                C20863cn cnVar = clVar2.f58481a;
                cnVar.f58494G = list2;
                cnVar.f58492E = this.f58377j;
                cnVar.f58505f = this.f58381n;
                cnVar.f58499L = this.f58382o;
                cnVar.f58491D = this.f58372e;
                cnVar.f58498K = this.f58384q;
                cnVar.f58496I = this.f58385r;
                cnVar.f58497J = this.f58386s;
                cnVar.f58495H = this.f58387t;
                cnVar.f58488A = this.f58383p;
                cnVar.f58506g = null;
                cnVar.f58501b = this.f58388u;
                cnVar.f58502c = this.f58376i;
                cnVar.f58504e = this.f58378k;
                cnVar.f58503d = this.f58379l;
                cnVar.f58493F = this.f58380m;
                cnVar.f58489B = this.f58392y;
                cnVar.f58490C = this.f58393z;
                clVar = clVar2;
            }
            if (f58366b) {
                clVar.mo13438V();
            }
            SparseArray sparseArray = this.f58390w;
            if (sparseArray != null) {
                clVar.f18980c.mo13456J().mo13411E().mo13063ae(sparseArray);
            }
            a = clVar.mo13259a();
        }
        return a;
    }

    /* renamed from: c */
    public final Map mo25930c() {
        Map map = this.f58391x;
        return map == null ? C58729pv.f156485a : map;
    }

    /* renamed from: e */
    public final boolean mo25931e() {
        List list = this.f58376i;
        return list != null && !list.isEmpty();
    }

    /* renamed from: f */
    public final boolean mo25932f() {
        List list = this.f58377j;
        return list != null && !list.isEmpty();
    }

    /* renamed from: g */
    public final boolean mo25933g() {
        List list = this.f58375h;
        return list != null && !list.isEmpty();
    }

    /* renamed from: h */
    public final void mo25934h(C66156ca caVar, C6138bs bsVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58391x == null) {
                this.f58391x = new EnumMap(C66156ca.class);
            }
            this.f58391x.put(caVar, bsVar);
        }
    }

    /* renamed from: i */
    public final void mo25935i(C21011aq aqVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58388u == null) {
                this.f58388u = new ArrayList();
            }
            this.f58388u.add(aqVar);
            this.f58368B = true;
        }
    }

    /* renamed from: j */
    public final void mo25936j(C21240aj ajVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58376i == null) {
                this.f58376i = new ArrayList();
            }
            this.f58376i.add(ajVar);
            this.f58368B = true;
        }
    }

    /* renamed from: k */
    public final void mo25937k(C20996ab abVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58379l == null) {
                this.f58379l = new ArrayList();
            }
            this.f58379l.add(abVar);
            this.f58368B = true;
        }
    }

    /* renamed from: l */
    public final void mo25938l(C21241ak akVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58378k == null) {
                this.f58378k = new ArrayList();
            }
            this.f58378k.add(akVar);
            this.f58368B = true;
        }
    }

    /* renamed from: m */
    public final void mo25939m(C21247aq aqVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58381n == null) {
                this.f58381n = new ArrayList();
            }
            this.f58381n.add(aqVar);
            this.f58368B = true;
        }
    }

    /* renamed from: n */
    public final void mo25940n(C21242al alVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58383p == null) {
                this.f58383p = new ArrayList();
            }
            this.f58383p.add(alVar);
            this.f58368B = true;
        }
    }

    /* renamed from: o */
    public final void mo25941o(C21243am amVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58377j == null) {
                this.f58377j = new ArrayList();
            }
            this.f58377j.add(amVar);
            this.f58368B = true;
        }
    }

    /* renamed from: p */
    public final void mo25942p(C21244an anVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58380m == null) {
                this.f58380m = new ArrayList();
            }
            this.f58380m.add(anVar);
            this.f58368B = true;
        }
    }

    /* renamed from: q */
    public final void mo25943q(C21245ao aoVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58375h == null) {
                this.f58375h = new ArrayList();
            }
            this.f58375h.add(aoVar);
            this.f58368B = true;
        }
    }

    /* renamed from: r */
    public final void mo25944r(C21061w wVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58387t == null) {
                this.f58387t = new ArrayList();
            }
            this.f58387t.add(wVar);
            this.f58368B = true;
        }
    }

    /* renamed from: s */
    public final void mo25945s(C21246ap apVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58385r == null) {
                this.f58385r = new ArrayList();
            }
            this.f58385r.add(apVar);
            this.f58368B = true;
        }
    }

    /* renamed from: t */
    public final void mo25946t(C21060v vVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58386s == null) {
                this.f58386s = new ArrayList();
            }
            this.f58386s.add(vVar);
            this.f58368B = true;
        }
    }

    /* renamed from: u */
    public final void mo25947u(C21059u uVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58384q == null) {
                this.f58384q = new ArrayList();
            }
            this.f58384q.add(uVar);
            this.f58368B = true;
        }
    }

    /* renamed from: v */
    public final void mo25948v(C21247aq aqVar) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58382o == null) {
                this.f58382o = new ArrayList();
            }
            this.f58382o.add(aqVar);
            this.f58368B = true;
        }
    }

    /* renamed from: w */
    public final void mo25949w(int i, Object obj) {
        synchronized (this.f58370c) {
            m39136B();
            if (this.f58390w == null) {
                this.f58390w = new SparseArray();
            }
            this.f58390w.put(i, obj);
        }
    }

    /* renamed from: x */
    public final void mo25950x() {
        this.f58392y = true;
    }

    /* renamed from: y */
    public final void mo25951y(boolean z) {
        this.f58393z = z;
    }

    /* renamed from: z */
    public final void mo25952z(C68043af afVar) {
        this.f58389v = afVar;
    }
}
