package org.p5633c.p5634a.p5638d;

import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72294r;

/* renamed from: org.c.a.d.h */
/* compiled from: PG */
public final class C72218h {
    /* renamed from: a */
    public static int m106355a(long j) {
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("Value cannot fit in an int: " + j);
    }

    /* renamed from: b */
    public static long m106356b(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j + " + " + j2);
    }

    /* renamed from: d */
    public static long m106358d(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0;
        }
        long j3 = j * j2;
        if (j3 / j2 == j) {
            if (j != Long.MIN_VALUE || j2 != -1) {
                return j3;
            }
            j2 = -1;
            j = Long.MIN_VALUE;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + j2);
    }

    /* renamed from: e */
    public static long m106359e(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j + " - " + j2);
    }

    /* renamed from: f */
    public static void m106360f(C72233e eVar, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new C72294r(eVar.mo63563z(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    /* renamed from: g */
    public static void m106361g(C72283g gVar, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new C72294r(gVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    /* renamed from: h */
    public static boolean m106362h(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    public static long m106357c(long j, int i) {
        if (i != -1) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return j;
            }
            long j2 = (long) i;
            long j3 = j * j2;
            if (j3 / j2 == j) {
                return j3;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        } else if (j != Long.MIN_VALUE) {
            return -j;
        } else {
            throw new ArithmeticException("Multiplication overflows a long: -9223372036854775808 * " + i);
        }
    }
}
