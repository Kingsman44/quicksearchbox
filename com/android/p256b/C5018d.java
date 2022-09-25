package com.android.p256b;

/* renamed from: com.android.b.d */
/* compiled from: PG */
final class C5018d extends C5032r {
    /* renamed from: d */
    private static void m13808d(String str, int[] iArr, int[] iArr2, int i) {
        String str2;
        int length = str.length() - 2;
        if (length > 0) {
            iArr2[i] = m13823b(str.substring(0, length), -53, 53, false);
            str2 = str.substring(length);
        } else {
            str2 = str;
        }
        Integer num = (Integer) C5033s.f15886b.get(str2);
        if (num != null) {
            iArr[i] = num.intValue();
            return;
        }
        throw new C5017c("Invalid BYDAY value: ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public final int mo9969a(String str, C5033s sVar) {
        int[] iArr;
        int[] iArr2;
        int i;
        if (str.indexOf(",") < 0) {
            i = 1;
            iArr2 = new int[1];
            iArr = new int[1];
            m13808d(str, iArr2, iArr, 0);
        } else {
            String[] split = str.split(",");
            i = split.length;
            iArr2 = new int[i];
            iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                m13808d(split[i2], iArr2, iArr, i2);
            }
        }
        sVar.f15900o = iArr2;
        sVar.f15901p = iArr;
        sVar.f15902q = i;
        return 128;
    }
}
