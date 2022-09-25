package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.m */
/* compiled from: PG */
public final /* synthetic */ class C26870m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26871n f73193a;

    /* renamed from: b */
    public final /* synthetic */ C26733ab f73194b;

    public /* synthetic */ C26870m(C26871n nVar, C26733ab abVar) {
        this.f73193a = nVar;
        this.f73194b = abVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:191:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0691  */
    /* JADX WARNING: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r1 = r30
            com.google.android.libraries.lens.view.h.h.a.n r0 = r1.f73193a
            com.google.android.libraries.lens.view.h.d.ab r5 = r1.f73194b
            com.google.android.libraries.lens.view.h.h.a.u r0 = r0.f73196b
            com.google.common.base.ax r2 = r0.f73260v
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f73243e
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x002a
        L_0x0018:
            com.google.apps.tiktok.tracing.dh r2 = r0.f73231T
            java.lang.String r3 = "onFrameProcessing noSyncRendering"
            com.google.apps.tiktok.tracing.ax r2 = r2.mo51613c(r3)
            com.google.android.libraries.lens.view.h.e.ah r3 = r0.f73237Z     // Catch:{ all -> 0x06ae }
            r3.mo32147b()     // Catch:{ all -> 0x06ae }
            if (r2 == 0) goto L_0x002a
            r2.close()
        L_0x002a:
            com.google.common.base.ax r2 = r0.f73260v
            boolean r2 = r2.mo56113h()
            if (r2 != 0) goto L_0x003c
            com.google.android.libraries.lens.view.h.e.ah r2 = r0.f73237Z
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            r2.mo32146a(r3)
            r0.mo32248e()
        L_0x003c:
            com.google.android.libraries.lens.view.h.h.a.ag r2 = r0.f73261w
            java.lang.String r3 = "updateTexImageWithResult"
            r2.mo32219a(r3)
            com.google.android.libraries.lens.view.h.d.ap r2 = r0.f73236Y
            boolean r2 = r2.mo32060b()
            com.google.android.libraries.lens.view.h.h.a.ag r3 = r0.f73261w
            r3.mo32220b()
            if (r2 != 0) goto L_0x005f
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26878u.f73209a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r2 = "***** Dropping frame: input texture update failed."
            r3 = 49243(0xc05b, float:6.9004E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x005f:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            com.google.android.libraries.lens.view.h.d.ap r3 = r0.f73236Y
            long r3 = r3.getTimestamp()
            long r8 = r2.toMicros(r3)
            long r2 = r0.f73222K
            long r2 = r8 - r2
            r6 = 0
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x008f
            com.google.common.f.a.d r2 = com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26878u.f73209a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            r3 = 49242(0xc05a, float:6.9003E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            r6 = r2
            com.google.common.f.a.a r6 = (com.google.common.p4526f.p4527a.C58970a) r6
            java.lang.String r7 = "***** Dropping frame: non-increasing timestamp %d -> %d"
            long r10 = r0.f73222K
            r6.mo56350C(r7, r8, r10)
            return
        L_0x008f:
            r0.f73222K = r8
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f73243e
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x009b
            goto L_0x06ad
        L_0x009b:
            com.google.common.base.ax r2 = r0.f73260v
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x00b1
            com.google.common.base.ax r2 = r0.f73260v
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.lens.view.av.c r2 = (com.google.android.libraries.lens.view.p2082av.C25579c) r2
            boolean r2 = r2.mo30665e(r8)
            if (r2 != 0) goto L_0x06ad
        L_0x00b1:
            com.google.common.base.ax r2 = r0.f73260v
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x0110
            com.google.common.base.ax r2 = r0.f73260v
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.lens.view.av.c r2 = (com.google.android.libraries.lens.view.p2082av.C25579c) r2
            boolean r2 = r2.mo30667g()
            if (r2 == 0) goto L_0x0110
            com.google.android.libraries.lens.view.h.e.ah r2 = r0.f73237Z
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            r2.mo32146a(r3)
            r0.mo32248e()
            com.google.android.libraries.lens.view.h.h.a.b.b r2 = r0.f73253o
            r3 = r2
            com.google.android.libraries.lens.view.h.h.a.b.a r3 = (com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b.C26854a) r3
            android.opengl.EGLDisplay r3 = r3.f73167b
            android.opengl.EGLSurface r2 = r2.mo32230g()
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26847ac.m49719j(r3, r2)
            boolean r2 = r0.f73246h
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49758c(r2)
            com.google.apps.tiktok.tracing.dh r2 = r0.f73231T
            java.lang.String r3 = "onFrameProcessing noSyncRendering"
            com.google.apps.tiktok.tracing.ax r2 = r2.mo51613c(r3)
            com.google.android.libraries.lens.view.h.e.ah r3 = r0.f73237Z     // Catch:{ all -> 0x0102 }
            r3.mo32147b()     // Catch:{ all -> 0x0102 }
            if (r2 == 0) goto L_0x00f6
            r2.close()
        L_0x00f6:
            com.google.common.base.ax r0 = r0.f73260v
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.lens.view.av.c r0 = (com.google.android.libraries.lens.view.p2082av.C25579c) r0
            r0.mo30669i()
            return
        L_0x0102:
            r0 = move-exception
            r3 = r0
            if (r2 == 0) goto L_0x010f
            r2.close()     // Catch:{ all -> 0x010a }
            goto L_0x010f
        L_0x010a:
            r0 = move-exception
            r2 = r0
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26839a.m49688a(r3, r2)
        L_0x010f:
            throw r3
        L_0x0110:
            com.google.android.libraries.lens.view.u.c r10 = new com.google.android.libraries.lens.view.u.c
            com.google.common.base.ax r2 = r0.f73260v
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x0126
            com.google.android.libraries.lens.view.h.h.a.b.b r2 = r0.f73253o
            com.google.android.libraries.lens.view.h.h.a.b.a r2 = (com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b.C26854a) r2
            java.util.concurrent.atomic.AtomicInteger r2 = r2.f73170e
            int r2 = r2.get()
            r6 = r2
            goto L_0x0128
        L_0x0126:
            r2 = -1
            r6 = -1
        L_0x0128:
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f73227P
            int r7 = r2.get()
            com.google.common.base.ax r2 = r0.f73226O
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x0158
            com.google.common.base.ax r2 = r0.f73226O
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.lens.view.h.h.a.s r2 = (com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26876s) r2
            java.util.concurrent.ConcurrentLinkedDeque r2 = r2.f73205a
            java.lang.Object r2 = r2.poll()
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L_0x0156
            com.google.common.f.a.d r3 = com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26878u.f73209a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "***** FSIQ UNDERFLOW"
            r12 = 49236(0xc054, float:6.8994E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r12)).mo56386p(r4)
        L_0x0156:
            r12 = r2
            goto L_0x0159
        L_0x0158:
            r12 = 0
        L_0x0159:
            com.google.common.base.ax r2 = r0.f73226O
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x0176
            com.google.common.base.ax r2 = r0.f73226O
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.lens.view.h.h.a.s r2 = (com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26876s) r2
            p3186j$.util.Objects.requireNonNull(r2)
            com.google.android.libraries.lens.view.h.h.a.b r3 = new com.google.android.libraries.lens.view.h.h.a.b
            r3.<init>(r2)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r3)
            goto L_0x0178
        L_0x0176:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x0178:
            r13 = r2
            r2 = r10
            r3 = r8
            r8 = r12
            r9 = r13
            r2.<init>(r3, r5, r6, r7, r8, r9)
            boolean r2 = r0.f73223L
            r3 = 0
            if (r2 == 0) goto L_0x019c
            com.google.android.libraries.lens.view.h.e.ah r2 = r0.f73237Z
            com.google.android.libraries.lens.view.h.e.ai r4 = r2.f72970a
            java.util.concurrent.atomic.AtomicInteger r4 = r4.f73024p
            r4.incrementAndGet()
            com.google.android.libraries.lens.view.h.e.ai r2 = r2.f72970a
            com.google.android.libraries.lens.view.h.e.ag r4 = new com.google.android.libraries.lens.view.h.e.ag
            r4.<init>()
            r2.mo32154x(r4)
            r3 = r10
        L_0x0199:
            r2 = 0
            goto L_0x0642
        L_0x019c:
            boolean r2 = r0.mo32250g()
            if (r2 == 0) goto L_0x01af
            com.google.common.base.ax r2 = r0.f73226O
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x01af
            com.google.android.libraries.lens.view.u.a r2 = com.google.android.libraries.lens.view.p2173u.C28095a.NOT_SELECTABLE_WAITING_FOR_USER_VISIBLE_REGION
            r10.mo33560c(r2)
        L_0x01af:
            r2 = 1
            r0.f73223L = r2
            long r4 = java.lang.System.nanoTime()
            com.google.android.libraries.lens.view.h.d.ab r6 = r10.f76485c
            com.google.common.base.ax r6 = r6.mo32047a()
            boolean r6 = r6.mo56113h()
            if (r6 == 0) goto L_0x01f2
            com.google.android.libraries.lens.view.n.i r6 = r0.f73262x
            long r7 = r10.f76484b
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            com.google.android.libraries.lens.view.h.d.ab r12 = r10.f76485c
            com.google.common.base.ax r12 = r12.mo32047a()
            java.lang.Object r12 = r12.mo56107c()
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = r9.toMicros(r12)
            boolean r9 = r6.f75112e
            if (r9 != 0) goto L_0x01e1
            goto L_0x01f2
        L_0x01e1:
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x01f2
            java.util.Map r6 = r6.f75118k
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            r6.put(r7, r8)
        L_0x01f2:
            boolean r6 = r0.f73248j
            r7 = 3
            if (r6 == 0) goto L_0x0229
            com.google.android.libraries.lens.view.h.h.a.ag r6 = r0.f73261w
            java.lang.String r8 = "analyzer/drawMipmap"
            r6.mo32219a(r8)
            com.google.android.libraries.lens.view.h.h.a.a.e r6 = r0.f73215D
            int r6 = r6.mo32211a()
            android.util.Size r8 = r0.f73258t
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26847ac.m49715f(r6, r8)
            com.google.android.libraries.lens.view.h.h.a.w r6 = r0.f73250l
            int r8 = r0.f73221J
            com.google.android.libraries.lens.view.h.d.ap r9 = r0.f73236Y
            r6.mo32252a(r7, r8, r9)
            boolean r6 = r0.f73248j
            if (r6 == 0) goto L_0x0224
            com.google.android.libraries.lens.view.h.h.a.a.e r6 = r0.f73215D
            int r6 = r6.mo32213c()
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26847ac.m49718i(r6)
            boolean r6 = r0.f73246h
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49758c(r6)
        L_0x0224:
            com.google.android.libraries.lens.view.h.h.a.ag r6 = r0.f73261w
            r6.mo32220b()
        L_0x0229:
            boolean r6 = r0.f73234W
            r8 = 2
            if (r6 == 0) goto L_0x0251
            r0.mo32251h(r8)
            com.google.android.libraries.lens.view.h.h.a.a.e r6 = r0.f73214C
            int r6 = r6.mo32211a()
            android.util.Size r9 = new android.util.Size
            com.google.android.libraries.lens.view.h.d.c r12 = r0.f73240b
            android.util.Size r12 = r12.f72878a
            int r12 = r12.getWidth()
            com.google.android.libraries.lens.view.h.d.c r13 = r0.f73240b
            android.util.Size r13 = r13.f72878a
            int r13 = r13.getHeight()
            r9.<init>(r12, r13)
            android.util.Size r12 = r0.f73258t
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26847ac.m49727r(r6, r9, r12)
        L_0x0251:
            boolean r6 = r0.f73233V
            if (r6 == 0) goto L_0x0258
            r0.mo32251h(r2)
        L_0x0258:
            com.google.android.libraries.lens.view.h.h.a.p r6 = r0.f73224M
            com.google.android.libraries.lens.view.h.e.ah r9 = r0.f73237Z
            com.google.android.libraries.lens.view.h.e.ai r9 = r9.f72970a
            java.util.concurrent.atomic.AtomicBoolean r9 = r9.f73012d
            boolean r9 = r9.get()
            r6.f73199a = r9
            com.google.android.libraries.lens.view.h.h.a.p r6 = r0.f73224M
            com.google.android.libraries.lens.view.n.i r9 = r0.f73262x
            boolean r9 = r9.f75112e
            r6.f73200b = r9
            com.google.android.libraries.lens.view.h.h.a.p r6 = r0.f73224M
            boolean r6 = r6.mo32240a()
            if (r6 != 0) goto L_0x027e
            com.google.common.base.ax r6 = r0.f73226O
            boolean r6 = r6.mo56113h()
            if (r6 == 0) goto L_0x029e
        L_0x027e:
            com.google.android.libraries.lens.view.h.h.a.ag r6 = r0.f73261w
            java.lang.String r9 = "capture/draw"
            r6.mo32219a(r9)
            com.google.android.libraries.lens.view.h.h.a.a.e r6 = r0.f73216E
            int r6 = r6.mo32211a()
            android.util.Size r9 = r0.f73257s
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26847ac.m49715f(r6, r9)
            com.google.android.libraries.lens.view.h.h.a.w r6 = r0.f73250l
            int r9 = r0.f73221J
            com.google.android.libraries.lens.view.h.d.ap r12 = r0.f73236Y
            r6.mo32252a(r2, r9, r12)
            com.google.android.libraries.lens.view.h.h.a.ag r6 = r0.f73261w
            r6.mo32220b()
        L_0x029e:
            com.google.common.base.ax r6 = r0.f73226O
            boolean r6 = r6.mo56113h()
            if (r6 == 0) goto L_0x02d0
            java.lang.Integer r6 = r10.f76488f
            if (r6 == 0) goto L_0x02b8
            com.google.android.libraries.lens.view.h.h.a.a.e r9 = r0.f73216E
            android.util.Size r12 = r0.f73257s
            com.google.android.libraries.lens.view.h.h.a.ag r13 = r0.f73261w
            int r6 = r6.intValue()
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26847ac.m49726q(r9, r12, r13, r6)
            goto L_0x02d0
        L_0x02b8:
            com.google.common.f.a.d r6 = com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26878u.f73209a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.a.a r6 = (com.google.common.p4526f.p4527a.C58970a) r6
            r9 = 49248(0xc060, float:6.9011E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r9)
            com.google.common.f.a.a r6 = (com.google.common.p4526f.p4527a.C58970a) r6
            java.lang.String r9 = "***** FSIQ readCaptureFrameToPbo nil pbo for frame[%d]"
            long r12 = r10.f76484b
            r6.mo56388r(r9, r12)
        L_0x02d0:
            boolean r6 = r0.f73233V
            if (r6 == 0) goto L_0x031f
            boolean r6 = r0.f73245g
            if (r6 == 0) goto L_0x030c
            com.google.android.libraries.lens.view.h.h.a.a.e r6 = r0.f73214C
            android.util.Size r9 = new android.util.Size
            int r12 = r0.f73219H
            com.google.android.libraries.lens.view.h.d.c r13 = r0.f73240b
            android.util.Size r13 = r13.f72878a
            int r13 = r13.getHeight()
            r9.<init>(r12, r13)
            boolean r12 = r0.f73247i
            com.google.android.libraries.lens.view.h.h.a.ag r13 = r0.f73261w
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26847ac.m49722m(r6, r9, r12, r13)
            com.google.android.libraries.lens.view.h.h.a.a.e r6 = r0.f73214C
            int r12 = r6.mo32212b()
            java.nio.ByteBuffer r13 = r0.f73212A
            int r14 = r0.f73217F
            byte[] r15 = r0.f73213B
            com.google.android.libraries.lens.view.h.d.c r6 = r0.f73240b
            android.util.Size r6 = r6.f72878a
            int r16 = r6.getHeight()
            com.google.android.libraries.lens.view.h.h.a.ag r6 = r0.f73261w
            r17 = r6
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26847ac.m49720k(r12, r13, r14, r15, r16, r17)
            goto L_0x031f
        L_0x030c:
            com.google.android.libraries.lens.view.h.h.a.a.e r6 = r0.f73214C
            int r6 = r6.mo32211a()
            java.nio.ByteBuffer r9 = r0.f73212A
            com.google.android.libraries.lens.view.h.d.c r12 = r0.f73240b
            android.util.Size r12 = r12.f72878a
            boolean r13 = r0.f73247i
            com.google.android.libraries.lens.view.h.h.a.ag r14 = r0.f73261w
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26847ac.m49721l(r6, r9, r12, r13, r14)
        L_0x031f:
            boolean r6 = r0.f73235X
            if (r6 == 0) goto L_0x060a
            g.a.a r6 = r0.f73255q
            java.lang.Object r6 = r6.mo17428b()
            com.google.android.libraries.lens.view.ao.e r6 = (com.google.android.libraries.lens.view.p2073ao.C25459e) r6
            java.util.Map r9 = r6.f69391f
            monitor-enter(r9)
            java.util.Map r6 = r6.f69391f     // Catch:{ all -> 0x0607 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0607 }
            r6 = r6 ^ r2
            monitor-exit(r9)     // Catch:{ all -> 0x0607 }
            if (r6 == 0) goto L_0x060a
            com.google.android.libraries.lens.view.h.h.a.ag r6 = r0.f73261w
            java.lang.String r9 = "regionFiltering/all"
            r6.mo32219a(r9)
            g.a.a r6 = r0.f73255q
            java.lang.Object r6 = r6.mo17428b()
            com.google.android.libraries.lens.view.ao.e r6 = (com.google.android.libraries.lens.view.p2073ao.C25459e) r6
            int r9 = r6.f69394i
            if (r9 != r2) goto L_0x0350
            r29 = r10
        L_0x034d:
            r12 = 0
            goto L_0x05fb
        L_0x0350:
            com.google.android.libraries.lens.view.ao.a r9 = r6.f69393h
            r12 = 36160(0x8d40, float:5.0671E-41)
            r13 = 3553(0xde1, float:4.979E-42)
            if (r9 == 0) goto L_0x035b
            goto L_0x0438
        L_0x035b:
            r9 = 4
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.allocateDirect(r9)
            com.google.android.libraries.lens.view.ao.d[] r8 = new com.google.android.libraries.lens.view.p2073ao.C25458d[r7]
            r9 = 0
        L_0x0363:
            if (r9 >= r7) goto L_0x0400
            com.google.android.libraries.lens.view.ao.d r7 = new com.google.android.libraries.lens.view.ao.d
            r7.<init>()
            r8[r9] = r7
            int[] r11 = new int[r2]
            android.opengl.GLES20.glGenFramebuffers(r2, r11, r3)
            boolean r14 = r6.f69386a
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49758c(r14)
            r11 = r11[r3]
            r7.f69382a = r11
            int[] r11 = new int[r2]
            android.opengl.GLES20.glGenTextures(r2, r11, r3)
            boolean r14 = r6.f69386a
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49758c(r14)
            r11 = r11[r3]
            r7.f69384c = r11
            android.opengl.GLES20.glBindTexture(r13, r11)
            r18 = 3553(0xde1, float:4.979E-42)
            r19 = 0
            r20 = 6408(0x1908, float:8.98E-42)
            r21 = 1
            r22 = 1
            r23 = 0
            r24 = 6408(0x1908, float:8.98E-42)
            r25 = 5121(0x1401, float:7.176E-42)
            r26 = 0
            android.opengl.GLES20.glTexImage2D(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r11 = 10242(0x2802, float:1.4352E-41)
            r14 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r13, r11, r14)
            r11 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r13, r11, r14)
            r11 = 10241(0x2801, float:1.435E-41)
            r14 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r13, r11, r14)
            r11 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameteri(r13, r11, r14)
            int r11 = r7.f69382a
            int r14 = r7.f69384c
            android.opengl.GLES20.glBindFramebuffer(r12, r11)
            r11 = 36064(0x8ce0, float:5.0536E-41)
            android.opengl.GLES20.glFramebufferTexture2D(r12, r11, r13, r14, r3)
            boolean r11 = r6.f69386a
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49758c(r11)
            int r11 = android.opengl.GLES20.glCheckFramebufferStatus(r12)
            r14 = 36053(0x8cd5, float:5.0521E-41)
            if (r11 != r14) goto L_0x03d6
            r11 = 1
            goto L_0x03d7
        L_0x03d6:
            r11 = 0
        L_0x03d7:
            com.google.common.base.C58838bb.m90883r(r11)
            android.opengl.GLES20.glBindFramebuffer(r12, r3)
            int[] r11 = new int[r2]
            android.opengl.GLES20.glGenBuffers(r2, r11, r3)
            r11 = r11[r3]
            r7.f69383b = r11
            r7 = 35051(0x88eb, float:4.9117E-41)
            android.opengl.GLES20.glBindBuffer(r7, r11)
            r11 = 35041(0x88e1, float:4.9103E-41)
            r13 = 0
            r14 = 4
            android.opengl.GLES20.glBufferData(r7, r14, r13, r11)
            boolean r7 = r6.f69386a
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49758c(r7)
            int r9 = r9 + 1
            r7 = 3
            r13 = 3553(0xde1, float:4.979E-42)
            goto L_0x0363
        L_0x0400:
            android.content.Context r7 = r6.f69389d
            int r9 = android.opengl.GLES20.glCreateProgram()
            r11 = 2132017491(0x7f140153, float:1.9673262E38)
            java.lang.String r11 = com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49757b(r7, r11)
            r13 = 35633(0x8b31, float:4.9932E-41)
            int r11 = com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49756a(r11, r13)
            android.opengl.GLES20.glAttachShader(r9, r11)
            r11 = 2132017490(0x7f140152, float:1.967326E38)
            java.lang.String r7 = com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49757b(r7, r11)
            r11 = 35632(0x8b30, float:4.9931E-41)
            int r7 = com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49756a(r7, r11)
            android.opengl.GLES20.glAttachShader(r9, r7)
            android.opengl.GLES20.glLinkProgram(r9)
            boolean r7 = r6.f69386a
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49758c(r7)
            com.google.android.libraries.lens.view.ao.a r7 = new com.google.android.libraries.lens.view.ao.a
            r7.<init>(r9, r8, r15)
            r6.f69393h = r7
            r9 = r7
        L_0x0438:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f69392g
            int r7 = r7.incrementAndGet()
            int r8 = r6.f69387b
            int r8 = r8 + r2
            r6.f69387b = r8
            r11 = 3
            if (r8 != r11) goto L_0x044a
            r6.f69388c = r2
            r6.f69387b = r3
        L_0x044a:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Map r11 = r6.f69391f
            monitor-enter(r11)
            java.util.Map r13 = r6.f69391f     // Catch:{ all -> 0x0604 }
            java.util.Set r13 = r13.entrySet()     // Catch:{ all -> 0x0604 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0604 }
        L_0x045c:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x0604 }
            if (r14 == 0) goto L_0x0486
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x0604 }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ all -> 0x0604 }
            java.lang.Object r15 = r14.getValue()     // Catch:{ all -> 0x0604 }
            com.google.android.libraries.lens.view.ao.c r15 = (com.google.android.libraries.lens.view.p2073ao.C25457c) r15     // Catch:{ all -> 0x0604 }
            com.google.android.libraries.lens.view.ao.b r15 = r15.f69379a     // Catch:{ all -> 0x0604 }
            int r15 = r15.f69378e     // Catch:{ all -> 0x0604 }
            int r15 = r7 - r15
            int r15 = java.lang.Math.abs(r15)     // Catch:{ all -> 0x0604 }
            r2 = 3
            if (r15 <= r2) goto L_0x0484
            java.lang.Object r2 = r14.getKey()     // Catch:{ all -> 0x0604 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0604 }
            r8.add(r2)     // Catch:{ all -> 0x0604 }
        L_0x0484:
            r2 = 1
            goto L_0x045c
        L_0x0486:
            java.util.Map r2 = r6.f69391f     // Catch:{ all -> 0x0604 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0604 }
            r2.removeAll(r8)     // Catch:{ all -> 0x0604 }
            monitor-exit(r11)     // Catch:{ all -> 0x0604 }
            int r2 = r6.f69387b
            com.google.android.libraries.lens.view.ao.d[] r7 = r9.f69372b
            int r8 = r2 + 2
            r11 = 3
            int r8 = r8 % r11
            r8 = r7[r8]
            r2 = r7[r2]
            java.util.Map r7 = r6.f69391f
            monitor-enter(r7)
            java.util.Map r11 = r6.f69391f     // Catch:{ all -> 0x0601 }
            java.util.Collection r11 = r11.values()     // Catch:{ all -> 0x0601 }
            com.google.common.b.gu r11 = com.google.common.p4522b.C58485gu.m89842j(r11)     // Catch:{ all -> 0x0601 }
            monitor-exit(r7)     // Catch:{ all -> 0x0601 }
            int r7 = r11.size()
            r13 = 0
        L_0x04af:
            if (r13 >= r7) goto L_0x05f6
            java.lang.Object r14 = r11.get(r13)
            com.google.android.libraries.lens.view.ao.c r14 = (com.google.android.libraries.lens.view.p2073ao.C25457c) r14
            int r15 = r9.f69371a
            int r1 = r2.f69382a
            android.opengl.GLES20.glBindFramebuffer(r12, r1)
            r1 = 1
            android.opengl.GLES20.glViewport(r3, r3, r1, r1)
            r1 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r1)
            com.google.android.libraries.lens.view.ao.b r1 = r14.f69379a
            android.opengl.GLES20.glUseProgram(r15)
            boolean r12 = r6.f69386a
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49758c(r12)
            java.lang.String r12 = "vPosition"
            int r12 = android.opengl.GLES20.glGetAttribLocation(r15, r12)
            java.lang.String r3 = "uTextureM"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r15, r3)
            r26 = r2
            java.lang.String r2 = "uPreviewM"
            int r2 = android.opengl.GLES20.glGetUniformLocation(r15, r2)
            r27 = r7
            java.lang.String r7 = "sTexture"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r15, r7)
            r28 = r11
            java.lang.String r11 = "uFilterBounds"
            int r11 = android.opengl.GLES20.glGetUniformLocation(r15, r11)
            android.opengl.GLES20.glEnableVertexAttribArray(r12)
            r15 = 0
            android.opengl.GLES20.glUniform1i(r7, r15)
            com.google.android.libraries.lens.view.h.h.a.e r7 = r6.f69395j
            com.google.android.libraries.lens.view.h.h.a.u r7 = r7.f73183a
            com.google.android.libraries.lens.view.h.h.a.w r15 = r7.f73250l
            com.google.android.libraries.lens.view.h.d.ap r7 = r7.f73236Y
            r29 = r10
            r10 = 2
            r15.mo32253b(r10, r7, r2, r3)
            float r2 = r1.f69374a
            float r3 = r1.f69375b
            float r7 = r1.f69376c
            float r1 = r1.f69377d
            android.opengl.GLES20.glUniform4f(r11, r2, r3, r7, r1)
            boolean r1 = r6.f69386a
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49758c(r1)
            r20 = 2
            r21 = 5126(0x1406, float:7.183E-42)
            r22 = 0
            r23 = 0
            java.nio.ByteBuffer r1 = r6.f69390e
            r19 = r12
            r24 = r1
            android.opengl.GLES20.glVertexAttribPointer(r19, r20, r21, r22, r23, r24)
            r1 = 5
            r2 = 3
            r3 = 0
            android.opengl.GLES20.glDrawArrays(r1, r3, r2)
            boolean r1 = r6.f69386a
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49758c(r1)
            r1 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r1, r3)
            android.opengl.GLES20.glDisableVertexAttribArray(r12)
            boolean r2 = r6.f69386a
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49758c(r2)
            boolean r2 = r6.f69388c
            if (r2 == 0) goto L_0x05db
            java.nio.ByteBuffer r2 = r9.f69373c
            int r3 = r8.f69382a
            r7 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r7, r3)
            int r3 = r8.f69383b
            r11 = 35051(0x88eb, float:4.9117E-41)
            android.opengl.GLES20.glBindBuffer(r11, r3)
            r18 = 0
            r19 = 0
            r20 = 1
            r21 = 1
            r22 = 6408(0x1908, float:8.98E-42)
            r23 = 5121(0x1401, float:7.176E-42)
            r24 = 0
            android.opengl.GLES30.glReadPixels(r18, r19, r20, r21, r22, r23, r24)
            r3 = 35051(0x88eb, float:4.9117E-41)
            r11 = 0
            android.opengl.GLES20.glBindBuffer(r3, r11)
            r2.rewind()
            int r12 = r8.f69383b
            android.opengl.GLES20.glBindBuffer(r3, r12)
            int r12 = r2.capacity()
            r15 = 1
            java.nio.Buffer r12 = android.opengl.GLES30.glMapBufferRange(r3, r11, r12, r15)
            java.nio.ByteBuffer r12 = (java.nio.ByteBuffer) r12
            r2.put(r12)
            r3 = 3
            float[] r11 = new float[r3]
            r11 = {0, 0, 0} // fill-array
            r15 = 0
        L_0x058e:
            if (r15 >= r3) goto L_0x05a4
            byte r3 = r2.get(r15)
            if (r3 >= 0) goto L_0x0598
            int r3 = r3 + 256
        L_0x0598:
            float r3 = (float) r3
            r12 = 998277249(0x3b808081, float:0.003921569)
            float r3 = r3 * r12
            r11[r15] = r3
            int r15 = r15 + 1
            r3 = 3
            goto L_0x058e
        L_0x05a4:
            boolean r2 = r14.f69380b
            if (r2 == 0) goto L_0x05c6
            r2 = 3
            r15 = 0
        L_0x05aa:
            if (r15 >= r2) goto L_0x05c3
            float[] r2 = r14.f69381c
            float[] r3 = r14.f69381c
            r3 = r3[r15]
            r12 = 1061158912(0x3f400000, float:0.75)
            float r3 = r3 * r12
            r12 = r11[r15]
            r16 = 1048576000(0x3e800000, float:0.25)
            float r12 = r12 * r16
            float r3 = r3 + r12
            r2[r15] = r3
            int r15 = r15 + 1
            r2 = 3
            goto L_0x05aa
        L_0x05c3:
            r2 = 1
            r3 = 3
            goto L_0x05d0
        L_0x05c6:
            r2 = 1
            r14.f69380b = r2
            r3 = 3
            float[] r11 = java.util.Arrays.copyOf(r11, r3)
            r14.f69381c = r11
        L_0x05d0:
            r11 = 35051(0x88eb, float:4.9117E-41)
            android.opengl.GLES30.glUnmapBuffer(r11)
            r12 = 0
            android.opengl.GLES20.glBindBuffer(r11, r12)
            goto L_0x05e4
        L_0x05db:
            r2 = 1
            r3 = 3
            r7 = 36160(0x8d40, float:5.0671E-41)
            r11 = 35051(0x88eb, float:4.9117E-41)
            r12 = 0
        L_0x05e4:
            int r13 = r13 + 1
            r1 = r30
            r2 = r26
            r7 = r27
            r11 = r28
            r10 = r29
            r3 = 0
            r12 = 36160(0x8d40, float:5.0671E-41)
            goto L_0x04af
        L_0x05f6:
            r29 = r10
            r2 = 1
            goto L_0x034d
        L_0x05fb:
            com.google.android.libraries.lens.view.h.h.a.ag r1 = r0.f73261w
            r1.mo32220b()
            goto L_0x060d
        L_0x0601:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0601 }
            throw r0
        L_0x0604:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0604 }
            throw r0
        L_0x0607:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0607 }
            throw r0
        L_0x060a:
            r29 = r10
            r12 = 0
        L_0x060d:
            long r6 = java.lang.System.nanoTime()
            com.google.android.libraries.lens.view.h.e.ah r1 = r0.f73237Z
            com.google.android.libraries.lens.view.h.e.ai r1 = r1.f72970a
            com.google.android.libraries.lens.view.h.a.c r1 = r1.f73029u
            long r6 = r6 - r4
            float r3 = (float) r6
            r4 = 1232348160(0x49742400, float:1000000.0)
            float r3 = r3 / r4
            r1.mo31932b(r3)
            com.google.android.libraries.lens.view.h.h.a.o r1 = new com.google.android.libraries.lens.view.h.h.a.o
            r3 = r29
            r1.<init>(r0, r3)
            com.google.common.base.ax r4 = r0.f73260v
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x063d
            boolean r4 = r1.mo32238a(r3)
            if (r4 != 0) goto L_0x063d
            com.google.android.libraries.lens.view.n.i r4 = r0.f73262x
            boolean r4 = r4.f75112e
            if (r4 != 0) goto L_0x063d
            goto L_0x0199
        L_0x063d:
            java.util.concurrent.Executor r4 = r0.f73251m
            r4.execute(r1)
        L_0x0642:
            com.google.common.base.ax r1 = r0.f73260v
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x0676
            if (r2 == 0) goto L_0x0668
            com.google.android.libraries.lens.view.ay.ai r1 = r0.f73230S
            boolean r1 = r1.mo30746f()
            if (r1 != 0) goto L_0x0655
            goto L_0x0668
        L_0x0655:
            boolean r1 = r0.f73234W
            if (r1 != 0) goto L_0x065c
            r0.mo32248e()
        L_0x065c:
            com.google.common.base.ax r1 = r0.f73260v
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.lens.view.av.c r1 = (com.google.android.libraries.lens.view.p2082av.C25579c) r1
            r1.mo30663c(r3)
            goto L_0x0676
        L_0x0668:
            com.google.common.base.ax r0 = r0.f73226O
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x06ad
            com.google.android.libraries.lens.view.u.a r0 = com.google.android.libraries.lens.view.p2173u.C28095a.DROPPED
            r3.mo33560c(r0)
            return
        L_0x0676:
            com.google.android.libraries.lens.view.h.h.a.b.b r1 = r0.f73253o
            r2 = r1
            com.google.android.libraries.lens.view.h.h.a.b.a r2 = (com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b.C26854a) r2
            android.opengl.EGLDisplay r2 = r2.f73167b
            android.opengl.EGLSurface r1 = r1.mo32230g()
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26847ac.m49719j(r2, r1)
            boolean r1 = r0.f73246h
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b.m49758c(r1)
            com.google.common.base.ax r1 = r0.f73260v
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x06ad
            com.google.android.libraries.lens.view.h.h.a.b.b r0 = r0.f73253o
        L_0x0693:
            r1 = r0
            com.google.android.libraries.lens.view.h.h.a.b.a r1 = (com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b.C26854a) r1
            java.util.concurrent.atomic.AtomicInteger r2 = r1.f73170e
            int r2 = r2.get()
            com.google.common.b.gu r3 = r1.f73168c
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r3 = r3.f156474d
            int r4 = r2 + 1
            int r4 = r4 % r3
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f73170e
            boolean r1 = r1.compareAndSet(r2, r4)
            if (r1 == 0) goto L_0x0693
        L_0x06ad:
            return
        L_0x06ae:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L_0x06bb
            r2.close()     // Catch:{ all -> 0x06b6 }
            goto L_0x06bb
        L_0x06b6:
            r0 = move-exception
            r2 = r0
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26839a.m49688a(r1, r2)
        L_0x06bb:
            goto L_0x06bd
        L_0x06bc:
            throw r1
        L_0x06bd:
            goto L_0x06bc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26870m.run():void");
    }
}
