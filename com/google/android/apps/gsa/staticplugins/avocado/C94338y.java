package com.google.android.apps.gsa.staticplugins.avocado;

import android.media.ImageReader;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.y */
/* compiled from: PG */
final class C94338y implements ImageReader.OnImageAvailableListener {

    /* renamed from: a */
    final /* synthetic */ C94170an f263616a;

    public C94338y(C94170an anVar) {
        this.f263616a = anVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onImageAvailable(android.media.ImageReader r7) {
        /*
            r6 = this;
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b
            com.google.android.apps.gsa.staticplugins.avocado.an r0 = r6.f263616a
            java.lang.Object r0 = r0.f263094c
            monitor-enter(r0)
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r6.f263616a     // Catch:{ all -> 0x019d }
            int r2 = r1.f263063O     // Catch:{ all -> 0x019d }
            r3 = 1
            int r2 = r2 + r3
            r1.f263063O = r2     // Catch:{ all -> 0x019d }
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x019d }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            r2 = 14119(0x3727, float:1.9785E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            java.lang.String r2 = "num of available: %d"
            com.google.android.apps.gsa.staticplugins.avocado.an r4 = r6.f263616a     // Catch:{ all -> 0x019d }
            int r4 = r4.f263063O     // Catch:{ all -> 0x019d }
            r1.mo56387q(r2, r4)     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r6.f263616a     // Catch:{ all -> 0x019d }
            int r2 = r1.f263063O     // Catch:{ all -> 0x019d }
            int r4 = r1.f263117z     // Catch:{ all -> 0x019d }
            if (r2 > r4) goto L_0x0099
            java.lang.Integer r1 = r1.f263049A     // Catch:{ all -> 0x019d }
            if (r1 == 0) goto L_0x0077
            int r1 = r1.intValue()     // Catch:{ all -> 0x019d }
            r2 = 2
            if (r1 == r2) goto L_0x005b
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x019d }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            r2 = 14128(0x3730, float:1.9798E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            java.lang.String r2 = "Error waiting for converged %d, max %d,"
            com.google.android.apps.gsa.staticplugins.avocado.an r3 = r6.f263616a     // Catch:{ all -> 0x019d }
            int r4 = r3.f263063O     // Catch:{ all -> 0x019d }
            int r3 = r3.f263117z     // Catch:{ all -> 0x019d }
            r1.mo56393w(r2, r4, r3)     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.staticplugins.avocado.C94170an.m155416k(r7)     // Catch:{ all -> 0x019d }
            monitor-exit(r0)     // Catch:{ all -> 0x019d }
            return
        L_0x005b:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x019d }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            r2 = 14127(0x372f, float:1.9796E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            java.lang.String r2 = "Converged! %d, %d"
            com.google.android.apps.gsa.staticplugins.avocado.an r4 = r6.f263616a     // Catch:{ all -> 0x019d }
            int r5 = r4.f263063O     // Catch:{ all -> 0x019d }
            int r4 = r4.f263117z     // Catch:{ all -> 0x019d }
            r1.mo56393w(r2, r5, r4)     // Catch:{ all -> 0x019d }
            goto L_0x0099
        L_0x0077:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x019d }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            r2 = 14126(0x372e, float:1.9795E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            java.lang.String r2 = "AE not supported: %b"
            com.google.android.apps.gsa.staticplugins.avocado.an r3 = r6.f263616a     // Catch:{ all -> 0x019d }
            boolean r3 = r3.f263064P     // Catch:{ all -> 0x019d }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x019d }
            r1.mo56389s(r2, r3)     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.staticplugins.avocado.C94170an.m155416k(r7)     // Catch:{ all -> 0x019d }
            monitor-exit(r0)     // Catch:{ all -> 0x019d }
            return
        L_0x0099:
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r6.f263616a     // Catch:{ all -> 0x019d }
            boolean r2 = r1.f263067S     // Catch:{ all -> 0x019d }
            if (r2 != 0) goto L_0x00c3
            boolean r1 = r1.f263065Q     // Catch:{ all -> 0x019d }
            if (r1 != 0) goto L_0x00a8
            com.google.android.apps.gsa.staticplugins.avocado.C94170an.m155416k(r7)     // Catch:{ all -> 0x019d }
            monitor-exit(r0)     // Catch:{ all -> 0x019d }
            return
        L_0x00a8:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x019d }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            r2 = 14125(0x372d, float:1.9793E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            java.lang.String r2 = "#shouldStart"
            r1.mo56386p(r2)     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r6.f263616a     // Catch:{ all -> 0x019d }
            r1.f263067S = r3     // Catch:{ all -> 0x019d }
            r1.f263066R = r3     // Catch:{ all -> 0x019d }
        L_0x00c3:
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r6.f263616a     // Catch:{ all -> 0x019d }
            boolean r2 = r1.f263113v     // Catch:{ all -> 0x019d }
            if (r2 == 0) goto L_0x00e3
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x019d }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            r2 = 14124(0x372c, float:1.9792E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            java.lang.String r2 = "Enough!"
            r1.mo56386p(r2)     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.staticplugins.avocado.C94170an.m155416k(r7)     // Catch:{ all -> 0x019d }
            monitor-exit(r0)     // Catch:{ all -> 0x019d }
            return
        L_0x00e3:
            java.lang.Boolean r1 = r1.f263054F     // Catch:{ all -> 0x019d }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x019d }
            if (r1 == 0) goto L_0x0105
            com.google.android.apps.gsa.staticplugins.avocado.C94170an.m155416k(r7)     // Catch:{ all -> 0x019d }
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x019d }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ all -> 0x019d }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x019d }
            r1 = 14123(0x372b, float:1.979E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r1)     // Catch:{ all -> 0x019d }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x019d }
            java.lang.String r1 = "isInProcess return!"
            r7.mo56386p(r1)     // Catch:{ all -> 0x019d }
            monitor-exit(r0)     // Catch:{ all -> 0x019d }
            return
        L_0x0105:
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r6.f263616a     // Catch:{ all -> 0x019d }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x019d }
            r1.f263054F = r2     // Catch:{ all -> 0x019d }
            android.media.Image r1 = r7.acquireLatestImage()     // Catch:{ Exception -> 0x0179 }
            if (r1 == 0) goto L_0x0158
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r6.f263616a     // Catch:{ Exception -> 0x0177 }
            com.google.android.libraries.gcoreclient.aa.a.b r2 = r2.f263083ai     // Catch:{ Exception -> 0x0177 }
            com.google.android.gms.vision.face.d r2 = r2.f59887a     // Catch:{ Exception -> 0x0177 }
            com.google.android.gms.vision.face.internal.client.b r2 = r2.f395181c     // Catch:{ Exception -> 0x0177 }
            boolean r2 = r2.mo122884c()     // Catch:{ Exception -> 0x0177 }
            if (r2 != 0) goto L_0x0148
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ Exception -> 0x0177 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ Exception -> 0x0177 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ Exception -> 0x0177 }
            r3 = 14122(0x372a, float:1.9789E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ Exception -> 0x0177 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ Exception -> 0x0177 }
            java.lang.String r3 = "Not operational!"
            r2.mo56386p(r3)     // Catch:{ Exception -> 0x0177 }
            com.google.android.apps.gsa.staticplugins.avocado.C94170an.m155416k(r7)     // Catch:{ Exception -> 0x0177 }
            com.google.android.apps.gsa.staticplugins.avocado.an r7 = r6.f263616a     // Catch:{ Exception -> 0x0177 }
            com.google.android.apps.gsa.staticplugins.avocado.ak r7 = r7.f263084aj     // Catch:{ Exception -> 0x0177 }
            com.google.android.apps.gsa.staticplugins.avocado.fa r2 = com.google.android.apps.gsa.staticplugins.avocado.C94303fa.DETECTOR_NOT_OPERATIONAL     // Catch:{ Exception -> 0x0177 }
            com.google.android.apps.gsa.staticplugins.avocado.n r2 = com.google.android.apps.gsa.staticplugins.avocado.AvocadoUtils.m155379c(r2)     // Catch:{ Exception -> 0x0177 }
            r7.mo88359a(r2)     // Catch:{ Exception -> 0x0177 }
            monitor-exit(r0)     // Catch:{ all -> 0x019d }
            return
        L_0x0148:
            com.google.android.apps.gsa.staticplugins.avocado.an r7 = r6.f263616a     // Catch:{ Exception -> 0x0177 }
            android.os.Handler r2 = r7.f263062N     // Catch:{ Exception -> 0x0177 }
            r2.getClass()
            com.google.android.apps.gsa.staticplugins.avocado.am r3 = new com.google.android.apps.gsa.staticplugins.avocado.am     // Catch:{ Exception -> 0x0177 }
            r3.<init>(r7, r1)     // Catch:{ Exception -> 0x0177 }
            r2.post(r3)     // Catch:{ Exception -> 0x0177 }
            goto L_0x019b
        L_0x0158:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ Exception -> 0x0177 }
            com.google.common.f.x r7 = r7.mo56225c()     // Catch:{ Exception -> 0x0177 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ Exception -> 0x0177 }
            r2 = 14120(0x3728, float:1.9786E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r2)     // Catch:{ Exception -> 0x0177 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ Exception -> 0x0177 }
            java.lang.String r2 = "Image is null!!!!"
            r7.mo56386p(r2)     // Catch:{ Exception -> 0x0177 }
            com.google.android.apps.gsa.staticplugins.avocado.an r7 = r6.f263616a     // Catch:{ Exception -> 0x0177 }
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0177 }
            r7.f263054F = r2     // Catch:{ Exception -> 0x0177 }
            goto L_0x019b
        L_0x0177:
            r7 = move-exception
            goto L_0x017b
        L_0x0179:
            r7 = move-exception
            r1 = 0
        L_0x017b:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x019d }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x019d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x019d }
            com.google.common.f.x r7 = r2.mo56382g(r7)     // Catch:{ all -> 0x019d }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x019d }
            r2 = 14121(0x3729, float:1.9788E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r2)     // Catch:{ all -> 0x019d }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x019d }
            java.lang.String r2 = "exception try to close!"
            r7.mo56386p(r2)     // Catch:{ all -> 0x019d }
            if (r1 == 0) goto L_0x019b
            r1.close()     // Catch:{ all -> 0x019d }
        L_0x019b:
            monitor-exit(r0)     // Catch:{ all -> 0x019d }
            return
        L_0x019d:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x019d }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.avocado.C94338y.onImageAvailable(android.media.ImageReader):void");
    }
}
