package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7735i;
import com.google.p375ai.p378b.C7751ip;
import com.google.p375ai.p378b.C7752iq;
import com.google.p375ai.p378b.C7762j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.az */
/* compiled from: PG */
public final /* synthetic */ class C98170az implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98236ba f274131a;

    public /* synthetic */ C98170az(C98236ba baVar) {
        this.f274131a = baVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C7735i iVar;
        C7708h hVar;
        HashMap hashMap;
        C7709ha haVar;
        C7709ha haVar2;
        C7718hj hjVar;
        C7708h hVar2;
        C7708h hVar3;
        C98236ba baVar = this.f274131a;
        C7762j jVar = baVar.f274275b.f27923d;
        if (jVar == null) {
            jVar = C7762j.f27177h;
        }
        List list = baVar.f274277d;
        int i = baVar.f274278e;
        if (jVar != null) {
            iVar = (C7735i) jVar.toBuilder();
        } else {
            iVar = (C7735i) C7762j.f27177h.createBuilder();
        }
        if (!list.isEmpty()) {
            iVar.mo16954a(list);
            int i2 = 1;
            if (i > 0) {
                iVar.copyOnWrite();
                C7762j jVar2 = (C7762j) iVar.instance;
                jVar2.f27179a |= 1;
                jVar2.f27185g = i;
            }
            ArrayList arrayList = new ArrayList(((C7762j) iVar.instance).f27180b.size());
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            for (C7752iq builder : Collections.unmodifiableList(((C7762j) iVar.instance).f27180b)) {
                C7751ip ipVar = (C7751ip) builder.toBuilder();
                C7752iq iqVar = (C7752iq) ipVar.instance;
                if (iqVar.f27132b == i2) {
                    hVar = (C7708h) iqVar.f27133c;
                } else {
                    hVar = C7708h.f26894n;
                }
                Integer num = (Integer) hashMap2.get(hVar);
                if (num != null) {
                    int intValue = num.intValue();
                    ipVar.copyOnWrite();
                    C7752iq iqVar2 = (C7752iq) ipVar.instance;
                    iqVar2.f27132b = 40;
                    iqVar2.f27133c = Integer.valueOf(intValue);
                } else {
                    int size = arrayList2.size();
                    C7752iq iqVar3 = (C7752iq) ipVar.instance;
                    if (iqVar3.f27132b == 1) {
                        hVar2 = (C7708h) iqVar3.f27133c;
                    } else {
                        hVar2 = C7708h.f26894n;
                    }
                    arrayList2.add(hVar2);
                    C7752iq iqVar4 = (C7752iq) ipVar.instance;
                    if (iqVar4.f27132b == 1) {
                        hVar3 = (C7708h) iqVar4.f27133c;
                    } else {
                        hVar3 = C7708h.f26894n;
                    }
                    Integer valueOf = Integer.valueOf(size);
                    hashMap2.put(hVar3, valueOf);
                    ipVar.copyOnWrite();
                    C7752iq iqVar5 = (C7752iq) ipVar.instance;
                    iqVar5.f27132b = 40;
                    iqVar5.f27133c = valueOf;
                }
                C7752iq iqVar6 = (C7752iq) ipVar.instance;
                if (iqVar6.f27134d == 2) {
                    C7718hj hjVar2 = (C7718hj) iqVar6.f27135e;
                    if (!hashMap3.containsKey(hjVar2)) {
                        int size2 = arrayList3.size();
                        C7752iq iqVar7 = (C7752iq) ipVar.instance;
                        hashMap = hashMap2;
                        if (iqVar7.f27134d == 2) {
                            hjVar = (C7718hj) iqVar7.f27135e;
                        } else {
                            hjVar = C7718hj.f26927af;
                        }
                        arrayList3.add(hjVar);
                        hashMap3.put(hjVar2, Integer.valueOf(size2));
                    } else {
                        hashMap = hashMap2;
                    }
                    int intValue2 = ((Integer) hashMap3.get(hjVar2)).intValue();
                    ipVar.copyOnWrite();
                    C7752iq iqVar8 = (C7752iq) ipVar.instance;
                    iqVar8.f27134d = 41;
                    iqVar8.f27135e = Integer.valueOf(intValue2);
                } else {
                    hashMap = hashMap2;
                }
                C7752iq iqVar9 = (C7752iq) ipVar.instance;
                if (iqVar9.f27136f == 35) {
                    haVar = (C7709ha) iqVar9.f27137g;
                } else {
                    haVar = C7709ha.f26910f;
                }
                if (haVar != null) {
                    if (!hashMap4.containsKey(haVar)) {
                        int size3 = arrayList4.size();
                        arrayList4.add(haVar);
                        hashMap4.put(haVar, Integer.valueOf(size3));
                    }
                    int intValue3 = ((Integer) hashMap4.get(haVar)).intValue();
                    ipVar.copyOnWrite();
                    C7752iq iqVar10 = (C7752iq) ipVar.instance;
                    iqVar10.f27136f = 42;
                    iqVar10.f27137g = Integer.valueOf(intValue3);
                }
                C7752iq iqVar11 = (C7752iq) ipVar.instance;
                if (iqVar11.f27138h == 36) {
                    haVar2 = (C7709ha) iqVar11.f27139i;
                } else {
                    haVar2 = C7709ha.f26910f;
                }
                if (haVar2 != null) {
                    if (!hashMap5.containsKey(haVar2)) {
                        int size4 = arrayList5.size();
                        arrayList5.add(haVar2);
                        hashMap5.put(haVar2, Integer.valueOf(size4));
                    }
                    int intValue4 = ((Integer) hashMap5.get(haVar2)).intValue();
                    ipVar.copyOnWrite();
                    C7752iq iqVar12 = (C7752iq) ipVar.instance;
                    iqVar12.f27138h = 43;
                    iqVar12.f27139i = Integer.valueOf(intValue4);
                }
                arrayList.add((C7752iq) ipVar.build());
                hashMap2 = hashMap;
                i2 = 1;
            }
            iVar.copyOnWrite();
            ((C7762j) iVar.instance).f27180b = C7762j.emptyProtobufList();
            iVar.mo16954a(arrayList);
            iVar.copyOnWrite();
            ((C7762j) iVar.instance).f27181c = C7762j.emptyProtobufList();
            iVar.copyOnWrite();
            C7762j jVar3 = (C7762j) iVar.instance;
            C62971cq cqVar = jVar3.f27181c;
            if (!cqVar.mo58948c()) {
                jVar3.f27181c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) arrayList2, (List) jVar3.f27181c);
            iVar.copyOnWrite();
            ((C7762j) iVar.instance).f27182d = C7762j.emptyProtobufList();
            iVar.copyOnWrite();
            C7762j jVar4 = (C7762j) iVar.instance;
            C62971cq cqVar2 = jVar4.f27182d;
            if (!cqVar2.mo58948c()) {
                jVar4.f27182d = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) arrayList3, (List) jVar4.f27182d);
            iVar.copyOnWrite();
            ((C7762j) iVar.instance).f27183e = C7762j.emptyProtobufList();
            iVar.copyOnWrite();
            C7762j jVar5 = (C7762j) iVar.instance;
            C62971cq cqVar3 = jVar5.f27183e;
            if (!cqVar3.mo58948c()) {
                jVar5.f27183e = C62942bv.mutableCopy(cqVar3);
            }
            C62947c.addAll((Iterable) arrayList4, (List) jVar5.f27183e);
            iVar.copyOnWrite();
            ((C7762j) iVar.instance).f27184f = C7762j.emptyProtobufList();
            iVar.copyOnWrite();
            C7762j jVar6 = (C7762j) iVar.instance;
            C62971cq cqVar4 = jVar6.f27184f;
            if (!cqVar4.mo58948c()) {
                jVar6.f27184f = C62942bv.mutableCopy(cqVar4);
            }
            C62947c.addAll((Iterable) arrayList5, (List) jVar6.f27184f);
        }
        return (C7762j) iVar.build();
    }
}
