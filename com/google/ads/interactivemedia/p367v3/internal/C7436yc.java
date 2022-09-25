package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Locale;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yc */
/* compiled from: PG */
public final class C7436yc {

    /* renamed from: a */
    private final String[] f24369a;

    /* renamed from: b */
    private final int[] f24370b;

    /* renamed from: c */
    private final String[] f24371c;

    /* renamed from: d */
    private final int f24372d;

    private C7436yc(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f24369a = strArr;
        this.f24370b = iArr;
        this.f24371c = strArr2;
        this.f24372d = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.ads.interactivemedia.p367v3.internal.C7436yc m22487a(java.lang.String r13) {
        /*
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 4
            int[] r2 = new int[r1]
            java.lang.String[] r3 = new java.lang.String[r1]
            r4 = 0
            java.lang.String r5 = ""
            r0[r4] = r5
            r6 = 0
            r7 = 0
        L_0x000f:
            int r8 = r13.length()
            if (r6 >= r8) goto L_0x0118
            java.lang.String r8 = "$"
            int r9 = r13.indexOf(r8, r6)
            r10 = -1
            if (r9 != r10) goto L_0x0043
            r8 = r0[r7]
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = r13.substring(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L_0x0037
            java.lang.String r6 = r8.concat(r6)
            goto L_0x003c
        L_0x0037:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x003c:
            r0[r7] = r6
            int r6 = r13.length()
            goto L_0x000f
        L_0x0043:
            if (r9 == r6) goto L_0x0067
            r8 = r0[r7]
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = r13.substring(r6, r9)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r10 = r6.length()
            if (r10 == 0) goto L_0x005e
            java.lang.String r6 = r8.concat(r6)
            goto L_0x0063
        L_0x005e:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x0063:
            r0[r7] = r6
            r6 = r9
            goto L_0x000f
        L_0x0067:
            java.lang.String r9 = "$$"
            boolean r9 = r13.startsWith(r9, r6)
            if (r9 == 0) goto L_0x007e
            r9 = r0[r7]
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r8 = r9.concat(r8)
            r0[r7] = r8
            int r6 = r6 + 2
            goto L_0x000f
        L_0x007e:
            int r6 = r6 + 1
            int r8 = r13.indexOf(r8, r6)
            java.lang.String r6 = r13.substring(r6, r8)
            java.lang.String r9 = "RepresentationID"
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L_0x0094
            r6 = 1
            r2[r7] = r6
            goto L_0x00f7
        L_0x0094:
            java.lang.String r9 = "%0"
            int r9 = r6.indexOf(r9)
            if (r9 == r10) goto L_0x00bd
            java.lang.String r10 = r6.substring(r9)
            java.lang.String r11 = "d"
            boolean r12 = r10.endsWith(r11)
            if (r12 != 0) goto L_0x00b8
            java.lang.String r12 = "x"
            boolean r12 = r10.endsWith(r12)
            if (r12 != 0) goto L_0x00b8
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r10.concat(r11)
        L_0x00b8:
            java.lang.String r6 = r6.substring(r4, r9)
            goto L_0x00bf
        L_0x00bd:
            java.lang.String r10 = "%01d"
        L_0x00bf:
            int r9 = r6.hashCode()
            r11 = -1950496919(0xffffffff8bbdc769, float:-7.310019E-32)
            if (r9 == r11) goto L_0x00ea
            r11 = 2606829(0x27c6ed, float:3.652945E-39)
            if (r9 == r11) goto L_0x00df
            r11 = 38199441(0x246e091, float:1.461119E-37)
            if (r9 == r11) goto L_0x00d3
            goto L_0x0100
        L_0x00d3:
            java.lang.String r9 = "Bandwidth"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0100
            r6 = 3
            r2[r7] = r6
            goto L_0x00f5
        L_0x00df:
            java.lang.String r9 = "Time"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0100
            r2[r7] = r1
            goto L_0x00f5
        L_0x00ea:
            java.lang.String r9 = "Number"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0100
            r6 = 2
            r2[r7] = r6
        L_0x00f5:
            r3[r7] = r10
        L_0x00f7:
            int r7 = r7 + 1
            r0[r7] = r5
            int r8 = r8 + 1
            r6 = r8
            goto L_0x000f
        L_0x0100:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r13.length()
            java.lang.String r2 = "Invalid template: "
            if (r1 == 0) goto L_0x010f
            java.lang.String r13 = r2.concat(r13)
            goto L_0x0114
        L_0x010f:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r2)
        L_0x0114:
            r0.<init>(r13)
            throw r0
        L_0x0118:
            com.google.ads.interactivemedia.v3.internal.yc r13 = new com.google.ads.interactivemedia.v3.internal.yc
            r13.<init>(r0, r2, r3, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7436yc.m22487a(java.lang.String):com.google.ads.interactivemedia.v3.internal.yc");
    }

    /* renamed from: b */
    public final String mo16797b(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f24372d;
            if (i2 < i3) {
                sb.append(this.f24369a[i2]);
                int i4 = this.f24370b[i2];
                if (i4 == 1) {
                    sb.append(str);
                } else if (i4 == 2) {
                    sb.append(String.format(Locale.US, this.f24371c[i2], new Object[]{Long.valueOf(j)}));
                } else if (i4 == 3) {
                    sb.append(String.format(Locale.US, this.f24371c[i2], new Object[]{Integer.valueOf(i)}));
                } else if (i4 == 4) {
                    sb.append(String.format(Locale.US, this.f24371c[i2], new Object[]{Long.valueOf(j2)}));
                }
                i2++;
            } else {
                sb.append(this.f24369a[i3]);
                return sb.toString();
            }
        }
    }
}
