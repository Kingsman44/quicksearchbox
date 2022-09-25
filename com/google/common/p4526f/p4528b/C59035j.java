package com.google.common.p4526f.p4528b;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.common.f.b.j */
/* compiled from: PG */
public final class C59035j {

    /* renamed from: a */
    public static final Locale f156957a = Locale.ROOT;

    /* renamed from: a */
    public static String m91287a(Object obj, RuntimeException runtimeException) {
        String str;
        try {
            str = runtimeException.toString();
        } catch (RuntimeException e) {
            str = e.getClass().getSimpleName();
        }
        return m91290d(obj, str);
    }

    /* renamed from: b */
    public static String m91288b(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (!obj.getClass().isArray()) {
            String obj2 = obj.toString();
            if (obj2 != null) {
                return obj2;
            }
            return m91290d(obj, "toString() returned null");
        } else if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        } else {
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            return Arrays.toString((Object[]) obj);
        }
    }

    /* renamed from: c */
    public static void m91289c(StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append("0");
            return;
        }
        String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & -4; numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    /* renamed from: d */
    private static String m91290d(Object obj, String str) {
        String name = obj.getClass().getName();
        int identityHashCode = System.identityHashCode(obj);
        return "{" + name + "@" + identityHashCode + ": " + str + "}";
    }
}
