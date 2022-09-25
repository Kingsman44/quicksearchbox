package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.components.s */
/* compiled from: PG */
final class C61165s {
    /* renamed from: a */
    static void m93532a(List list) {
        Set<C61163q> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                C61151e eVar = (C61151e) it.next();
                C61163q qVar = new C61163q(eVar);
                Iterator it2 = eVar.f165478a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class cls = (Class) it2.next();
                        C61164r rVar = new C61164r(cls, !eVar.mo57719d());
                        if (!hashMap.containsKey(rVar)) {
                            hashMap.put(rVar, new HashSet());
                        }
                        Set set2 = (Set) hashMap.get(rVar);
                        if (set2.isEmpty() || rVar.f165503a) {
                            set2.add(qVar);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                        }
                    }
                }
            } else {
                for (Set<C61163q> it3 : hashMap.values()) {
                    for (C61163q qVar2 : it3) {
                        for (C61166t tVar : qVar2.f165500a.f165479b) {
                            if (tVar.mo57727d() && (set = (Set) hashMap.get(new C61164r(tVar.f165505a, tVar.mo57728e()))) != null) {
                                for (C61163q qVar3 : set) {
                                    qVar2.f165501b.add(qVar3);
                                    qVar3.f165502c.add(qVar2);
                                }
                            }
                        }
                    }
                }
                HashSet<C61163q> hashSet = new HashSet<>();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                for (C61163q qVar4 : hashSet) {
                    if (qVar4.mo57724a()) {
                        hashSet2.add(qVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    C61163q qVar5 = (C61163q) hashSet2.iterator().next();
                    hashSet2.remove(qVar5);
                    i++;
                    for (C61163q qVar6 : qVar5.f165501b) {
                        qVar6.f165502c.remove(qVar5);
                        if (qVar6.mo57724a()) {
                            hashSet2.add(qVar6);
                        }
                    }
                }
                if (i != list.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (C61163q qVar7 : hashSet) {
                        if (!qVar7.mo57724a() && !qVar7.f165501b.isEmpty()) {
                            arrayList.add(qVar7.f165500a);
                        }
                    }
                    throw new C61167u(arrayList);
                }
                return;
            }
        }
    }
}
