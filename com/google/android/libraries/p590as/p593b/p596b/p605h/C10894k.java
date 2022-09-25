package com.google.android.libraries.p590as.p593b.p596b.p605h;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.as.b.b.h.k */
/* compiled from: PG */
public final /* synthetic */ class C10894k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C10894k f35980a = new C10894k();

    private /* synthetic */ C10894k() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0075 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r9) {
        /*
            r8 = this;
            java.io.File r9 = (java.io.File) r9
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "metadata"
            r0.<init>(r9, r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0024
            com.google.common.f.a.d r1 = com.google.android.libraries.p590as.p593b.p596b.p605h.C10895l.f35981a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r0 = r0.getParent()
            r2 = 54009(0xd2f9, float:7.5683E-41)
            java.lang.String r3 = "Metadata file is not present in dir: %s"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r2)).mo56389s(r3, r0)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x008b
        L_0x0024:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0076 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0076 }
            com.google.common.f.a.d r2 = com.google.android.libraries.p590as.p593b.p596b.p605h.C10895l.f35981a     // Catch:{ all -> 0x0058 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0058 }
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2     // Catch:{ all -> 0x0058 }
            r3 = 54007(0xd2f7, float:7.568E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x0058 }
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2     // Catch:{ all -> 0x0058 }
            java.lang.String r3 = "Parsed system partition LanguagePack metadata file: %s"
            java.lang.String r4 = r0.getAbsolutePath()     // Catch:{ all -> 0x0058 }
            r2.mo56389s(r3, r4)     // Catch:{ all -> 0x0058 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0058 }
            com.google.al.c.c.b.as r3 = com.google.p395al.p408c.p414c.p416b.C8476as.f29413p     // Catch:{ all -> 0x0058 }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (java.io.InputStream) r1, (com.google.protobuf.C62921ba) r2)     // Catch:{ all -> 0x0058 }
            com.google.al.c.c.b.as r2 = (com.google.p395al.p408c.p414c.p416b.C8476as) r2     // Catch:{ all -> 0x0058 }
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)     // Catch:{ all -> 0x0058 }
            r1.close()     // Catch:{ IOException -> 0x0076 }
            r0 = r2
            goto L_0x008b
        L_0x0058:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x005d }
            goto L_0x0075
        L_0x005d:
            r1 = move-exception
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0075 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r6 = 0
            r4[r6] = r5     // Catch:{ Exception -> 0x0075 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r7, r4)     // Catch:{ Exception -> 0x0075 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0075 }
            r3[r6] = r1     // Catch:{ Exception -> 0x0075 }
            r4.invoke(r2, r3)     // Catch:{ Exception -> 0x0075 }
        L_0x0075:
            throw r2     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            com.google.common.f.a.d r2 = com.google.android.libraries.p590as.p593b.p596b.p605h.C10895l.f35981a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r0 = r0.getAbsolutePath()
            r3 = 54008(0xd2f8, float:7.5681E-41)
            java.lang.String r4 = "Could not parse metadata file: %s"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56382g(r1)).mo56372aa(r3)).mo56389s(r4, r0)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x008b:
            com.google.android.libraries.as.b.b.h.e r1 = new com.google.android.libraries.as.b.b.h.e
            r1.<init>(r9)
            com.google.common.base.ax r9 = r0.mo56106b(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p590as.p593b.p596b.p605h.C10894k.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
