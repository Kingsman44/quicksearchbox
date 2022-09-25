package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58692ol;
import com.google.common.p4535g.C59109ab;
import com.google.common.p4535g.C59110ac;
import com.google.common.p4535g.C59123ap;
import com.google.common.p4535g.C59126as;
import com.google.common.p4535g.C59129av;
import com.google.common.p4535g.C59133az;
import com.google.common.p4535g.C59136bb;
import com.google.common.p4535g.C59141bg;
import com.google.common.p4535g.C59142bh;
import com.google.common.p4535g.C59143bi;
import com.google.common.p4535g.C59144bj;
import com.google.common.p4535g.C59145bk;
import com.google.common.p4535g.C59146bl;
import com.google.common.p4535g.C59203do;
import com.google.common.p4535g.C59214h;
import com.google.common.p4535g.C59218l;
import com.google.common.p4535g.C59220n;
import com.google.common.p4535g.C59222p;
import com.google.common.p4535g.C59229w;
import com.google.common.p4535g.C59230x;
import com.google.common.p4535g.C59232z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C131125aa implements Function {

    /* renamed from: a */
    public final /* synthetic */ C59143bi f358620a;

    public /* synthetic */ C131125aa(C59143bi biVar) {
        this.f358620a = biVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C59143bi biVar = this.f358620a;
        C59143bi biVar2 = (C59143bi) obj;
        C59143bi biVar3 = new C59143bi();
        C59218l lVar = C59123ap.f157123a;
        C58838bb.m90883r(biVar3.mo56517b() == 0);
        if (!biVar2.mo56528k() && !biVar.mo56528k()) {
            if (biVar2.mo56529l()) {
                biVar3.mo56520d(biVar);
            } else if (biVar.mo56529l()) {
                biVar3.mo56520d(biVar2);
            } else {
                C59129av avVar = biVar2.f157178b;
                C59129av avVar2 = biVar.f157178b;
                C59214h hVar = avVar.f157134a;
                C59214h hVar2 = avVar2.f157134a;
                double d = hVar.f157289a;
                double d2 = hVar2.f157289a;
                if (d > d2 ? !(d > hVar2.f157290b || d > hVar.f157290b) : !(d2 > hVar.f157290b || d2 > hVar2.f157290b)) {
                    C59220n nVar = avVar.f157135b;
                    C59220n nVar2 = avVar2.f157135b;
                    if (!nVar.mo56635l() && !nVar2.mo56635l() && (!nVar.mo56637n() ? !(!nVar2.mo56637n() ? nVar2.f157306a > nVar.f157307b || nVar2.f157307b < nVar.f157306a : nVar2.f157306a > nVar.f157307b && nVar2.f157307b < nVar.f157306a) : !(!nVar2.mo56637n() && nVar2.f157306a > nVar.f157307b && nVar2.f157307b < nVar.f157306a))) {
                        C59145bk bkVar = C59145bk.f157188a;
                        C59144bj bjVar = new C59144bj();
                        bjVar.f157184a = bkVar.f157189b;
                        bjVar.f157185b = bkVar.f157190c;
                        bjVar.f157186c = bkVar.f157192e;
                        double d3 = bkVar.f157194g;
                        C58838bb.m90884s(d3 < Math.sqrt(3.0d) / 2.0d, "Splice fraction must be at least sqrt(3)/2 to ensure termination of edge splicing algorithm.");
                        bjVar.f157187d = d3;
                        bjVar.f157186c = lVar;
                        C59146bl blVar = new C59146bl(new C59145bk(bjVar));
                        C59143bi.m91689m(biVar2, biVar, true, blVar);
                        C59143bi.m91689m(biVar, biVar2, false, blVar);
                        ArrayList<C59133az> arrayList = new ArrayList<>();
                        C59218l lVar2 = blVar.f157195a.f157192e;
                        if (lVar2.f157299c > C59203do.f157270a) {
                            HashMap hashMap = new HashMap();
                            Stack stack = new Stack();
                            ArrayList arrayList2 = new ArrayList();
                            C59142bh b = blVar.mo56532b();
                            C59109ab abVar = new C59109ab(b);
                            abVar.f157082a = lVar2;
                            C59126as a = b.mo56514a();
                            while (!a.mo56446g()) {
                                C59136bb bbVar = ((C59141bg) a.mo56441c()).f157172a;
                                if (!hashMap.containsKey(bbVar)) {
                                    stack.add(bbVar);
                                    while (!stack.isEmpty()) {
                                        arrayList2.clear();
                                        abVar.mo56417a(new C59230x((C59136bb) stack.pop()));
                                        abVar.mo56418b(arrayList2);
                                        int size = arrayList2.size();
                                        for (int i = 0; i < size; i++) {
                                            C59136bb bbVar2 = ((C59232z) arrayList2.get(i)).f157341b.f157172a;
                                            if (!hashMap.containsKey(bbVar2) && !bbVar.mo56506q(bbVar2)) {
                                                stack.push(bbVar2);
                                                hashMap.put(bbVar2, bbVar);
                                            }
                                        }
                                    }
                                }
                                a.mo56450j();
                            }
                            if (!hashMap.isEmpty()) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Map.Entry entry : blVar.f157196b.entrySet()) {
                                    C59136bb bbVar3 = (C59136bb) entry.getKey();
                                    for (C59136bb bbVar4 : (C58692ol) entry.getValue()) {
                                        if (!(hashMap.get(bbVar3) == null && hashMap.get(bbVar4) == null) && (!blVar.f157195a.f157189b || bbVar3.mo56507r(bbVar4))) {
                                            arrayList3.add(new C59110ac(bbVar3, bbVar4));
                                        }
                                    }
                                }
                                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                                    C59136bb bbVar5 = ((C59110ac) arrayList3.get(i2)).f157094a;
                                    C59136bb bbVar6 = ((C59110ac) arrayList3.get(i2)).f157095b;
                                    blVar.mo56533c(bbVar5, bbVar6);
                                    C59136bb bbVar7 = (C59136bb) hashMap.get(bbVar5);
                                    if (bbVar7 != null) {
                                        bbVar5 = bbVar7;
                                    }
                                    C59136bb bbVar8 = (C59136bb) hashMap.get(bbVar6);
                                    if (bbVar8 != null) {
                                        bbVar6 = bbVar8;
                                    }
                                    blVar.mo56534d(bbVar5, bbVar6);
                                }
                            }
                            double d4 = blVar.f157195a.f157194g;
                            if (d4 > C59203do.f157270a) {
                                C59218l lVar3 = new C59218l(lVar2.f157299c * d4);
                                ArrayList arrayList4 = new ArrayList();
                                for (Map.Entry entry2 : blVar.f157196b.entrySet()) {
                                    C59136bb bbVar9 = (C59136bb) entry2.getKey();
                                    for (C59136bb bbVar10 : ((C58692ol) entry2.getValue()).mo54974l()) {
                                        if (!blVar.f157195a.f157189b || bbVar9.compareTo(bbVar10) < 0) {
                                            arrayList4.add(new C59110ac(bbVar9, bbVar10));
                                        }
                                    }
                                }
                                C59109ab abVar2 = new C59109ab(blVar.mo56532b());
                                abVar2.f157082a = lVar3;
                                ArrayList arrayList5 = new ArrayList();
                                while (!arrayList4.isEmpty()) {
                                    C59110ac acVar = (C59110ac) arrayList4.remove(arrayList4.size() - 1);
                                    C59136bb bbVar11 = acVar.f157094a;
                                    C59136bb bbVar12 = acVar.f157095b;
                                    if (!blVar.f157195a.f157190c || blVar.mo56535e(bbVar11, bbVar12)) {
                                        arrayList5.clear();
                                        abVar2.mo56417a(new C59229w(bbVar11, bbVar12));
                                        abVar2.mo56418b(arrayList5);
                                        int size2 = arrayList5.size();
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= size2) {
                                                break;
                                            }
                                            C59136bb bbVar13 = ((C59232z) arrayList5.get(i3)).f157341b.f157172a;
                                            if (bbVar13.mo56506q(bbVar11) || bbVar13.mo56506q(bbVar12)) {
                                                i3++;
                                            } else {
                                                blVar.mo56533c(bbVar11, bbVar12);
                                                if (blVar.mo56534d(bbVar11, bbVar13)) {
                                                    arrayList4.add(new C59110ac(bbVar11, bbVar13));
                                                }
                                                if (blVar.mo56534d(bbVar13, bbVar12)) {
                                                    arrayList4.add(new C59110ac(bbVar13, bbVar12));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        boolean z = blVar.f157195a.f157193f;
                        ArrayList arrayList6 = new ArrayList();
                        int i4 = 0;
                        while (i4 < blVar.f157197c.size()) {
                            C59136bb bbVar14 = (C59136bb) blVar.f157197c.get(i4);
                            C58692ol olVar = (C58692ol) blVar.f157196b.get(bbVar14);
                            if (olVar == null) {
                                i4++;
                            } else {
                                C59133az a2 = blVar.mo56531a(bbVar14, (C59136bb) olVar.iterator().next(), arrayList6);
                                if (a2 != null) {
                                    int i5 = a2.f157143d;
                                    int i6 = i5 - 1;
                                    for (int i7 = 0; i7 < i5; i7++) {
                                        blVar.mo56533c(a2.mo56481i(i6), a2.mo56481i(i7));
                                        i6 = i7;
                                    }
                                    arrayList.add(a2);
                                }
                            }
                        }
                        arrayList6.isEmpty();
                        if (blVar.f157195a.f157189b) {
                            biVar3.mo56524h(arrayList);
                        } else {
                            C58838bb.m90883r(biVar3.f157177a.isEmpty());
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                            for (C59133az azVar : arrayList) {
                                if (azVar.f157146g) {
                                    newSetFromMap.add(azVar);
                                }
                                double f = azVar.mo56478f();
                                if (Math.abs(f) > C59222p.m91895a(azVar.f157143d)) {
                                    if (f < C59203do.f157270a) {
                                        azVar.mo56484l();
                                    }
                                } else if (azVar.f157146g) {
                                    azVar.mo56484l();
                                }
                            }
                            biVar3.mo56524h(arrayList);
                            if (biVar3.mo56517b() > 0) {
                                C59133az c = biVar3.mo56518c(0);
                                boolean z2 = false;
                                for (int i8 = 0; i8 < biVar3.mo56517b(); i8++) {
                                    if (biVar3.mo56518c(i8).f157146g) {
                                        z2 = !z2;
                                        c = biVar3.mo56518c(i8);
                                    }
                                }
                                if (newSetFromMap.contains(c) != z2) {
                                    biVar3.mo56526i();
                                }
                            }
                            for (C59133az azVar2 : arrayList) {
                            }
                        }
                        boolean z3 = blVar.f157195a.f157191d;
                        if (biVar3.mo56517b() == 0 && biVar2.f157178b.mo56469j() > 6.283185307179586d && biVar.f157178b.mo56469j() > 6.283185307179586d) {
                            double a3 = biVar2.mo56516a();
                            double a4 = biVar.mo56516a();
                            if (Math.max(C59203do.f157270a, (a3 + a4) - 0.35730091830127586d) > 12.566370614359172d - Math.min(a3, a4)) {
                                biVar3.mo56526i();
                            }
                        }
                    }
                }
            }
        }
        return biVar3;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
