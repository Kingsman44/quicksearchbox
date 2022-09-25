package com.google.android.libraries.geller.p1815c;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.geller.c.f */
/* compiled from: PG */
public final class C21765f {
    /* renamed from: a */
    public static void m40882a(String str, String str2, Map map) {
        if (str != null) {
            if (map.containsKey(str)) {
                ((Set) map.get(str)).add(str2);
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(str2);
            map.put(str, hashSet);
        }
    }

    /* renamed from: b */
    public static void m40883b(String str, String str2, Map map) {
        if (str != null && map.containsKey(str)) {
            if (map.get(str) == null) {
                map.remove(str);
                return;
            }
            ((Set) map.get(str)).remove(str2);
            if (map.get(str) == null || ((Set) map.get(str)).isEmpty()) {
                map.remove(str);
            }
        }
    }
}
