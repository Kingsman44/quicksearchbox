package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.airbnb.lottie.n */
/* compiled from: PG */
final class C4967n implements Callable {

    /* renamed from: a */
    final /* synthetic */ Context f15767a;

    /* renamed from: b */
    final /* synthetic */ String f15768b;

    /* renamed from: c */
    final /* synthetic */ String f15769c;

    public C4967n(Context context, String str, String str2) {
        this.f15767a = context;
        this.f15768b = str;
        this.f15769c = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.airbnb.lottie.d.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0244, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0245, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0247, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0248, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        r5.f15632a.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x027d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x027e, code lost:
        com.airbnb.lottie.p245f.C4947d.m13696a("LottieFetchResult close failed ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c4, code lost:
        if (r6 == null) goto L_0x004d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x01f7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x0224 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0244 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:64:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0254 A[SYNTHETIC, Splitter:B:137:0x0254] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0277 A[SYNTHETIC, Splitter:B:149:0x0277] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017c A[Catch:{ Exception -> 0x0247, all -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a6 A[SYNTHETIC, Splitter:B:90:0x01a6] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:116:0x0224=Splitter:B:116:0x0224, B:108:0x01f7=Splitter:B:108:0x01f7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object call() {
        /*
            r10 = this;
            java.lang.String r0 = "Unable to rename cache file "
            android.content.Context r1 = r10.f15767a
            com.airbnb.lottie.d.f r2 = com.airbnb.lottie.C4838b.f15407b
            if (r2 != 0) goto L_0x0045
            java.lang.Class<com.airbnb.lottie.d.f> r3 = com.airbnb.lottie.p242d.C4901f.class
            monitor-enter(r3)
            com.airbnb.lottie.d.f r2 = com.airbnb.lottie.C4838b.f15407b     // Catch:{ all -> 0x0042 }
            if (r2 != 0) goto L_0x0040
            com.airbnb.lottie.d.f r2 = new com.airbnb.lottie.d.f     // Catch:{ all -> 0x0042 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x0042 }
            com.airbnb.lottie.d.e r4 = com.airbnb.lottie.C4838b.f15408c     // Catch:{ all -> 0x0042 }
            if (r4 != 0) goto L_0x0032
            java.lang.Class<com.airbnb.lottie.d.e> r4 = com.airbnb.lottie.p242d.C4900e.class
            monitor-enter(r4)     // Catch:{ all -> 0x0042 }
            com.airbnb.lottie.d.e r5 = com.airbnb.lottie.C4838b.f15408c     // Catch:{ all -> 0x002f }
            if (r5 != 0) goto L_0x002c
            com.airbnb.lottie.d.e r5 = new com.airbnb.lottie.d.e     // Catch:{ all -> 0x002f }
            com.airbnb.lottie.a r6 = new com.airbnb.lottie.a     // Catch:{ all -> 0x002f }
            r6.<init>(r1)     // Catch:{ all -> 0x002f }
            r5.<init>(r6)     // Catch:{ all -> 0x002f }
            com.airbnb.lottie.C4838b.f15408c = r5     // Catch:{ all -> 0x002f }
        L_0x002c:
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            r4 = r5
            goto L_0x0032
        L_0x002f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0032:
            com.airbnb.lottie.d.d r1 = com.airbnb.lottie.C4838b.f15406a     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x003b
            com.airbnb.lottie.d.b r1 = new com.airbnb.lottie.d.b     // Catch:{ all -> 0x0042 }
            r1.<init>()     // Catch:{ all -> 0x0042 }
        L_0x003b:
            r2.<init>(r4, r1)     // Catch:{ all -> 0x0042 }
            com.airbnb.lottie.C4838b.f15407b = r2     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            goto L_0x0045
        L_0x0042:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            throw r0
        L_0x0045:
            java.lang.String r1 = r10.f15768b
            java.lang.String r3 = r10.f15769c
            r4 = 0
            r5 = 0
            if (r3 != 0) goto L_0x0050
        L_0x004d:
            r6 = r5
            goto L_0x00c7
        L_0x0050:
            com.airbnb.lottie.d.e r6 = r2.f15638a
            java.io.File r7 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00a3 }
            java.io.File r8 = r6.mo9837a()     // Catch:{ FileNotFoundException -> 0x00a3 }
            com.airbnb.lottie.d.c r9 = com.airbnb.lottie.p242d.C4898c.JSON     // Catch:{ FileNotFoundException -> 0x00a3 }
            java.lang.String r9 = com.airbnb.lottie.p242d.C4900e.m13595c(r1, r9, r4)     // Catch:{ FileNotFoundException -> 0x00a3 }
            r7.<init>(r8, r9)     // Catch:{ FileNotFoundException -> 0x00a3 }
            boolean r8 = r7.exists()     // Catch:{ FileNotFoundException -> 0x00a3 }
            if (r8 == 0) goto L_0x0068
            goto L_0x007f
        L_0x0068:
            java.io.File r7 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00a3 }
            java.io.File r6 = r6.mo9837a()     // Catch:{ FileNotFoundException -> 0x00a3 }
            com.airbnb.lottie.d.c r8 = com.airbnb.lottie.p242d.C4898c.ZIP     // Catch:{ FileNotFoundException -> 0x00a3 }
            java.lang.String r8 = com.airbnb.lottie.p242d.C4900e.m13595c(r1, r8, r4)     // Catch:{ FileNotFoundException -> 0x00a3 }
            r7.<init>(r6, r8)     // Catch:{ FileNotFoundException -> 0x00a3 }
            boolean r6 = r7.exists()     // Catch:{ FileNotFoundException -> 0x00a3 }
            if (r6 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r7 = r5
        L_0x007f:
            if (r7 != 0) goto L_0x0082
            goto L_0x00a4
        L_0x0082:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00a3 }
            r6.<init>(r7)     // Catch:{ FileNotFoundException -> 0x00a3 }
            java.lang.String r8 = r7.getAbsolutePath()
            java.lang.String r9 = ".zip"
            boolean r8 = r8.endsWith(r9)
            if (r8 == 0) goto L_0x0096
            com.airbnb.lottie.d.c r8 = com.airbnb.lottie.p242d.C4898c.ZIP
            goto L_0x0098
        L_0x0096:
            com.airbnb.lottie.d.c r8 = com.airbnb.lottie.p242d.C4898c.JSON
        L_0x0098:
            r7.getAbsolutePath()
            com.airbnb.lottie.af r7 = com.airbnb.lottie.p245f.C4947d.f15711a
            android.util.Pair r7 = new android.util.Pair
            r7.<init>(r8, r6)
            goto L_0x00a5
        L_0x00a3:
        L_0x00a4:
            r7 = r5
        L_0x00a5:
            if (r7 != 0) goto L_0x00a8
            goto L_0x004d
        L_0x00a8:
            java.lang.Object r6 = r7.first
            com.airbnb.lottie.d.c r6 = (com.airbnb.lottie.p242d.C4898c) r6
            java.lang.Object r7 = r7.second
            java.io.InputStream r7 = (java.io.InputStream) r7
            com.airbnb.lottie.d.c r8 = com.airbnb.lottie.p242d.C4898c.ZIP
            if (r6 != r8) goto L_0x00be
            java.util.zip.ZipInputStream r6 = new java.util.zip.ZipInputStream
            r6.<init>(r7)
            com.airbnb.lottie.ah r6 = com.airbnb.lottie.C4972s.m13747e(r6, r1)
            goto L_0x00c2
        L_0x00be:
            com.airbnb.lottie.ah r6 = com.airbnb.lottie.C4972s.m13755m(r7, r1)
        L_0x00c2:
            java.lang.Object r6 = r6.f15396a
            if (r6 != 0) goto L_0x00c7
            goto L_0x004d
        L_0x00c7:
            if (r6 == 0) goto L_0x00d0
            com.airbnb.lottie.ah r0 = new com.airbnb.lottie.ah
            r0.<init>((java.lang.Object) r6)
            goto L_0x0261
        L_0x00d0:
            com.airbnb.lottie.af r6 = com.airbnb.lottie.p245f.C4947d.f15711a
            com.airbnb.lottie.d.d r6 = r2.f15639b     // Catch:{ Exception -> 0x024c }
            com.airbnb.lottie.d.a r6 = r6.mo9835a(r1)     // Catch:{ Exception -> 0x024c }
            boolean r7 = r6.mo9833a()     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            if (r7 == 0) goto L_0x01b5
            java.net.HttpURLConnection r7 = r6.f15632a     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.net.HttpURLConnection r8 = r6.f15632a     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.String r8 = r8.getContentType()     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.String r9 = "application/json"
            if (r8 != 0) goto L_0x00ef
            r8 = r9
        L_0x00ef:
            java.lang.String r9 = "application/zip"
            boolean r8 = r8.contains(r9)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            if (r8 != 0) goto L_0x012a
            java.lang.String r8 = "\\?"
            java.lang.String[] r8 = r1.split(r8)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r4 = r8[r4]     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.String r8 = ".lottie"
            boolean r4 = r4.endsWith(r8)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            if (r4 == 0) goto L_0x0108
            goto L_0x012a
        L_0x0108:
            com.airbnb.lottie.d.c r4 = com.airbnb.lottie.p242d.C4898c.JSON     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            if (r3 != 0) goto L_0x0111
            com.airbnb.lottie.ah r7 = com.airbnb.lottie.C4972s.m13755m(r7, r5)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            goto L_0x014c
        L_0x0111:
            com.airbnb.lottie.d.e r8 = r2.f15638a     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.io.File r7 = r8.mo9838b(r1, r7, r4)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            com.airbnb.lottie.ah r7 = com.airbnb.lottie.C4972s.m13755m(r8, r1)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            goto L_0x014c
        L_0x012a:
            com.airbnb.lottie.d.c r4 = com.airbnb.lottie.p242d.C4898c.ZIP     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            if (r3 != 0) goto L_0x0138
            java.util.zip.ZipInputStream r8 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            com.airbnb.lottie.ah r7 = com.airbnb.lottie.C4972s.m13747e(r8, r5)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            goto L_0x014c
        L_0x0138:
            com.airbnb.lottie.d.e r8 = r2.f15638a     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.io.File r7 = r8.mo9838b(r1, r7, r4)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.util.zip.ZipInputStream r8 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            com.airbnb.lottie.ah r7 = com.airbnb.lottie.C4972s.m13747e(r8, r1)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
        L_0x014c:
            if (r3 == 0) goto L_0x01a4
            java.lang.Object r3 = r7.f15396a     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            if (r3 == 0) goto L_0x01a4
            com.airbnb.lottie.d.e r2 = r2.f15638a     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r3 = 1
            java.lang.String r1 = com.airbnb.lottie.p242d.C4900e.m13595c(r1, r4, r3)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.io.File r2 = r2.mo9837a()     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r3.<init>(r2, r1)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.String r2 = ".temp"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.replace(r2, r4)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            boolean r1 = r3.renameTo(r2)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r2.toString()     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            if (r1 != 0) goto L_0x01a4
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r3.append(r1)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.String r0 = " to "
            r3.append(r0)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r3.append(r2)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.String r0 = "."
            r3.append(r0)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            com.airbnb.lottie.af r1 = com.airbnb.lottie.p245f.C4947d.f15711a     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            com.airbnb.lottie.f.c r1 = (com.airbnb.lottie.p245f.C4946c) r1     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r1.mo9784a(r0, r5)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
        L_0x01a4:
            if (r6 == 0) goto L_0x01b2
            java.net.HttpURLConnection r0 = r6.f15632a     // Catch:{ IOException -> 0x01ac }
            r0.disconnect()     // Catch:{ IOException -> 0x01ac }
            goto L_0x01b2
        L_0x01ac:
            r0 = move-exception
            java.lang.String r1 = "LottieFetchResult close failed "
            com.airbnb.lottie.p245f.C4947d.m13696a(r1, r0)
        L_0x01b2:
            r0 = r7
            goto L_0x0261
        L_0x01b5:
            com.airbnb.lottie.ah r0 = new com.airbnb.lottie.ah     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            boolean r2 = r6.mo9833a()     // Catch:{ IOException -> 0x0225 }
            if (r2 == 0) goto L_0x01c0
            goto L_0x022f
        L_0x01c0:
            java.net.HttpURLConnection r2 = r6.f15632a     // Catch:{ IOException -> 0x0225 }
            java.net.URL r2 = r2.getURL()     // Catch:{ IOException -> 0x0225 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0225 }
            java.net.HttpURLConnection r3 = r6.f15632a     // Catch:{ IOException -> 0x0225 }
            int r3 = r3.getResponseCode()     // Catch:{ IOException -> 0x0225 }
            java.net.HttpURLConnection r4 = r6.f15632a     // Catch:{ IOException -> 0x0225 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0225 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0225 }
            java.io.InputStream r4 = r4.getErrorStream()     // Catch:{ IOException -> 0x0225 }
            r7.<init>(r4)     // Catch:{ IOException -> 0x0225 }
            r5.<init>(r7)     // Catch:{ IOException -> 0x0225 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0225 }
            r4.<init>()     // Catch:{ IOException -> 0x0225 }
        L_0x01e5:
            java.lang.String r7 = r5.readLine()     // Catch:{ Exception -> 0x021f }
            if (r7 == 0) goto L_0x01f4
            r4.append(r7)     // Catch:{ Exception -> 0x021f }
            r7 = 10
            r4.append(r7)     // Catch:{ Exception -> 0x021f }
            goto L_0x01e5
        L_0x01f4:
            r5.close()     // Catch:{ Exception -> 0x01f7, all -> 0x0244 }
        L_0x01f7:
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0225 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0225 }
            r5.<init>()     // Catch:{ IOException -> 0x0225 }
            java.lang.String r7 = "Unable to fetch "
            r5.append(r7)     // Catch:{ IOException -> 0x0225 }
            r5.append(r2)     // Catch:{ IOException -> 0x0225 }
            java.lang.String r2 = ". Failed with "
            r5.append(r2)     // Catch:{ IOException -> 0x0225 }
            r5.append(r3)     // Catch:{ IOException -> 0x0225 }
            java.lang.String r2 = "\n"
            r5.append(r2)     // Catch:{ IOException -> 0x0225 }
            r5.append(r4)     // Catch:{ IOException -> 0x0225 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0225 }
            goto L_0x022f
        L_0x021d:
            r2 = move-exception
            goto L_0x0221
        L_0x021f:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x021d }
        L_0x0221:
            r5.close()     // Catch:{ Exception -> 0x0224, all -> 0x0244 }
        L_0x0224:
            throw r2     // Catch:{ IOException -> 0x0225 }
        L_0x0225:
            r2 = move-exception
            java.lang.String r3 = "get error failed "
            com.airbnb.lottie.p245f.C4947d.m13696a(r3, r2)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            java.lang.String r5 = r2.getMessage()     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
        L_0x022f:
            r1.<init>(r5)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ Exception -> 0x0247, all -> 0x0244 }
            if (r6 == 0) goto L_0x0261
            java.net.HttpURLConnection r1 = r6.f15632a     // Catch:{ IOException -> 0x023d }
            r1.disconnect()     // Catch:{ IOException -> 0x023d }
            goto L_0x0261
        L_0x023d:
            r1 = move-exception
            java.lang.String r2 = "LottieFetchResult close failed "
            com.airbnb.lottie.p245f.C4947d.m13696a(r2, r1)
            goto L_0x0261
        L_0x0244:
            r0 = move-exception
            r5 = r6
            goto L_0x0275
        L_0x0247:
            r0 = move-exception
            r5 = r6
            goto L_0x024d
        L_0x024a:
            r0 = move-exception
            goto L_0x0275
        L_0x024c:
            r0 = move-exception
        L_0x024d:
            com.airbnb.lottie.ah r1 = new com.airbnb.lottie.ah     // Catch:{ all -> 0x024a }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x024a }
            if (r5 == 0) goto L_0x0260
            java.net.HttpURLConnection r0 = r5.f15632a     // Catch:{ IOException -> 0x025a }
            r0.disconnect()     // Catch:{ IOException -> 0x025a }
            goto L_0x0260
        L_0x025a:
            r0 = move-exception
            java.lang.String r2 = "LottieFetchResult close failed "
            com.airbnb.lottie.p245f.C4947d.m13696a(r2, r0)
        L_0x0260:
            r0 = r1
        L_0x0261:
            java.lang.String r1 = r10.f15769c
            if (r1 == 0) goto L_0x0274
            java.lang.Object r1 = r0.f15396a
            if (r1 == 0) goto L_0x0274
            com.airbnb.lottie.c.g r1 = com.airbnb.lottie.p238c.C4892g.f15627a
            java.lang.String r2 = r10.f15769c
            java.lang.Object r3 = r0.f15396a
            com.airbnb.lottie.k r3 = (com.airbnb.lottie.C4964k) r3
            r1.mo9829a(r2, r3)
        L_0x0274:
            return r0
        L_0x0275:
            if (r5 == 0) goto L_0x0283
            java.net.HttpURLConnection r1 = r5.f15632a     // Catch:{ IOException -> 0x027d }
            r1.disconnect()     // Catch:{ IOException -> 0x027d }
            goto L_0x0283
        L_0x027d:
            r1 = move-exception
            java.lang.String r2 = "LottieFetchResult close failed "
            com.airbnb.lottie.p245f.C4947d.m13696a(r2, r1)
        L_0x0283:
            goto L_0x0285
        L_0x0284:
            throw r0
        L_0x0285:
            goto L_0x0284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C4967n.call():java.lang.Object");
    }
}
