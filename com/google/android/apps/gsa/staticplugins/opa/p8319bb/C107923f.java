package com.google.android.apps.gsa.staticplugins.opa.p8319bb;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88279vu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88280vv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88281vw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88282vx;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107740s;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114526n;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114527o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.f */
/* compiled from: PG */
public final class C107923f implements C91007g {

    /* renamed from: a */
    public final C86124t f300276a;

    /* renamed from: b */
    public final C68214a f300277b;

    /* renamed from: c */
    public final C68214a f300278c;

    /* renamed from: d */
    public final Queue f300279d;

    /* renamed from: e */
    public C107763d f300280e;

    /* renamed from: f */
    private final C107740s f300281f;

    /* renamed from: g */
    private final int f300282g;

    /* renamed from: h */
    private final C68214a f300283h;

    /* renamed from: i */
    private final C68214a f300284i;

    public C107923f(C107740s sVar, C86124t tVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f300281f = sVar;
        sVar.mo96265b(new C107749c(this));
        this.f300276a = tVar;
        int max = tVar.mo79746e(C90014bt.f247412gf) ? Math.max(5, (int) tVar.mo79743a(C90014bt.f247404gX)) : 5;
        this.f300282g = max;
        this.f300279d = new C58781rt(new C58425eo(max));
        this.f300283h = aVar;
        this.f300277b = aVar2;
        this.f300284i = aVar3;
        this.f300278c = aVar4;
    }

    /* renamed from: a */
    public final C88282vx mo96331a() {
        long b = ((C21370a) this.f300283h.mo27525b()).mo26870b() - TimeUnit.MINUTES.toMillis(this.f300276a.mo79743a(C90014bt.f247564jY));
        String F = ((C86054o) this.f300277b.mo27525b()).mo79659F();
        ArrayList arrayList = new ArrayList();
        if (F != null) {
            synchronized (this.f300279d) {
                for (C107763d dVar : this.f300279d) {
                    Query query = (Query) dVar.f299846c.f299968a.get();
                    String str = (String) dVar.f299844a.f299968a.get();
                    if (query != null && str != null && str.equals(F) && query.f252745C >= b) {
                        arrayList.add(query);
                    }
                }
            }
        }
        int size = arrayList.size();
        C88279vu vuVar = (C88279vu) C88282vx.f238770b.createBuilder();
        for (int i = 0; i < size; i++) {
            C88280vv vvVar = (C88280vv) C88281vw.f238765d.createBuilder();
            String obj = ((Query) arrayList.get(i)).f252768g.toString();
            vvVar.copyOnWrite();
            C88281vw vwVar = (C88281vw) vvVar.instance;
            obj.getClass();
            vwVar.f238767a |= 1;
            vwVar.f238768b = obj;
            boolean dA = ((Query) arrayList.get(i)).mo84420dA();
            vvVar.copyOnWrite();
            C88281vw vwVar2 = (C88281vw) vvVar.instance;
            vwVar2.f238767a |= 2;
            vwVar2.f238769c = dA;
            C88281vw vwVar3 = (C88281vw) vvVar.build();
            vuVar.copyOnWrite();
            C88282vx vxVar = (C88282vx) vuVar.instance;
            vwVar3.getClass();
            C62971cq cqVar = vxVar.f238772a;
            if (!cqVar.mo58948c()) {
                vxVar.f238772a = C62942bv.mutableCopy(cqVar);
            }
            vxVar.f238772a.add(vwVar3);
        }
        return (C88282vx) vuVar.build();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
        C91006f e = fVar.mo85281e((Object) null);
        int i = this.f300282g;
        e.mo85291r("Last " + i + " debug entries");
        ArrayList arrayList = new ArrayList();
        synchronized (this.f300279d) {
            int i2 = 0;
            for (C107763d dVar : this.f300279d) {
                int i3 = i2 + 1;
                e.mo85290q("Debug data " + i2, dVar);
                Query query = (Query) dVar.f299846c.f299968a.get();
                if (query != null) {
                    String obj = query.f252768g.toString();
                    arrayList.add("[" + obj + "]");
                }
                i2 = i3;
            }
        }
        int i4 = this.f300282g;
        fVar.mo85278b("Last " + i4 + " OPA queries").mo85276a(C90752i.m148233g(new C58827ar(", ").mo56097d(arrayList)));
        C91006f e2 = fVar.mo85281e((Object) null);
        e2.mo85291r("Sherlog links for recent OPA queries");
        for (C114526n nVar : ((C114527o) this.f300284i.mo27525b()).mo101387a(mo96331a())) {
            e2.mo85279c(nVar.f317606a).mo85276a(C90752i.m148233g(nVar.f317607b));
        }
    }
}
