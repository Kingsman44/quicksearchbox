package com.google.android.apps.gsa.shared.p7027bi;

/* renamed from: com.google.android.apps.gsa.shared.bi.c */
/* compiled from: PG */
public final class C89432c {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bd A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m145485a(com.google.android.apps.gsa.shared.p7027bi.C89431b r8, float r9, float r10) {
        /*
            com.google.android.apps.gsa.shared.bi.a r8 = (com.google.android.apps.gsa.shared.p7027bi.C89430a) r8
            int r0 = r8.f242428e
            int r1 = r8.f242424a
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r8.f242429f
            int r2 = r8.f242424a
            int r3 = r8.f242425b
            int r2 = r2 + r3
            int r2 = r2 + -1
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r8.f242430g
            int r3 = r8.f242426c
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r8.f242431h
            int r4 = r8.f242426c
            int r5 = r8.f242427d
            int r4 = r4 + r5
            int r4 = r4 + -1
            int r3 = java.lang.Math.min(r3, r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r2, r0, r3, r1)
            int r0 = r4.bottom
            int r1 = r4.top
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            float r0 = (float) r0
            int r2 = r4.right
            int r3 = r4.left
            int r2 = r2 - r3
            int r2 = r2 + r1
            float r2 = (float) r2
            int r3 = r8.f242429f
            int r5 = r8.f242428e
            int r3 = r3 - r5
            int r3 = r3 + r1
            float r3 = (float) r3
            int r5 = r8.f242431h
            int r6 = r8.f242430g
            int r5 = r5 - r6
            int r5 = r5 + r1
            float r5 = (float) r5
            r6 = 0
            int r7 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0064
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0064
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0064
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0064
            float r0 = r0 * r2
            float r3 = r3 * r5
            goto L_0x006c
        L_0x0064:
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x006e
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x006e
        L_0x006c:
            float r0 = r0 / r3
            goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0077
            r0 = 0
            goto L_0x007b
        L_0x0077:
            float r0 = java.lang.Math.min(r0, r2)
        L_0x007b:
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x00bf
            int r9 = r4.bottom
            int r0 = r4.top
            int r9 = r9 - r0
            int r9 = r9 + r1
            float r9 = (float) r9
            int r0 = r4.right
            int r3 = r4.left
            int r0 = r0 - r3
            int r0 = r0 + r1
            float r0 = (float) r0
            int r3 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
            int r3 = r8.f242425b
            if (r3 <= 0) goto L_0x00a3
            int r4 = r8.f242427d
            if (r4 <= 0) goto L_0x00a3
            float r9 = r9 * r0
            int r3 = r3 * r4
            float r8 = (float) r3
            goto L_0x00ac
        L_0x00a3:
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ae
            int r8 = r8.f242425b
            if (r8 <= 0) goto L_0x00ae
            float r8 = (float) r8
        L_0x00ac:
            float r9 = r9 / r8
            goto L_0x00af
        L_0x00ae:
            r9 = 0
        L_0x00af:
            int r8 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x00b4
            goto L_0x00b8
        L_0x00b4:
            float r6 = java.lang.Math.min(r9, r2)
        L_0x00b8:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r8 = 0
            return r8
        L_0x00bf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7027bi.C89432c.m145485a(com.google.android.apps.gsa.shared.bi.b, float, float):boolean");
    }
}
