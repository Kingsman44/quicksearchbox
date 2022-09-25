package com.google.android.libraries.social.populous.p3296e.p3297a;

import com.google.android.libraries.social.populous.core.C42266as;
import com.google.android.libraries.social.populous.core.C42276bb;
import com.google.android.libraries.social.populous.core.C42309ch;
import com.google.android.libraries.social.populous.core.C42313cl;
import com.google.android.libraries.social.populous.core.C42351l;
import com.google.android.libraries.social.populous.core.C42352m;
import com.google.android.libraries.social.populous.core.C42355p;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3289c.C42211b;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.android.libraries.social.populous.p3296e.C42550o;
import com.google.android.libraries.social.populous.p3296e.C42554s;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42433l;
import com.google.android.libraries.social.populous.p3296e.p3303g.C42540m;
import com.google.android.libraries.social.populous.storage.C42701v;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69302j;

/* renamed from: com.google.android.libraries.social.populous.e.a.p */
/* compiled from: PG */
public final class C42401p implements C42554s {

    /* renamed from: a */
    public final C42701v f111196a;

    /* renamed from: b */
    public final C60887da f111197b;

    /* renamed from: c */
    public final ClientConfigInternal f111198c;

    /* renamed from: d */
    public final C42591z f111199d;

    /* renamed from: e */
    public final C42355p f111200e;

    /* renamed from: f */
    public final C58833ax f111201f;

    /* renamed from: g */
    final transient AtomicReference f111202g = new AtomicReference(C58836b.f156633a);

    /* renamed from: h */
    public final C42211b f111203h;

    /* renamed from: i */
    private final C42352m f111204i;

    /* renamed from: j */
    private final C42433l f111205j;

    public C42401p(C42701v vVar, C60887da daVar, ClientConfigInternal clientConfigInternal, C42211b bVar, C42352m mVar, C42591z zVar, C42355p pVar, C58833ax axVar, C42433l lVar) {
        this.f111196a = vVar;
        this.f111197b = daVar;
        this.f111198c = clientConfigInternal;
        this.f111203h = bVar;
        this.f111204i = mVar;
        this.f111199d = zVar;
        this.f111200e = pVar;
        this.f111201f = axVar;
        this.f111205j = lVar;
    }

