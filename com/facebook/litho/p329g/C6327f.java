package com.facebook.litho.p329g;

import android.util.SparseArray;
import androidx.core.p097i.C1970e;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.litho.g.f */
/* compiled from: PG */
public final class C6327f {

    /* renamed from: a */
    public static final /* synthetic */ int f18722a = 0;

    /* renamed from: b */
    private static final List f18723b = new ArrayList();

    /* renamed from: b */
    private static final int m16980b(List list, String str) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C6335n nVar = (C6335n) it.next();
            if (nVar.f18740k.equals(str)) {
                break;
            }
            i += nVar.f18738i;
        }
        return i;
    }

    /* renamed from: c */
    private static final String m16981c(C6335n nVar, String str) {
        if (nVar != null && nVar.f18730a == null) {
            return nVar.getClass().getSimpleName();
        }
        if (nVar == null) {
            return BuildConfig.FLAVOR;
        }
        String simpleName = nVar.getClass().getSimpleName();
        return str + "->" + simpleName;
    }

    /* renamed from: a */
    public static C6326e m16979a(C6336o oVar, C6335n nVar, C6335n nVar2, List list, C6333l lVar, String str, String str2, String str3, String str4, boolean z) {
        List list2;
        C6335n nVar3 = nVar;
        C6335n nVar4 = nVar2;
        boolean z2 = z;
        int i = 0;
        boolean z3 = nVar3 == null;
        boolean z4 = nVar4 == null;
        if (z3 && z4) {
            throw new IllegalStateException("Both currentRoot and newRoot are null.");
        } else if (z4) {
            int i2 = nVar3.f18738i;
            list.add(nVar3);
            C6326e c = C6326e.m16970c(nVar3.f18738i, nVar4, z2);
            for (int i3 = 0; i3 < i2; i3++) {
                c.mo13338f(C6324c.m16968e(0, (Object) null));
            }
            return c;
        } else {
            List list3 = list;
            String c2 = m16981c(nVar3, str2);
            String c3 = m16981c(nVar4, str3);
            if (z3 || C6337p.m17004q(nVar, nVar2)) {
                lVar.mo13345d(str, nVar, nVar2, c2, c3, true, str4);
                if (nVar2.mo13291k()) {
                    if (!z3) {
                        i = nVar3.f18738i;
                    }
                    C6326e c4 = C6326e.m16970c(i, nVar4, z2);
                    C6336o oVar2 = nVar4.f18732c;
                    if (nVar3 == null) {
                        nVar3 = null;
                    }
                    nVar4.mo13292n(oVar2, c4, nVar3, nVar4);
                    nVar4.f18738i = c4.f18721d;
                    return c4;
                }
                C6326e c5 = C6326e.m16970c(0, nVar4, z2);
                Map d = C6335n.m16990d(nVar);
                Map d2 = C6335n.m16990d(nVar2);
                if (nVar3 == null) {
                    list2 = f18723b;
                } else {
                    list2 = new ArrayList(nVar3.f18739j);
                }
                List list4 = nVar4.f18739j;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                while (i4 < list4.size()) {
                    String str5 = ((C6335n) list4.get(i4)).f18740k;
                    if (d.containsKey(str5)) {
                        C1970e eVar = (C1970e) d.get(str5);
                        C6335n nVar5 = (C6335n) eVar.f5888a;
                        int intValue = ((Integer) eVar.f5889b).intValue();
                        if (i6 > intValue) {
                            int i7 = 0;
                            while (i7 < nVar5.f18738i) {
                                c5.mo13338f(C6324c.m16964a(m16980b(list2, str5), i5, (Object) null));
                                i7++;
                                List list5 = list;
                            }
                            list2.remove(intValue);
                            list2.add(i6, nVar5);
                            int size = list2.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                C6335n nVar6 = (C6335n) list2.get(i8);
                                C1970e eVar2 = (C1970e) d.get(nVar6.f18740k);
                                if (((Integer) eVar2.f5889b).intValue() != i8) {
                                    d.put(nVar6.f18740k, new C1970e((C6335n) eVar2.f5888a, Integer.valueOf(i8)));
                                }
                            }
                        } else if (intValue > i6) {
                            i5 = (m16980b(list2, str5) + ((C6335n) list2.get(intValue)).f18738i) - 1;
                            i6 = intValue;
                            i4++;
                            List list6 = list;
                        }
                    }
                    i4++;
                    List list62 = list;
                }
                SparseArray sparseArray = new SparseArray();
                int i9 = 0;
                while (i9 < list2.size()) {
                    String str6 = ((C6335n) list2.get(i9)).f18740k;
                    C6335n nVar7 = (C6335n) list2.get(i9);
                    if (d2.get(str6) == null) {
                        sparseArray.put(i9, m16979a(oVar, nVar7, (C6335n) null, list, lVar, str, c2, c3, str4, z));
                    }
                    i9++;
                    boolean z5 = z;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < list4.size(); i11++) {
                    C6335n nVar8 = (C6335n) list4.get(i11);
                    C1970e eVar3 = (C1970e) d.get(nVar8.f18740k);
                    int intValue2 = eVar3 != null ? ((Integer) eVar3.f5889b).intValue() : -1;
                    if (intValue2 < 0) {
                        C6326e eVar4 = (C6326e) sparseArray.get(i10);
                        C6326e a = m16979a(oVar, (C6335n) null, nVar8, list, lVar, str, c2, c3, str4, z);
                        sparseArray.put(i10, C6326e.m16971d(eVar4, a));
                        if (eVar4 != null) {
                            eVar4.mo13340h();
                        }
                        a.mo13340h();
                    } else {
                        C6326e eVar5 = (C6326e) sparseArray.get(intValue2);
                        C6326e a2 = m16979a(oVar, (C6335n) list2.get(intValue2), nVar8, list, lVar, str, c2, c3, str4, z);
                        sparseArray.put(intValue2, C6326e.m16971d(eVar5, a2));
                        if (eVar5 != null) {
                            eVar5.mo13340h();
                        }
                        a2.mo13340h();
                        i10 = intValue2;
                    }
                }
                int size2 = sparseArray.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    C6326e eVar6 = (C6326e) sparseArray.valueAt(i12);
                    c5 = C6326e.m16971d(c5, eVar6);
                    if (eVar6 != null) {
                        eVar6.mo13340h();
                    }
                }
                nVar4.f18738i = c5.f18721d;
                return c5;
            }
            C6326e c6 = C6326e.m16970c(nVar3.f18738i, nVar4, z2);
            nVar4.f18738i = c6.f18721d;
            lVar.mo13345d(str, nVar, nVar2, c2, c3, false, str4);
            return c6;
        }
    }
}
