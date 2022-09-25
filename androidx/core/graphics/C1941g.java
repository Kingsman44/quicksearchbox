package androidx.core.graphics;

import java.util.ArrayList;

/* renamed from: androidx.core.graphics.g */
/* compiled from: PG */
public final class C1941g {
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        r14 = true;
        r15 = false;
        r16 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099 A[Catch:{ NumberFormatException -> 0x00bb }, LOOP:3: B:25:0x006e->B:44:0x0099, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f A[Catch:{ NumberFormatException -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ae A[Catch:{ NumberFormatException -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b0 A[Catch:{ NumberFormatException -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x009d A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.C1940f[] m5255a(java.lang.String r17) {
        /*
            r0 = r17
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
            r4 = 1
            r5 = 0
        L_0x000e:
            int r6 = r17.length()
            if (r4 >= r6) goto L_0x00e6
        L_0x0014:
            int r6 = r17.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x003a
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r9 = r9 * r10
            if (r9 <= 0) goto L_0x0032
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r9 = r9 * r10
            if (r9 > 0) goto L_0x0037
        L_0x0032:
            if (r6 == r8) goto L_0x0037
            if (r6 == r7) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x003a:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x00df
            char r6 = r5.charAt(r3)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto L_0x00d5
            char r6 = r5.charAt(r3)
            r9 = 90
            if (r6 != r9) goto L_0x005a
            goto L_0x00d5
        L_0x005a:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00bb }
            float[] r6 = new float[r6]     // Catch:{ NumberFormatException -> 0x00bb }
            int r9 = r5.length()     // Catch:{ NumberFormatException -> 0x00bb }
            r10 = 1
            r11 = 0
        L_0x0066:
            if (r10 >= r9) goto L_0x00b4
            r12 = r10
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x006e:
            int r2 = r5.length()     // Catch:{ NumberFormatException -> 0x00bb }
            if (r12 >= r2) goto L_0x009d
            char r2 = r5.charAt(r12)     // Catch:{ NumberFormatException -> 0x00bb }
            r3 = 32
            if (r2 == r3) goto L_0x0095
            if (r2 == r7) goto L_0x0093
            if (r2 == r8) goto L_0x0093
            switch(r2) {
                case 44: goto L_0x0095;
                case 45: goto L_0x008e;
                case 46: goto L_0x0084;
                default: goto L_0x0083;
            }     // Catch:{ NumberFormatException -> 0x00bb }
        L_0x0083:
            goto L_0x0096
        L_0x0084:
            if (r13 != 0) goto L_0x0088
            r13 = 1
            goto L_0x0096
        L_0x0088:
            r13 = 1
        L_0x0089:
            r14 = 1
            r15 = 0
            r16 = 1
            goto L_0x0097
        L_0x008e:
            if (r12 == r10) goto L_0x0096
            if (r15 != 0) goto L_0x0096
            goto L_0x0089
        L_0x0093:
            r15 = 1
            goto L_0x0097
        L_0x0095:
            r14 = 1
        L_0x0096:
            r15 = 0
        L_0x0097:
            if (r14 != 0) goto L_0x009d
            int r12 = r12 + 1
            r3 = 0
            goto L_0x006e
        L_0x009d:
            if (r10 >= r12) goto L_0x00ac
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch:{ NumberFormatException -> 0x00bb }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x00bb }
            r6[r11] = r3     // Catch:{ NumberFormatException -> 0x00bb }
            r11 = r2
        L_0x00ac:
            if (r16 == 0) goto L_0x00b0
            r10 = r12
            goto L_0x00b2
        L_0x00b0:
            int r10 = r12 + 1
        L_0x00b2:
            r3 = 0
            goto L_0x0066
        L_0x00b4:
            float[] r2 = m5257c(r6, r11)     // Catch:{ NumberFormatException -> 0x00bb }
            r3 = r2
            r2 = 0
            goto L_0x00d8
        L_0x00bb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error in parsing \""
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = "\""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00d5:
            r2 = 0
            float[] r3 = new float[r2]
        L_0x00d8:
            char r5 = r5.charAt(r2)
            m5258d(r1, r5, r3)
        L_0x00df:
            int r2 = r4 + 1
            r5 = r4
            r3 = 0
            r4 = r2
            goto L_0x000e
        L_0x00e6:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto L_0x00fa
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x00fa
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r2 = new float[r2]
            m5258d(r1, r0, r2)
        L_0x00fa:
            int r0 = r1.size()
            androidx.core.graphics.f[] r0 = new androidx.core.graphics.C1940f[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            androidx.core.graphics.f[] r0 = (androidx.core.graphics.C1940f[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C1941g.m5255a(java.lang.String):androidx.core.graphics.f[]");
    }

    /* renamed from: b */
    public static C1940f[] m5256b(C1940f[] fVarArr) {
        if (fVarArr == null) {
            return null;
        }
        C1940f[] fVarArr2 = new C1940f[fVarArr.length];
        for (int i = 0; i < fVarArr.length; i++) {
            fVarArr2[i] = new C1940f(fVarArr[i]);
        }
        return fVarArr2;
    }

    /* renamed from: d */
    private static void m5258d(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new C1940f(c, fArr));
    }

    /* renamed from: c */
    static float[] m5257c(float[] fArr, int i) {
        if (i >= 0) {
            int min = Math.min(i, fArr.length);
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }
}
