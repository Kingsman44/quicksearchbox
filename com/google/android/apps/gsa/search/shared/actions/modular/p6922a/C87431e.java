package com.google.android.apps.gsa.search.shared.actions.modular.p6922a;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55138hg;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.a.e */
/* compiled from: PG */
public final class C87431e {

    /* renamed from: a */
    public static final C58817ah f236137a = C87430d.f236136a;

    /* renamed from: b */
    private static final C59071e f236138b = C59071e.m91332i("com.google.android.apps.gsa.search.shared.actions.modular.a.e");

    /* renamed from: a */
    public static C87429c m141670a(List list, C55134hc hcVar, C58817ah ahVar, C58817ah ahVar2) {
        HashSet hashSet;
        if (list.isEmpty()) {
            return C87429c.f236122a;
        }
        int size = list.size();
        if (size == 0) {
            return C87429c.f236122a;
        }
        if (size == 1) {
            C87429c cVar = (C87429c) ahVar.apply(list.get(0));
            cVar.getClass();
            return cVar;
        } else if (hcVar == null) {
            return C87429c.f236122a;
        } else {
            if (hcVar.f145126f.size() == 1) {
                int d = hcVar.f145126f.mo58914d(0);
                if (d < 0) {
                    d += size;
                }
                if (d < 0 || d >= size) {
                    return new C87429c(BuildConfig.FLAVOR);
                }
                C87429c cVar2 = (C87429c) ahVar.apply(list.get(d));
                cVar2.getClass();
                return cVar2;
            }
            ArrayList d2 = C58597ky.m90213d(list.size());
            C55138hg hgVar = null;
            if (ahVar2 == null) {
                hashSet = null;
            } else {
                hashSet = new HashSet();
            }
            C62961ch<Integer> chVar = hcVar.f145126f;
            if (!chVar.isEmpty()) {
                ArrayList arrayList = new ArrayList(chVar.size());
                for (Integer intValue : chVar) {
                    int intValue2 = intValue.intValue();
                    if (intValue2 < 0) {
                        intValue2 += list.size();
                    }
                    if (intValue2 >= 0 && intValue2 < list.size()) {
                        arrayList.add(list.get(intValue2));
                    }
                }
                list = arrayList;
            }
            for (Object next : list) {
                next.getClass();
                C87429c cVar3 = (C87429c) ahVar.apply(next);
                if (cVar3 == null || !cVar3.mo81247f()) {
                    return C87429c.f236122a;
                }
                Object c = cVar3.mo81244c();
                if (c != null) {
                    if (ahVar2 != null) {
                        Object b = m141671b(c);
                        b.getClass();
                        if (!hashSet.add(b)) {
                        }
                    }
                    d2.add(c);
                }
            }
            if ((hcVar.f145121a & 16) != 0 && (hgVar = hcVar.f145127g) == null) {
                hgVar = C55138hg.f145142g;
            }
            return new C87429c(m141674e(hgVar, d2));
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Object m141671b(Object obj) {
        return obj instanceof String ? ((String) obj).toLowerCase(Locale.getDefault()) : obj;
    }

    /* renamed from: c */
    public static List m141672c(List list, List list2, boolean z) {
        return (!z || list.isEmpty()) ? list2 : list;
    }

    /* renamed from: d */
    public static List m141673d(List list, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i2 = -1;
        C55365pr prVar = null;
        int i3 = -1;
        while (it.hasNext()) {
            C55365pr prVar2 = (C55365pr) it.next();
            int i4 = prVar2.f145883f;
            int i5 = prVar2.f145884g;
            if (!((i4 == i2 && i5 == i3) || prVar == null)) {
                arrayList.add(prVar);
                prVar = null;
            }
            if (prVar2.f145885h <= i) {
                prVar = prVar2;
            }
            i2 = i4;
            i3 = i5;
        }
        if (prVar != null) {
            arrayList.add(prVar);
        }
        return arrayList;
    }

    /* renamed from: e */
    public static String m141674e(C55138hg hgVar, List list) {
        if (hgVar == null) {
            return new C58827ar(", ").mo56097d(list);
        }
        int size = list.size();
        C62971cq cqVar = hgVar.f145149f;
        String[] strArr = new String[size];
        int i = 0;
        for (Object next : list) {
            if (i < cqVar.size()) {
                strArr[i] = String.format((String) cqVar.get(i), new Object[]{next});
            } else {
                strArr[i] = next.toString();
            }
            i++;
        }
        if (size == 0) {
            return BuildConfig.FLAVOR;
        }
        if (size == 1) {
            return strArr[0];
        }
        if (size != 2) {
            int i2 = size - 1;
            String str = null;
            String str2 = BuildConfig.FLAVOR;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                String str3 = strArr[i4];
                if (i3 == 0) {
                    str = str3;
                } else if (i3 == 1) {
                    if ((hgVar.f145144a & 4) != 0) {
                        str2 = String.format(hgVar.f145146c, new Object[]{str, str3});
                    } else {
                        ((C59052c) ((C59052c) f236138b.mo56225c()).mo56372aa(9548)).mo56386p("No start format for list with more than 2 items.");
                        return BuildConfig.FLAVOR;
                    }
                } else if (i3 < i2) {
                    if ((hgVar.f145144a & 16) != 0) {
                        str2 = String.format(hgVar.f145147d, new Object[]{str2, str3});
                    } else {
                        ((C59052c) ((C59052c) f236138b.mo56225c()).mo56372aa(9547)).mo56386p("No middle format for list with more than 3 items.");
                        return BuildConfig.FLAVOR;
                    }
                } else if ((hgVar.f145144a & 64) != 0) {
                    str2 = String.format(hgVar.f145148e, new Object[]{str2, str3});
                } else {
                    ((C59052c) ((C59052c) f236138b.mo56225c()).mo56372aa(9546)).mo56386p("No end format for list with more than 2 items.");
                    return BuildConfig.FLAVOR;
                }
                i3++;
            }
            return str2;
        } else if ((hgVar.f145144a & 1) != 0) {
            return String.format(hgVar.f145145b, new Object[]{strArr[0], strArr[1]});
        } else {
            ((C59052c) ((C59052c) f236138b.mo56225c()).mo56372aa(9549)).mo56386p("No two item format for list with exactly 2 items.");
            return BuildConfig.FLAVOR;
        }
    }
}
