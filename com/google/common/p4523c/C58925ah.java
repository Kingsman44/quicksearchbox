package com.google.common.p4523c;

import com.google.common.p4575r.C60755l;

/* renamed from: com.google.common.c.ah */
/* compiled from: PG */
final class C58925ah extends C58922ae {

    /* renamed from: e */
    final long f156771e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C58925ah(com.google.common.p4575r.C60755l r8, int r9) {
        /*
            r7 = this;
            long[] r9 = new long[r9]
            int r0 = r8.f164798c
            r1 = 0
        L_0x0005:
            r2 = 1
            if (r1 >= r0) goto L_0x0016
            int r4 = r8.mo57181a(r1)
            r5 = r9[r4]
            long r2 = r2 << r1
            long r2 = r2 | r5
            r9[r4] = r2
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0016:
            r7.<init>(r8, r9)
            int r8 = r7.f156766c
            int r8 = r8 + -1
            long r8 = r2 << r8
            r7.f156771e = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4523c.C58925ah.<init>(com.google.common.r.l, int):void");
    }

    /* renamed from: a */
    public final int mo56202a(C60755l lVar, int i) {
        C60755l lVar2 = lVar;
        int i2 = i;
        int i3 = lVar2.f164798c;
        int i4 = this.f156766c;
        if (i3 - i4 > i2 || i4 - i3 > i2) {
            return i2 + 1;
        }
        int i5 = (i2 + i3) - i4;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        long j = -1;
        int i6 = 0;
        long j2 = 0;
        long j3 = -1;
        while (i6 < i3) {
            long j4 = ((long[]) this.f156767d)[lVar2.mo57181a(i6)] | j2;
            long j5 = j4 | (((j4 & j3) + j3) ^ j3);
            long j6 = j2 | ((j5 | j3) ^ j);
            long j7 = j3 & j5;
            long j8 = this.f156771e;
            if ((j7 & j8) != 0) {
                i4--;
            } else if ((j8 & j6) != 0) {
                i4++;
                i5 -= 2;
                if (i5 < 0) {
                    break;
                }
            } else {
                i5--;
                if (i5 < 0) {
                    break;
                }
            }
            long j9 = 1 | (j6 + j6);
            j3 = (j7 + j7) | ((j5 | j9) ^ -1);
            j2 = j5 & j9;
            i6++;
            j = -1;
        }
        return i4;
    }
}
