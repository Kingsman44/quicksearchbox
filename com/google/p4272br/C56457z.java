package com.google.p4272br;

/* renamed from: com.google.br.z */
/* compiled from: PG */
final class C56457z {
    /* renamed from: a */
    static int m88193a(int i) {
        char c;
        int length = C56431aa.f150588a.length;
        if (i < 8492 && (c = C56431aa.f150588a[i]) != 0) {
            return c;
        }
        int lowerCase = Character.toLowerCase(i);
        if (lowerCase != i) {
            return lowerCase;
        }
        return Character.toUpperCase(i);
    }

    /* renamed from: b */
    public static boolean m88194b(int[][] iArr, int i) {
        if (i >= iArr[0][0]) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                int i3 = ((length - i2) / 2) + i2;
                int[] iArr2 = iArr[i3];
                int i4 = iArr2[0];
                if (i4 > i || i > iArr2[1]) {
                    if (i >= i4) {
                        i2 = i3 + 1;
                    } else {
                        length = i3;
                    }
                } else if ((i - i4) % iArr2[2] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
