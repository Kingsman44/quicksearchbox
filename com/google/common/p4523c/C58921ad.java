package com.google.common.p4523c;

import com.google.common.p4575r.C60755l;

/* renamed from: com.google.common.c.ad */
/* compiled from: PG */
final class C58921ad extends C58934i {

    /* renamed from: c */
    private static final int[] f156759c = new int[0];

    /* renamed from: d */
    private int[] f156760d;

    /* renamed from: e */
    private int[] f156761e;

    /* renamed from: f */
    private int[] f156762f;

    /* renamed from: g */
    private int[] f156763g;

    /* renamed from: h */
    private int[] f156764h;

    /* renamed from: i */
    private int[] f156765i;

    public C58921ad(C60755l lVar) {
        super(lVar);
        int[] iArr = f156759c;
        this.f156760d = iArr;
        this.f156761e = iArr;
        this.f156762f = iArr;
        this.f156763g = iArr;
        this.f156764h = iArr;
        this.f156765i = iArr;
    }

    /* renamed from: c */
    private final void m91067c(int i, boolean z) {
        if (this.f156760d.length <= i) {
            int i2 = i + 1;
            this.f156762f = m91070f(this.f156762f, i2, z);
            this.f156761e = m91070f(this.f156761e, i2, z);
            this.f156760d = new int[i2];
        }
    }

    /* renamed from: d */
    private final void m91068d(int i, boolean z) {
        if (this.f156763g.length <= i) {
            int i2 = i + 1;
            this.f156765i = m91070f(this.f156765i, i2, z);
            this.f156764h = m91070f(this.f156764h, i2, z);
            this.f156763g = new int[i2];
        }
    }

    /* renamed from: f */
    private static final int[] m91070f(int[] iArr, int i, boolean z) {
        int[] iArr2 = new int[i];
        if (z) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        }
        return iArr2;
    }

    /* renamed from: a */
    public final int mo56202a(C60755l lVar, int i) {
        boolean z;
        int i2;
        int i3 = i;
        C60755l lVar2 = this.f156777b;
        int i4 = lVar2.f164798c;
        int i5 = lVar.f164798c;
        int i6 = i4 - i5;
        int abs = Math.abs(i6);
        if (abs > i3) {
            return Integer.MAX_VALUE;
        }
        if (i6 <= 0) {
            m91068d(abs, false);
            for (int i7 = 0; i7 <= abs; i7++) {
                this.f156764h[i7] = (abs - i7) - 1;
                this.f156765i[i7] = -1;
            }
        } else {
            m91067c(abs, false);
            for (int i8 = 0; i8 <= abs; i8++) {
                this.f156761e[i8] = -1;
                this.f156762f[i8] = -1;
            }
        }
        int i9 = abs;
        boolean z2 = true;
        while (true) {
            int i10 = (i9 - i6) / 2;
            m91068d(i10, true);
            if (z2) {
                this.f156764h[i10] = -1;
            }
            int i11 = i10;
            int i12 = -1;
            while (i11 > 0) {
                int i13 = i11 - 1;
                i12 = m91069e(i6 + i11, i9 - i11, lVar2, lVar, this.f156765i[i13], this.f156764h[i11], i12);
                this.f156763g[i11] = i12;
                i11 = i13;
                i10 = i10;
            }
            int i14 = i10;
            int i15 = (i9 + i6) / 2;
            m91067c(i15, true);
            if (z2) {
                this.f156761e[i15] = i14 - 1;
                z = true;
            } else {
                z = false;
            }
            int i16 = i15;
            int i17 = z ? -1 : i14;
            while (i16 > 0) {
                int[] iArr = this.f156760d;
                int i18 = i16 - 1;
                i17 = m91069e(i6 - i16, i9 - i16, lVar2, lVar, i17, this.f156761e[i16], this.f156762f[i18]);
                iArr[i16] = i17;
                i16 = i18;
            }
            int e = m91069e(i6, i9, lVar2, lVar, i17, this.f156761e[0], i12);
            if (e == i5) {
                return i9;
            }
            i2 = i9 + 1;
            if (i2 <= i3 && i2 >= 0) {
                int[] iArr2 = this.f156760d;
                int[] iArr3 = this.f156763g;
                iArr3[0] = e;
                iArr2[0] = e;
                int[] iArr4 = this.f156761e;
                this.f156762f = iArr4;
                this.f156761e = iArr2;
                this.f156760d = iArr4;
                int[] iArr5 = this.f156765i;
                this.f156765i = this.f156764h;
                this.f156764h = iArr3;
                this.f156763g = iArr5;
                z2 = !z;
                i9 = i2;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public final double mo56203b(C60755l lVar) {
        return C58927b.m91078a(this, lVar);
    }

    /* renamed from: e */
    private static final int m91069e(int i, int i2, C60755l lVar, C60755l lVar2, int i3, int i4, int i5) {
        int i6;
        int i7 = lVar.f164798c;
        int i8 = lVar2.f164798c;
        if (i2 == 0) {
            i6 = 0;
        } else {
            i6 = Math.max(Math.max(i4, i5) + 1, i3);
        }
        int min = Math.min(i8, i7 - i);
        while (i6 < min && lVar.mo57181a(i6 + i) == lVar2.mo57181a(i6)) {
            i6++;
        }
        return i6;
    }
}
