package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import com.google.android.apps.gsa.i.a.c;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.ag */
/* compiled from: PG */
public final /* synthetic */ class C101126ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ c f282329a;

    public /* synthetic */ C101126ag(c cVar) {
        this.f282329a = cVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        throw r6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.apps.gsa.i.a.c r0 = r11.f282329a
            j$.util.Optional r12 = (p3186j$.util.Optional) r12
            boolean r1 = r12.isPresent()
            if (r1 == 0) goto L_0x0121
            java.lang.Object r12 = r12.get()
            com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerImpl r12 = (com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerImpl) r12
            com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerResult r1 = com.google.android.apps.gsa.staticplugins.fedass.p7954l.C101128ai.m167327a(r12)
        L_0x0014:
            byte[] r2 = r1.exampleBytes
            r3 = 1
            if (r2 == 0) goto L_0x0118
            int r2 = r2.length
            if (r2 == 0) goto L_0x0118
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "resumption_token"
            byte[] r5 = r1.resumptionToken
            r2.putByteArray(r4, r5)
            java.lang.String r4 = "example_bytes"
            byte[] r5 = r1.exampleBytes
            r2.putByteArray(r4, r5)
            r4 = 0
            org.tensorflow.a.t r5 = org.tensorflow.p5650a.C72660t.f193233b     // Catch:{ ct -> 0x004b }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ ct -> 0x004b }
            org.tensorflow.a.s r5 = (org.tensorflow.p5650a.C72659s) r5     // Catch:{ ct -> 0x004b }
            byte[] r1 = r1.exampleBytes     // Catch:{ ct -> 0x004b }
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x004b }
            com.google.protobuf.b r1 = r5.mergeFrom((byte[]) r1, (com.google.protobuf.C62921ba) r6)     // Catch:{ ct -> 0x004b }
            org.tensorflow.a.s r1 = (org.tensorflow.p5650a.C72659s) r1     // Catch:{ ct -> 0x004b }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ ct -> 0x004b }
            org.tensorflow.a.t r1 = (org.tensorflow.p5650a.C72660t) r1     // Catch:{ ct -> 0x004b }
            goto L_0x005a
        L_0x004b:
            r1 = move-exception
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.fedass.p7954l.C101120aa.f282316a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r6 = "Failed to parse sequence example."
            r7 = 19828(0x4d74, float:2.7785E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r1)).mo56372aa(r7)).mo56386p(r6)
            r1 = r4
        L_0x005a:
            r5 = 0
            java.lang.String r6 = com.google.android.apps.gsa.staticplugins.fedass.p7954l.C101120aa.m167322a(r1)     // Catch:{ RuntimeException -> 0x00a2 }
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ RuntimeException -> 0x00a2 }
            java.nio.file.Path r6 = java.nio.file.Paths.get(r6, r7)     // Catch:{ RuntimeException -> 0x00a2 }
            java.nio.file.Path r6 = r6.getFileName()     // Catch:{ RuntimeException -> 0x00a2 }
            java.lang.String r6 = r6.toString()     // Catch:{ RuntimeException -> 0x00a2 }
            java.lang.String r7 = ".ogg"
            com.google.common.base.cf r7 = com.google.common.base.C58869cf.m90938d(r7)     // Catch:{ RuntimeException -> 0x00a2 }
            java.util.List r6 = r7.mo56155i(r6)     // Catch:{ RuntimeException -> 0x00a2 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ RuntimeException -> 0x00a2 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ RuntimeException -> 0x00a2 }
            com.google.common.base.m r7 = new com.google.common.base.m     // Catch:{ RuntimeException -> 0x00a2 }
            r8 = 45
            r7.<init>(r8)     // Catch:{ RuntimeException -> 0x00a2 }
            com.google.common.base.cf r7 = com.google.common.base.C58869cf.m90936b(r7)     // Catch:{ RuntimeException -> 0x00a2 }
            java.util.List r6 = r7.mo56155i(r6)     // Catch:{ RuntimeException -> 0x00a2 }
            java.lang.Object r7 = r6.get(r5)     // Catch:{ RuntimeException -> 0x00a2 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ RuntimeException -> 0x00a2 }
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ RuntimeException -> 0x00a2 }
            java.lang.Object r6 = r6.get(r3)     // Catch:{ RuntimeException -> 0x00a2 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ RuntimeException -> 0x00a2 }
            long r9 = java.lang.Long.parseLong(r6)     // Catch:{ RuntimeException -> 0x00a2 }
            long r7 = r7 + r9
            goto L_0x00b2
        L_0x00a2:
            r6 = move-exception
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.fedass.p7954l.C101120aa.f282316a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r8 = "Failed to get the timestamp of the example."
            r9 = 19827(0x4d73, float:2.7784E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r6)).mo56372aa(r9)).mo56386p(r8)
            r7 = 0
        L_0x00b2:
            java.lang.String r6 = "example_timestamp"
            r2.putLong(r6, r7)
            java.lang.String r1 = com.google.android.apps.gsa.staticplugins.fedass.p7954l.C101120aa.m167322a(r1)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 != 0) goto L_0x0102
            java.io.File r6 = new java.io.File
            r6.<init>(r1)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00f4 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x00f4 }
            com.google.protobuf.z r6 = com.google.protobuf.C63088z.m96144F(r1)     // Catch:{ all -> 0x00d8 }
            byte[] r3 = r6.mo59174N()     // Catch:{ all -> 0x00d8 }
            r1.close()     // Catch:{ IOException -> 0x00f4 }
            r4 = r3
            goto L_0x0102
        L_0x00d8:
            r6 = move-exception
            r1.close()     // Catch:{ all -> 0x00dd }
            goto L_0x00f3
        L_0x00dd:
            r1 = move-exception
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00f3 }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r5] = r8     // Catch:{ Exception -> 0x00f3 }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            java.lang.String r9 = "addSuppressed"
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r9, r7)     // Catch:{ Exception -> 0x00f3 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00f3 }
            r3[r5] = r1     // Catch:{ Exception -> 0x00f3 }
            r7.invoke(r6, r3)     // Catch:{ Exception -> 0x00f3 }
        L_0x00f3:
            throw r6     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            r1 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.fedass.p7954l.C101120aa.f282316a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r5 = "Failed to read the audio file."
            r6 = 19829(0x4d75, float:2.7786E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r1)).mo56372aa(r6)).mo56386p(r5)
        L_0x0102:
            java.lang.String r1 = "audio_data"
            r2.putByteArray(r1, r4)
            android.os.Parcel r1 = r0.mo17260gA()
            com.google.android.p445a.C8850c.m23497f(r1, r2)
            r2 = 4
            r0.mo17263hf(r2, r1)
            com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerResult r1 = com.google.android.apps.gsa.staticplugins.fedass.p7954l.C101128ai.m167327a(r12)
            goto L_0x0014
        L_0x0118:
            r12.close()
            java.lang.String r12 = ""
            r0.f(r3, r12)
            goto L_0x012e
        L_0x0121:
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.fedass.p7954l.C101128ai.f282331a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r0 = "optionalMaterializer is not present; cannot runMaterializer"
            r1 = 19831(0x4d77, float:2.7789E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
        L_0x012e:
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60866ct.f164955a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.fedass.p7954l.C101126ag.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
