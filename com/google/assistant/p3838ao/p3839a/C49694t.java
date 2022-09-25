package com.google.assistant.p3838ao.p3839a;

import java.util.concurrent.Callable;

/* renamed from: com.google.assistant.ao.a.t */
/* compiled from: PG */
public final /* synthetic */ class C49694t implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C49429af f128271a;

    public /* synthetic */ C49694t(C49429af afVar) {
        this.f128271a = afVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r9 = this;
            com.google.assistant.ao.a.af r0 = r9.f128271a
            com.google.assistant.ao.a.g r1 = r0.f127680g
            r2 = 0
            android.content.Context r1 = r1.f128137b     // Catch:{ IOException -> 0x0045 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ IOException -> 0x0045 }
            java.lang.String r3 = "nga_suggestions/obfuscated_suggestions_config"
            java.io.InputStream r1 = r1.open(r3)     // Catch:{ IOException -> 0x0045 }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0025 }
            com.google.assistant.ao.a.e.dd r4 = com.google.assistant.p3838ao.p3839a.p3845e.C49601dd.f127995f     // Catch:{ all -> 0x0025 }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (java.io.InputStream) r1, (com.google.protobuf.C62921ba) r3)     // Catch:{ all -> 0x0025 }
            com.google.assistant.ao.a.e.dd r3 = (com.google.assistant.p3838ao.p3839a.p3845e.C49601dd) r3     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0055
        L_0x0023:
            r1 = move-exception
            goto L_0x0047
        L_0x0025:
            r3 = move-exception
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ all -> 0x002c }
            goto L_0x0044
        L_0x002c:
            r1 = move-exception
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0044 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x0044 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r8 = "addSuppressed"
            java.lang.reflect.Method r5 = r6.getDeclaredMethod(r8, r5)     // Catch:{ Exception -> 0x0044 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0044 }
            r4[r7] = r1     // Catch:{ Exception -> 0x0044 }
            r5.invoke(r3, r4)     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            throw r3     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            r3 = r2
        L_0x0047:
            com.google.common.f.a.d r4 = com.google.assistant.p3838ao.p3839a.C49643g.f128136a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r5 = "Could not load the initial suggestions config."
            r6 = 54805(0xd615, float:7.6798E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r4).mo56382g(r1)).mo56372aa(r6)).mo56386p(r5)
        L_0x0055:
            j$.util.Optional r1 = p3186j$.util.Optional.ofNullable(r3)
            com.google.assistant.ao.a.v r3 = new com.google.assistant.ao.a.v
            r3.<init>(r0)
            r1.ifPresent(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.assistant.p3838ao.p3839a.C49694t.call():java.lang.Object");
    }
}
