package com.google.android.apps.gsa.shared.logger.p7051b;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1864f.p1865a.C22804a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58541iw;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59694ci;
import com.google.common.p4552o.C59698cm;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import com.google.common.p4552o.C59808ga;
import com.google.common.p4552o.C59809gb;
import com.google.common.p4552o.C59810gc;
import com.google.common.p4552o.C59811gd;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.shared.logger.b.s */
/* compiled from: PG */
public final class C89869s implements C89862l, C90964a {

    /* renamed from: a */
    private static final C89855e f246219a = new C89855e();

    /* renamed from: b */
    private final C89847ac f246220b = new C89847ac();

    /* renamed from: c */
    private final Set f246221c = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: d */
    private final C89867q f246222d = new C89867q();

    /* renamed from: e */
    private volatile C58833ax f246223e = C58836b.f156633a;

    public C89869s(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C89860j jVar = (C89860j) it.next();
            if (jVar != null) {
                this.f246221c.add(new WeakReference(jVar));
            }
        }
    }

    /* renamed from: f */
    private final void m146324f(C58817ah ahVar) {
        Iterator it = this.f246221c.iterator();
        while (it.hasNext()) {
            C89860j jVar = (C89860j) ((WeakReference) it.next()).get();
            if (jVar == null) {
                it.remove();
            } else {
                Void voidR = (Void) ahVar.apply(jVar);
            }
        }
    }

    /* renamed from: g */
    private final void m146325g() {
        C89867q qVar = this.f246222d;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            C89868r rVar = (C89868r) qVar.get(i);
            ((C89852b) this.f246223e.mo56107c()).mo79810a(rVar.f246217a, rVar.f246218b);
        }
        this.f246222d.clear();
    }

    /* renamed from: a */
    public final void mo83704a(C89860j jVar) {
        this.f246221c.add(new WeakReference(jVar));
        jVar.mo77941d(this.f246220b.mo83682a());
    }

    /* renamed from: b */
    public final void mo83705b(C89852b bVar) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f246222d) {
            this.f246223e = C58833ax.m90834k(bVar);
            m146325g();
        }
    }

    /* renamed from: c */
    public final void mo83706c(C22804a aVar) {
        C89854d dVar;
        C58528ij ijVar;
        synchronized (this.f246220b) {
            this.f246220b.f243180a.add(aVar);
            m146324f(new C89865o(aVar));
            if (C89858h.m146305c(aVar.f62786a)) {
                m146324f(new C89866p(aVar));
            }
            if (C89858h.m146304b(aVar.f62786a)) {
                C89847ac acVar = this.f246220b;
                C58528ij ijVar2 = aVar.f62791f;
                if (ijVar2 == null || ijVar2.isEmpty()) {
                    ijVar = C89858h.m146303a(aVar.f62786a);
                } else {
                    ijVar = C58528ij.m90006F(C58758qx.m90646d(aVar.f62791f, C89858h.m146303a(aVar.f62786a)));
                }
                C58838bb.m90868c(!ijVar.isEmpty());
                Iterator descendingIterator = acVar.f243180a.descendingIterator();
                ((C22804a) C58570jy.m90168t(descendingIterator, new C89876z(aVar))).getClass();
                C22804a aVar2 = (C22804a) C58570jy.m90168t(descendingIterator, new C89846ab(aVar, ijVar));
                if (aVar2 == null) {
                    C89873w wVar = new C89873w();
                    wVar.mo83689c(C89851ag.NONE);
                    wVar.mo83690d(4);
                    wVar.f246229b = aVar;
                    wVar.mo83688b(acVar.mo83684c(aVar));
                    dVar = wVar.mo83687a();
                } else {
                    C89849ae aeVar = aVar2.f62786a;
                    C89849ae aeVar2 = aVar.f62786a;
                    if (aeVar == aeVar2) {
                        C89873w wVar2 = new C89873w();
                        wVar2.mo83689c(C89851ag.NONE);
                        wVar2.mo83690d(6);
                        wVar2.f246229b = aVar;
                        wVar2.mo83688b(acVar.mo83684c(aVar));
                        dVar = wVar2.mo83687a();
                    } else {
                        C89851ag a = C89871u.m146333a(aeVar, aeVar2);
                        Set set = (Set) acVar.f243181b.get(aVar2);
                        if (set != null) {
                            if (set.contains(a)) {
                                C89873w wVar3 = new C89873w();
                                wVar3.mo83689c(a);
                                wVar3.mo83690d(5);
                                wVar3.f246228a = aVar2;
                                wVar3.f246229b = aVar;
                                wVar3.mo83688b(acVar.mo83683b(aVar2, aVar));
                                dVar = wVar3.mo83687a();
                            }
                        }
                        Set set2 = (Set) acVar.f243181b.get(aVar2);
                        if (set2 == null) {
                            set2 = new HashSet();
                            acVar.f243181b.put(aVar2, set2);
                        }
                        set2.add(a);
                        C89873w wVar4 = new C89873w();
                        wVar4.mo83689c(a);
                        wVar4.mo83690d(2);
                        wVar4.f246228a = aVar2;
                        wVar4.f246229b = aVar;
                        wVar4.mo83688b(acVar.mo83683b(aVar2, aVar));
                        dVar = wVar4.mo83687a();
                    }
                }
                C89847ac acVar2 = this.f246220b;
                if (acVar2.f243180a.size() > 1000) {
                    int size = acVar2.f243180a.size() - 1000;
                    for (int i = 0; i < size; i++) {
                        acVar2.f243181b.remove((C22804a) acVar2.f243180a.pollFirst());
                    }
                }
            } else {
                dVar = null;
            }
        }
        if (C89858h.m146304b(aVar.f62786a) && dVar != null) {
            String str = aVar.f62790e;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 883;
            C59698cm d = f246219a.apply(dVar);
            int e = dVar.mo83695e();
            if (e != 0) {
                if (e == 2) {
                    C22804a c = dVar.mo83693c();
                    if (c != null) {
                        long millis = TimeUnit.NANOSECONDS.toMillis(dVar.mo83692b().f62787b - c.f62787b);
                        tzVar.copyOnWrite();
                        C60555uf ufVar2 = (C60555uf) tzVar.instance;
                        ufVar2.f164250e = 2 | ufVar2.f164250e;
                        ufVar2.f164144ay = millis;
                    }
                    tzVar.copyOnWrite();
                    C60555uf ufVar3 = (C60555uf) tzVar.instance;
                    d.getClass();
                    ufVar3.f164184bl = d;
                    ufVar3.f164252g = 65536 | ufVar3.f164252g;
                    m146324f(new C89864n(dVar.mo83694d(), tzVar));
                } else {
                    tzVar.copyOnWrite();
                    C60555uf ufVar4 = (C60555uf) tzVar.instance;
                    d.getClass();
                    ufVar4.f164184bl = d;
                    ufVar4.f164252g = 65536 | ufVar4.f164252g;
                    C58541iw d2 = dVar.mo83694d();
                    C60555uf ufVar5 = (C60555uf) tzVar.build();
                    m146324f(new C89863m(d2));
                }
                C60555uf ufVar6 = (C60555uf) tzVar.build();
                if (ufVar6.f164184bl == null) {
                    C59698cm cmVar = C59698cm.f160165g;
                }
                C58976aa aaVar = C58975e.f156826a;
                if (!this.f246223e.mo56113h()) {
                    synchronized (this.f246222d) {
                        if (this.f246223e.mo56113h()) {
                            m146325g();
                            ((C89852b) this.f246223e.mo56107c()).mo79810a(ufVar6, str);
                            return;
                        }
                        if (this.f246222d.size() > 10) {
                            C89867q qVar = this.f246222d;
                            qVar.removeRange(0, qVar.size() - 10);
                        }
                        this.f246222d.add(new C89868r(ufVar6, str));
                        return;
                    }
                }
                ((C89852b) this.f246223e.mo56107c()).mo79810a(ufVar6, str);
                return;
            }
            throw null;
        }
    }

    /* renamed from: e */
    public final void mo83707e(C89860j jVar) {
        Iterator it = this.f246221c.iterator();
        while (it.hasNext()) {
            C89860j jVar2 = (C89860j) ((WeakReference) it.next()).get();
            if (jVar2 == null || jVar2.equals(jVar)) {
                it.remove();
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C89847ac acVar = this.f246220b;
        C59795fw fwVar = fVar.f254236a;
        for (C22804a aVar : acVar.f243180a.descendingSet()) {
            C59808ga gaVar = (C59808ga) C59811gd.f161636e.createBuilder();
            C59694ci c = aVar.mo28151c();
            gaVar.copyOnWrite();
            C59811gd gdVar = (C59811gd) gaVar.instance;
            c.getClass();
            gdVar.f161639b = c;
            gdVar.f161638a |= 1;
            C58800sl lA = aVar.f62789d.entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                C59809gb gbVar = (C59809gb) C59810gc.f161631d.createBuilder();
                String str = (String) entry.getKey();
                gbVar.copyOnWrite();
                C59810gc gcVar = (C59810gc) gbVar.instance;
                str.getClass();
                gcVar.f161633a |= 1;
                gcVar.f161634b = str;
                String str2 = (String) entry.getValue();
                gbVar.copyOnWrite();
                C59810gc gcVar2 = (C59810gc) gbVar.instance;
                str2.getClass();
                gcVar2.f161633a |= 2;
                gcVar2.f161635c = str2;
                C59810gc gcVar3 = (C59810gc) gbVar.build();
                gaVar.copyOnWrite();
                C59811gd gdVar2 = (C59811gd) gaVar.instance;
                gcVar3.getClass();
                C62971cq cqVar = gdVar2.f161640c;
                if (!cqVar.mo58948c()) {
                    gdVar2.f161640c = C62942bv.mutableCopy(cqVar);
                }
                gdVar2.f161640c.add(gcVar3);
            }
            C59687cb cbVar = aVar.mo28151c().f160162d;
            if (cbVar == null) {
                cbVar = C59687cb.f160034bf;
            }
            C62971cq cqVar2 = cbVar.f160125f;
            gaVar.copyOnWrite();
            C59811gd gdVar3 = (C59811gd) gaVar.instance;
            C62971cq cqVar3 = gdVar3.f161641d;
            if (!cqVar3.mo58948c()) {
                gdVar3.f161641d = C62942bv.mutableCopy(cqVar3);
            }
            C62947c.addAll((Iterable) cqVar2, (List) gdVar3.f161641d);
            C59811gd gdVar4 = (C59811gd) gaVar.build();
            fwVar.copyOnWrite();
            C59796fx fxVar = (C59796fx) fwVar.instance;
            C59796fx fxVar2 = C59796fx.f161580r;
            gdVar4.getClass();
            C62971cq cqVar4 = fxVar.f161594m;
            if (!cqVar4.mo58948c()) {
                fxVar.f161594m = C62942bv.mutableCopy(cqVar4);
            }
            fxVar.f161594m.add(gdVar4);
        }
    }
}
