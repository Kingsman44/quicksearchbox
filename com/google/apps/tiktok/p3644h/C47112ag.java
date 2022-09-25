package com.google.apps.tiktok.p3644h;

import androidx.p060c.C0977g;
import androidx.p060c.C0984n;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4577t.C60785a;
import com.google.common.p4577t.C60786b;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.h.ag */
/* compiled from: PG */
public final class C47112ag {
    /* renamed from: a */
    public static C58485gu m83788a(Map map, C0984n nVar, C47111af afVar) {
        List<C47110ae> list;
        int i;
        Set keySet = map.keySet();
        synchronized (nVar) {
            list = (List) nVar.get(keySet);
            if (list == null) {
                list = new ArrayList<>(keySet);
                Collections.shuffle(list, afVar.f122717a);
                int i2 = 0;
                C0984n nVar2 = new C0984n(0);
                ArrayDeque arrayDeque = new ArrayDeque(list);
                HashSet hashSet = new HashSet(list);
                while (!arrayDeque.isEmpty()) {
                    C47110ae aeVar = (C47110ae) arrayDeque.remove();
                    C58485gu guVar = aeVar.f122714b;
                    int i3 = ((C58724pq) guVar).f156474d;
                    for (int i4 = 0; i4 < i3; i4++) {
                        C47110ae aeVar2 = (C47110ae) guVar.get(i4);
                        C47111af.m83787b(nVar2, aeVar, aeVar2);
                        if (hashSet.add(aeVar2)) {
                            arrayDeque.add(aeVar2);
                        }
                    }
                    C58485gu guVar2 = aeVar.f122715c;
                    int i5 = ((C58724pq) guVar2).f156474d;
                    for (int i6 = 0; i6 < i5; i6++) {
                        C47110ae aeVar3 = (C47110ae) guVar2.get(i6);
                        C47111af.m83787b(nVar2, aeVar3, aeVar);
                        if (hashSet.add(aeVar3)) {
                            arrayDeque.add(aeVar3);
                        }
                    }
                }
                C58528ij F = C58528ij.m90006F(list);
                try {
                    ArrayList<C60786b> arrayList = new ArrayList<>(list.size());
                    HashMap hashMap = new HashMap(list.size());
                    int i7 = 0;
                    for (Object next : list) {
                        C60786b bVar = new C60786b(next, i7);
                        arrayList.add(bVar);
                        List list2 = (List) hashMap.get(next);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            hashMap.put(next, list2);
                        }
                        list2.add(bVar);
                        i7++;
                    }
                    int size = arrayList.size();
                    while (i2 < size) {
                        C60786b bVar2 = (C60786b) arrayList.get(i2);
                        Iterator it = C47111af.m83786a(F, nVar2, (C47110ae) bVar2.f164840a).iterator();
                        while (true) {
                            i = i2 + 1;
                            if (!it.hasNext()) {
                                break;
                            }
                            List<C60786b> list3 = (List) hashMap.get(it.next());
                            if (list3 != null) {
                                for (C60786b bVar3 : list3) {
                                    bVar3.f164842c.add(bVar2);
                                    bVar2.f164843d++;
                                }
                            } else {
                                bVar2.f164843d++;
                            }
                        }
                        i2 = i;
                    }
                    ArrayList<C60786b> arrayList2 = new ArrayList<>(list.size());
                    PriorityQueue priorityQueue = new PriorityQueue();
                    for (C60786b bVar4 : arrayList) {
                        if (bVar4.f164843d == 0) {
                            priorityQueue.add(bVar4);
                        }
                    }
                    while (!priorityQueue.isEmpty()) {
                        C60786b bVar5 = (C60786b) priorityQueue.poll();
                        arrayList2.add(bVar5);
                        for (C60786b bVar6 : bVar5.f164842c) {
                            int i8 = bVar6.f164843d - 1;
                            bVar6.f164843d = i8;
                            if (i8 == 0) {
                                priorityQueue.add(bVar6);
                            }
                        }
                    }
                    if (arrayList2.size() != list.size()) {
                        ArrayList arrayList3 = new ArrayList();
                        for (C60786b bVar7 : arrayList) {
                            if (bVar7.f164843d > 0) {
                                arrayList3.add(bVar7.f164840a);
                            }
                        }
                        throw new C60785a(arrayList3);
                    }
                    list.clear();
                    for (C60786b bVar8 : arrayList2) {
                        list.add(bVar8.f164840a);
                    }
                    nVar.put(keySet, list);
                } catch (C60785a e) {
                    throw new IllegalStateException("Cycle: ".concat(String.valueOf(String.valueOf(Collections.unmodifiableList(e.f164839a)))), e);
                }
            }
        }
        C58480gp e2 = C58485gu.m89837e();
        for (C47110ae aeVar4 : list) {
            for (C69464a b : (Set) map.get(aeVar4)) {
                e2.mo55395g((C61485f) b.mo17428b());
            }
        }
        return e2.mo55394f();
    }

    /* renamed from: b */
    public static Map m83789b(Set set) {
        C0977g gVar = new C0977g();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = (AbstractMap.SimpleImmutableEntry) it.next();
            Set set2 = (Set) gVar.get(simpleImmutableEntry.getKey());
            if (set2 == null) {
                set2 = Collections.newSetFromMap(new C0977g());
                gVar.put((C47110ae) simpleImmutableEntry.getKey(), set2);
            }
            set2.add((C69464a) simpleImmutableEntry.getValue());
        }
        return gVar;
    }
}
