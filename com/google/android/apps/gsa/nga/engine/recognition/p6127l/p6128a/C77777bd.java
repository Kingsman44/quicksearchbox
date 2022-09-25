package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67150mx;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.bd */
/* compiled from: PG */
public final /* synthetic */ class C77777bd implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77782bi f214250a;

    /* renamed from: b */
    public final /* synthetic */ C67150mx f214251b;

    /* renamed from: c */
    public final /* synthetic */ C66999hh f214252c;

    public /* synthetic */ C77777bd(C77782bi biVar, C67150mx mxVar, C66999hh hhVar) {
        this.f214250a = biVar;
        this.f214251b = mxVar;
        this.f214252c = hhVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x009e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bi r0 = r11.f214250a
            com.google.speech.j.mx r1 = r11.f214251b
            com.google.speech.j.hh r2 = r11.f214252c
            com.google.android.apps.gsa.nga.shared.v.d.hd r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82969hd.f226361e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.nga.shared.v.d.hc r3 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82968hc) r3
            int r4 = r1.f182527b
            com.google.speech.j.mz r4 = com.google.speech.p5218j.C67152mz.m97427a(r4)
            if (r4 != 0) goto L_0x0018
            com.google.speech.j.mz r4 = com.google.speech.p5218j.C67152mz.NO_ERROR
        L_0x0018:
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.gsa.nga.shared.v.d.hd r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82969hd) r5
            int r4 = r4.f182542l
            r5.f226364b = r4
            int r4 = r5.f226363a
            r6 = 1
            r4 = r4 | r6
            r5.f226363a = r4
            com.google.speech.j.hf r2 = r2.f182132d
            if (r2 != 0) goto L_0x002f
            com.google.speech.j.hf r2 = com.google.speech.p5218j.C66997hf.f182099z
        L_0x002f:
            java.lang.String r2 = r2.f182115n
            java.io.File r4 = new java.io.File
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]
            r7 = 0
            r5[r7] = r2
            java.lang.String r2 = "metadata"
            r5[r6] = r2
            java.lang.String r2 = com.google.common.util.C60790c.m92793a(r5)
            r4.<init>(r2)
            boolean r2 = r4.exists()
            r5 = -1
            if (r2 == 0) goto L_0x00b2
            boolean r2 = r4.isFile()
            if (r2 != 0) goto L_0x0052
            goto L_0x00b2
        L_0x0052:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x009f }
            r2.<init>(r4)     // Catch:{ IOException -> 0x009f }
            com.google.al.c.c.b.as r4 = com.google.p395al.p408c.p414c.p416b.C8476as.f29413p     // Catch:{ all -> 0x0083 }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (java.io.InputStream) r2)     // Catch:{ all -> 0x0083 }
            com.google.al.c.c.b.as r4 = (com.google.p395al.p408c.p414c.p416b.C8476as) r4     // Catch:{ all -> 0x0083 }
            com.google.protobuf.ch r8 = r4.f29422g     // Catch:{ all -> 0x0083 }
            int r8 = r8.size()     // Catch:{ all -> 0x0083 }
            if (r8 == 0) goto L_0x0077
            com.google.protobuf.ch r8 = r4.f29422g     // Catch:{ all -> 0x0083 }
            int r8 = r8.size()     // Catch:{ all -> 0x0083 }
            int r8 = r8 + r5
            com.google.protobuf.ch r9 = r4.f29422g     // Catch:{ all -> 0x0083 }
            int r8 = r9.mo58914d(r8)     // Catch:{ all -> 0x0083 }
            java.lang.Integer.toString(r8)     // Catch:{ all -> 0x0083 }
        L_0x0077:
            java.lang.String r8 = r4.f29417b     // Catch:{ all -> 0x0083 }
            java.lang.String r8 = r4.f29421f     // Catch:{ all -> 0x0083 }
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)     // Catch:{ all -> 0x0083 }
            r2.close()     // Catch:{ IOException -> 0x009f }
            goto L_0x00c3
        L_0x0083:
            r4 = move-exception
            r2.close()     // Catch:{ all -> 0x0088 }
            goto L_0x009e
        L_0x0088:
            r2 = move-exception
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x009e }
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            r8[r7] = r9     // Catch:{ Exception -> 0x009e }
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            java.lang.String r10 = "addSuppressed"
            java.lang.reflect.Method r8 = r9.getDeclaredMethod(r10, r8)     // Catch:{ Exception -> 0x009e }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x009e }
            r6[r7] = r2     // Catch:{ Exception -> 0x009e }
            r8.invoke(r4, r6)     // Catch:{ Exception -> 0x009e }
        L_0x009e:
            throw r4     // Catch:{ IOException -> 0x009f }
        L_0x009f:
            r2 = move-exception
            com.google.common.f.a.d r4 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77782bi.f214261a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r6 = "Failed to parse SODA metadata."
            r7 = 4462(0x116e, float:6.253E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r4).mo56382g(r2)).mo56372aa(r7)).mo56386p(r6)
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            goto L_0x00c3
        L_0x00b2:
            com.google.common.f.a.d r2 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77782bi.f214261a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r4 = "Could not locate SODA metadata file."
            r6 = 4460(0x116c, float:6.25E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r6)).mo56386p(r4)
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
        L_0x00c3:
            r0.f214270j = r4
            j$.util.Optional r2 = r0.f214270j
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bg r4 = new com.google.android.apps.gsa.nga.engine.recognition.l.a.bg
            r4.<init>(r3)
            r2.ifPresent(r4)
            com.google.android.apps.gsa.nga.shared.v.w r2 = r0.f214262b
            com.google.android.apps.gsa.nga.shared.v.d.ec r4 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.SPEECH_RECOGNITION_INITIALIZATION
            com.google.android.apps.gsa.nga.shared.v.d.ea r6 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.nga.shared.v.d.dz r6 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz) r6
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.gsa.nga.shared.v.d.hd r3 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82969hd) r3
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.gsa.nga.shared.v.d.ea r7 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea) r7
            r3.getClass()
            r7.f225980b = r3
            r3 = 39
            r7.f225979a = r3
            com.google.protobuf.bv r3 = r6.build()
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea) r3
            r2.mo75543a(r4, r3)
            int r2 = r1.f182527b
            com.google.speech.j.mz r2 = com.google.speech.p5218j.C67152mz.m97427a(r2)
            if (r2 != 0) goto L_0x0104
            com.google.speech.j.mz r2 = com.google.speech.p5218j.C67152mz.NO_ERROR
        L_0x0104:
            java.util.concurrent.atomic.AtomicReference r3 = r0.f214271k
            java.lang.Object r3 = r3.get()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x015a
            com.google.android.apps.gsa.nga.shared.v.i r2 = r0.f214264d
            int r3 = r1.f182527b
            com.google.speech.j.mz r3 = com.google.speech.p5218j.C67152mz.m97427a(r3)
            if (r3 != 0) goto L_0x011c
            com.google.speech.j.mz r3 = com.google.speech.p5218j.C67152mz.NO_ERROR
        L_0x011c:
            java.lang.String r3 = r3.name()
            if (r3 == 0) goto L_0x0152
            j$.util.Optional r4 = r0.f214270j
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bh r6 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77781bh.f214260a
            j$.util.Optional r4 = r4.map(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r4.orElse(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.apps.gsa.nga.shared.v.c.ew r5 = new com.google.android.apps.gsa.nga.shared.v.c.ew
            java.lang.String r6 = "NGA_SODA_INITIALIZATION_STATUS3"
            r5.<init>(r6, r4, r3)
            r2.mo75579d(r5)
            java.util.concurrent.atomic.AtomicReference r0 = r0.f214271k
            int r1 = r1.f182527b
            com.google.speech.j.mz r1 = com.google.speech.p5218j.C67152mz.m97427a(r1)
            if (r1 != 0) goto L_0x014e
            com.google.speech.j.mz r1 = com.google.speech.p5218j.C67152mz.NO_ERROR
        L_0x014e:
            r0.set(r1)
            return
        L_0x0152:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null status"
            r0.<init>(r1)
            throw r0
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77777bd.run():void");
    }
}
