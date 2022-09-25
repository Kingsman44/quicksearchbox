package com.android.p275j.p276a;

import com.android.p275j.C5199k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.android.j.a.k */
/* compiled from: PG */
public final class C5181k extends C5171a {
    public C5181k() {
    }

    public C5181k(byte[] bArr) {
    }

    /* renamed from: a */
    public static List m14138a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String kVar : (List) entry.getValue()) {
                    arrayList.add(new C5199k((String) entry.getKey(), kVar));
                }
            }
        }
        return arrayList;
    }
}
