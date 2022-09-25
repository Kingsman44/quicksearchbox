package com.android.p256b;

/* renamed from: com.android.b.r */
/* compiled from: PG */
abstract class C5032r {
    /* renamed from: b */
    public static int m13823b(String str, int i, int i2, boolean z) {
        try {
            if (str.charAt(0) == '+') {
                str = str.substring(1);
            }
            int parseInt = Integer.parseInt(str);
            if (parseInt >= i && parseInt <= i2) {
                if (parseInt != 0) {
                    return parseInt;
                }
                if (z) {
                    return 0;
                }
            }
            throw new C5017c("Integer value out of range: " + str);
        } catch (NumberFormatException unused) {
            throw new C5017c("Invalid integer value: ".concat(String.valueOf(str)));
        }
    }

    /* renamed from: c */
    public static int[] m13824c(String str, int i, int i2, boolean z) {
        if (str.indexOf(",") < 0) {
            return new int[]{m13823b(str, i, i2, z)};
        }
        String[] split = str.split(",");
        int length = split.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = m13823b(split[i3], i, i2, z);
        }
        return iArr;
    }

    /* renamed from: a */
    public abstract int mo9969a(String str, C5033s sVar);
}
