package com.google.p4272br;

/* renamed from: com.google.br.ab */
/* compiled from: PG */
final class C56432ab {

    /* renamed from: a */
    static final int[] f150706a = new int[0];

    /* renamed from: a */
    static int m88117a(int i, int i2) {
        int i3 = i < 0 ? 5 : 0;
        if (i == 10) {
            i3 = 1;
        }
        if (i2 < 0) {
            i3 |= 10;
        }
        if (i2 == 10) {
            i3 |= 2;
        }
        return m88120d(i) != m88120d(i2) ? i3 | 16 : i3 | 32;
    }

    /* renamed from: b */
    static int m88118b(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 97 && i <= 102) {
            return i - 87;
        }
        if (i < 65 || i > 70) {
            return -1;
        }
        return i - 55;
    }

    /* renamed from: c */
    static void m88119c(StringBuilder sb, int i) {
        if (i > 255 ? C56457z.m88194b(C56431aa.f150570I, i) || C56457z.m88194b(C56431aa.f150571J, i) || C56457z.m88194b(C56431aa.f150572K, i) || C56457z.m88194b(C56431aa.f150566E, i) || C56457z.m88194b(C56431aa.f150567F, i) : (i >= 32 && i < 127) || (i >= 161 && i != 173)) {
            if ("\\.+*?()|[]{}^$".indexOf((char) i) >= 0) {
                sb.append('\\');
            }
            sb.appendCodePoint(i);
        } else if (i == 12) {
            sb.append("\\f");
        } else if (i == 13) {
            sb.append("\\r");
        } else if (i == 34) {
            sb.append("\\\"");
        } else if (i != 92) {
            switch (i) {
                case 8:
                    sb.append("\\b");
                    return;
                case 9:
                    sb.append("\\t");
                    return;
                case 10:
                    sb.append("\\n");
                    return;
                default:
                    String hexString = Integer.toHexString(i);
                    if (i < 256) {
                        sb.append("\\x");
                        if (hexString.length() == 1) {
                            sb.append('0');
                        }
                        sb.append(hexString);
                        return;
                    }
                    sb.append("\\x{");
                    sb.append(hexString);
                    sb.append('}');
                    return;
            }
        } else {
            sb.append("\\\\");
        }
    }

    /* renamed from: d */
    static boolean m88120d(int i) {
        if (i >= 65 && i <= 90) {
            return true;
        }
        if (i < 97 || i > 122) {
            return (i >= 48 && i <= 57) || i == 95;
        }
        return true;
    }

    /* renamed from: e */
    static boolean m88121e(int i) {
        if (i >= 48 && i <= 57) {
            return true;
        }
        if (i < 65 || i > 90) {
            return i >= 97 && i <= 122;
        }
        return true;
    }

    /* renamed from: f */
    static int[] m88122f(int[] iArr, int i, int i2) {
        int[] iArr2 = new int[(i2 - i)];
        for (int i3 = i; i3 < i2; i3++) {
            iArr2[i3 - i] = iArr[i3];
        }
        return iArr2;
    }
}
