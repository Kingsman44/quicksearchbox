package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.eo */
/* compiled from: PG */
final class C63023eo {

    /* renamed from: a */
    public static final C63044fi f170119a = m95822Z(false);

    /* renamed from: b */
    public static final C63044fi f170120b = m95822Z(true);

    /* renamed from: c */
    public static final C63044fi f170121c = new C63046fk();

    /* renamed from: d */
    private static final Class f170122d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f170122d = cls;
    }

    /* renamed from: A */
    static int m95797A(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m95829g(list) + (size * C62906an.m95320M(i));
    }

    /* renamed from: B */
    static int m95798B(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return m95830h(list) + (list.size() * C62906an.m95320M(i));
    }

    /* renamed from: C */
    static int m95799C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m95833k(list) + (size * C62906an.m95320M(i));
    }

    /* renamed from: D */
    static int m95800D(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m95834l(list) + (size * C62906an.m95320M(i));
    }

    /* renamed from: E */
    static int m95801E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m95836n(list) + (size * C62906an.m95320M(i));
    }

    /* renamed from: F */
    static int m95802F(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m95837o(list) + (size * C62906an.m95320M(i));
    }

    /* renamed from: G */
    public static void m95803G(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    i3++;
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    aoVar.f169854a.mo58760Y(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58761Z(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: H */
    public static void m95804H(int i, List list, C62907ao aoVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                aoVar.f169854a.mo58763aa(i, (C63088z) list.get(i2));
            }
        }
    }

    /* renamed from: I */
    public static void m95805I(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    i3 += 8;
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    aoVar.f169854a.mo58769l(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58768k(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    /* renamed from: J */
    public static void m95806J(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C62906an.m95314G(((Integer) list.get(i4)).intValue());
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    aoVar.f169854a.mo58771n(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58770m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: K */
    public static void m95807K(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += 4;
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    aoVar.f169854a.mo58767j(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58766i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: L */
    public static void m95808L(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += 8;
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    aoVar.f169854a.mo58769l(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58768k(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: M */
    public static void m95809M(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    i3 += 4;
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    aoVar.f169854a.mo58767j(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58766i(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    /* renamed from: N */
    public static void m95810N(int i, List list, C62907ao aoVar, C63022en enVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                aoVar.mo58790a(i, list.get(i2), enVar);
            }
        }
    }

    /* renamed from: O */
    public static void m95811O(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C62906an.m95314G(((Integer) list.get(i4)).intValue());
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    aoVar.f169854a.mo58771n(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58770m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: P */
    public static void m95812P(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C62906an.m95322O(((Long) list.get(i4)).longValue());
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    aoVar.f169854a.mo58782y(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58781x(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: Q */
    public static void m95813Q(int i, List list, C62907ao aoVar, C63022en enVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                aoVar.mo58791b(i, list.get(i2), enVar);
            }
        }
    }

    /* renamed from: R */
    public static void m95814R(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += 4;
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    aoVar.f169854a.mo58767j(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58766i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: S */
    public static void m95815S(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += 8;
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    aoVar.f169854a.mo58769l(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58768k(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: T */
    public static void m95816T(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += C62906an.m95321N((intValue >> 31) ^ (intValue + intValue));
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    C62906an anVar = aoVar.f169854a;
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    anVar.mo58780w((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C62906an anVar2 = aoVar.f169854a;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                anVar2.mo58779v(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    /* renamed from: U */
    public static void m95817U(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += C62906an.m95322O((longValue >> 63) ^ (longValue + longValue));
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    C62906an anVar = aoVar.f169854a;
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    anVar.mo58782y((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C62906an anVar2 = aoVar.f169854a;
                long longValue3 = ((Long) list.get(i2)).longValue();
                anVar2.mo58781x(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    /* renamed from: V */
    public static void m95818V(int i, List list, C62907ao aoVar) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof C62983db) {
                C62983db dbVar = (C62983db) list;
                while (i2 < list.size()) {
                    Object f = dbVar.mo58965f(i2);
                    if (f instanceof String) {
                        aoVar.f169854a.mo58776s(i, (String) f);
                    } else {
                        aoVar.f169854a.mo58763aa(i, (C63088z) f);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58776s(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: W */
    public static void m95819W(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C62906an.m95321N(((Integer) list.get(i4)).intValue());
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    aoVar.f169854a.mo58780w(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58779v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: X */
    public static void m95820X(int i, List list, C62907ao aoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aoVar.f169854a.mo58778u(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C62906an.m95322O(((Long) list.get(i4)).longValue());
                }
                aoVar.f169854a.mo58780w(i3);
                while (i2 < list.size()) {
                    aoVar.f169854a.mo58782y(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aoVar.f169854a.mo58781x(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: Y */
    static void m95821Y(Object obj, Object obj2, long j) {
        C63054fs.f170169a.mo59141s(obj, j, C62996do.m95606c(C63054fs.f170169a.mo59138p(obj, j), C63054fs.f170169a.mo59138p(obj2, j)));
    }

    /* renamed from: Z */
    private static C63044fi m95822Z(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C63044fi) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    static int m95823a(List list) {
        return list.size();
    }

    /* renamed from: b */
    static int m95824b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int M = size * C62906an.m95320M(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            M += C62906an.m95311D((C63088z) list.get(i2));
        }
        return M;
    }

    /* renamed from: c */
    static int m95825c(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            i = 0;
            while (i2 < size) {
                caVar.mo58918h(i2);
                i += C62906an.m95314G(caVar.f169993c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C62906an.m95314G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    static int m95826d(List list) {
        return list.size() * 4;
    }

    /* renamed from: e */
    static int m95827e(List list) {
        return list.size() * 8;
    }

    /* renamed from: f */
    static int m95828f(int i, List list, C63022en enVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C62906an.m95312E(i, (MessageLite) list.get(i3), enVar);
        }
        return i2;
    }

    /* renamed from: g */
    static int m95829g(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            i = 0;
            while (i2 < size) {
                caVar.mo58918h(i2);
                i += C62906an.m95314G(caVar.f169993c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C62906an.m95314G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: h */
    static int m95830h(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            i = 0;
            while (i2 < size) {
                dhVar.mo58975g(i2);
                i += C62906an.m95322O(dhVar.f170047c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C62906an.m95322O(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: i */
    static int m95831i(int i, Object obj, C63022en enVar) {
        if (!(obj instanceof C62980cz)) {
            return C62906an.m95321N(i << 3) + C62906an.m95317J((MessageLite) obj, enVar);
        }
        int N = C62906an.m95321N(i << 3);
        int a = ((C62980cz) obj).mo58957a();
        return N + C62906an.m95321N(a) + a;
    }

    /* renamed from: j */
    static int m95832j(int i, List list, C63022en enVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int M = C62906an.m95320M(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C62980cz) {
                i2 = C62906an.m95315H((C62980cz) obj);
            } else {
                i2 = C62906an.m95317J((MessageLite) obj, enVar);
            }
            M += i2;
        }
        return M;
    }

    /* renamed from: k */
    static int m95833k(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            i = 0;
            while (i2 < size) {
                caVar.mo58918h(i2);
                int i3 = caVar.f169993c[i2];
                i += C62906an.m95321N((i3 >> 31) ^ (i3 + i3));
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i4 = i + C62906an.m95321N((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: l */
    static int m95834l(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            i = 0;
            while (i2 < size) {
                dhVar.mo58975g(i2);
                long j = dhVar.f170047c[i2];
                i += C62906an.m95322O((j >> 63) ^ (j + j));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + C62906an.m95322O((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    static int m95835m(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int M = C62906an.m95320M(i) * size;
        if (list instanceof C62983db) {
            C62983db dbVar = (C62983db) list;
            while (i4 < size) {
                Object f = dbVar.mo58965f(i4);
                if (f instanceof C63088z) {
                    i3 = C62906an.m95311D((C63088z) f);
                } else {
                    i3 = C62906an.m95319L((String) f);
                }
                M += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C63088z) {
                    i2 = C62906an.m95311D((C63088z) obj);
                } else {
                    i2 = C62906an.m95319L((String) obj);
                }
                M += i2;
                i4++;
            }
        }
        return M;
    }

    /* renamed from: n */
    static int m95836n(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            i = 0;
            while (i2 < size) {
                caVar.mo58918h(i2);
                i += C62906an.m95321N(caVar.f169993c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C62906an.m95321N(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    static int m95837o(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            i = 0;
            while (i2 < size) {
                dhVar.mo58975g(i2);
                i += C62906an.m95322O(dhVar.f170047c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C62906an.m95322O(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: p */
    static Object m95838p(int i, List list, C62958ce ceVar, Object obj, C63044fi fiVar) {
        if (ceVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (ceVar.mo23993a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = m95840r(i, intValue, obj, fiVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (ceVar.mo23993a(intValue2) == null) {
                    obj = m95840r(i, intValue2, obj, fiVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: q */
    static Object m95839q(int i, List list, C62959cf cfVar, Object obj, C63044fi fiVar) {
        if (cfVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (cfVar.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = m95840r(i, intValue, obj, fiVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!cfVar.isInRange(intValue2)) {
                    obj = m95840r(i, intValue2, obj, fiVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: r */
    static Object m95840r(int i, int i2, Object obj, C63044fi fiVar) {
        if (obj == null) {
            obj = fiVar.mo59091f();
        }
        fiVar.mo59097l(obj, i, (long) i2);
        return obj;
    }

    /* renamed from: s */
    static void m95841s(C62922bb bbVar, Object obj, Object obj2) {
        C62926bf b = bbVar.mo58834b(obj2);
        if (!b.f169888b.isEmpty()) {
            C62926bf c = bbVar.mo58835c(obj);
            for (int i = 0; i < b.f169888b.mo59064a(); i++) {
                c.mo58850g(b.f169888b.mo59070e(i));
            }
            for (Map.Entry g : b.f169888b.mo59065b()) {
                c.mo58850g(g);
            }
        }
    }

    /* renamed from: t */
    static void m95842t(C63044fi fiVar, Object obj, Object obj2) {
        fiVar.mo59100o(obj, fiVar.mo59090e(fiVar.mo59089d(obj), fiVar.mo59089d(obj2)));
    }

    /* renamed from: u */
    public static void m95843u(Class cls) {
        Class cls2;
        if (!C62942bv.class.isAssignableFrom(cls) && (cls2 = f170122d) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: v */
    static boolean m95844v(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: w */
    static int m95845w(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C62906an.m95321N(i << 3) + 1);
    }

    /* renamed from: x */
    static int m95846x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m95825c(list) + (size * C62906an.m95320M(i));
    }

    /* renamed from: y */
    static int m95847y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C62906an.m95321N(i << 3) + 4);
    }

    /* renamed from: z */
    static int m95848z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C62906an.m95321N(i << 3) + 8);
    }
}
