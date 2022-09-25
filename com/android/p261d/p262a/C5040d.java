package com.android.p261d.p262a;

/* renamed from: com.android.d.a.d */
/* compiled from: PG */
public final class C5040d {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m13841a(android.content.res.Resources r4, int r5, android.content.Context r6, android.net.Uri r7) {
        /*
            com.android.d.b.c r0 = new com.android.d.b.c
            r0.<init>()
            java.lang.String r1 = "Getting exif data failed"
            java.lang.String r2 = "BitmapUtils"
            r3 = 0
            if (r7 == 0) goto L_0x0028
            android.content.ContentResolver r4 = r6.getContentResolver()     // Catch:{ IOException -> 0x006c, NullPointerException -> 0x0065, all -> 0x0061 }
            java.io.InputStream r4 = r4.openInputStream(r7)     // Catch:{ IOException -> 0x006c, NullPointerException -> 0x0065, all -> 0x0061 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x005c, NullPointerException -> 0x0057, all -> 0x0024 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x005c, NullPointerException -> 0x0057, all -> 0x0024 }
            r0.mo9996h(r5)     // Catch:{ IOException -> 0x0022, NullPointerException -> 0x0020, all -> 0x001d }
            goto L_0x0034
        L_0x001d:
            r6 = move-exception
            goto L_0x007c
        L_0x0020:
            r6 = move-exception
            goto L_0x005a
        L_0x0022:
            r6 = move-exception
            goto L_0x005f
        L_0x0024:
            r5 = move-exception
            r6 = r5
            goto L_0x007d
        L_0x0028:
            java.io.InputStream r4 = r4.openRawResource(r5)     // Catch:{ IOException -> 0x006c, NullPointerException -> 0x0065, all -> 0x0061 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x005c, NullPointerException -> 0x0057, all -> 0x0024 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x005c, NullPointerException -> 0x0057, all -> 0x0024 }
            r0.mo9996h(r5)     // Catch:{ IOException -> 0x0022, NullPointerException -> 0x0020, all -> 0x001d }
        L_0x0034:
            r3 = r5
            int r5 = com.android.p261d.p263b.C5044c.f16027j     // Catch:{ IOException -> 0x005c, NullPointerException -> 0x0057, all -> 0x0024 }
            int r6 = r0.mo9993b(r5)     // Catch:{ IOException -> 0x005c, NullPointerException -> 0x0057, all -> 0x0024 }
            java.lang.Integer r5 = r0.mo9995f(r5, r6)     // Catch:{ IOException -> 0x005c, NullPointerException -> 0x0057, all -> 0x0024 }
            if (r5 == 0) goto L_0x0050
            short r5 = r5.shortValue()     // Catch:{ IOException -> 0x005c, NullPointerException -> 0x0057, all -> 0x0024 }
            int r5 = com.android.p261d.p263b.C5044c.m13853d(r5)     // Catch:{ IOException -> 0x005c, NullPointerException -> 0x0057, all -> 0x0024 }
            com.android.p261d.p262a.C5041e.m13845d(r3)
            com.android.p261d.p262a.C5041e.m13845d(r4)
            return r5
        L_0x0050:
            com.android.p261d.p262a.C5041e.m13845d(r3)
            com.android.p261d.p262a.C5041e.m13845d(r4)
            goto L_0x0078
        L_0x0057:
            r5 = move-exception
            r6 = r5
            r5 = r3
        L_0x005a:
            r3 = r4
            goto L_0x0068
        L_0x005c:
            r5 = move-exception
            r6 = r5
            r5 = r3
        L_0x005f:
            r3 = r4
            goto L_0x006f
        L_0x0061:
            r4 = move-exception
            r6 = r4
            r4 = r3
            goto L_0x007d
        L_0x0065:
            r4 = move-exception
            r6 = r4
            r5 = r3
        L_0x0068:
            android.util.Log.w(r2, r1, r6)     // Catch:{ all -> 0x007a }
            goto L_0x0072
        L_0x006c:
            r4 = move-exception
            r6 = r4
            r5 = r3
        L_0x006f:
            android.util.Log.w(r2, r1, r6)     // Catch:{ all -> 0x007a }
        L_0x0072:
            com.android.p261d.p262a.C5041e.m13845d(r5)
            com.android.p261d.p262a.C5041e.m13845d(r3)
        L_0x0078:
            r4 = 0
            return r4
        L_0x007a:
            r6 = move-exception
            r4 = r3
        L_0x007c:
            r3 = r5
        L_0x007d:
            com.android.p261d.p262a.C5041e.m13845d(r3)
            com.android.p261d.p262a.C5041e.m13845d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p261d.p262a.C5040d.m13841a(android.content.res.Resources, int, android.content.Context, android.net.Uri):int");
    }
}
