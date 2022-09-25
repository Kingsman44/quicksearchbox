package com.google.android.apps.gsa.staticplugins.opa;

import android.view.GestureDetector;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ek */
/* compiled from: PG */
final class C108807ek extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C109040fj f302548a;

    /* renamed from: b */
    private long f302549b = 0;

    public C108807ek(C109040fj fjVar) {
        this.f302548a = fjVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ce A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScroll(android.view.MotionEvent r10, android.view.MotionEvent r11, float r12, float r13) {
        /*
            r9 = this;
            r12 = 0
            if (r10 == 0) goto L_0x0236
            if (r11 != 0) goto L_0x0007
            goto L_0x0236
        L_0x0007:
            com.google.android.apps.gsa.staticplugins.opa.fj r13 = r9.f302548a
            com.google.android.apps.gsa.staticplugins.opa.af.x r13 = r13.f303324be
            boolean r13 = r13.mo95321b()
            if (r13 == 0) goto L_0x0012
            return r12
        L_0x0012:
            com.google.android.apps.gsa.staticplugins.opa.fj r13 = r9.f302548a
            boolean r13 = r13.mo97527bu()
            if (r13 == 0) goto L_0x0032
            com.google.android.apps.gsa.staticplugins.opa.fj r13 = r9.f302548a
            com.google.common.base.ax r13 = r13.f303319bZ
            java.lang.Object r13 = r13.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.aq.g r13 = (com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107383g) r13
            android.view.ViewGroup r13 = r13.f298866c
            int r13 = r13.getScrollY()
            if (r13 == 0) goto L_0x0032
            long r0 = r11.getEventTime()
            r9.f302549b = r0
        L_0x0032:
            float r11 = r11.getY()
            float r13 = r10.getY()
            float r11 = r11 - r13
            float r13 = java.lang.Math.abs(r11)
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302548a
            android.content.Context r0 = r0.f303346c
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            float r0 = (float) r0
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 > 0) goto L_0x0051
            return r12
        L_0x0051:
            com.google.android.apps.gsa.staticplugins.opa.fj r13 = r9.f302548a
            com.google.android.apps.gsa.staticplugins.opa.samson.a.b.a r0 = r13.f303265aY
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0.mo98293e()
            if (r0 != 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            return r12
        L_0x005f:
            com.google.android.apps.gsa.staticplugins.opa.ey r13 = r13.f303275ai
            com.google.android.apps.gsa.staticplugins.opa.ey r0 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_STARTED
            r1 = 1
            if (r13 != r0) goto L_0x0068
            r13 = 1
            goto L_0x0069
        L_0x0068:
            r13 = 0
        L_0x0069:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302548a
            boolean r0 = r0.mo97521bm()
            com.google.android.apps.gsa.staticplugins.opa.fj r2 = r9.f302548a
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r2 = r2.f303450o
            boolean r2 = com.google.android.apps.gsa.staticplugins.opa.C109040fj.m181378bx(r2)
            if (r2 == 0) goto L_0x0091
            com.google.android.apps.gsa.staticplugins.opa.fj r2 = r9.f302548a
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r2 = r2.f303450o
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r2 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r2
            com.google.common.base.ax r2 = r2.mo100833bf()
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r2 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r2
            boolean r2 = r2.mo100885cZ()
            if (r2 == 0) goto L_0x0091
            r2 = 1
            goto L_0x0092
        L_0x0091:
            r2 = 0
        L_0x0092:
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r9.f302548a
            com.google.android.apps.gsa.staticplugins.opa.ay.as r3 = r3.f303238X
            boolean r3 = r3.mo96131aD()
            if (r3 != 0) goto L_0x00b4
            if (r13 != 0) goto L_0x00b2
            if (r0 != 0) goto L_0x00b2
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r9.f302548a
            boolean r3 = r3.mo97527bu()
            if (r3 == 0) goto L_0x00b4
            long r3 = r9.f302549b
            long r5 = r10.getDownTime()
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x00b4
        L_0x00b2:
            r10 = 1
            goto L_0x00b5
        L_0x00b4:
            r10 = 0
        L_0x00b5:
            if (r13 == 0) goto L_0x00c3
            com.google.android.apps.gsa.staticplugins.opa.fj r13 = r9.f302548a
            boolean r3 = r13.f303371cc
            if (r3 != 0) goto L_0x00c3
            boolean r13 = r13.f303303bJ
            if (r13 != 0) goto L_0x00c3
            r13 = 1
            goto L_0x00c4
        L_0x00c3:
            r13 = 0
        L_0x00c4:
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r9.f302548a
            com.google.android.apps.gsa.staticplugins.opa.ay.as r3 = r3.f303238X
            boolean r3 = r3.mo96134aG()
            if (r3 == 0) goto L_0x00cf
            return r12
        L_0x00cf:
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r9.f302548a
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r3 = r3.f303450o
            boolean r3 = r3.mo95399aj()
            if (r3 == 0) goto L_0x00e6
            com.google.android.apps.gsa.staticplugins.opa.fj r10 = r9.f302548a
            boolean r11 = r10.mo97523bp()
            if (r11 != 0) goto L_0x0236
            r10.mo97459aU()
            goto L_0x0236
        L_0x00e6:
            if (r10 == 0) goto L_0x0236
            com.google.android.apps.gsa.staticplugins.opa.fj r10 = r9.f302548a
            boolean r3 = r10.f303292az
            if (r3 != 0) goto L_0x0236
            int r3 = r10.f303290ax
            float r4 = (float) r3
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x010a
            if (r2 != 0) goto L_0x010a
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r0 != 0) goto L_0x0104
            com.google.android.apps.gsa.staticplugins.opa.fj r10 = r9.f302548a
            com.google.android.apps.gsa.staticplugins.opa.fl r10 = r10.f303444i
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_SCROLL
            r10.mo95167z(r11)
        L_0x0104:
            com.google.android.apps.gsa.staticplugins.opa.fj r10 = r9.f302548a
            r10.f303292az = r1
            goto L_0x0236
        L_0x010a:
            int r0 = -r3
            float r0 = (float) r0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0236
            if (r13 == 0) goto L_0x0236
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r10 = r10.f303450o
            android.view.ViewGroup r10 = r10.mo95418g()
            r13 = 0
            r0 = 22
            if (r10 == 0) goto L_0x018a
            com.google.android.apps.gsa.staticplugins.opa.fj r2 = r9.f302548a
            com.google.android.apps.gsa.staticplugins.opa.util.cr r3 = r2.f303445j
            com.google.android.libraries.logging.j r10 = com.google.android.libraries.logging.C28295m.m52915a(r10)
            if (r10 != 0) goto L_0x0128
            goto L_0x018a
        L_0x0128:
            r10.mo33795i(r0)
            com.google.common.o.oe r10 = com.google.android.libraries.logging.C28285c.m52883j(r10, r0, r13)
            if (r10 == 0) goto L_0x018a
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.common.o.od r10 = (com.google.common.p4552o.C60320od) r10
            com.google.protobuf.bv r2 = r10.instance
            com.google.common.o.oe r2 = (com.google.common.p4552o.C60321oe) r2
            int r2 = r2.f163226a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x017c
            com.google.common.o.l.dk r2 = com.google.common.p4552o.p4566l.C60200dk.UP
            com.google.protobuf.bv r4 = r10.instance
            com.google.common.o.oe r4 = (com.google.common.p4552o.C60321oe) r4
            com.google.common.o.aqm r4 = r4.f163230e
            if (r4 != 0) goto L_0x014d
            com.google.common.o.aqm r4 = com.google.common.p4552o.aqm.f159760n
        L_0x014d:
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.common.o.aql r4 = (com.google.common.p4552o.aql) r4
            int r2 = r2.f162873f
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.common.o.aqm r5 = (com.google.common.p4552o.aqm) r5
            int r6 = r5.f159762a
            r6 = r6 | 32
            r5.f159762a = r6
            r5.f159768g = r2
            r10.copyOnWrite()
            com.google.protobuf.bv r2 = r10.instance
            com.google.common.o.oe r2 = (com.google.common.p4552o.C60321oe) r2
            com.google.protobuf.bv r4 = r4.build()
            com.google.common.o.aqm r4 = (com.google.common.p4552o.aqm) r4
            r4.getClass()
            r2.f163230e = r4
            int r4 = r2.f163226a
            r4 = r4 | 16
            r2.f163226a = r4
        L_0x017c:
            r4 = 0
            r6 = 0
            com.google.protobuf.bv r10 = r10.build()
            r8 = r10
            com.google.common.o.oe r8 = (com.google.common.p4552o.C60321oe) r8
            r3.mo100721a(r4, r6, r8)
        L_0x018a:
            com.google.android.apps.gsa.staticplugins.opa.fj r10 = r9.f302548a
            boolean r10 = r10.mo97519bk()
            if (r10 == 0) goto L_0x01b4
            com.google.android.apps.gsa.staticplugins.opa.fj r10 = r9.f302548a
            boolean r10 = r10.mo97526bt()
            if (r10 != 0) goto L_0x01b4
            com.google.android.apps.gsa.staticplugins.opa.fj r10 = r9.f302548a
            com.google.common.base.ax r10 = r10.f303247aG
            java.lang.Object r10 = r10.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.ah.l r10 = (com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l) r10
            com.google.android.apps.gsa.staticplugins.opa.fj r11 = r9.f302548a
            android.app.Activity r0 = r11.f303441f
            com.google.android.apps.gsa.staticplugins.opa.el r2 = new com.google.android.apps.gsa.staticplugins.opa.el
            r2.<init>(r11, r1, r13)
            com.google.android.apps.gsa.staticplugins.opa.gb r11 = r11.f303456u
            r10.mo95343g(r1, r0, r2, r11)
            goto L_0x0236
        L_0x01b4:
            com.google.android.apps.gsa.staticplugins.opa.fj r10 = r9.f302548a
            boolean r13 = r10.mo97521bm()
            if (r13 == 0) goto L_0x01d4
            com.google.android.apps.gsa.staticplugins.opa.ay.as r13 = r10.f303238X
            int r13 = r13.mo96177e()
            if (r13 != r1) goto L_0x01d4
            float r11 = -r11
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r10 = r10.f303450o
            android.widget.FrameLayout r10 = r10.mo95420i()
            int r10 = r10.getHeight()
            float r10 = (float) r10
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x0236
        L_0x01d4:
            com.google.android.apps.gsa.staticplugins.opa.fj r10 = r9.f302548a
            com.google.android.apps.gsa.search.core.i.t r10 = r10.f303455t
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247287eM
            boolean r10 = r10.mo79746e(r11)
            if (r10 == 0) goto L_0x022c
            com.google.android.apps.gsa.staticplugins.opa.fj r10 = r9.f302548a
            dagger.a r10 = r10.f303272af
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.search.shared.h.n r10 = (com.google.android.apps.gsa.search.shared.p6930h.C87571n) r10
            com.google.android.apps.gsa.staticplugins.opa.fj r11 = r9.f302548a
            android.content.Context r11 = r11.f303346c
            com.google.assistant.s.a.ih r13 = com.google.assistant.p3994s.p3995a.C53287ih.f139693l
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.s.a.hw r13 = (com.google.assistant.p3994s.p3995a.C53275hw) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r2 = r13.instance
            com.google.assistant.s.a.ih r2 = (com.google.assistant.p3994s.p3995a.C53287ih) r2
            r2.f139698d = r1
            int r3 = r2.f139695a
            r3 = r3 | r1
            r2.f139695a = r3
            r13.copyOnWrite()
            com.google.protobuf.bv r2 = r13.instance
            com.google.assistant.s.a.ih r2 = (com.google.assistant.p3994s.p3995a.C53287ih) r2
            r2.f139702h = r1
            int r3 = r2.f139695a
            r3 = r3 | 64
            r2.f139695a = r3
            r13.copyOnWrite()
            com.google.protobuf.bv r2 = r13.instance
            com.google.assistant.s.a.ih r2 = (com.google.assistant.p3994s.p3995a.C53287ih) r2
            r2.f139703i = r0
            int r0 = r2.f139695a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r2.f139695a = r0
            com.google.protobuf.bv r13 = r13.build()
            com.google.assistant.s.a.ih r13 = (com.google.assistant.p3994s.p3995a.C53287ih) r13
            r10.mo81698j(r11, r13)
            goto L_0x0232
        L_0x022c:
            com.google.android.apps.gsa.staticplugins.opa.fj r10 = r9.f302548a
            r11 = 7
            r10.mo97498bH(r12, r1, r1, r11)
        L_0x0232:
            com.google.android.apps.gsa.staticplugins.opa.fj r10 = r9.f302548a
            r10.f303292az = r1
        L_0x0236:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C108807ek.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
