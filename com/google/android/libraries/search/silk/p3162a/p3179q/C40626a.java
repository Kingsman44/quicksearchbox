package com.google.android.libraries.search.silk.p3162a.p3179q;

/* renamed from: com.google.android.libraries.search.silk.a.q.a */
/* compiled from: PG */
public final /* synthetic */ class C40626a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40627b f106615a;

    public /* synthetic */ C40626a(C40627b bVar) {
        this.f106615a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.libraries.search.silk.a.q.b r0 = r8.f106615a
            android.net.Uri r1 = r0.mo42570e()
            if (r1 != 0) goto L_0x0031
            com.google.common.f.e r1 = com.google.android.libraries.search.silk.p3162a.p3179q.C40627b.f106616a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Cannot create final file to copy to."
            r3 = 53382(0xd086, float:7.4804E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.libraries.storage.a.k r1 = r0.f106620e     // Catch:{ IOException -> 0x001e }
            android.net.Uri r2 = r0.f106618c     // Catch:{ IOException -> 0x001e }
            r1.mo45892f(r2)     // Catch:{ IOException -> 0x001e }
            goto L_0x002d
        L_0x001e:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.libraries.search.silk.p3162a.p3179q.C40627b.f106616a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Cannot delete the temp downloaded file."
            r4 = 53383(0xd087, float:7.4806E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
        L_0x002d:
            r0.mo42572g()
            return
        L_0x0031:
            r2 = 0
            com.google.android.libraries.storage.a.k r3 = r0.f106620e     // Catch:{ IOException -> 0x007e, all -> 0x007b }
            android.net.Uri r4 = r0.f106618c     // Catch:{ IOException -> 0x007e, all -> 0x007b }
            com.google.android.libraries.storage.a.f.n r5 = new com.google.android.libraries.storage.a.f.n     // Catch:{ IOException -> 0x007e, all -> 0x007b }
            r5.<init>()     // Catch:{ IOException -> 0x007e, all -> 0x007b }
            java.lang.Object r3 = r3.mo45889c(r4, r5)     // Catch:{ IOException -> 0x007e, all -> 0x007b }
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch:{ IOException -> 0x007e, all -> 0x007b }
            android.content.Context r4 = r0.f106617b     // Catch:{ IOException -> 0x0077, all -> 0x0074 }
            android.content.res.AssetFileDescriptor r4 = com.google.android.libraries.p11029ao.p11032c.C147806g.m240911e(r4, r1)     // Catch:{ IOException -> 0x0077, all -> 0x0074 }
            java.io.FileOutputStream r4 = r4.createOutputStream()     // Catch:{ IOException -> 0x0077, all -> 0x0074 }
            org.p5610a.p5611a.p5612a.C71989i.m105290e(r3, r4)     // Catch:{ IOException -> 0x0072 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ IOException -> 0x0072 }
            r5.<init>()     // Catch:{ IOException -> 0x0072 }
            java.lang.String r6 = "is_pending"
            r7 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0072 }
            r5.put(r6, r7)     // Catch:{ IOException -> 0x0072 }
            android.content.ContentResolver r6 = r0.f106619d     // Catch:{ IOException -> 0x0072 }
            r6.update(r1, r5, r2, r2)     // Catch:{ IOException -> 0x0072 }
            r0.mo42571f()
            if (r3 == 0) goto L_0x006a
            org.p5610a.p5611a.p5612a.C71989i.m105289d(r3)
        L_0x006a:
            if (r4 == 0) goto L_0x00b0
            org.p5610a.p5611a.p5612a.C71989i.m105289d(r4)
            return
        L_0x0070:
            r1 = move-exception
            goto L_0x00b1
        L_0x0072:
            r5 = move-exception
            goto L_0x0082
        L_0x0074:
            r1 = move-exception
            r4 = r2
            goto L_0x00b1
        L_0x0077:
            r4 = move-exception
            r5 = r4
            r4 = r2
            goto L_0x0082
        L_0x007b:
            r1 = move-exception
            r4 = r2
            goto L_0x00b2
        L_0x007e:
            r3 = move-exception
            r5 = r3
            r3 = r2
            r4 = r3
        L_0x0082:
            com.google.common.f.e r6 = com.google.android.libraries.search.silk.p3162a.p3179q.C40627b.f106616a     // Catch:{ all -> 0x0070 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x0070 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0070 }
            com.google.common.f.x r5 = r6.mo56382g(r5)     // Catch:{ all -> 0x0070 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0070 }
            r6 = 53384(0xd088, float:7.4807E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ all -> 0x0070 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0070 }
            java.lang.String r6 = "Cannot move file to public external storage."
            r5.mo56386p(r6)     // Catch:{ all -> 0x0070 }
            android.content.ContentResolver r5 = r0.f106619d     // Catch:{ all -> 0x0070 }
            r5.delete(r1, r2, r2)     // Catch:{ all -> 0x0070 }
            r0.mo42571f()
            if (r3 == 0) goto L_0x00ab
            org.p5610a.p5611a.p5612a.C71989i.m105289d(r3)
        L_0x00ab:
            if (r4 == 0) goto L_0x00b0
            org.p5610a.p5611a.p5612a.C71989i.m105289d(r4)
        L_0x00b0:
            return
        L_0x00b1:
            r2 = r3
        L_0x00b2:
            r0.mo42571f()
            if (r2 == 0) goto L_0x00ba
            org.p5610a.p5611a.p5612a.C71989i.m105289d(r2)
        L_0x00ba:
            if (r4 == 0) goto L_0x00bf
            org.p5610a.p5611a.p5612a.C71989i.m105289d(r4)
        L_0x00bf:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.silk.p3162a.p3179q.C40626a.run():void");
    }
}
