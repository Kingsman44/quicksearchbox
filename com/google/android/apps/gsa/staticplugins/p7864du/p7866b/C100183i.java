package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.common.base.C58881cr;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.i */
/* compiled from: PG */
final class C100183i implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ File f280205a;

    public C100183i(File file) {
        this.f280205a = file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100184j.f280206a.mo56225c()).mo56372aa(33192)).mo56389s("Failed to read file: %s", r1.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r5 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100184j.f280206a.mo56225c()).mo56382g(r1)).mo56372aa(33193)).mo56386p("Failed to close stream");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003a */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c A[SYNTHETIC, Splitter:B:29:0x006c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo6453a() {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to close stream"
            java.io.File r1 = r8.f280205a
            boolean r2 = r1.exists()
            r3 = 0
            if (r2 != 0) goto L_0x000c
            goto L_0x0067
        L_0x000c:
            long r4 = r1.length()
            int r2 = (int) r4
            byte[] r4 = new byte[r2]
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0039, all -> 0x0037 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x0039, all -> 0x0037 }
            r6 = 0
        L_0x0019:
            int r7 = r5.read(r4, r6, r2)     // Catch:{ IOException -> 0x003a }
            if (r7 > 0) goto L_0x0020
            goto L_0x0024
        L_0x0020:
            int r2 = r2 - r7
            int r6 = r6 + r7
            if (r2 > 0) goto L_0x0019
        L_0x0024:
            r5.close()     // Catch:{ Exception -> 0x0028 }
            goto L_0x0035
        L_0x0028:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100184j.f280206a
            com.google.common.f.x r2 = r2.mo56225c()
            r3 = 33191(0x81a7, float:4.651E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r3)).mo56386p(r0)
        L_0x0035:
            r3 = r4
            goto L_0x0067
        L_0x0037:
            r1 = move-exception
            goto L_0x006a
        L_0x0039:
            r5 = r3
        L_0x003a:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100184j.f280206a     // Catch:{ all -> 0x0068 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0068 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0068 }
            r4 = 33192(0x81a8, float:4.6512E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x0068 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "Failed to read file: %s"
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0068 }
            r2.mo56389s(r4, r1)     // Catch:{ all -> 0x0068 }
            if (r5 == 0) goto L_0x0067
            r5.close()     // Catch:{ Exception -> 0x005a }
            goto L_0x0067
        L_0x005a:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100184j.f280206a
            com.google.common.f.x r2 = r2.mo56225c()
            r4 = 33193(0x81a9, float:4.6513E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r0)
        L_0x0067:
            return r3
        L_0x0068:
            r1 = move-exception
            r3 = r5
        L_0x006a:
            if (r3 == 0) goto L_0x007d
            r3.close()     // Catch:{ Exception -> 0x0070 }
            goto L_0x007d
        L_0x0070:
            r2 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100184j.f280206a
            com.google.common.f.x r3 = r3.mo56225c()
            r4 = 33194(0x81aa, float:4.6515E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r4)).mo56386p(r0)
        L_0x007d:
            goto L_0x007f
        L_0x007e:
            throw r1
        L_0x007f:
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100183i.mo6453a():java.lang.Object");
    }
}
