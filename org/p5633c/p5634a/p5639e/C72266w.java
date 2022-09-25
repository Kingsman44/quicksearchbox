package org.p5633c.p5634a.p5639e;

/* renamed from: org.c.a.e.w */
/* compiled from: PG */
public final class C72266w {

    /* renamed from: a */
    private static final double f192286a = Math.log(10.0d);

    /* renamed from: a */
    public static int m106673a(long j) {
        int log;
        if (j < 0) {
            log = m106673a(-j);
        } else if (j < 10) {
            return 1;
        } else {
            if (j < 100) {
                return 2;
            }
            if (j < 1000) {
                return 3;
            }
            if (j < 10000) {
                return 4;
            }
            log = (int) (Math.log((double) j) / f192286a);
        }
        return log + 1;
    }

    /* renamed from: b */
    static int m106674b(String str, int i) {
        int charAt = str.charAt(i) - '0';
        return (((charAt << 3) + (charAt + charAt)) + str.charAt(i + 1)) - 48;
    }

    /* renamed from: c */
    static String m106675c(String str, int i) {
        String str2;
        int i2 = i + 32;
        if (str.length() <= i2 + 3) {
            str2 = str;
        } else {
            str2 = str.substring(0, i2).concat("...");
        }
        if (i <= 0) {
            return "Invalid format: \"" + str2 + "\"";
        } else if (i >= str.length()) {
            return "Invalid format: \"" + str2 + "\" is too short";
        } else {
            String substring = str2.substring(i);
            return "Invalid format: \"" + str2 + "\" is malformed at \"" + substring + "\"";
        }
    }

    /* renamed from: d */
    public static void m106676d(StringBuffer stringBuffer, int i, int i2) {
        if (i < 0) {
            stringBuffer.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                while (i2 > 10) {
                    stringBuffer.append('0');
                    i2--;
                }
                stringBuffer.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            while (i2 > 1) {
                stringBuffer.append('0');
                i2--;
            }
            stringBuffer.append((char) (i + 48));
        } else if (i < 100) {
            while (i2 > 2) {
                stringBuffer.append('0');
                i2--;
            }
            int i3 = ((i + 1) * 13421772) >> 27;
            stringBuffer.append((char) (i3 + 48));
            stringBuffer.append((char) (((i - (i3 << 3)) - (i3 + i3)) + 48));
        } else {
            int log = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log((double) i) / f192286a)) + 1;
            while (i2 > log) {
                stringBuffer.append('0');
                i2--;
            }
            stringBuffer.append(Integer.toString(i));
        }
    }

    /* renamed from: e */
    public static void m106677e(StringBuffer stringBuffer, int i) {
        if (i < 0) {
            stringBuffer.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                stringBuffer.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            stringBuffer.append((char) (i + 48));
        } else if (i < 100) {
            int i2 = ((i + 1) * 13421772) >> 27;
            stringBuffer.append((char) (i2 + 48));
            stringBuffer.append((char) (((i - (i2 << 3)) - (i2 + i2)) + 48));
        } else {
            stringBuffer.append(Integer.toString(i));
        }
    }

    /* renamed from: f */
    public static void m106678f(StringBuffer stringBuffer, long j) {
        int i = (int) j;
        if (((long) i) == j) {
            m106677e(stringBuffer, i);
        } else {
            stringBuffer.append(Long.toString(j));
        }
    }
}
