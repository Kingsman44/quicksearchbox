package com.google.p4272br;

/* renamed from: com.google.br.a */
/* compiled from: PG */
final class C56430a {

    /* renamed from: a */
    public int[] f150560a;

    /* renamed from: b */
    public int f150561b;

    public C56430a() {
        this.f150560a = C56432ab.f150706a;
        this.f150561b = 0;
    }

    public C56430a(int[] iArr) {
        this.f150560a = iArr;
        this.f150561b = iArr.length;
    }

    /* renamed from: k */
    private static int m87989k(int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[i] - i2;
        if (i4 != 0) {
            return i4;
        }
        return i3 - iArr[i + 1];
    }

    /* renamed from: l */
    private static void m87990l(int[] iArr, int i, int i2) {
        int i3 = ((i + i2) / 2) & -2;
        int i4 = iArr[i3];
        int i5 = iArr[i3 + 1];
        int i6 = i;
        int i7 = i2;
        while (i6 <= i7) {
            while (i6 < i2 && m87989k(iArr, i6, i4, i5) < 0) {
                i6 += 2;
            }
            while (i7 > i && m87989k(iArr, i7, i4, i5) > 0) {
                i7 -= 2;
            }
            if (i6 <= i7) {
                if (i6 != i7) {
                    int i8 = iArr[i6];
                    iArr[i6] = iArr[i7];
                    iArr[i7] = i8;
                    int i9 = i6 + 1;
                    int i10 = iArr[i9];
                    int i11 = i7 + 1;
                    iArr[i9] = iArr[i11];
                    iArr[i11] = i10;
                }
                i6 += 2;
                i7 -= 2;
            }
        }
        if (i < i7) {
            m87990l(iArr, i, i7);
        }
        if (i6 < i2) {
            m87990l(iArr, i6, i2);
        }
    }

    /* renamed from: a */
    public final void mo54363a(int i) {
        int[] iArr = this.f150560a;
        if (iArr.length < i) {
            int i2 = this.f150561b;
            int i3 = i2 + i2;
            if (i < i3) {
                i = i3;
            }
            int[] iArr2 = new int[i];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f150560a = iArr2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int[] mo54364b() {
        int i = this.f150561b;
        int[] iArr = this.f150560a;
        if (i == iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo54365c(int[] iArr) {
        for (int i = 0; i < iArr.length; i += 2) {
            mo54367e(iArr[i], iArr[i + 1]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo54366d(C56433b bVar, boolean z) {
        int[] iArr = bVar.f150727d;
        if (z) {
            C56430a aVar = new C56430a();
            for (int i = 0; i < iArr.length; i += 2) {
                aVar.mo54371i(iArr[i], iArr[i + 1]);
            }
            aVar.mo54369g();
            iArr = aVar.mo54364b();
        }
        mo54370h(iArr, bVar.f150726c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo54367e(int i, int i2) {
        if (this.f150561b > 0) {
            for (int i3 = 2; i3 <= 4; i3 += 2) {
                int i4 = this.f150561b;
                if (i4 >= i3) {
                    int[] iArr = this.f150560a;
                    int i5 = i4 - i3;
                    int i6 = iArr[i5];
                    int i7 = i5 + 1;
                    int i8 = iArr[i7];
                    if (i <= i8 + 1 && i6 <= i2 + 1) {
                        if (i < i6) {
                            iArr[i5] = i;
                        }
                        if (i2 > i8) {
                            iArr[i7] = i2;
                            return;
                        }
                        return;
                    }
                }
            }
        }
        mo54363a(this.f150561b + 2);
        int[] iArr2 = this.f150560a;
        int i9 = this.f150561b;
        int i10 = i9 + 1;
        iArr2[i9] = i;
        this.f150561b = i10 + 1;
        iArr2[i10] = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo54368f(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            int i = iArr2[0];
            int i2 = iArr2[1];
            int i3 = iArr2[2];
            if (i3 == 1) {
                mo54367e(i, i2);
            } else {
                while (i <= i2) {
                    mo54367e(i, i);
                    i += i3;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo54369g() {
        int i = this.f150561b;
        if (i >= 4) {
            m87990l(this.f150560a, 0, i - 2);
            int i2 = 2;
            for (int i3 = 2; i3 < this.f150561b; i3 += 2) {
                int[] iArr = this.f150560a;
                int i4 = iArr[i3];
                int i5 = iArr[i3 + 1];
                int i6 = i2 - 1;
                int i7 = iArr[i6];
                if (i4 > i7 + 1) {
                    iArr[i2] = i4;
                    iArr[i2 + 1] = i5;
                    i2 += 2;
                } else if (i5 > i7) {
                    iArr[i6] = i5;
                }
            }
            this.f150561b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo54370h(int[] iArr, int i) {
        if (i < 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < iArr.length; i3 += 2) {
                int i4 = iArr[i3];
                int i5 = iArr[i3 + 1];
                int i6 = i4 - 1;
                if (i2 <= i6) {
                    mo54367e(i2, i6);
                }
                i2 = i5 + 1;
            }
            if (i2 <= 1114111) {
                mo54367e(i2, 1114111);
                return;
            }
            return;
        }
        mo54365c(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo54372j(int i, int i2) {
        if ((i2 & 1) != 0) {
            mo54371i(i, i);
        } else {
            mo54367e(i, i);
        }
    }

    public final String toString() {
        int[] iArr = this.f150560a;
        int i = this.f150561b;
        StringBuilder sb = new StringBuilder("[");
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (i2 > 0) {
                sb.append(' ');
            }
            int i3 = iArr[i2];
            int i4 = iArr[i2 + 1];
            if (i3 == i4) {
                sb.append("0x");
                sb.append(Integer.toHexString(i3));
            } else {
                sb.append("0x");
                sb.append(Integer.toHexString(i3));
                sb.append("-0x");
                sb.append(Integer.toHexString(i4));
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo54371i(int i, int i2) {
        if (i <= 65 && i2 >= 66639) {
            mo54367e(i, i2);
        } else if (i2 < 65 || i > 66639) {
            mo54367e(i, i2);
        } else {
            if (i < 65) {
                mo54367e(i, 64);
                i = 65;
            }
            if (i2 > 66639) {
                mo54367e(66640, i2);
                i2 = 66639;
            }
            while (i <= i2) {
                mo54367e(i, i);
                for (int a = C56457z.m88193a(i); a != i; a = C56457z.m88193a(a)) {
                    mo54367e(a, a);
                }
                i++;
            }
        }
    }
}
