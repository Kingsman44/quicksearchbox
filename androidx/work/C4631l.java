package androidx.work;

import java.util.Map;

/* renamed from: androidx.work.l */
/* compiled from: PG */
public final class C4631l {
    /* renamed from: a */
    public static final C4632m m13030a(Map map) {
        C4632m mVar = new C4632m(map);
        C4632m.m13036e(mVar);
        return mVar;
    }

    /* renamed from: b */
    public static final void m13031b(Map map, Map map2) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                map2.put(str, (Object) null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map2.put(str, value);
                } else if (cls == boolean[].class) {
                    map2.put(str, C4632m.m13037f((boolean[]) value));
                } else if (cls == byte[].class) {
                    map2.put(str, C4632m.m13038g((byte[]) value));
                } else if (cls == int[].class) {
                    map2.put(str, C4632m.m13041j((int[]) value));
                } else if (cls == long[].class) {
                    map2.put(str, C4632m.m13042k((long[]) value));
                } else if (cls == float[].class) {
                    map2.put(str, C4632m.m13040i((float[]) value));
                } else if (cls == double[].class) {
                    map2.put(str, C4632m.m13039h((double[]) value));
                } else {
                    throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                }
            }
        }
    }

    /* renamed from: c */
    public static final void m13032c(String str, byte[] bArr, Map map) {
        map.put(str, C4632m.m13038g(bArr));
    }

    /* renamed from: d */
    public static final void m13033d(String str, int i, Map map) {
        map.put(str, Integer.valueOf(i));
    }

    /* renamed from: e */
    public static final void m13034e(long j, Map map) {
        map.put("com.google.android.libraries.privatetelemetry.tqcobalt.worker.DISABLED_TIME", Long.valueOf(j));
    }
}
