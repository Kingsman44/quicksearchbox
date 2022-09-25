package com.google.android.libraries.gsa.conversation.p1853g.p1854a;

import com.google.assistant.p3897e.p3908d.p3909a.C51174e;
import com.google.assistant.p3897e.p3908d.p3909a.C51175f;
import com.google.assistant.p3897e.p3908d.p3909a.C51178i;
import com.google.assistant.p3897e.p3908d.p3909a.C51180k;
import com.google.assistant.p3897e.p3908d.p3909a.C51181l;
import com.google.assistant.p3897e.p3908d.p3909a.C51182m;
import com.google.assistant.p3897e.p3917i.p3918a.C51429hj;
import com.google.assistant.p3897e.p3917i.p3918a.C51430hk;
import com.google.assistant.p3897e.p3917i.p3918a.C51432hm;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a.e */
/* compiled from: PG */
final class C22600e {

    /* renamed from: a */
    public static final C59071e f62261a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.g.a.e");

    /* renamed from: a */
    public static int m42093a(C22599d dVar) {
        C51174e eVar = (C51174e) C51175f.f133205f.createBuilder();
        int i = dVar.f62260d;
        eVar.copyOnWrite();
        C51175f fVar = (C51175f) eVar.instance;
        fVar.f133207a |= 1;
        fVar.f133208b = i;
        dVar.f62257a.put(Integer.valueOf(dVar.f62260d), eVar);
        dVar.f62260d++;
        return ((C51175f) eVar.instance).f133208b;
    }

    /* renamed from: b */
    public static int m42094b(C51430hk hkVar, int i, C22599d dVar) {
        int i2;
        int a = C51429hj.m86182a(hkVar.f133952a);
        if (a != 0 && a == 2) {
            if (!hkVar.f133953b.isEmpty()) {
                TreeSet<Integer> treeSet = new TreeSet<>();
                for (C51432hm hmVar : hkVar.f133953b) {
                    int i3 = hmVar.f133957a;
                    if (i3 == 2) {
                        i2 = m42094b((C51430hk) hmVar.f133958b, i, dVar);
                    } else {
                        if (dVar.f62259c.contains(Integer.valueOf(i3 == 1 ? ((Integer) hmVar.f133958b).intValue() : 0))) {
                            int a2 = m42093a(dVar);
                            C51174e eVar = (C51174e) dVar.f62257a.get(Integer.valueOf(a2));
                            eVar.getClass();
                            eVar.mo53531b(hmVar.f133957a == 1 ? ((Integer) hmVar.f133958b).intValue() : 0);
                            if (i >= 0) {
                                eVar.mo53532c(i);
                                C51174e eVar2 = (C51174e) dVar.f62257a.get(Integer.valueOf(i));
                                eVar2.getClass();
                                eVar2.mo53533d(a2);
                            }
                            i2 = a2;
                        } else if (hmVar.f133957a == 1) {
                            ((Integer) hmVar.f133958b).intValue();
                        }
                    }
                    treeSet.add(Integer.valueOf(i2));
                }
                i = m42093a(dVar);
                for (Integer intValue : treeSet) {
                    int intValue2 = intValue.intValue();
                    C51174e eVar3 = (C51174e) dVar.f62257a.get(Integer.valueOf(intValue2));
                    eVar3.getClass();
                    eVar3.mo53533d(i);
                    C51174e eVar4 = (C51174e) dVar.f62257a.get(Integer.valueOf(i));
                    eVar4.getClass();
                    eVar4.mo53532c(intValue2);
                }
            }
        } else if (!hkVar.f133953b.isEmpty()) {
            int a3 = m42093a(dVar);
            if (i >= 0) {
                C51174e eVar5 = (C51174e) dVar.f62257a.get(Integer.valueOf(a3));
                eVar5.getClass();
                eVar5.mo53532c(i);
                C51174e eVar6 = (C51174e) dVar.f62257a.get(Integer.valueOf(i));
                eVar6.getClass();
                eVar6.mo53533d(a3);
            }
            i = a3;
            for (C51432hm hmVar2 : hkVar.f133953b) {
                int i4 = hmVar2.f133957a;
                if (i4 == 2) {
                    i = m42094b((C51430hk) hmVar2.f133958b, i, dVar);
                } else {
                    if (dVar.f62259c.contains(Integer.valueOf(i4 == 1 ? ((Integer) hmVar2.f133958b).intValue() : 0))) {
                        C51174e eVar7 = (C51174e) dVar.f62257a.get(Integer.valueOf(i));
                        eVar7.getClass();
                        eVar7.mo53531b(hmVar2.f133957a == 1 ? ((Integer) hmVar2.f133958b).intValue() : 0);
                    } else if (hmVar2.f133957a == 1) {
                        ((Integer) hmVar2.f133958b).intValue();
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public static List m42095c(List list, int i) {
        ArrayList arrayList = new ArrayList(list.size() - 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue != i) {
                arrayList.add(Integer.valueOf(intValue));
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static void m42096d(C51182m mVar) {
        C51178i iVar = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar = C51180k.SEND_RESPONSE;
        iVar.copyOnWrite();
        C51181l lVar = (C51181l) iVar.instance;
        lVar.f133224b = kVar.f133220f;
        lVar.f133223a |= 1;
        mVar.mo53550e(iVar);
        C51178i iVar2 = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar2 = C51180k.FINISH;
        iVar2.copyOnWrite();
        C51181l lVar2 = (C51181l) iVar2.instance;
        lVar2.f133224b = kVar2.f133220f;
        lVar2.f133223a |= 1;
        mVar.mo53550e(iVar2);
    }

    /* renamed from: e */
    public static void m42097e(int i, Deque deque, Set set, C22599d dVar) {
        Integer valueOf = Integer.valueOf(i);
        if (!set.contains(valueOf)) {
            set.add(valueOf);
            C51174e eVar = (C51174e) dVar.f62257a.get(valueOf);
            eVar.getClass();
            for (Integer intValue : Collections.unmodifiableList(((C51175f) eVar.instance).f133210d)) {
                int intValue2 = intValue.intValue();
                if (!set.contains(Integer.valueOf(intValue2))) {
                    m42097e(intValue2, deque, set, dVar);
                }
            }
            deque.addFirst(Integer.valueOf(i));
        }
    }
}
