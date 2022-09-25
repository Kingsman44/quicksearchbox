package com.google.p4272br;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.br.v */
/* compiled from: PG */
final class C56453v {

    /* renamed from: a */
    final String f150783a;

    /* renamed from: b */
    final C56451t f150784b;

    /* renamed from: c */
    final int f150785c;

    /* renamed from: d */
    final int f150786d;

    /* renamed from: e */
    String f150787e;

    /* renamed from: f */
    int f150788f;

    /* renamed from: g */
    public Map f150789g;

    /* renamed from: h */
    private final AtomicReference f150790h = new AtomicReference();

    public C56453v(String str, C56451t tVar, int i) {
        this.f150783a = str;
        this.f150784b = tVar;
        this.f150786d = i;
        int i2 = tVar.f150781c;
        int i3 = 0;
        while (true) {
            C56436e eVar = tVar.f150779a[i2];
            int i4 = eVar.f150733a;
            if (i4 != 3) {
                if (i4 != 4) {
                    if (i4 == 5) {
                        i3 = -1;
                        break;
                    } else if (i4 != 7) {
                        break;
                    }
                } else {
                    i3 |= eVar.f150735c;
                }
            }
            i2 = eVar.f150734b;
        }
        this.f150785c = i3;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0214, code lost:
        if (r2 != 10) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0223, code lost:
        if (r2 == r10.f150736d[0]) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0225, code lost:
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0227, code lost:
        r16 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0229, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x022c, code lost:
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x022e, code lost:
        r16 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0230, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0297, code lost:
        if (r13 == false) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0299, code lost:
        r0 = r10.f150734b;
        r14 = r12.f150741a;
        r13 = r12;
        r12 = r0;
        r0 = r19;
        r21 = r2;
        r2 = r16;
        r22 = r15;
        r12 = r6.mo54376a(r26, r12, r15, r14, r18, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02b6, code lost:
        r21 = r2;
        r22 = r15;
        r2 = r16;
        r0 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02e9, code lost:
        if (r12 == null) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02eb, code lost:
        r10 = r6.f150747e;
        r11 = r10.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02f0, code lost:
        if (r11 > r6.f150748f) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02f2, code lost:
        r6.f150747e = (com.google.p4272br.C56438g[]) java.util.Arrays.copyOf(r10, r11 + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02fb, code lost:
        r10 = r6.f150747e;
        r11 = r6.f150748f;
        r10[r11] = r12;
        r6.f150748f = r11 + 1;
        r4.f150737a[r0] = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0393 A[LOOP:11: B:195:0x0367->B:206:0x0393, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x01ae A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0384 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0196  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54418a(com.google.p4272br.C56444m r25, int r26, int r27, int r28, int[] r29, int r30) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = 0
            if (r1 > r2) goto L_0x0396
            r6 = r25
            com.google.br.l r6 = (com.google.p4272br.C56443l) r6
            java.lang.CharSequence r6 = r6.f150764a
            com.google.br.i r7 = new com.google.br.i
            r7.<init>(r6, r2)
            int r2 = r30 + r30
        L_0x001a:
            java.util.concurrent.atomic.AtomicReference r6 = r0.f150790h
            java.lang.Object r6 = r6.get()
            com.google.br.h r6 = (com.google.p4272br.C56439h) r6
            if (r6 == 0) goto L_0x002e
            java.util.concurrent.atomic.AtomicReference r8 = r0.f150790h
            com.google.br.h r9 = r6.f150752j
            boolean r8 = com.google.p4272br.C56452u.m88185a(r8, r6, r9)
            if (r8 == 0) goto L_0x001a
        L_0x002e:
            r8 = 1
            if (r6 != 0) goto L_0x0038
            com.google.br.h r6 = new com.google.br.h
            r6.<init>((com.google.p4272br.C56453v) r0)
        L_0x0036:
            r9 = 1
            goto L_0x0044
        L_0x0038:
            com.google.br.h r9 = r6.f150752j
            if (r9 == 0) goto L_0x0043
            com.google.br.h r9 = new com.google.br.h
            r9.<init>((com.google.p4272br.C56439h) r6)
            r6 = r9
            goto L_0x0036
        L_0x0043:
            r9 = 0
        L_0x0044:
            r6.f150751i = r2
            int[] r10 = r6.f150750h
            int r10 = r10.length
            if (r2 <= r10) goto L_0x0060
            r10 = 0
        L_0x004c:
            int r11 = r6.f150748f
            if (r10 >= r11) goto L_0x005b
            com.google.br.g[] r11 = r6.f150747e
            r11 = r11[r10]
            int[] r12 = new int[r2]
            r11.f150741a = r12
            int r10 = r10 + 1
            goto L_0x004c
        L_0x005b:
            int[] r2 = new int[r2]
            r6.f150750h = r2
            goto L_0x0071
        L_0x0060:
            r10 = 0
        L_0x0061:
            int r11 = r6.f150748f
            if (r10 >= r11) goto L_0x0071
            com.google.br.g[] r11 = r6.f150747e
            r11 = r11[r10]
            int[] r11 = r11.f150741a
            java.util.Arrays.fill(r11, r5, r2, r5)
            int r10 = r10 + 1
            goto L_0x0061
        L_0x0071:
            com.google.br.v r2 = r6.f150743a
            int r2 = r2.f150785c
            r17 = 0
            r15 = -1
            if (r2 != r15) goto L_0x0080
        L_0x007a:
            r20 = r9
        L_0x007c:
            r0 = r17
            goto L_0x0363
        L_0x0080:
            r14 = 2
            if (r3 == r8) goto L_0x0085
            if (r3 != r14) goto L_0x0089
        L_0x0085:
            if (r1 == 0) goto L_0x0088
            goto L_0x007a
        L_0x0088:
            r1 = 0
        L_0x0089:
            r6.f150749g = r5
            int[] r10 = r6.f150750h
            com.google.br.t r11 = r6.f150744b
            int r11 = r11.f150782d
            java.util.Arrays.fill(r10, r5, r11, r15)
            com.google.br.f r10 = r6.f150745c
            com.google.br.f r11 = r6.f150746d
            int r12 = r7.mo54379b(r1)
            int r13 = r12 >> 3
            r16 = r12 & 7
            r14 = -8
            if (r12 == r14) goto L_0x00ae
            int r12 = r1 + r16
            int r12 = r7.mo54379b(r12)
            int r14 = r12 >> 3
            r12 = r12 & 7
            goto L_0x00b0
        L_0x00ae:
            r12 = 0
            r14 = -1
        L_0x00b0:
            if (r1 != 0) goto L_0x00b7
            int r18 = com.google.p4272br.C56432ab.m88117a(r15, r13)
            goto L_0x00bb
        L_0x00b7:
            int r18 = r7.mo54378a(r1)
        L_0x00bb:
            r23 = r14
            r14 = r10
            r10 = r13
            r13 = r11
            r11 = r23
        L_0x00c2:
            int r15 = r14.f150740d
            if (r15 != 0) goto L_0x01b2
            r15 = r2 & 4
            if (r15 == 0) goto L_0x00cf
            if (r1 == 0) goto L_0x00ce
            goto L_0x01ac
        L_0x00ce:
            r1 = 0
        L_0x00cf:
            boolean r15 = r6.f150749g
            if (r15 != 0) goto L_0x01ac
            com.google.br.v r15 = r6.f150743a
            java.lang.String r15 = r15.f150787e
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x01b2
            com.google.br.v r15 = r6.f150743a
            int r8 = r15.f150788f
            if (r11 == r8) goto L_0x01b2
            java.lang.CharSequence r8 = r7.f150753a
            java.lang.String r10 = r15.f150787e
            boolean r11 = r8 instanceof java.lang.String
            if (r11 == 0) goto L_0x00f9
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.indexOf(r10, r1)
            r27 = r2
            r20 = r9
        L_0x00f5:
            r19 = -1
            goto L_0x0191
        L_0x00f9:
            int r11 = r8.length()
            if (r1 < r11) goto L_0x010d
            boolean r8 = r10.isEmpty()
            r27 = r2
            r20 = r9
            if (r8 == 0) goto L_0x010b
            r8 = 0
            goto L_0x00f5
        L_0x010b:
            r8 = -1
            goto L_0x00f5
        L_0x010d:
            if (r1 >= 0) goto L_0x0111
            r11 = 0
            goto L_0x0112
        L_0x0111:
            r11 = r1
        L_0x0112:
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L_0x018a
            char r12 = r10.charAt(r5)
            int r15 = r8.length()
            int r16 = r10.length()
            int r15 = r15 - r16
        L_0x0126:
            if (r11 > r15) goto L_0x0182
            char r5 = r8.charAt(r11)
            if (r5 == r12) goto L_0x0138
        L_0x012e:
            r5 = 1
            int r11 = r11 + r5
            if (r11 > r15) goto L_0x0138
            char r5 = r8.charAt(r11)
            if (r5 != r12) goto L_0x012e
        L_0x0138:
            if (r11 > r15) goto L_0x016c
            int r5 = r11 + 1
            int r16 = r10.length()
            int r16 = r5 + r16
            r27 = r2
            r19 = -1
            int r2 = r16 + -1
            r20 = r9
            r9 = r5
            r5 = 1
        L_0x014c:
            if (r9 >= r2) goto L_0x0165
            r26 = r12
            char r12 = r8.charAt(r9)
            r16 = r8
            char r8 = r10.charAt(r5)
            if (r12 != r8) goto L_0x0169
            int r9 = r9 + 1
            int r5 = r5 + 1
            r12 = r26
            r8 = r16
            goto L_0x014c
        L_0x0165:
            r16 = r8
            r26 = r12
        L_0x0169:
            if (r9 == r2) goto L_0x0190
            goto L_0x0176
        L_0x016c:
            r27 = r2
            r16 = r8
            r20 = r9
            r26 = r12
            r19 = -1
        L_0x0176:
            int r11 = r11 + 1
            r12 = r26
            r2 = r27
            r8 = r16
            r9 = r20
            r5 = 0
            goto L_0x0126
        L_0x0182:
            r27 = r2
            r20 = r9
            r19 = -1
            r8 = -1
            goto L_0x0191
        L_0x018a:
            r27 = r2
            r20 = r9
            r19 = -1
        L_0x0190:
            r8 = r11
        L_0x0191:
            if (r8 < 0) goto L_0x0194
            int r8 = r8 - r1
        L_0x0194:
            if (r8 < 0) goto L_0x01ae
            int r1 = r1 + r8
            int r2 = r7.mo54379b(r1)
            int r10 = r2 >> 3
            r16 = r2 & 7
            int r2 = r1 + r16
            int r2 = r7.mo54379b(r2)
            int r5 = r2 >> 3
            r2 = r2 & 7
            r9 = r2
            r2 = r10
            goto L_0x01bb
        L_0x01ac:
            r20 = r9
        L_0x01ae:
            r11 = r13
        L_0x01af:
            r0 = 0
            goto L_0x034c
        L_0x01b2:
            r27 = r2
            r20 = r9
            r19 = -1
            r2 = r10
            r5 = r11
            r9 = r12
        L_0x01bb:
            r8 = r16
            boolean r10 = r6.f150749g
            if (r10 != 0) goto L_0x01e4
            if (r1 == 0) goto L_0x01c5
            if (r3 != 0) goto L_0x01e4
        L_0x01c5:
            int r10 = r6.f150751i
            if (r10 <= 0) goto L_0x01ce
            int[] r10 = r6.f150750h
            r11 = 0
            r10[r11] = r1
        L_0x01ce:
            com.google.br.t r10 = r6.f150744b
            int r12 = r10.f150781c
            int[] r15 = r6.f150750h
            r16 = 0
            r10 = r6
            r11 = r14
            r26 = r13
            r13 = r1
            r4 = r14
            r0 = 2
            r14 = r15
            r15 = r18
            r10.mo54376a(r11, r12, r13, r14, r15, r16)
            goto L_0x01e8
        L_0x01e4:
            r26 = r13
            r4 = r14
            r0 = 2
        L_0x01e8:
            int r15 = r1 + r8
            int r18 = r7.mo54378a(r15)
            int r14 = r7.f150754b
            r13 = 0
        L_0x01f1:
            int r10 = r4.f150740d
            if (r13 >= r10) goto L_0x0313
            com.google.br.g[] r10 = r4.f150737a
            r12 = r10[r13]
            if (r12 != 0) goto L_0x0203
            r21 = r2
            r0 = r13
            r2 = r14
            r22 = r15
            goto L_0x0309
        L_0x0203:
            com.google.br.e r10 = r12.f150742b
            int r11 = r10.f150733a
            switch(r11) {
                case 6: goto L_0x02bf;
                case 7: goto L_0x020a;
                case 8: goto L_0x0233;
                case 9: goto L_0x021d;
                case 10: goto L_0x0217;
                case 11: goto L_0x0212;
                default: goto L_0x020a;
            }
        L_0x020a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "bad inst"
            r0.<init>(r1)
            throw r0
        L_0x0212:
            r11 = 10
            if (r2 == r11) goto L_0x022c
            goto L_0x0225
        L_0x0217:
            r19 = r13
            r16 = r14
            goto L_0x0299
        L_0x021d:
            int[] r11 = r10.f150736d
            r16 = 0
            r11 = r11[r16]
            if (r2 != r11) goto L_0x022c
        L_0x0225:
            r19 = r13
        L_0x0227:
            r16 = r14
        L_0x0229:
            r13 = 1
            goto L_0x0297
        L_0x022c:
            r19 = r13
        L_0x022e:
            r16 = r14
        L_0x0230:
            r13 = 0
            goto L_0x0297
        L_0x0233:
            r16 = 0
            int[] r11 = r10.f150736d
            int r0 = r11.length
            r19 = r13
            r13 = 1
            if (r0 != r13) goto L_0x0257
            r0 = r11[r16]
            if (r2 != r0) goto L_0x0244
            r16 = r14
            goto L_0x0297
        L_0x0244:
            int r11 = r10.f150735c
            r11 = r11 & r13
            if (r11 == 0) goto L_0x022e
            int r11 = com.google.p4272br.C56457z.m88193a(r0)
        L_0x024d:
            if (r11 == r0) goto L_0x022e
            if (r2 != r11) goto L_0x0252
            goto L_0x0227
        L_0x0252:
            int r11 = com.google.p4272br.C56457z.m88193a(r11)
            goto L_0x024d
        L_0x0257:
            r0 = 0
        L_0x0258:
            int[] r11 = r10.f150736d
            int r13 = r11.length
            r16 = r14
            if (r0 >= r13) goto L_0x0274
            r14 = 8
            if (r0 > r14) goto L_0x0274
            r13 = r11[r0]
            if (r2 >= r13) goto L_0x0268
            goto L_0x0230
        L_0x0268:
            int r13 = r0 + 1
            r11 = r11[r13]
            if (r2 > r11) goto L_0x026f
        L_0x026e:
            goto L_0x0229
        L_0x026f:
            int r0 = r0 + 2
            r14 = r16
            goto L_0x0258
        L_0x0274:
            int r0 = r13 >> 1
            r11 = 0
        L_0x0277:
            if (r11 >= r0) goto L_0x0230
            int r13 = r0 - r11
            r14 = 2
            int r13 = r13 / r14
            int r13 = r13 + r11
            int[] r14 = r10.f150736d
            int r21 = r13 + r13
            r22 = r0
            r0 = r14[r21]
            if (r0 > r2) goto L_0x0295
            int r21 = r21 + 1
            r0 = r14[r21]
            if (r2 > r0) goto L_0x028f
            goto L_0x026e
        L_0x028f:
            int r13 = r13 + 1
            r11 = r13
            r0 = r22
            goto L_0x0277
        L_0x0295:
            r0 = r13
            goto L_0x0277
        L_0x0297:
            if (r13 == 0) goto L_0x02b6
        L_0x0299:
            int r0 = r10.f150734b
            int[] r14 = r12.f150741a
            r10 = r6
            r11 = r26
            r13 = r12
            r12 = r0
            r0 = r19
            r19 = r13
            r13 = r15
            r21 = r2
            r2 = r16
            r22 = r15
            r15 = r18
            r16 = r19
            com.google.br.g r12 = r10.mo54376a(r11, r12, r13, r14, r15, r16)
            goto L_0x02e9
        L_0x02b6:
            r21 = r2
            r22 = r15
            r2 = r16
            r0 = r19
            goto L_0x02e9
        L_0x02bf:
            r21 = r2
            r19 = r12
            r0 = r13
            r2 = r14
            r22 = r15
            r10 = 2
            if (r3 != r10) goto L_0x02cf
            if (r1 == r2) goto L_0x02cf
            r12 = r19
            goto L_0x02e9
        L_0x02cf:
            int r11 = r6.f150751i
            r12 = r19
            if (r11 <= 0) goto L_0x02e1
            int[] r13 = r12.f150741a
            r14 = 1
            r13[r14] = r1
            int[] r15 = r6.f150750h
            r10 = 0
            java.lang.System.arraycopy(r13, r10, r15, r10, r11)
            goto L_0x02e2
        L_0x02e1:
            r14 = 1
        L_0x02e2:
            int r13 = r0 + 1
            r6.mo54377b(r4, r13)
            r6.f150749g = r14
        L_0x02e9:
            if (r12 == 0) goto L_0x0309
            com.google.br.g[] r10 = r6.f150747e
            int r11 = r10.length
            int r13 = r6.f150748f
            if (r11 > r13) goto L_0x02fb
            int r11 = r11 + r11
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
            com.google.br.g[] r10 = (com.google.p4272br.C56438g[]) r10
            r6.f150747e = r10
        L_0x02fb:
            com.google.br.g[] r10 = r6.f150747e
            int r11 = r6.f150748f
            r10[r11] = r12
            r10 = 1
            int r11 = r11 + r10
            r6.f150748f = r11
            com.google.br.g[] r10 = r4.f150737a
            r10[r0] = r17
        L_0x0309:
            int r13 = r0 + 1
            r14 = r2
            r2 = r21
            r15 = r22
            r0 = 2
            goto L_0x01f1
        L_0x0313:
            r22 = r15
            r0 = 0
            r4.f150740d = r0
            if (r8 == 0) goto L_0x0348
            int r0 = r6.f150751i
            if (r0 != 0) goto L_0x0322
            boolean r0 = r6.f150749g
            if (r0 != 0) goto L_0x0348
        L_0x0322:
            r0 = -1
            if (r5 == r0) goto L_0x0332
            int r15 = r22 + r9
            int r1 = r7.mo54379b(r15)
            int r2 = r1 >> 3
            r1 = r1 & 7
            r12 = r1
            r11 = r2
            goto L_0x0334
        L_0x0332:
            r11 = r5
            r12 = r9
        L_0x0334:
            r0 = r24
            r14 = r26
            r2 = r27
            r13 = r4
            r10 = r5
            r16 = r9
            r9 = r20
            r1 = r22
            r5 = 0
            r8 = 1
            r4 = r29
            goto L_0x00c2
        L_0x0348:
            r11 = r26
            goto L_0x01af
        L_0x034c:
            r6.mo54377b(r11, r0)
            boolean r0 = r6.f150749g
            if (r0 == 0) goto L_0x007c
            int r0 = r6.f150751i
            if (r0 != 0) goto L_0x035b
            int[] r17 = com.google.p4272br.C56432ab.f150706a
            goto L_0x007c
        L_0x035b:
            int[] r1 = r6.f150750h
            int[] r17 = java.util.Arrays.copyOf(r1, r0)
            goto L_0x007c
        L_0x0363:
            r1 = r24
            r9 = r20
        L_0x0367:
            java.util.concurrent.atomic.AtomicReference r2 = r1.f150790h
            java.lang.Object r2 = r2.get()
            com.google.br.h r2 = (com.google.p4272br.C56439h) r2
            if (r9 != 0) goto L_0x037a
            if (r2 == 0) goto L_0x037a
            com.google.br.h r3 = new com.google.br.h
            r3.<init>((com.google.p4272br.C56439h) r6)
            r6 = r3
            r9 = 1
        L_0x037a:
            r6.f150752j = r2
            java.util.concurrent.atomic.AtomicReference r3 = r1.f150790h
            boolean r2 = com.google.p4272br.C56452u.m88185a(r3, r2, r6)
            if (r2 == 0) goto L_0x0393
            if (r0 != 0) goto L_0x0388
            r2 = 0
            return r2
        L_0x0388:
            r3 = r29
            r2 = 0
            if (r3 == 0) goto L_0x0391
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r2, r3, r2, r4)
        L_0x0391:
            r4 = 1
            return r4
        L_0x0393:
            r3 = r29
            goto L_0x0367
        L_0x0396:
            r1 = r0
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4272br.C56453v.mo54418a(com.google.br.m, int, int, int, int[], int):boolean");
    }

    public final String toString() {
        return this.f150783a;
    }
}
