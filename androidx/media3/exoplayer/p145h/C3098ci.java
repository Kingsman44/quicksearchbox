package androidx.media3.exoplayer.p145h;

import java.util.Arrays;
import java.util.Random;

/* renamed from: androidx.media3.exoplayer.h.ci */
/* compiled from: PG */
public final class C3098ci {

    /* renamed from: a */
    public final int[] f9065a;

    /* renamed from: b */
    public final int[] f9066b;

    /* renamed from: c */
    private final Random f9067c;

    public C3098ci() {
        this(new Random());
    }

    /* renamed from: a */
    public final C3098ci mo7090a() {
        return new C3098ci(new Random(this.f9067c.nextLong()));
    }

    /* renamed from: b */
    public final C3098ci mo7091b(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            iArr[i4] = this.f9067c.nextInt(this.f9065a.length + 1);
            int i5 = i4 + 1;
            int nextInt = this.f9067c.nextInt(i5);
            iArr2[i4] = iArr2[nextInt];
            iArr2[nextInt] = i4 + i;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[(this.f9065a.length + i2)];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr4 = this.f9065a;
            if (i3 >= iArr4.length + i2) {
                return new C3098ci(iArr3, new Random(this.f9067c.nextLong()));
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

    /* renamed from: c */
    public final C3098ci mo7092c(int i, int i2) {
        int i3 = i2 - i;
        int[] iArr = new int[(this.f9065a.length - i3)];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = this.f9065a;
            if (i4 >= iArr2.length) {
                return new C3098ci(iArr, new Random(this.f9067c.nextLong()));
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

    private C3098ci(Random random) {
        this(new int[0], random);
    }

    private C3098ci(int[] iArr, Random random) {
        this.f9065a = iArr;
        this.f9067c = random;
        this.f9066b = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f9066b[iArr[i]] = i;
        }
    }
}
