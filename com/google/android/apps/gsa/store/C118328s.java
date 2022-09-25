package com.google.android.apps.gsa.store;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.store.s */
/* compiled from: PG */
public final class C118328s {
    /* renamed from: a */
    public static C118327r m196509a(C118336y yVar, C118336y yVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(yVar);
        arrayList.add(yVar2);
        return C118326q.m196505a(arrayList, 13);
    }

    /* renamed from: b */
    public static C118327r m196510b(C118302a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C118308af.m196468b(aVar));
        arrayList.add(C118308af.m196476j((long) aVar.f328381a));
        return C118326q.m196505a(arrayList, 5);
    }

    /* renamed from: c */
    public static C118327r m196511c(C118302a aVar, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C118308af.m196474h(aVar));
        arrayList.add(C118308af.m196476j(j));
        return C118326q.m196505a(arrayList, 5);
    }

    /* renamed from: d */
    public static C118327r m196512d(C118327r rVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C118308af.f328389d);
        arrayList.add(rVar);
        return C118326q.m196505a(arrayList, 12);
    }

    /* renamed from: e */
    public static C118327r m196513e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((C118336y) it.next());
        }
        return C118326q.m196505a(arrayList, 11);
    }

    /* renamed from: f */
    public static C118327r m196514f(C118327r rVar, List list) {
        C58838bb.m90868c(rVar.f328454b == 11);
        ArrayList d = C58597ky.m90213d(rVar.f328453a.size() + list.size());
        d.addAll(rVar.f328453a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d.add((C118336y) it.next());
        }
        return m196513e(d);
    }

    /* renamed from: g */
    public static C118327r m196515g(C118327r rVar, C118327r rVar2) {
        if (rVar2 == null) {
            return rVar;
        }
        if (rVar == null) {
            return rVar2;
        }
        return m196516h(2, rVar, rVar2);
    }

    /* renamed from: h */
    public static C118327r m196516h(int i, C118327r... rVarArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(rVarArr[0]);
        arrayList.add(rVarArr[1]);
        C118327r a = C118326q.m196505a(arrayList, i);
        for (int i2 = 2; i2 < rVarArr.length; i2++) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a);
            arrayList2.add(rVarArr[i2]);
            a = C118326q.m196505a(arrayList2, i);
        }
        return a;
    }
}
