package com.android.p275j;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.android.j.n */
/* compiled from: PG */
public final class C5202n {

    /* renamed from: a */
    public final int f16505a;

    /* renamed from: b */
    public final byte[] f16506b;

    /* renamed from: c */
    public final Map f16507c;

    /* renamed from: d */
    public final List f16508d;

    /* renamed from: e */
    public final boolean f16509e;

    public C5202n(int i, byte[] bArr, Map map, List list, boolean z) {
        this.f16505a = i;
        this.f16506b = bArr;
        this.f16507c = map;
        this.f16508d = list == null ? null : Collections.unmodifiableList(list);
        this.f16509e = z;
    }

    /* renamed from: a */
    public static Map m14163a(List list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5199k kVar = (C5199k) it.next();
            treeMap.put(kVar.f16498a, kVar.f16499b);
        }
        return treeMap;
    }
}
