package com.google.android.libraries.assistant.soda.speakerid;

/* renamed from: com.google.android.libraries.assistant.soda.speakerid.d */
/* compiled from: PG */
public final /* synthetic */ class C19377d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SodaEnrollmentManagerImpl f54218a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f54219b;

    public /* synthetic */ C19377d(SodaEnrollmentManagerImpl sodaEnrollmentManagerImpl, byte[] bArr) {
        this.f54218a = sodaEnrollmentManagerImpl;
        this.f54219b = bArr;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.libraries.assistant.soda.speakerid.SodaEnrollmentManagerImpl r0 = r8.f54218a
            byte[] r1 = r8.f54219b
            com.google.speech.j.bk r2 = com.google.speech.p5218j.C66833bk.f181738c     // Catch:{ ct -> 0x00cd }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ ct -> 0x00cd }
            com.google.speech.j.bj r2 = (com.google.speech.p5218j.C66832bj) r2     // Catch:{ ct -> 0x00cd }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00cd }
            com.google.protobuf.b r1 = r2.mergeFrom((byte[]) r1, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x00cd }
            com.google.speech.j.bj r1 = (com.google.speech.p5218j.C66832bj) r1     // Catch:{ ct -> 0x00cd }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ ct -> 0x00cd }
            com.google.speech.j.bk r1 = (com.google.speech.p5218j.C66833bk) r1     // Catch:{ ct -> 0x00cd }
            int r2 = r1.f181740a     // Catch:{ ct -> 0x00cd }
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r5) goto L_0x002f
            if (r2 == r4) goto L_0x002d
            if (r2 == r3) goto L_0x002b
            r6 = 0
            goto L_0x0032
        L_0x002b:
            r6 = 3
            goto L_0x0032
        L_0x002d:
            r6 = 2
            goto L_0x0032
        L_0x002f:
            r6 = 1
            goto L_0x0032
        L_0x0031:
            r6 = 4
        L_0x0032:
            int r7 = r6 + -1
            if (r6 == 0) goto L_0x00cb
            if (r7 == 0) goto L_0x008f
            if (r7 == r5) goto L_0x0070
            if (r7 == r4) goto L_0x0053
            com.google.common.f.e r0 = com.google.android.libraries.assistant.soda.speakerid.SodaEnrollmentManagerImpl.f54184a     // Catch:{ ct -> 0x00cd }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ ct -> 0x00cd }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x00cd }
            r1 = 47793(0xbab1, float:6.6972E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ ct -> 0x00cd }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x00cd }
            java.lang.String r1 = "Unknown VoiceMatchManagementUpdate."
            r0.mo56386p(r1)     // Catch:{ ct -> 0x00cd }
            return
        L_0x0053:
            if (r2 != r3) goto L_0x005a
            java.lang.Object r1 = r1.f181741b     // Catch:{ ct -> 0x00cd }
            com.google.speech.j.eg r1 = (com.google.speech.p5218j.C66917eg) r1     // Catch:{ ct -> 0x00cd }
            goto L_0x005c
        L_0x005a:
            com.google.speech.j.eg r1 = com.google.speech.p5218j.C66917eg.f181904d     // Catch:{ ct -> 0x00cd }
        L_0x005c:
            com.google.common.base.ax r2 = r0.f54185b     // Catch:{ ct -> 0x00cd }
            boolean r2 = r2.mo56113h()     // Catch:{ ct -> 0x00cd }
            if (r2 == 0) goto L_0x00bb
            com.google.common.base.ax r0 = r0.f54185b     // Catch:{ ct -> 0x00cd }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ ct -> 0x00cd }
            com.google.android.libraries.assistant.soda.d.k r0 = (com.google.android.libraries.assistant.soda.p1605d.C19273k) r0     // Catch:{ ct -> 0x00cd }
            r0.mo24436a(r1)     // Catch:{ ct -> 0x00cd }
            return
        L_0x0070:
            if (r2 != r4) goto L_0x0077
            java.lang.Object r1 = r1.f181741b     // Catch:{ ct -> 0x00cd }
            com.google.speech.j.bm r1 = (com.google.speech.p5218j.C66835bm) r1     // Catch:{ ct -> 0x00cd }
            goto L_0x0079
        L_0x0077:
            com.google.speech.j.bm r1 = com.google.speech.p5218j.C66835bm.f181742c     // Catch:{ ct -> 0x00cd }
        L_0x0079:
            java.lang.Object r2 = r0.f54190g     // Catch:{ ct -> 0x00cd }
            monitor-enter(r2)     // Catch:{ ct -> 0x00cd }
            com.google.speech.j.me r3 = r1.f181744a     // Catch:{ all -> 0x008c }
            if (r3 != 0) goto L_0x0082
            com.google.speech.j.me r3 = com.google.speech.p5218j.C67131me.f182477b     // Catch:{ all -> 0x008c }
        L_0x0082:
            r0.f54192i = r3     // Catch:{ all -> 0x008c }
            com.google.speech.j.mi r0 = r1.f181745b     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x008a
            com.google.speech.j.mi r0 = com.google.speech.p5218j.C67135mi.f182484c     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            return
        L_0x008c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            throw r0     // Catch:{ ct -> 0x00cd }
        L_0x008f:
            if (r2 != r5) goto L_0x0096
            java.lang.Object r1 = r1.f181741b     // Catch:{ ct -> 0x00cd }
            com.google.speech.j.bi r1 = (com.google.speech.p5218j.C66831bi) r1     // Catch:{ ct -> 0x00cd }
            goto L_0x0098
        L_0x0096:
            com.google.speech.j.bi r1 = com.google.speech.p5218j.C66831bi.f181733c     // Catch:{ ct -> 0x00cd }
        L_0x0098:
            com.google.speech.j.aw r2 = r1.f181735a     // Catch:{ ct -> 0x00cd }
            if (r2 != 0) goto L_0x009e
            com.google.speech.j.aw r2 = com.google.speech.p5218j.C66782aw.f181618c     // Catch:{ ct -> 0x00cd }
        L_0x009e:
            java.lang.String r2 = r2.f181621b     // Catch:{ ct -> 0x00cd }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ ct -> 0x00cd }
            if (r3 != 0) goto L_0x00bc
            java.util.Map r3 = r0.f54186c     // Catch:{ ct -> 0x00cd }
            boolean r3 = r3.containsKey(r2)     // Catch:{ ct -> 0x00cd }
            if (r3 == 0) goto L_0x00bc
            java.util.Map r0 = r0.f54186c     // Catch:{ ct -> 0x00cd }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ ct -> 0x00cd }
            androidx.d.a.c r0 = (androidx.p104d.p105a.C2164c) r0     // Catch:{ ct -> 0x00cd }
            if (r0 == 0) goto L_0x00bb
            r0.mo5437b(r1)     // Catch:{ ct -> 0x00cd }
        L_0x00bb:
            return
        L_0x00bc:
            com.google.common.f.e r0 = com.google.android.libraries.assistant.soda.speakerid.SodaEnrollmentManagerImpl.f54184a     // Catch:{ ct -> 0x00cd }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ ct -> 0x00cd }
            java.lang.String r1 = "Request ID not found: %s"
            r3 = 47792(0xbab0, float:6.6971E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r1, r2)     // Catch:{ ct -> 0x00cd }
            return
        L_0x00cb:
            r0 = 0
            throw r0     // Catch:{ ct -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.libraries.assistant.soda.speakerid.SodaEnrollmentManagerImpl.f54184a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Unable to parse VoiceMatchManagementUpdate."
            r3 = 47794(0xbab2, float:6.6974E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.soda.speakerid.C19377d.run():void");
    }
}
