package com.google.common.p4543n.p4550f;

import java.util.List;

/* renamed from: com.google.common.n.f.l */
/* compiled from: PG */
final class C59439l {
    /* renamed from: a */
    public static final void m92349a(String str, List list, List list2) {
        List list3 = (List) list2.get(list2.size() - 1);
        C59438k kVar = (C59438k) list.get(list3.size());
        list3.add(str);
        kVar.f157687c = Math.max(kVar.f157687c, str.length());
    }

    /* renamed from: b */
    public static final void m92350b(String str, int i, String str2, List list) {
        list.add(new C59438k(str, i, str2));
    }
}
