package com.google.ads.interactivemedia.p367v3.internal;

import java.io.EOFException;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yh */
/* compiled from: PG */
public final class C7441yh implements C7449yp {

    /* renamed from: b */
    private static final int[] f24384b = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: c */
    private final boolean f24385c = true;

    /* renamed from: b */
    private static void m22501b(int i, List list) {
        if (i != -1) {
            Integer valueOf = Integer.valueOf(i);
            if (!list.contains(valueOf)) {
                list.add(valueOf);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private static boolean m22502c(C7053jy jyVar, C7050jv jvVar) {
        try {
            boolean g = jyVar.mo16111g(jvVar);
            jvVar.mo16097j();
            return g;
        } catch (EOFException unused) {
            jvVar.mo16097j();
            return false;
        } catch (Throwable th) {
            jvVar.mo16097j();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.ads.interactivemedia.p367v3.internal.C7439yf mo16805a(android.net.Uri r17, com.google.ads.interactivemedia.p367v3.internal.C6864cy r18, java.util.List r19, com.google.ads.interactivemedia.p367v3.internal.aes r20, java.util.Map r21, com.google.ads.interactivemedia.p367v3.internal.C7050jv r22) {
        /*
            r16 = this;
            r0 = r18
            r1 = r20
            java.lang.String r2 = r0.f21812l
            int r2 = com.google.ads.interactivemedia.p367v3.internal.aqd.m19289q(r2)
            int r3 = com.google.ads.interactivemedia.p367v3.internal.aqd.m19288p(r21)
            int r4 = com.google.ads.interactivemedia.p367v3.internal.aqd.m19290r(r17)
            java.util.ArrayList r5 = new java.util.ArrayList
            int[] r6 = f24384b
            int r7 = r6.length
            r7 = 7
            r5.<init>(r7)
            m22501b(r2, r5)
            m22501b(r3, r5)
            m22501b(r4, r5)
            int r2 = r6.length
            r2 = 0
            r3 = 0
        L_0x0027:
            if (r3 >= r7) goto L_0x0031
            r4 = r6[r3]
            m22501b(r4, r5)
            int r3 = r3 + 1
            goto L_0x0027
        L_0x0031:
            r22.mo16097j()
            r3 = 0
            r6 = r3
            r4 = 0
        L_0x0037:
            int r8 = r5.size()
            if (r4 >= r8) goto L_0x011e
            java.lang.Object r8 = r5.get(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9 = 11
            if (r8 == 0) goto L_0x0101
            r10 = 1
            if (r8 == r10) goto L_0x00fb
            r10 = 2
            if (r8 == r10) goto L_0x00f5
            if (r8 == r7) goto L_0x00ed
            r11 = 8
            if (r8 == r11) goto L_0x00ba
            if (r8 == r9) goto L_0x0069
            r10 = 13
            if (r8 == r10) goto L_0x0060
            r10 = r3
            goto L_0x0106
        L_0x0060:
            com.google.ads.interactivemedia.v3.internal.zj r10 = new com.google.ads.interactivemedia.v3.internal.zj
            java.lang.String r11 = r0.f21803c
            r10.<init>(r11, r1)
            goto L_0x0106
        L_0x0069:
            if (r19 == 0) goto L_0x0070
            r11 = 48
            r12 = r19
            goto L_0x0087
        L_0x0070:
            com.google.ads.interactivemedia.v3.internal.cx r11 = new com.google.ads.interactivemedia.v3.internal.cx
            r11.<init>()
            java.lang.String r12 = "application/cea-608"
            r11.mo15630ae(r12)
            com.google.ads.interactivemedia.v3.internal.cy r11 = r11.mo15625a()
            java.util.List r11 = java.util.Collections.singletonList(r11)
            r12 = 16
            r12 = r11
            r11 = 16
        L_0x0087:
            java.lang.String r13 = r0.f21809i
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 != 0) goto L_0x00ab
            java.lang.String r14 = "audio/mp4a-latm"
            java.lang.String r15 = com.google.ads.interactivemedia.p367v3.internal.adz.m18354f(r13)
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x009d
            r11 = r11 | 2
        L_0x009d:
            java.lang.String r14 = "video/avc"
            java.lang.String r13 = com.google.ads.interactivemedia.p367v3.internal.adz.m18353e(r13)
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x00ab
            r11 = r11 | 4
        L_0x00ab:
            com.google.ads.interactivemedia.v3.internal.pm r13 = new com.google.ads.interactivemedia.v3.internal.pm
            com.google.ads.interactivemedia.v3.internal.oe r14 = new com.google.ads.interactivemedia.v3.internal.oe
            r14.<init>(r11, r12)
            r11 = 112800(0x1b8a0, float:1.58066E-40)
            r13.<init>(r10, r1, r14, r11)
            r10 = r13
            goto L_0x0106
        L_0x00ba:
            com.google.ads.interactivemedia.v3.internal.ms r10 = new com.google.ads.interactivemedia.v3.internal.ms
            com.google.ads.interactivemedia.v3.internal.qz r11 = r0.f21810j
            if (r11 != 0) goto L_0x00c2
        L_0x00c0:
            r11 = 0
            goto L_0x00e0
        L_0x00c2:
            r12 = 0
        L_0x00c3:
            int r13 = r11.mo16341a()
            if (r12 >= r13) goto L_0x00c0
            com.google.ads.interactivemedia.v3.internal.qy r13 = r11.mo16342b(r12)
            boolean r14 = r13 instanceof com.google.ads.interactivemedia.p367v3.internal.C7467zg
            if (r14 == 0) goto L_0x00dd
            com.google.ads.interactivemedia.v3.internal.zg r13 = (com.google.ads.interactivemedia.p367v3.internal.C7467zg) r13
            java.util.List r11 = r13.f24552c
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x00c0
            r11 = 4
            goto L_0x00e0
        L_0x00dd:
            int r12 = r12 + 1
            goto L_0x00c3
        L_0x00e0:
            if (r19 == 0) goto L_0x00e5
            r12 = r19
            goto L_0x00e9
        L_0x00e5:
            java.util.List r12 = java.util.Collections.emptyList()
        L_0x00e9:
            r10.<init>(r11, r1, r12)
            goto L_0x0106
        L_0x00ed:
            com.google.ads.interactivemedia.v3.internal.ly r10 = new com.google.ads.interactivemedia.v3.internal.ly
            r11 = 0
            r10.<init>((long) r11)
            goto L_0x0106
        L_0x00f5:
            com.google.ads.interactivemedia.v3.internal.oc r10 = new com.google.ads.interactivemedia.v3.internal.oc
            r10.<init>()
            goto L_0x0106
        L_0x00fb:
            com.google.ads.interactivemedia.v3.internal.nz r10 = new com.google.ads.interactivemedia.v3.internal.nz
            r10.<init>()
            goto L_0x0106
        L_0x0101:
            com.google.ads.interactivemedia.v3.internal.nw r10 = new com.google.ads.interactivemedia.v3.internal.nw
            r10.<init>()
        L_0x0106:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r10)
            r11 = r22
            boolean r12 = m22502c(r10, r11)
            if (r12 == 0) goto L_0x0117
            com.google.ads.interactivemedia.v3.internal.yf r2 = new com.google.ads.interactivemedia.v3.internal.yf
            r2.<init>(r10, r0, r1)
            goto L_0x0126
        L_0x0117:
            if (r8 != r9) goto L_0x011a
            r6 = r10
        L_0x011a:
            int r4 = r4 + 1
            goto L_0x0037
        L_0x011e:
            com.google.ads.interactivemedia.v3.internal.yf r2 = new com.google.ads.interactivemedia.v3.internal.yf
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r6)
            r2.<init>(r6, r0, r1)
        L_0x0126:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7441yh.mo16805a(android.net.Uri, com.google.ads.interactivemedia.v3.internal.cy, java.util.List, com.google.ads.interactivemedia.v3.internal.aes, java.util.Map, com.google.ads.interactivemedia.v3.internal.jv):com.google.ads.interactivemedia.v3.internal.yf");
    }
}
