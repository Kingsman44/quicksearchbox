package com.google.android.libraries.search.silk.p3162a.p3168f;

/* renamed from: com.google.android.libraries.search.silk.a.f.a */
/* compiled from: PG */
public final /* synthetic */ class C40568a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40569b f106470a;

    public /* synthetic */ C40568a(C40569b bVar) {
        this.f106470a = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c0, code lost:
        if (r9 != null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ff, code lost:
        if (r9 != null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0101, code lost:
        org.p5610a.p5611a.p5612a.C71989i.m105289d(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0104, code lost:
        r6 = r0.f106476f.query(r1, (java.lang.String[]) null, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010f, code lost:
        if (r6 == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r3 = r6.getColumnIndex("_display_name");
        r6.moveToFirst();
        r3 = r6.getString(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0120, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0121, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0124, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0125, code lost:
        r3 = r0.f106473c.getLastPathSegment();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012b, code lost:
        if (r3 != null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012d, code lost:
        r3 = "Unknown file";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012f, code lost:
        r1 = com.google.android.libraries.p11029ao.p11030a.C147798a.m240895a(r0.f106472b, 0, new android.content.Intent().addFlags(268435456).setAction("android.intent.action.VIEW").setDataAndType(r1, "image/*").addFlags(1), 335544320);
        r5 = new androidx.core.app.C1800aq(r0.f106472b);
        r4 = new androidx.core.app.C1839z(r0.f106472b, "download-notification-channel-id");
        r4.f5705y = "status";
        r4.f5679J.icon = 17301634;
        r4.mo5015d(8, true);
        r4.f5690j = -1;
        r4.f5685e = androidx.core.app.C1839z.m5037c(r3);
        r4.mo5015d(16, true);
        r4.f5686f = androidx.core.app.C1839z.m5037c(com.google.android.libraries.mdi.download.foreground.C29423c.m54383f(r0.f106472b));
        r4.f5687g = r1;
        r5.mo5003b("SILK_DOWNLOAD", r0.mo42522e(), r4.mo5013a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0199, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            com.google.android.libraries.search.silk.a.f.b r0 = r14.f106470a
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            android.net.Uri r2 = r0.f106473c
            java.lang.String r2 = r2.getLastPathSegment()
            java.lang.String r3 = "_display_name"
            r1.put(r3, r2)
            java.lang.String r2 = "mime_type"
            java.lang.String r4 = "image/*"
            r1.put(r2, r4)
            com.google.android.libraries.f.a r2 = r0.f106475e
            long r5 = r2.mo26870b()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r5 = "date_modified"
            r1.put(r5, r2)
            java.lang.String r2 = "_size"
            com.google.android.libraries.storage.a.k r5 = r0.f106477g     // Catch:{ IOException -> 0x003d }
            android.net.Uri r6 = r0.f106474d     // Catch:{ IOException -> 0x003d }
            long r5 = r5.mo45887a(r6)     // Catch:{ IOException -> 0x003d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x003d }
            r1.put(r2, r5)     // Catch:{ IOException -> 0x003d }
            goto L_0x004c
        L_0x003d:
            r2 = move-exception
            com.google.common.f.e r5 = com.google.android.libraries.search.silk.p3162a.p3168f.C40569b.f106471a
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r6 = "Cannot retrieve size of the downloaded file."
            r7 = 53358(0xd06e, float:7.477E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r2)).mo56372aa(r7)).mo56386p(r6)
        L_0x004c:
            r2 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.String r6 = "is_pending"
            r1.put(r6, r5)
            android.content.ContentResolver r5 = r0.f106476f
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r1 = r5.insert(r7, r1)
            if (r1 != 0) goto L_0x0089
            com.google.common.f.e r1 = com.google.android.libraries.search.silk.p3162a.p3168f.C40569b.f106471a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Cannot create final file to copy to."
            r3 = 53359(0xd06f, float:7.4772E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.libraries.storage.a.k r1 = r0.f106477g     // Catch:{ IOException -> 0x0076 }
            android.net.Uri r2 = r0.f106474d     // Catch:{ IOException -> 0x0076 }
            r1.mo45892f(r2)     // Catch:{ IOException -> 0x0076 }
            goto L_0x0085
        L_0x0076:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.libraries.search.silk.p3162a.p3168f.C40569b.f106471a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Cannot delete the temp downloaded file."
            r4 = 53360(0xd070, float:7.4773E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
        L_0x0085:
            r0.mo42524g()
            return
        L_0x0089:
            r5 = 0
            r7 = 0
            com.google.android.libraries.storage.a.k r8 = r0.f106477g     // Catch:{ IOException -> 0x00d3, all -> 0x00cf }
            android.net.Uri r9 = r0.f106474d     // Catch:{ IOException -> 0x00d3, all -> 0x00cf }
            com.google.android.libraries.storage.a.f.n r10 = new com.google.android.libraries.storage.a.f.n     // Catch:{ IOException -> 0x00d3, all -> 0x00cf }
            r10.<init>()     // Catch:{ IOException -> 0x00d3, all -> 0x00cf }
            java.lang.Object r8 = r8.mo45889c(r9, r10)     // Catch:{ IOException -> 0x00d3, all -> 0x00cf }
            java.io.InputStream r8 = (java.io.InputStream) r8     // Catch:{ IOException -> 0x00d3, all -> 0x00cf }
            android.content.Context r9 = r0.f106472b     // Catch:{ IOException -> 0x00cc, all -> 0x00c8 }
            android.content.res.AssetFileDescriptor r9 = com.google.android.libraries.p11029ao.p11032c.C147806g.m240911e(r9, r1)     // Catch:{ IOException -> 0x00cc, all -> 0x00c8 }
            java.io.FileOutputStream r9 = r9.createOutputStream()     // Catch:{ IOException -> 0x00cc, all -> 0x00c8 }
            org.p5610a.p5611a.p5612a.C71989i.m105290e(r8, r9)     // Catch:{ IOException -> 0x00c6 }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ IOException -> 0x00c6 }
            r10.<init>()     // Catch:{ IOException -> 0x00c6 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x00c6 }
            r10.put(r6, r11)     // Catch:{ IOException -> 0x00c6 }
            android.content.ContentResolver r6 = r0.f106476f     // Catch:{ IOException -> 0x00c6 }
            r6.update(r1, r10, r7, r7)     // Catch:{ IOException -> 0x00c6 }
            r0.mo42523f()
            if (r8 == 0) goto L_0x00c0
            org.p5610a.p5611a.p5612a.C71989i.m105289d(r8)
        L_0x00c0:
            if (r9 == 0) goto L_0x0104
            goto L_0x0101
        L_0x00c3:
            r1 = move-exception
            goto L_0x019a
        L_0x00c6:
            r6 = move-exception
            goto L_0x00d6
        L_0x00c8:
            r1 = move-exception
            r9 = r7
            goto L_0x019a
        L_0x00cc:
            r6 = move-exception
            r9 = r7
            goto L_0x00d6
        L_0x00cf:
            r1 = move-exception
            r9 = r7
            goto L_0x019b
        L_0x00d3:
            r6 = move-exception
            r8 = r7
            r9 = r8
        L_0x00d6:
            com.google.common.f.e r10 = com.google.android.libraries.search.silk.p3162a.p3168f.C40569b.f106471a     // Catch:{ all -> 0x00c3 }
            com.google.common.f.x r10 = r10.mo56226d()     // Catch:{ all -> 0x00c3 }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ all -> 0x00c3 }
            com.google.common.f.x r6 = r10.mo56382g(r6)     // Catch:{ all -> 0x00c3 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x00c3 }
            r10 = 53361(0xd071, float:7.4775E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r10)     // Catch:{ all -> 0x00c3 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x00c3 }
            java.lang.String r10 = "Cannot move file to public external storage."
            r6.mo56386p(r10)     // Catch:{ all -> 0x00c3 }
            android.content.ContentResolver r6 = r0.f106476f     // Catch:{ all -> 0x00c3 }
            r6.delete(r1, r7, r7)     // Catch:{ all -> 0x00c3 }
            r0.mo42523f()
            if (r8 == 0) goto L_0x00ff
            org.p5610a.p5611a.p5612a.C71989i.m105289d(r8)
        L_0x00ff:
            if (r9 == 0) goto L_0x0104
        L_0x0101:
            org.p5610a.p5611a.p5612a.C71989i.m105289d(r9)
        L_0x0104:
            android.content.ContentResolver r8 = r0.f106476f
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = r1
            android.database.Cursor r6 = r8.query(r9, r10, r11, r12, r13)
            if (r6 == 0) goto L_0x0125
            int r3 = r6.getColumnIndex(r3)     // Catch:{ all -> 0x0120 }
            r6.moveToFirst()     // Catch:{ all -> 0x0120 }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ all -> 0x0120 }
            r6.close()
            goto L_0x012b
        L_0x0120:
            r0 = move-exception
            r6.close()
            throw r0
        L_0x0125:
            android.net.Uri r3 = r0.f106473c
            java.lang.String r3 = r3.getLastPathSegment()
        L_0x012b:
            if (r3 != 0) goto L_0x012f
            java.lang.String r3 = "Unknown file"
        L_0x012f:
            android.content.Context r6 = r0.f106472b
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r7 = r7.addFlags(r8)
            java.lang.String r8 = "android.intent.action.VIEW"
            android.content.Intent r7 = r7.setAction(r8)
            android.content.Intent r1 = r7.setDataAndType(r1, r4)
            android.content.Intent r1 = r1.addFlags(r2)
            r4 = 335544320(0x14000000, float:6.4623485E-27)
            android.app.PendingIntent r1 = com.google.android.libraries.p11029ao.p11030a.C147798a.m240895a(r6, r5, r1, r4)
            android.content.Context r4 = r0.f106472b
            androidx.core.app.aq r5 = new androidx.core.app.aq
            r5.<init>(r4)
            androidx.core.app.z r4 = new androidx.core.app.z
            android.content.Context r6 = r0.f106472b
            java.lang.String r7 = "download-notification-channel-id"
            r4.<init>(r6, r7)
            java.lang.String r6 = "status"
            r4.f5705y = r6
            android.app.Notification r6 = r4.f5679J
            r7 = 17301634(0x1080082, float:2.497962E-38)
            r6.icon = r7
            r6 = 8
            r4.mo5015d(r6, r2)
            r6 = -1
            r4.f5690j = r6
            java.lang.CharSequence r3 = androidx.core.app.C1839z.m5037c(r3)
            r4.f5685e = r3
            r3 = 16
            r4.mo5015d(r3, r2)
            android.content.Context r2 = r0.f106472b
            java.lang.String r2 = com.google.android.libraries.mdi.download.foreground.C29423c.m54383f(r2)
            java.lang.CharSequence r2 = androidx.core.app.C1839z.m5037c(r2)
            r4.f5686f = r2
            r4.f5687g = r1
            int r0 = r0.mo42522e()
            android.app.Notification r1 = r4.mo5013a()
            java.lang.String r2 = "SILK_DOWNLOAD"
            r5.mo5003b(r2, r0, r1)
            return
        L_0x019a:
            r7 = r8
        L_0x019b:
            r0.mo42523f()
            if (r7 == 0) goto L_0x01a3
            org.p5610a.p5611a.p5612a.C71989i.m105289d(r7)
        L_0x01a3:
            if (r9 == 0) goto L_0x01a8
            org.p5610a.p5611a.p5612a.C71989i.m105289d(r9)
        L_0x01a8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.silk.p3162a.p3168f.C40568a.run():void");
    }
}
