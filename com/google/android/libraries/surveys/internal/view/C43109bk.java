package com.google.android.libraries.surveys.internal.view;

import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.p4281bu.p4282a.C56532bp;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68374aw;

/* renamed from: com.google.android.libraries.surveys.internal.view.bk */
/* compiled from: PG */
final class C43109bk {
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0129 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m76069a(int r8, com.google.p4281bu.p4282a.C56532bp r9, com.google.android.libraries.surveys.internal.model.Answer r10) {
        /*
            com.google.protobuf.cq r0 = r9.f150969e
            int r0 = r0.size()
            r1 = 0
            if (r8 < r0) goto L_0x000a
            return r1
        L_0x000a:
            com.google.protobuf.cq r9 = r9.f150969e
            java.lang.Object r8 = r9.get(r8)
            com.google.bu.a.cc r8 = (com.google.p4281bu.p4282a.C56546cc) r8
            boolean r9 = r8.f151000h
            r0 = 1
            if (r9 == 0) goto L_0x012a
            com.google.common.b.gp r9 = com.google.common.p4522b.C58485gu.m89837e()
            int r2 = r8.f150999g
            int r2 = com.google.p4281bu.p4282a.C56545cb.m88209a(r2)
            if (r2 != 0) goto L_0x0024
            r2 = 1
        L_0x0024:
            int r2 = r2 + -2
            r3 = 4
            r4 = 3
            r5 = 2
            if (r2 == r0) goto L_0x0076
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x0031
            goto L_0x00a7
        L_0x0031:
            int r9 = r8.f150993a
            r2 = 6
            if (r9 != r2) goto L_0x003b
            java.lang.Object r8 = r8.f150994b
            com.google.bu.a.ch r8 = (com.google.p4281bu.p4282a.C56551ch) r8
            goto L_0x003d
        L_0x003b:
            com.google.bu.a.ch r8 = com.google.p4281bu.p4282a.C56551ch.f151006g
        L_0x003d:
            com.google.protobuf.ch r8 = r8.f151010c
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89842j(r8)
            goto L_0x00ab
        L_0x0044:
            int r2 = r8.f150993a
            r6 = 5
            if (r2 != r6) goto L_0x004e
            java.lang.Object r8 = r8.f150994b
            com.google.bu.a.bl r8 = (com.google.p4281bu.p4282a.C56528bl) r8
            goto L_0x0050
        L_0x004e:
            com.google.bu.a.bl r8 = com.google.p4281bu.p4282a.C56528bl.f150956b
        L_0x0050:
            com.google.bu.a.m r8 = r8.f150958a
            if (r8 != 0) goto L_0x0056
            com.google.bu.a.m r8 = com.google.p4281bu.p4282a.C56587m.f151083b
        L_0x0056:
            com.google.protobuf.cq r8 = r8.f151085a
            java.util.Iterator r8 = r8.iterator()
        L_0x005c:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r8.next()
            com.google.bu.a.k r2 = (com.google.p4281bu.p4282a.C56585k) r2
            boolean r6 = r2.f151081d
            if (r6 == 0) goto L_0x005c
            int r2 = r2.f151079b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.mo55395g(r2)
            goto L_0x005c
        L_0x0076:
            int r2 = r8.f150993a
            if (r2 != r3) goto L_0x007f
            java.lang.Object r8 = r8.f150994b
            com.google.bu.a.cy r8 = (com.google.p4281bu.p4282a.C56568cy) r8
            goto L_0x0081
        L_0x007f:
            com.google.bu.a.cy r8 = com.google.p4281bu.p4282a.C56568cy.f151042c
        L_0x0081:
            com.google.bu.a.m r8 = r8.f151044a
            if (r8 != 0) goto L_0x0087
            com.google.bu.a.m r8 = com.google.p4281bu.p4282a.C56587m.f151083b
        L_0x0087:
            com.google.protobuf.cq r8 = r8.f151085a
            java.util.Iterator r8 = r8.iterator()
        L_0x008d:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r8.next()
            com.google.bu.a.k r2 = (com.google.p4281bu.p4282a.C56585k) r2
            boolean r6 = r2.f151081d
            if (r6 == 0) goto L_0x008d
            int r2 = r2.f151079b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.mo55395g(r2)
            goto L_0x008d
        L_0x00a7:
            com.google.common.b.gu r8 = r9.mo55394f()
        L_0x00ab:
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0129
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.google.bu.a.ba r10 = r10.f112629a
            int r2 = r10.f150936a
            int r6 = com.google.p4281bu.p4282a.C56503an.m88206a(r2)
            int r7 = r6 + -1
            if (r6 == 0) goto L_0x0127
            if (r7 == 0) goto L_0x0107
            if (r7 == r0) goto L_0x00e2
            if (r7 == r5) goto L_0x00c9
            goto L_0x011f
        L_0x00c9:
            if (r2 != r3) goto L_0x00d0
            java.lang.Object r10 = r10.f150937b
            com.google.bu.a.au r10 = (com.google.p4281bu.p4282a.C56510au) r10
            goto L_0x00d2
        L_0x00d0:
            com.google.bu.a.au r10 = com.google.p4281bu.p4282a.C56510au.f150919b
        L_0x00d2:
            com.google.bu.a.ax r10 = r10.f150921a
            if (r10 != 0) goto L_0x00d8
            com.google.bu.a.ax r10 = com.google.p4281bu.p4282a.C56513ax.f150922d
        L_0x00d8:
            int r10 = r10.f150925b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.add(r10)
            goto L_0x011f
        L_0x00e2:
            if (r2 != r4) goto L_0x00e9
            java.lang.Object r10 = r10.f150937b
            com.google.bu.a.aq r10 = (com.google.p4281bu.p4282a.C56506aq) r10
            goto L_0x00eb
        L_0x00e9:
            com.google.bu.a.aq r10 = com.google.p4281bu.p4282a.C56506aq.f150913b
        L_0x00eb:
            com.google.protobuf.cq r10 = r10.f150915a
            java.util.Iterator r10 = r10.iterator()
        L_0x00f1:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x011f
            java.lang.Object r2 = r10.next()
            com.google.bu.a.ax r2 = (com.google.p4281bu.p4282a.C56513ax) r2
            int r2 = r2.f150925b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.add(r2)
            goto L_0x00f1
        L_0x0107:
            if (r2 != r5) goto L_0x010e
            java.lang.Object r10 = r10.f150937b
            com.google.bu.a.az r10 = (com.google.p4281bu.p4282a.C56515az) r10
            goto L_0x0110
        L_0x010e:
            com.google.bu.a.az r10 = com.google.p4281bu.p4282a.C56515az.f150927b
        L_0x0110:
            com.google.bu.a.ax r10 = r10.f150929a
            if (r10 != 0) goto L_0x0116
            com.google.bu.a.ax r10 = com.google.p4281bu.p4282a.C56513ax.f150922d
        L_0x0116:
            int r10 = r10.f150925b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.add(r10)
        L_0x011f:
            boolean r8 = java.util.Collections.disjoint(r9, r8)
            if (r8 != 0) goto L_0x0126
            return r0
        L_0x0126:
            return r1
        L_0x0127:
            r8 = 0
            throw r8
        L_0x0129:
            return r1
        L_0x012a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.view.C43109bk.m76069a(int, com.google.bu.a.bp, com.google.android.libraries.surveys.internal.model.Answer):boolean");
    }

    /* renamed from: b */
    public static boolean m76070b(boolean z, C56532bp bpVar, Answer answer) {
        if (C43054c.m75959b(C68374aw.f184720a.mo6453a().mo60365a(C43054c.f112610b)) && z && !m76069a(0, bpVar, answer)) {
            return true;
        }
        return false;
    }
}
