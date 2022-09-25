package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aie */
/* compiled from: PG */
public final class aie {

    /* renamed from: a */
    private static final Map f20695a;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m18765c(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m18765c(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m18765c(hashMap, hashMap2, Character.TYPE, Character.class);
        m18765c(hashMap, hashMap2, Double.TYPE, Double.class);
        m18765c(hashMap, hashMap2, Float.TYPE, Float.class);
        m18765c(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m18765c(hashMap, hashMap2, Long.TYPE, Long.class);
        m18765c(hashMap, hashMap2, Short.TYPE, Short.class);
        m18765c(hashMap, hashMap2, Void.TYPE, Void.class);
        f20695a = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static boolean m18763a(Type type) {
        return f20695a.containsKey(type);
    }

    /* renamed from: b */
    public static Class m18764b(Class cls) {
        Class cls2 = (Class) f20695a.get(cls);
        return cls2 == null ? cls : cls2;
    }

    /* renamed from: c */
    private static void m18765c(Map map, Map map2, Class cls, Class cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
