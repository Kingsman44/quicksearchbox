package com.google.common.p4523c;

import com.google.common.p4575r.C60755l;

/* renamed from: com.google.common.c.ag */
/* compiled from: PG */
final class C58924ag extends C58922ae {

    /* renamed from: e */
    final int f156770e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C58924ag(com.google.common.p4575r.C60755l r6, int r7) {
        /*
            r5 = this;
            int[] r7 = new int[r7]
            int r0 = r6.f164798c
            r1 = 0
        L_0x0005:
            r2 = 1
            if (r1 >= r0) goto L_0x0015
            int r3 = r6.mo57181a(r1)
            r4 = r7[r3]
            int r2 = r2 << r1
            r2 = r2 | r4
            r7[r3] = r2
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0015:
            r5.<init>(r6, r7)
            int r6 = r5.f156766c
            int r6 = r6 + -1
            int r6 = r2 << r6
            r5.f156770e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4523c.C58924ag.<init>(com.google.common.r.l, int):void");
    }

    /* renamed from: a */
    public final int mo56202a(C60755l lVar, int i) {
        int i2 = lVar.f164798c;
        int i3 = this.f156766c;
        if (i2 - i3 > i || i3 - i2 > i) {
            return i + 1;
        }
        int i4 = (i + i2) - i3;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        int i5 = 0;
        int i6 = -1;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = ((int[]) this.f156767d)[lVar.mo57181a(i7)] | i5;
            int i9 = i8 | (((i8 & i6) + i6) ^ i6);
            int i10 = i5 | ((i9 | i6) ^ -1);
            int i11 = i6 & i9;
            int i12 = this.f156770e;
            if ((i11 & i12) != 0) {
                i3--;
            } else if ((i12 & i10) != 0) {
                i3++;
                i4 -= 2;
                if (i4 < 0) {
                    break;
                }
            } else {
                i4--;
                if (i4 < 0) {
                    break;
                }
            }
            int i13 = (i10 + i10) | 1;
            i6 = (i11 + i11) | ((i9 | i13) ^ -1);
            i5 = i13 & i9;
        }
        return i3;
    }
}
