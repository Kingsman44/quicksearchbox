package com.google.android.libraries.onegoogle.owners.p2386a;

import com.google.android.libraries.onegoogle.owners.C30974i;
import com.google.android.libraries.onegoogle.owners.C30976k;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.onegoogle.owners.a.c */
/* compiled from: PG */
final class C30944c {
    /* renamed from: a */
    public static final void m57752a(String str, List list, Map map) {
        if (!map.containsKey(str)) {
            list.add(str);
            C30974i m = C30976k.m57823m();
            m.mo36618b(str);
            map.put(str, m);
        }
    }
}
