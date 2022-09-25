package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.r */
/* compiled from: PG */
public final /* synthetic */ class C94331r implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C94170an f263608a;

    public /* synthetic */ C94331r(C94170an anVar) {
        this.f263608a = anVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0167, code lost:
        if (r5 > r6) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0258  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17870a(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r0.f263608a
            r2 = r24
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2
            if (r2 != 0) goto L_0x0023
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "byteArrayOutputStream is null! "
            r4 = 14212(0x3784, float:1.9915E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.gsa.staticplugins.avocado.ak r1 = r1.f263084aj
            com.google.android.apps.gsa.staticplugins.avocado.fa r2 = com.google.android.apps.gsa.staticplugins.avocado.C94303fa.TRANSFORM_IMAGE_FAILED
            com.google.android.apps.gsa.staticplugins.avocado.n r2 = com.google.android.apps.gsa.staticplugins.avocado.AvocadoUtils.m155379c(r2)
            r1.mo88359a(r2)
            return
        L_0x0023:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Transformed successfully"
            r5 = 14198(0x3776, float:1.9896E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 14200(0x3778, float:1.9898E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            int r4 = r1.f263112u
            int r5 = r1.f263050B
            java.lang.String r6 = "Start to send: %d of %d,"
            r3.mo56393w(r6, r4, r5)
            int r3 = r1.f263116y
            int r4 = r1.f263076ab
            int r5 = r4 + -1
            int r6 = r1.f263115x
            int r5 = r5 * r6
            int r10 = r3 + r5
            com.google.android.apps.gsa.staticplugins.avocado.dh r3 = r1.f263103l
            java.lang.String r9 = r1.f263098g
            int r5 = r1.f263114w
            java.lang.String r13 = "should not happen: pose index is %d , out of range [0, 4]"
            java.lang.String r14 = "should not happen: pose index is %d , out of range [0, 2]"
            r15 = 5
            r12 = 4
            r11 = 3
            r8 = 2
            r7 = 1
            if (r4 != r15) goto L_0x0080
            if (r5 == 0) goto L_0x0097
            if (r5 == r7) goto L_0x0095
            if (r5 == r8) goto L_0x007e
            if (r5 == r11) goto L_0x0093
            if (r5 == r12) goto L_0x007c
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.avocado.AvocadoUtils.f263017a
            com.google.common.f.x r4 = r4.mo56225c()
            r6 = 14377(0x3829, float:2.0146E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56387q(r13, r5)
            goto L_0x0091
        L_0x007c:
            r4 = 6
            goto L_0x0098
        L_0x007e:
            r4 = 5
            goto L_0x0098
        L_0x0080:
            if (r5 == 0) goto L_0x0097
            if (r5 == r7) goto L_0x0095
            if (r5 == r8) goto L_0x0093
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.avocado.AvocadoUtils.f263017a
            com.google.common.f.x r4 = r4.mo56225c()
            r6 = 14378(0x382a, float:2.0148E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56387q(r14, r5)
        L_0x0091:
            r4 = 1
            goto L_0x0098
        L_0x0093:
            r4 = 4
            goto L_0x0098
        L_0x0095:
            r4 = 3
            goto L_0x0098
        L_0x0097:
            r4 = 2
        L_0x0098:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.avocado.C94256dh.f263378a
            com.google.common.f.x r5 = r5.mo56224b()
            java.lang.String r6 = "Actually send."
            r7 = 14336(0x3800, float:2.0089E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            com.google.android.apps.gsa.opaonboarding.b r5 = r3.f263396k
            com.google.common.base.ax r5 = r5.mo77278a()
            java.lang.Object r5 = r5.mo56107c()
            android.accounts.Account r5 = (android.accounts.Account) r5
            if (r5 != 0) goto L_0x00d3
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94256dh.f263378a
            com.google.common.f.x r2 = r2.mo56225c()
            r4 = 14337(0x3801, float:2.009E-41)
            java.lang.String r5 = "No Account present!"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r5)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r5)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92899h(r2)
            com.google.android.apps.gsa.staticplugins.avocado.bf r3 = r3.f263399n
            r3.mo88401c(r2)
            r5 = r2
            r0 = 2
            r2 = 3
            r4 = 4
            goto L_0x011d
        L_0x00d3:
            byte[] r2 = r2.toByteArray()
            com.google.android.libraries.gsa.k.g r7 = r3.f263392g
            com.google.android.apps.gsa.staticplugins.avocado.cy r6 = new com.google.android.apps.gsa.staticplugins.avocado.cy
            r16 = r6
            r15 = r7
            r7 = r3
            r0 = 2
            r8 = r2
            r2 = 3
            r11 = r4
            r4 = 4
            r12 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5 = 2000(0x7d0, double:9.88E-321)
            j$.time.Duration r5 = p3186j$.time.Duration.ofMillis(r5)
            com.google.android.apps.gsa.search.core.i.t r6 = r3.f263389d
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249980bq
            long r6 = r6.mo79743a(r7)
            com.google.android.apps.gsa.search.core.i.t r8 = r3.f263389d
            com.google.android.apps.gsa.shared.m.f r9 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249979bp
            long r8 = r8.mo79743a(r9)
            long r18 = com.google.common.p4543n.p4546c.C59407o.m92308d(r5)
            com.google.common.n.c.i r5 = new com.google.common.n.c.i
            int r7 = (int) r6
            double r6 = (double) r7
            int r9 = (int) r8
            r17 = r5
            r20 = r6
            r22 = r9
            r17.<init>(r18, r20, r22)
            java.lang.String r6 = "Send image with retry"
            r7 = r16
            com.google.common.util.concurrent.cx r5 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148469c(r15, r6, r7, r5)
            com.google.android.apps.gsa.staticplugins.avocado.bf r3 = r3.f263399n
            r3.mo88401c(r5)
        L_0x011d:
            com.google.android.apps.gsa.staticplugins.avocado.ac r3 = new com.google.android.apps.gsa.staticplugins.avocado.ac
            r3.<init>(r1)
            com.google.common.util.concurrent.bg r6 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r5, r3, r6)
            java.lang.Integer r3 = r1.f263111t
            int r3 = r3.intValue()
            r5 = 1
            int r3 = r3 + r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.f263111t = r3
            int r3 = r1.f263112u
            int r3 = r3 + r5
            r1.f263112u = r3
            int r3 = r1.f263114w
            java.lang.Integer r5 = r1.f263111t
            int r5 = r5.intValue()
            int r6 = r1.f263115x
            int r7 = r1.f263116y
            r8 = 0
            if (r3 != 0) goto L_0x014d
            if (r5 < r7) goto L_0x014c
            goto L_0x0153
        L_0x014c:
            r3 = 0
        L_0x014d:
            if (r3 <= 0) goto L_0x028f
            if (r5 >= r6) goto L_0x0153
            goto L_0x028f
        L_0x0153:
            int r3 = r1.f263114w
            java.lang.Integer r5 = r1.f263111t
            int r5 = r5.intValue()
            int r6 = r1.f263115x
            int r7 = r1.f263116y
            if (r3 != 0) goto L_0x0165
            if (r5 <= r7) goto L_0x0164
            goto L_0x0169
        L_0x0164:
            r3 = 0
        L_0x0165:
            if (r3 <= 0) goto L_0x019e
            if (r5 <= r6) goto L_0x019e
        L_0x0169:
            dagger.a r3 = r1.f263102k
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r3 = (com.google.android.apps.gsa.shared.logger.C89911f) r3
            r5 = 111907052(0x6ab90ec, float:6.4535994E-35)
            r6 = 29
            r7 = 0
            com.google.android.apps.gsa.shared.logger.e r3 = r3.mo83755a(r7, r5, r6)
            r3.mo83721a()
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r5 = 14206(0x377e, float:1.9907E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.Integer r5 = r1.f263111t
            int r6 = r1.f263114w
            if (r6 <= 0) goto L_0x0197
            int r6 = r1.f263115x
            goto L_0x0199
        L_0x0197:
            int r6 = r1.f263116y
        L_0x0199:
            java.lang.String r7 = "should never happen: numberOfPicturesTaken %d > numberOfPicturesNeeded %d "
            r3.mo56352E(r7, r5, r6)
        L_0x019e:
            int r3 = r1.f263076ab
            int r5 = r1.f263114w
            dagger.a r6 = r1.f263106o
            r7 = 5
            if (r3 != r7) goto L_0x01cf
            if (r5 == 0) goto L_0x01cc
            r3 = 1
            if (r5 == r3) goto L_0x01c9
            if (r5 == r0) goto L_0x01c6
            if (r5 == r2) goto L_0x01c3
            if (r5 == r4) goto L_0x01c0
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.avocado.AvocadoUtils.f263017a
            com.google.common.f.x r0 = r0.mo56225c()
            r2 = 14375(0x3827, float:2.0144E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56387q(r13, r5)
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.UNKNOWN_EVENT
            goto L_0x01ec
        L_0x01c0:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_RECORD_FACE_DOWN_POSE_SUCCESS
            goto L_0x01ec
        L_0x01c3:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_RECORD_FACE_RIGHT_POSE_SUCCESS
            goto L_0x01ec
        L_0x01c6:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_RECORD_FACE_UP_POSE_SUCCESS
            goto L_0x01ec
        L_0x01c9:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_RECORD_FACE_LEFT_POSE_SUCCESS
            goto L_0x01ec
        L_0x01cc:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_RECORD_FACE_FRONT_POSE_SUCCESS
            goto L_0x01ec
        L_0x01cf:
            if (r5 == 0) goto L_0x01ea
            r2 = 1
            if (r5 == r2) goto L_0x01e7
            if (r5 == r0) goto L_0x01e4
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.avocado.AvocadoUtils.f263017a
            com.google.common.f.x r0 = r0.mo56225c()
            r2 = 14376(0x3828, float:2.0145E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56387q(r14, r5)
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.UNKNOWN_EVENT
            goto L_0x01ec
        L_0x01e4:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_RECORD_FACE_RIGHT_POSE_SUCCESS
            goto L_0x01ec
        L_0x01e7:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_RECORD_FACE_LEFT_POSE_SUCCESS
            goto L_0x01ec
        L_0x01ea:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_RECORD_FACE_FRONT_POSE_SUCCESS
        L_0x01ec:
            java.lang.Object r2 = r6.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r2 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r2
            r2.mo83702b(r0)
            int r0 = r1.f263114w
            r2 = 1
            int r0 = r0 + r2
            r1.f263114w = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.f263111t = r0
            com.google.android.apps.gsa.staticplugins.avocado.AvocadoLottieAnimationView r0 = r1.f263070V
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0219
            com.google.android.apps.gsa.staticplugins.avocado.ak r0 = r1.f263084aj
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r0.f263044a
            com.google.android.libraries.gsa.k.g r2 = r2.f263100i
            com.google.android.apps.gsa.staticplugins.avocado.af r3 = new com.google.android.apps.gsa.staticplugins.avocado.af
            r3.<init>(r0)
            java.lang.String r0 = "Remove loading animation"
            r2.mo28212l(r0, r3)
        L_0x0219:
            int r0 = r1.f263114w
            int r2 = r1.f263076ab
            if (r0 != r2) goto L_0x0258
            android.os.Vibrator r0 = r1.mo88362e()
            android.os.VibrationEffect r2 = r1.f263079ae
            com.google.android.apps.gsa.staticplugins.avocado.AvocadoUtils.m155383g(r0, r2)
            com.google.android.apps.gsa.staticplugins.avocado.dh r0 = r1.f263103l
            r2 = 1
            r0.mo88413h(r2)
            com.google.android.apps.gsa.staticplugins.avocado.ak r0 = r1.f263084aj
            com.google.android.apps.gsa.staticplugins.avocado.an r3 = r0.f263044a
            com.google.android.libraries.gsa.k.g r3 = r3.f263100i
            com.google.android.apps.gsa.staticplugins.avocado.ah r4 = new com.google.android.apps.gsa.staticplugins.avocado.ah
            r4.<init>(r0)
            java.lang.String r0 = "UI clean up"
            r3.mo28212l(r0, r4)
            r1.f263113v = r2
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r2 = 14205(0x377d, float:1.9905E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r2 = "Process and send total %d "
            int r1 = r1.f263112u
            r0.mo56387q(r2, r1)
            return
        L_0x0258:
            r2 = 1
            android.os.Vibrator r0 = r1.mo88362e()
            android.os.VibrationEffect r3 = r1.f263078ad
            com.google.android.apps.gsa.staticplugins.avocado.AvocadoUtils.m155383g(r0, r3)
            com.google.android.apps.gsa.staticplugins.avocado.dh r0 = r1.f263103l
            r0.mo88413h(r8)
            com.google.android.apps.gsa.staticplugins.avocado.ak r0 = r1.f263084aj
            java.lang.String[] r3 = r1.f263056H
            int r4 = r1.f263114w
            r3 = r3[r4]
            r0.mo88360b(r3)
            com.google.android.apps.gsa.staticplugins.avocado.ak r0 = r1.f263084aj
            int r3 = r1.f263114w
            if (r3 <= 0) goto L_0x027a
            r7 = 1
            goto L_0x027b
        L_0x027a:
            r7 = 0
        L_0x027b:
            com.google.common.base.C58838bb.m90868c(r7)
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r0.f263044a
            com.google.android.libraries.gsa.k.g r2 = r2.f263100i
            com.google.android.apps.gsa.staticplugins.avocado.ad r4 = new com.google.android.apps.gsa.staticplugins.avocado.ad
            r4.<init>(r0, r3)
            java.lang.String r0 = "Play the correct frames of the animation"
            r2.mo28212l(r0, r4)
            r1.mo88367l()
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.avocado.C94331r.mo17870a(java.lang.Object):void");
    }
}
