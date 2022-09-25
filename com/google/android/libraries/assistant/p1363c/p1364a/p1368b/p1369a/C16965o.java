package com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.c.a.b.a.o */
/* compiled from: PG */
public final /* synthetic */ class C16965o implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C16972v f49561a;

    public /* synthetic */ C16965o(C16972v vVar) {
        this.f49561a = vVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r17 = this;
            r0 = r17
            com.google.android.libraries.assistant.c.a.b.a.v r1 = r0.f49561a
            androidx.media3.exoplayer.ad r2 = r1.f49576g
            r3 = 2
            if (r2 != 0) goto L_0x0022
            com.google.android.libraries.assistant.c.a.c.l r1 = com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l.f49622i
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.c.a.c.k r1 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16987k) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.assistant.c.a.c.l r2 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l) r2
            r2.f49624a = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.c.a.c.l r1 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l) r1
            goto L_0x01b9
        L_0x0022:
            com.google.android.libraries.assistant.c.a.c.l r2 = com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l.f49622i
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.c.a.c.k r2 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16987k) r2
            androidx.media3.exoplayer.ad r4 = r1.f49576g
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = 0
            if (r4 != 0) goto L_0x0038
        L_0x0036:
            r12 = r8
            goto L_0x0061
        L_0x0038:
            androidx.media3.common.bm r4 = r4.mo6014u()
            androidx.media3.common.bl r10 = new androidx.media3.common.bl
            r10.<init>()
            r12 = r8
            r11 = 0
        L_0x0043:
            int r14 = r4.mo6022c()
            if (r11 >= r14) goto L_0x0061
            r4.mo6024e(r11, r10, r8)
            long r14 = r10.f7349n
            long r14 = androidx.media3.common.p136b.C2612ak.m6918A(r14)
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r16 != 0) goto L_0x0057
            goto L_0x0036
        L_0x0057:
            long r14 = r10.f7349n
            long r14 = androidx.media3.common.p136b.C2612ak.m6918A(r14)
            long r12 = r12 + r14
            int r11 = r11 + 1
            goto L_0x0043
        L_0x0061:
            com.google.protobuf.ar r4 = com.google.protobuf.p4750c.C62948a.m95459j(r12)
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.android.libraries.assistant.c.a.c.l r10 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l) r10
            r4.getClass()
            r10.f49625b = r4
            androidx.media3.exoplayer.ad r4 = r1.f49576g
            if (r4 != 0) goto L_0x0077
        L_0x0075:
            r10 = r8
            goto L_0x00bc
        L_0x0077:
            androidx.media3.common.bm r4 = r4.mo6014u()
            int r10 = r4.mo6022c()
            androidx.media3.exoplayer.ad r11 = r1.f49576g
            int r11 = r11.mo5996c()
            if (r10 >= r11) goto L_0x0088
            goto L_0x0075
        L_0x0088:
            androidx.media3.common.bl r10 = new androidx.media3.common.bl
            r10.<init>()
            r12 = r8
            r11 = 0
        L_0x008f:
            androidx.media3.exoplayer.ad r14 = r1.f49576g
            int r14 = r14.mo5996c()
            if (r11 >= r14) goto L_0x00b5
            r4.mo6024e(r11, r10, r8)
            long r14 = r10.f7349n
            long r14 = androidx.media3.common.p136b.C2612ak.m6918A(r14)
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r16 != 0) goto L_0x00ab
            androidx.media3.exoplayer.ad r4 = r1.f49576g
            long r10 = r4.mo6004k()
            goto L_0x00bc
        L_0x00ab:
            long r14 = r10.f7349n
            long r14 = androidx.media3.common.p136b.C2612ak.m6918A(r14)
            long r12 = r12 + r14
            int r11 = r11 + 1
            goto L_0x008f
        L_0x00b5:
            androidx.media3.exoplayer.ad r4 = r1.f49576g
            long r10 = r4.mo6004k()
            long r10 = r10 + r12
        L_0x00bc:
            com.google.protobuf.ar r4 = com.google.protobuf.p4750c.C62948a.m95459j(r10)
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.android.libraries.assistant.c.a.c.l r10 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l) r10
            r4.getClass()
            r10.f49626c = r4
            androidx.media3.exoplayer.ad r4 = r1.f49576g
            long r10 = r4.mo6004k()
            com.google.protobuf.ar r4 = com.google.protobuf.p4750c.C62948a.m95459j(r10)
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.android.libraries.assistant.c.a.c.l r10 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l) r10
            r4.getClass()
            r10.f49627d = r4
            androidx.media3.exoplayer.ad r4 = r1.f49576g
            if (r4 != 0) goto L_0x00e7
            goto L_0x012b
        L_0x00e7:
            long r10 = r4.mo6004k()
            androidx.media3.exoplayer.ad r4 = r1.f49576g
            androidx.media3.common.bm r4 = r4.mo6014u()
            int r12 = r4.mo6021b()
            androidx.media3.exoplayer.ad r13 = r1.f49576g
            int r13 = r13.mo5997d()
            if (r12 >= r13) goto L_0x00fe
            goto L_0x012b
        L_0x00fe:
            androidx.media3.common.bk r8 = new androidx.media3.common.bk
            r8.<init>()
            r9 = 0
        L_0x0104:
            androidx.media3.exoplayer.ad r12 = r1.f49576g
            int r12 = r12.mo5997d()
            if (r9 >= r12) goto L_0x012a
            r4.mo6023d(r9, r8, r7)
            long r12 = r8.f7331d
            long r12 = androidx.media3.common.p136b.C2612ak.m6918A(r12)
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 != 0) goto L_0x0120
            androidx.media3.exoplayer.ad r4 = r1.f49576g
            long r8 = r4.mo6004k()
            goto L_0x012b
        L_0x0120:
            long r12 = r8.f7331d
            long r12 = androidx.media3.common.p136b.C2612ak.m6918A(r12)
            long r10 = r10 - r12
            int r9 = r9 + 1
            goto L_0x0104
        L_0x012a:
            r8 = r10
        L_0x012b:
            com.google.protobuf.ar r4 = com.google.protobuf.p4750c.C62948a.m95459j(r8)
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.android.libraries.assistant.c.a.c.l r7 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l) r7
            r4.getClass()
            r7.f49631h = r4
            androidx.media3.exoplayer.ad r4 = r1.f49576g
            androidx.media3.common.bb r4 = r4.mo6012s()
            float r4 = r4.f7313b
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.android.libraries.assistant.c.a.c.l r7 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l) r7
            r7.f49629f = r4
            androidx.media3.exoplayer.ad r4 = r1.f49576g
            androidx.media3.exoplayer.o r4 = r4.mo6460K()
            r7 = 3
            if (r4 == 0) goto L_0x0156
            goto L_0x0179
        L_0x0156:
            androidx.media3.exoplayer.ad r4 = r1.f49576g
            boolean r4 = r4.mo5987O()
            androidx.media3.exoplayer.ad r8 = r1.f49576g
            int r8 = r8.mo5998e()
            r9 = 6
            r10 = 1
            if (r8 == r3) goto L_0x0174
            if (r8 == r7) goto L_0x016f
            r7 = 4
            if (r8 == r7) goto L_0x016c
            goto L_0x0179
        L_0x016c:
            r7 = 8
            goto L_0x0179
        L_0x016f:
            if (r10 == r4) goto L_0x0172
            goto L_0x0176
        L_0x0172:
            r7 = 7
            goto L_0x0179
        L_0x0174:
            if (r10 == r4) goto L_0x0178
        L_0x0176:
            r7 = 6
            goto L_0x0179
        L_0x0178:
            r7 = 5
        L_0x0179:
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.assistant.c.a.c.l r3 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l) r3
            int r7 = r7 + -2
            r3.f49624a = r7
            androidx.media3.exoplayer.ad r3 = r1.f49576g
            int r3 = r3.mo5997d()
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.assistant.c.a.c.l r4 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l) r4
            r4.f49630g = r3
            androidx.media3.exoplayer.ad r3 = r1.f49576g
            long r3 = r3.mo6005l()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x01b3
            androidx.media3.exoplayer.ad r1 = r1.f49576g
            long r3 = r1.mo6005l()
            com.google.protobuf.ar r1 = com.google.protobuf.p4750c.C62948a.m95459j(r3)
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.assistant.c.a.c.l r3 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l) r3
            r1.getClass()
            r3.f49628e = r1
        L_0x01b3:
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.assistant.c.a.c.l r1 = (com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l) r1
        L_0x01b9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a.C16965o.call():java.lang.Object");
    }
}
