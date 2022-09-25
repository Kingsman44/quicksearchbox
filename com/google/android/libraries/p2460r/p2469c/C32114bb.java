package com.google.android.libraries.p2460r.p2469c;

import com.google.p4283bv.p4354e.p4367c.p4368a.C57369au;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57442dm;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57444do;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57446dq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.r.c.bb */
/* compiled from: PG */
final class C32114bb {

    /* renamed from: a */
    public final C32075af f86233a;

    /* renamed from: b */
    public final C32139q f86234b;

    public C32114bb(C32075af afVar, C32139q qVar) {
        this.f86233a = afVar;
        this.f86234b = qVar;
    }

    /* renamed from: b */
    public static C32113ba m59824b(C32095az azVar, C32148z zVar) {
        List list;
        C57446dq dqVar = azVar.f86176a;
        List list2 = zVar.f86335b;
        if (zVar.f86339f.containsKey(dqVar)) {
            list = (List) zVar.f86339f.get(dqVar);
        } else {
            ArrayList arrayList = new ArrayList();
            C57444do doVar = dqVar.f153448b;
            if (doVar == null) {
                doVar = C57444do.f153440c;
            }
            for (C57442dm dmVar : doVar.f153443b) {
                if (dmVar.f153438d.size() > 0) {
                    arrayList.add(dmVar);
                }
            }
            C57444do doVar2 = dqVar.f153448b;
            if (doVar2 == null) {
                doVar2 = C57444do.f153440c;
            }
            for (String str : doVar2.f153442a) {
                C57442dm dmVar2 = (C57442dm) zVar.f86334a.f86167a.get(str);
                if (dmVar2 != null && dmVar2.f153438d.size() > 0) {
                    arrayList.add(dmVar2);
                }
            }
            arrayList.trimToSize();
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            zVar.f86339f.put(dqVar, unmodifiableList);
            list = unmodifiableList;
        }
        return new C32113ba(dqVar, list2, list);
    }

    /* renamed from: c */
    static boolean m59825c(C57446dq dqVar, C57446dq dqVar2) {
        return dqVar == dqVar2 || dqVar.hashCode() == dqVar2.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C32138p mo37918a(C32095az azVar, C32148z zVar) {
        C32148z a = zVar.mo37959a(azVar.f86176a, azVar.f86177b);
        C32113ba b = m59824b(azVar, zVar);
        C32138p a2 = this.f86233a.mo37856a(b);
        if (a2 == null) {
            C32139q qVar = this.f86234b;
            C57369au auVar = azVar.f86176a.f153449c;
            if (auVar == null) {
                auVar = C57369au.f153254l;
            }
            a2 = qVar.mo37949a(auVar, a);
            a2.f86303g = b;
        }
        C57369au auVar2 = azVar.f86176a.f153449c;
        if (auVar2 == null) {
            auVar2 = C57369au.f153254l;
        }
        a2.mo37941g(a2.mo37852v(auVar2), auVar2, a);
        return a2;
    }
}