    /* renamed from: e */
    public static C58528ij m74643e(Set set) {
        C58526ih ihVar = new C58526ih();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ihVar.mo55373c(((C42309ch) it.next()).name());
        }
        return ihVar.mo55486f();
    }

    /* renamed from: i */
    public static final int m74644i(C42549n nVar, int i) {
        int i2;
        int size = nVar.f111607d.f110807a.size();
        if (nVar.f111605b.isEmpty()) {
            i2 = C60757n.m92748i(C69302j.f185437a.mo6453a().mo60976b());
        } else {
            i2 = C60757n.m92748i(C69302j.f185437a.mo6453a().mo60977c());
        }
        return (i + size) * i2;
    }

    /* renamed from: j */
    public static final boolean m74645j(String str) {
        return !C58837ba.m90859h(str);
    }

    /* renamed from: k */
    private static final C60870cx m74646k(List list) {
        return C60922j.m93044g(C60856cj.m92896e(list), C42389d.f111171a, C60826bg.f164896a);
    }

    /* renamed from: l */
    private final void m74647l(C60870cx cxVar, C58872ci ciVar, int i, C42549n nVar) {
        C60856cj.m92911t(cxVar, new C42398m(this, i, ciVar, nVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo45370a(C42549n nVar) {
        C60870cx cxVar;
        int i = 1;
        if (this.f111204i.f111091c != C42351l.SUCCESS_LOGGED_IN) {
            C42550o oVar = new C42550o();
            oVar.f111627f = 1;
            oVar.f111626e = 18;
            oVar.f111623b = C58485gu.m89842j(C58485gu.m89845m());
            return C60856cj.m92900i(oVar.mo45556a());
        }
        C58872ci b = this.f111199d.mo45632b();
        C42576k kVar = nVar.f111612i;
        int a = this.f111205j.mo45491a();
        int i2 = a - 1;
        if (a != 0) {
            if (!(i2 == 1 || i2 == 2)) {
                this.f111199d.mo45635e(2, kVar);
            }
            if (this.f111198c.f110739y == C42276bb.EMPTY) {
                cxVar = C60866ct.f164955a;
                C42540m mVar = (C42540m) this.f111205j;
                if (mVar.mo45491a() != 2) {
                    mVar.mo45548c(2, C42576k.f111734a, true);
                }
                this.f111199d.mo45635e(3, kVar);
            } else {
                C58872ci b2 = this.f111199d.mo45632b();
                C60870cx b3 = ((C42540m) this.f111205j).mo45547b(kVar, true);
                if (b3.isDone()) {
                    this.f111199d.mo45635e(3, kVar);
                    cxVar = b3;
                } else {
                    m74647l(b3, b2, 6, nVar);
                    cxVar = b3;
                    C60870cx h = C60922j.m93045h(cxVar, new C42392g(this, nVar, i), this.f111197b);
                    C60856cj.m92911t(h, new C42397l(this, b, nVar, h), C60826bg.f164896a);
                    return h;
                }
            }
            i = 2;
            C60870cx h2 = C60922j.m93045h(cxVar, new C42392g(this, nVar, i), this.f111197b);
            C60856cj.m92911t(h2, new C42397l(this, b, nVar, h2), C60826bg.f164896a);
            return h2;
        }
        throw null;
    }

    /* renamed from: b */
    public final C60870cx mo45371b() {
        if (this.f111204i.f111091c != C42351l.SUCCESS_LOGGED_IN) {
            return C60866ct.f164955a;
        }
        return ((C42540m) this.f111205j).mo45547b(C42576k.f111734a, true);
    }

    /* renamed from: c */
    public final void mo45372c(C42266as asVar) {
    }

    /* renamed from: d */
    public final int mo45373d() {
        return 1;
    }

    /* renamed from: f */
    public final C60870cx mo45374f(C58872ci ciVar, List list, C60870cx cxVar, C42549n nVar) {
        C60870cx cxVar2;
        C60870cx cxVar3;
        C58724pq pqVar = (C58724pq) list;
        if (pqVar.f156474d != 1 || !C69302j.m100551c()) {
            cxVar2 = C60856cj.m92896e(list);
        } else {
            cxVar2 = (C60870cx) list.get(0);
        }
        m74647l(cxVar2, ciVar, 24, nVar);
        if (cxVar != null) {
            m74647l(cxVar, ciVar, 76, nVar);
        }
        if (pqVar.f156474d != 1 || !C69302j.m100551c()) {
            cxVar3 = C60922j.m93044g(m74646k(list), C42393h.f111177a, C60826bg.f164896a);
        } else {
            cxVar3 = (C60870cx) list.get(0);
        }
        C58872ci b = this.f111199d.mo45632b();
        C60870cx h = C60922j.m93045h(cxVar3, new C42390e(this), C60826bg.f164896a);
        m74647l(h, b, 31, nVar);
        if (cxVar == null) {
            return h;
        }
        C58872ci b2 = this.f111199d.mo45632b();
        C60870cx h2 = C60922j.m93045h(cxVar, C42396k.f111184a, C60826bg.f164896a);
        m74647l(h2, b2, 77, nVar);
        return m74646k(C58485gu.m89847o(h, h2));
    }

    /* renamed from: g */
    public final C60870cx mo45375g(List list, long j) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42405ab abVar = (C42405ab) it.next();
            C58833ax d = abVar.mo45402d(abVar.f111226a.mo56107c());
            if (d.mo56113h() && ((C42313cl) d.mo56107c()).mo45283h()) {
                e.mo55395g(C58837ba.m90858g(((C42313cl) d.mo56107c()).mo45281f()));
            }
        }
        return this.f111196a.mo45698g().mo45755b(e.mo55394f(), j);
    }

    /* renamed from: h */
    public final void mo45376h(C60870cx cxVar) {
        C60856cj.m92911t(cxVar, new C42400o(this), C60826bg.f164896a);
    }
}
