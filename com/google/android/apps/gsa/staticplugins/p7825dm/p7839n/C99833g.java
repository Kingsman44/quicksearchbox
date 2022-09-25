package com.google.android.apps.gsa.staticplugins.p7825dm.p7839n;

import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.n.g */
/* compiled from: PG */
public final /* synthetic */ class C99833g implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C99837k f279292a;

    /* renamed from: b */
    public final /* synthetic */ C99828b f279293b;

    public /* synthetic */ C99833g(C99837k kVar, C99828b bVar) {
        this.f279292a = kVar;
        this.f279293b = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0076 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r10 = this;
            com.google.android.apps.gsa.staticplugins.dm.n.k r0 = r10.f279292a
            com.google.android.apps.gsa.staticplugins.dm.n.b r1 = r10.f279293b
            java.lang.String r2 = r1.mo91609b()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r2 = r2.getLastPathSegment()
            com.google.android.libraries.f.a r3 = r0.f279303f
            long r3 = r3.mo26870b()
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r6 = "_display_name"
            r5.put(r6, r2)
            java.lang.String r2 = "mime_type"
            java.lang.String r6 = r1.mo91608a()
            r5.put(r2, r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "datetaken"
            r5.put(r3, r2)
            java.lang.String r3 = "date_added"
            r5.put(r3, r2)
            android.content.ContentResolver r2 = r0.f279301b
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r2 = r2.insert(r3, r5)
            r3 = 0
            if (r2 != 0) goto L_0x0044
        L_0x0042:
            r2 = r3
            goto L_0x009b
        L_0x0044:
            android.content.ContentResolver r4 = r0.f279301b     // Catch:{ IOException -> 0x0077 }
            java.io.OutputStream r4 = r4.openOutputStream(r2)     // Catch:{ IOException -> 0x0077 }
            byte[] r1 = r1.mo91610c()     // Catch:{ all -> 0x0057 }
            r4.write(r1)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x009b
            r4.close()     // Catch:{ IOException -> 0x0077 }
            goto L_0x009b
        L_0x0057:
            r1 = move-exception
            if (r4 == 0) goto L_0x0076
            r4.close()     // Catch:{ all -> 0x005e }
            goto L_0x0076
        L_0x005e:
            r4 = move-exception
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0076 }
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            r8 = 0
            r6[r8] = r7     // Catch:{ Exception -> 0x0076 }
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            java.lang.String r9 = "addSuppressed"
            java.lang.reflect.Method r6 = r7.getDeclaredMethod(r9, r6)     // Catch:{ Exception -> 0x0076 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0076 }
            r5[r8] = r4     // Catch:{ Exception -> 0x0076 }
            r6.invoke(r1, r5)     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            throw r1     // Catch:{ IOException -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.p7825dm.p7839n.C99837k.f279300a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "Failed to store image in media store."
            r6 = 32909(0x808d, float:4.6115E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r1)).mo56372aa(r6)).mo56386p(r5)
            android.content.ContentResolver r0 = r0.f279301b     // Catch:{ IOException -> 0x008c }
            com.google.android.libraries.gsa.util.C23335a.m43766c(r0, r2)     // Catch:{ IOException -> 0x008c }
            goto L_0x0042
        L_0x008c:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.p7825dm.p7839n.C99837k.f279300a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "Failed to clean up media store."
            r4 = 32910(0x808e, float:4.6117E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r1)).mo56372aa(r4)).mo56386p(r2)
            goto L_0x0042
        L_0x009b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7825dm.p7839n.C99833g.mo17947a():java.lang.Object");
    }
}
