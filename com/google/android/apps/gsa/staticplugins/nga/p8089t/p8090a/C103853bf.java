package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.bf */
/* compiled from: PG */
public final /* synthetic */ class C103853bf implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C103853bf f289107a = new C103853bf();

    private /* synthetic */ C103853bf() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r8) {
        /*
            r7 = this;
            java.io.File r8 = (java.io.File) r8
            com.google.common.f.a.d r0 = com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a.C103868bu.f289129a
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ ct -> 0x004b, IOException -> 0x0039 }
            r0.<init>(r8)     // Catch:{ ct -> 0x004b, IOException -> 0x0039 }
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.f169869a     // Catch:{ all -> 0x001b }
            com.google.android.apps.gsa.staticplugins.nga.t.a.cc r2 = com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a.C103877cc.f289164m     // Catch:{ all -> 0x001b }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (java.io.InputStream) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ all -> 0x001b }
            com.google.android.apps.gsa.staticplugins.nga.t.a.cc r1 = (com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a.C103877cc) r1     // Catch:{ all -> 0x001b }
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)     // Catch:{ all -> 0x001b }
            r0.close()     // Catch:{ ct -> 0x004b, IOException -> 0x0039 }
            goto L_0x005c
        L_0x001b:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0038
        L_0x0020:
            r0 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0038 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x0038 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x0038 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0038 }
            r2[r5] = r0     // Catch:{ Exception -> 0x0038 }
            r3.invoke(r1, r2)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            throw r1     // Catch:{ ct -> 0x004b, IOException -> 0x0039 }
        L_0x0039:
            com.google.common.f.a.d r0 = com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a.C103868bu.f289129a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Failed to read %s log event file"
            r2 = 21786(0x551a, float:3.0529E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56389s(r1, r8)
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            goto L_0x005c
        L_0x004b:
            com.google.common.f.a.d r0 = com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a.C103868bu.f289129a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Failed to parse %s log event file"
            r2 = 21785(0x5519, float:3.0527E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56389s(r1, r8)
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a.C103853bf.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
