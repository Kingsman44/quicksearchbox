package com.google.android.apps.search.podcasts.p10550b.p10552b;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.podcasts.b.b.d */
/* compiled from: PG */
public final /* synthetic */ class C140026d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C140022ao f380583a;

    /* renamed from: b */
    public final /* synthetic */ HashMap f380584b;

    public /* synthetic */ C140026d(C140022ao aoVar, HashMap hashMap) {
        this.f380583a = aoVar;
        this.f380584b = hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0132, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[ExcHandler: NullPointerException | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:21:0x00e3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r24 = this;
            r1 = r24
            com.google.android.apps.search.podcasts.b.b.ao r2 = r1.f380583a
            java.util.HashMap r3 = r1.f380584b
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.size()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r0 = r3.keySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x0018:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0286
            java.lang.Object r0 = r5.next()
            r6 = r0
            com.google.android.apps.gsa.staticplugins.cl.b.j r6 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j) r6
            java.lang.Object r0 = r3.get(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r7 = r0.longValue()
            com.google.android.apps.gsa.staticplugins.cl.b.d r0 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d.f273393j
            com.google.protobuf.bn r0 = r0.createBuilder()
            r9 = r0
            com.google.android.apps.gsa.staticplugins.cl.b.a r9 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.android.apps.gsa.staticplugins.cl.b.d r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d) r0
            int r10 = r0.f273395a
            r10 = r10 | 4
            r0.f273395a = r10
            r0.f273398d = r7
            android.app.DownloadManager$Query r0 = new android.app.DownloadManager$Query
            r0.<init>()
            r10 = 1
            long[] r11 = new long[r10]
            r12 = 0
            r11[r12] = r7
            r0.setFilterById(r11)
            android.app.DownloadManager r11 = r2.f380566i
            android.database.Cursor r11 = r11.query(r0)
            r15 = 8
            java.lang.String r13 = "EpisodeDownloadManager"
            if (r11 == 0) goto L_0x023d
            boolean r0 = r11.moveToFirst()
            if (r0 != 0) goto L_0x0069
            goto L_0x023d
        L_0x0069:
            java.lang.String r0 = "bytes_so_far"
            int r0 = r11.getColumnIndex(r0)
            int r0 = r11.getInt(r0)
            java.lang.String r7 = "total_size"
            int r7 = r11.getColumnIndex(r7)
            int r7 = r11.getInt(r7)
            r16 = r13
            r12 = 100
            if (r7 == 0) goto L_0x008f
            if (r0 > 0) goto L_0x0086
            goto L_0x008f
        L_0x0086:
            r17 = r11
            long r10 = (long) r0
            long r10 = r10 * r12
            long r12 = (long) r7
            long r10 = r10 / r12
            int r8 = (int) r10
            goto L_0x0092
        L_0x008f:
            r17 = r11
            r8 = 0
        L_0x0092:
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.apps.gsa.staticplugins.cl.b.d r10 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d) r10
            int r11 = r10.f273395a
            r11 = r11 | r15
            r10.f273395a = r11
            long r11 = (long) r8
            r10.f273399e = r11
            java.lang.String r8 = "status"
            r10 = r17
            int r8 = r10.getColumnIndex(r8)
            int r8 = r10.getInt(r8)
            java.lang.String r11 = "local_uri"
            int r11 = r10.getColumnIndex(r11)
            java.lang.String r11 = r10.getString(r11)
            if (r8 != r15) goto L_0x01f7
            if (r7 > 0) goto L_0x00bc
            r7 = r0
        L_0x00bc:
            long r12 = (long) r7
            r9.copyOnWrite()
            com.google.protobuf.bv r8 = r9.instance
            com.google.android.apps.gsa.staticplugins.cl.b.d r8 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d) r8
            int r14 = r8.f273395a
            r14 = r14 | 64
            r8.f273395a = r14
            r8.f273401g = r12
            if (r0 != r7) goto L_0x01b5
            if (r7 <= 0) goto L_0x01b5
            java.io.File r7 = new java.io.File
            android.net.Uri r0 = android.net.Uri.parse(r11)
            java.lang.String r0 = r0.getPath()
            r7.<init>(r0)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x014a
            java.io.File r8 = r2.mo115400f()     // Catch:{ NullPointerException | SecurityException -> 0x0132 }
            if (r8 != 0) goto L_0x00ed
            r16 = r3
            goto L_0x0161
        L_0x00ed:
            boolean r0 = r8.exists()     // Catch:{ NullPointerException | SecurityException -> 0x0132 }
            if (r0 != 0) goto L_0x00f6
            r8.mkdirs()     // Catch:{ NullPointerException | SecurityException -> 0x0132 }
        L_0x00f6:
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0105, NullPointerException | SecurityException -> 0x0132 }
            java.lang.String r14 = ".nomedia"
            r0.<init>(r8, r14)     // Catch:{ IOException -> 0x0105, NullPointerException | SecurityException -> 0x0132 }
            r0.createNewFile()     // Catch:{ IOException -> 0x0105, NullPointerException | SecurityException -> 0x0132 }
            r1 = r16
            r16 = r3
            goto L_0x011d
        L_0x0105:
            r0 = move-exception
            com.google.common.f.e r14 = com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao.f380558a     // Catch:{ NullPointerException | SecurityException -> 0x0132 }
            com.google.common.f.x r14 = r14.mo56226d()     // Catch:{ NullPointerException | SecurityException -> 0x0132 }
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ NullPointerException | SecurityException -> 0x0132 }
            r1 = r16
            r14.mo56378ag(r15, r1)     // Catch:{ NullPointerException | SecurityException -> 0x0134 }
            java.lang.String r15 = "Invalid .nomedia file in directory %s."
            r16 = r3
            r3 = 41543(0xa247, float:5.8214E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56382g(r0)).mo56372aa(r3)).mo56389s(r15, r8)     // Catch:{ NullPointerException | SecurityException -> 0x0136 }
        L_0x011d:
            java.io.File r0 = new java.io.File     // Catch:{ NullPointerException | SecurityException -> 0x0136 }
            java.lang.String r3 = r7.getName()     // Catch:{ NullPointerException | SecurityException -> 0x0136 }
            r0.<init>(r8, r3)     // Catch:{ NullPointerException | SecurityException -> 0x0136 }
            r7.renameTo(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0136 }
            java.net.URI r0 = r0.toURI()     // Catch:{ NullPointerException | SecurityException -> 0x0136 }
            java.lang.String r11 = r0.toString()     // Catch:{ NullPointerException | SecurityException -> 0x0136 }
            goto L_0x0161
        L_0x0132:
            r1 = r16
        L_0x0134:
            r16 = r3
        L_0x0136:
            com.google.common.f.e r0 = com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao.f380558a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r1)
            java.lang.String r1 = "Couldn't move file %s is to the sub-directory downloaded_episodes."
            r3 = 41532(0xa23c, float:5.8199E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r1, r11)
            goto L_0x0161
        L_0x014a:
            r1 = r16
            r16 = r3
            com.google.common.f.e r0 = com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao.f380558a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r1)
            java.lang.String r1 = "Downloaded file %s is missing in DownloadManager."
            r3 = 41531(0xa23b, float:5.8197E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r1, r11)
        L_0x0161:
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.android.apps.gsa.staticplugins.cl.b.d r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d) r0
            r11.getClass()
            int r1 = r0.f273395a
            r1 = r1 | 32
            r0.f273395a = r1
            r0.f273400f = r11
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.android.apps.gsa.staticplugins.cl.b.d r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d) r0
            int r1 = r0.f273395a
            r3 = 8
            r1 = r1 | r3
            r0.f273395a = r1
            r7 = 100
            r0.f273399e = r7
            com.google.android.libraries.f.a r0 = r2.f380569l
            long r0 = r0.mo26870b()
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.android.apps.gsa.staticplugins.cl.b.d r3 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d) r3
            int r7 = r3.f273395a
            r7 = r7 | 128(0x80, float:1.794E-43)
            r3.f273395a = r7
            r3.f273402h = r0
            com.google.android.apps.search.podcasts.p.o r0 = r2.f380571n
            com.google.android.libraries.search.logging.d.kp r1 = r0.f382198a
            java.lang.String r0 = r0.mo115852a()
            com.google.common.base.cr r1 = r1.f102830aN
            java.lang.Object r1 = r1.mo6453a()
            com.google.android.libraries.au.d r1 = (com.google.android.libraries.p1635au.C19567d) r1
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r7 = 0
            r3[r7] = r0
            r1.mo24822a(r12, r3)
            goto L_0x0230
        L_0x01b5:
            r1 = r16
            r16 = r3
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.android.apps.gsa.staticplugins.cl.b.d r3 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d) r3
            int r8 = r3.f273395a
            r12 = 8
            r8 = r8 | r12
            r3.f273395a = r8
            r12 = -1
            r3.f273399e = r12
            com.google.common.f.e r3 = com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao.f380558a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r8, r1)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r1 = 41540(0xa244, float:5.821E-41)
            com.google.common.f.x r1 = r3.mo56372aa(r1)
            r18 = r1
            com.google.common.f.c r18 = (com.google.common.p4526f.C59052c) r18
            java.lang.String r19 = "Download progress is not right for episode %s. Downloaded is %d, and the total size is %d for uri %s"
            java.lang.String r20 = com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao.m227691h(r6)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r7)
            r23 = r11
            r18.mo56360M(r19, r20, r21, r22, r23)
            goto L_0x0230
        L_0x01f7:
            r1 = r16
            r16 = r3
            r0 = 16
            if (r8 != r0) goto L_0x0230
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.android.apps.gsa.staticplugins.cl.b.d r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d) r0
            int r3 = r0.f273395a
            r7 = 8
            r3 = r3 | r7
            r0.f273395a = r3
            r7 = -1
            r0.f273399e = r7
            com.google.common.f.e r0 = com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao.f380558a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 41539(0xa243, float:5.8209E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "Download failed for episode %s with uri %s."
            java.lang.String r3 = com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao.m227691h(r6)
            r0.mo56354G(r1, r3, r11)
        L_0x0230:
            com.google.protobuf.bv r0 = r9.build()
            com.google.android.apps.gsa.staticplugins.cl.b.d r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d) r0
            r4.put(r6, r0)
            r10.close()
            goto L_0x0280
        L_0x023d:
            r16 = r3
            r10 = r11
            r1 = r13
            if (r10 == 0) goto L_0x0246
            r10.close()
        L_0x0246:
            com.google.common.f.e r0 = com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao.f380558a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 41537(0xa241, float:5.8206E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "Cursor is null for episode %s [download id: %d]."
            java.lang.String r3 = com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao.m227691h(r6)
            r0.mo56353F(r1, r3, r7)
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.android.apps.gsa.staticplugins.cl.b.d r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d) r0
            int r1 = r0.f273395a
            r3 = 8
            r1 = r1 | r3
            r0.f273395a = r1
            r7 = -1
            r0.f273399e = r7
            com.google.protobuf.bv r0 = r9.build()
            com.google.android.apps.gsa.staticplugins.cl.b.d r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d) r0
            r4.put(r6, r0)
        L_0x0280:
            r1 = r24
            r3 = r16
            goto L_0x0018
        L_0x0286:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10552b.C140026d.call():java.lang.Object");
    }
}
