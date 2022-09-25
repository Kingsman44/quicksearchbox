package org.p5633c.p5634a.p5639e;

import java.util.ArrayList;
import java.util.List;
import org.p5633c.p5634a.C72144ab;
import org.p5633c.p5634a.C72152aj;

/* renamed from: org.c.a.e.aa */
/* compiled from: PG */
final class C72235aa implements C72244aj, C72243ai {

    /* renamed from: a */
    private final C72244aj[] f192211a;

    /* renamed from: b */
    private final C72243ai[] f192212b;

    public C72235aa(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof C72244aj) {
                if (obj instanceof C72235aa) {
                    m106520e(arrayList, ((C72235aa) obj).f192211a);
                } else {
                    arrayList.add(obj);
                }
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof C72243ai) {
                if (obj2 instanceof C72235aa) {
                    m106520e(arrayList2, ((C72235aa) obj2).f192212b);
                } else {
                    arrayList2.add(obj2);
                }
            }
        }
        if (arrayList.size() <= 0) {
            this.f192211a = null;
        } else {
            this.f192211a = (C72244aj[]) arrayList.toArray(new C72244aj[arrayList.size()]);
        }
        if (arrayList2.size() <= 0) {
            this.f192212b = null;
        } else {
            this.f192212b = (C72243ai[]) arrayList2.toArray(new C72243ai[arrayList2.size()]);
        }
    }

    /* renamed from: e */
    private static final void m106520e(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object add : objArr) {
                list.add(add);
            }
        }
    }

    /* renamed from: a */
    public final int mo63582a(C72152aj ajVar) {
        C72244aj[] ajVarArr = this.f192211a;
        int length = ajVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += ajVarArr[length].mo63582a(ajVar);
        }
    }

    /* renamed from: b */
    public final int mo63583b(C72152aj ajVar, int i) {
        C72244aj[] ajVarArr = this.f192211a;
        int length = ajVarArr.length;
        int i2 = 0;
        while (i2 < i) {
            length--;
            if (length < 0) {
                break;
            }
            i2 += ajVarArr[length].mo63583b(ajVar, Integer.MAX_VALUE);
        }
        return i2;
    }

    /* renamed from: c */
    public final int mo63584c(C72144ab abVar, String str, int i) {
        C72243ai[] aiVarArr = this.f192212b;
        if (aiVarArr != null) {
            int length = aiVarArr.length;
            for (int i2 = 0; i2 < length && i >= 0; i2++) {
                i = aiVarArr[i2].mo63584c(abVar, str, i);
            }
            return i;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo63585d(StringBuffer stringBuffer, C72152aj ajVar) {
        for (C72244aj d : this.f192211a) {
            d.mo63585d(stringBuffer, ajVar);
        }
    }
}
