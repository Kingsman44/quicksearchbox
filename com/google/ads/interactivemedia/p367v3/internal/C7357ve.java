package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;
import java.util.Random;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ve */
/* compiled from: PG */
public final class C7357ve {

    /* renamed from: a */
    private final Random f24032a;

    /* renamed from: b */
    private final int[] f24033b;

    /* renamed from: c */
    private final int[] f24034c;

    public C7357ve() {
        this(new Random());
    }

    /* renamed from: a */
    public final int mo16638a() {
        return this.f24033b.length;
    }

    /* renamed from: b */
    public final int mo16639b(int i) {
        int i2 = this.f24034c[i] + 1;
        int[] iArr = this.f24033b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo16640c(int i) {
        int i2 = this.f24034c[i] - 1;
        if (i2 >= 0) {
            return this.f24033b[i2];
        }
        return -1;
    }

    /* renamed from: d */
    public final int mo16641d() {
        int[] iArr = this.f24033b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    /* renamed from: e */
    public final int mo16642e() {
        int[] iArr = this.f24033b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    /* renamed from: f */
    public final C7357ve mo16643f(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            iArr[i4] = this.f24032a.nextInt(this.f24033b.length + 1);
            int i5 = i4 + 1;
            int nextInt = this.f24032a.nextInt(i5);
            iArr2[i4] = iArr2[nextInt];
            iArr2[nextInt] = i4 + i;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[(this.f24033b.length + i2)];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr4 = this.f24033b;
            if (i3 >= iArr4.length + i2) {
                return new C7357ve(iArr3, new Random(this.f24032a.nextLong()));
            }
            if (i6 >= i2 || i7 != iArr[i6]) {
                int i8 = i7 + 1;
                int i9 = iArr4[i7];
                iArr3[i3] = i9;
                if (i9 >= i) {
                    iArr3[i3] = i9 + i2;
                }
                i7 = i8;
            } else {
                iArr3[i3] = iArr2[i6];
                i6++;
            }
            i3++;
        }
    }

    /* renamed from: g */
    public final C7357ve mo16644g(int i, int i2) {
        int i3 = i2 - i;
        int[] iArr = new int[(this.f24033b.length - i3)];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = this.f24033b;
            if (i4 >= iArr2.length) {
                return new C7357ve(iArr, new Random(this.f24032a.nextLong()));
            }
            int i6 = iArr2[i4];
            if (i6 < i || i6 >= i2) {
                int i7 = i4 - i5;
                if (i6 >= i) {
                    i6 -= i3;
                }
                iArr[i7] = i6;
            } else {
                i5++;
            }
            i4++;
        }
    }

    /* renamed from: h */
    public final C7357ve mo16645h() {
        return new C7357ve(new Random(this.f24032a.nextLong()));
    }

    private C7357ve(Random random) {
        this(new int[0], random);
    }

    private C7357ve(int[] iArr, Random random) {
        this.f24033b = iArr;
        this.f24032a = random;
        this.f24034c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f24034c[iArr[i]] = i;
        }
    }
}
