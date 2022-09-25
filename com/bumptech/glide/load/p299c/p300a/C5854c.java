package com.bumptech.glide.load.p299c.p300a;

import com.bumptech.glide.load.C5959r;
import com.bumptech.glide.load.C5963v;
import com.bumptech.glide.load.p293a.p294a.C5640b;

/* renamed from: com.bumptech.glide.load.c.a.c */
/* compiled from: PG */
public final class C5854c implements C5963v {

    /* renamed from: a */
    public static final C5959r f17455a = C5959r.m15375b("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: b */
    public static final C5959r f17456b = C5959r.m15374a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: c */
    private final C5640b f17457c;

    @Deprecated
    public C5854c() {
        this.f17457c = null;
    }

    public C5854c(C5640b bVar) {
        this.f17457c = bVar;
    }

    /* renamed from: b */
    public final int mo12325b() {
        return 2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:22|(2:45|46)|47|48) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c2 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069 A[SYNTHETIC, Splitter:B:35:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf A[SYNTHETIC, Splitter:B:45:0x00bf] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12285a(com.bumptech.glide.load.p293a.C5679av r9, java.io.File r10, com.bumptech.glide.load.C5960s r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.String r1 = "Compressed with type: "
            java.lang.Object r9 = r9.mo12160c()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            com.bumptech.glide.load.r r2 = f17456b
            java.lang.Object r2 = r11.mo12401b(r2)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 != 0) goto L_0x001f
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L_0x001d
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x001f
        L_0x001d:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x001f:
            r9.getWidth()
            r9.getHeight()
            long r3 = com.bumptech.glide.p291h.C5625l.m14593b()     // Catch:{ all -> 0x00c3 }
            com.bumptech.glide.load.r r5 = f17455a     // Catch:{ all -> 0x00c3 }
            java.lang.Object r5 = r11.mo12401b(r5)     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x00c3 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x00c3 }
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0053 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x0053 }
            com.bumptech.glide.load.a.a.b r10 = r8.f17457c     // Catch:{ IOException -> 0x0058, all -> 0x0055 }
            if (r10 == 0) goto L_0x0045
            com.bumptech.glide.load.data.c r6 = new com.bumptech.glide.load.data.c     // Catch:{ IOException -> 0x0058, all -> 0x0055 }
            r6.<init>(r7, r10)     // Catch:{ IOException -> 0x0058, all -> 0x0055 }
            goto L_0x0046
        L_0x0045:
            r6 = r7
        L_0x0046:
            r9.compress(r2, r5, r6)     // Catch:{ IOException -> 0x0053 }
            r6.close()     // Catch:{ IOException -> 0x0053 }
            r10 = 1
            r6.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x006c
        L_0x0051:
            r9 = move-exception
            goto L_0x00bd
        L_0x0053:
            r10 = move-exception
            goto L_0x005a
        L_0x0055:
            r9 = move-exception
            r6 = r7
            goto L_0x00bd
        L_0x0058:
            r10 = move-exception
            r6 = r7
        L_0x005a:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0051 }
            if (r5 == 0) goto L_0x0066
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch:{ all -> 0x0051 }
        L_0x0066:
            r10 = 0
            if (r6 == 0) goto L_0x006c
            r6.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x00c3 }
            if (r5 == 0) goto L_0x00bc
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00c3 }
            int r5 = com.bumptech.glide.p291h.C5632s.m14608a(r9)     // Catch:{ all -> 0x00c3 }
            double r3 = com.bumptech.glide.p291h.C5625l.m14592a(r3)     // Catch:{ all -> 0x00c3 }
            com.bumptech.glide.load.r r6 = f17456b     // Catch:{ all -> 0x00c3 }
            java.lang.Object r11 = r11.mo12401b(r6)     // Catch:{ all -> 0x00c3 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00c3 }
            boolean r9 = r9.hasAlpha()     // Catch:{ all -> 0x00c3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r6.<init>(r1)     // Catch:{ all -> 0x00c3 }
            r6.append(r2)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = " of size "
            r6.append(r1)     // Catch:{ all -> 0x00c3 }
            r6.append(r5)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = " in "
            r6.append(r1)     // Catch:{ all -> 0x00c3 }
            r6.append(r3)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = ", options format: "
            r6.append(r1)     // Catch:{ all -> 0x00c3 }
            r6.append(r11)     // Catch:{ all -> 0x00c3 }
            java.lang.String r11 = ", hasAlpha: "
            r6.append(r11)     // Catch:{ all -> 0x00c3 }
            r6.append(r9)     // Catch:{ all -> 0x00c3 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x00c3 }
            android.util.Log.v(r0, r9)     // Catch:{ all -> 0x00c3 }
        L_0x00bc:
            return r10
        L_0x00bd:
            if (r6 == 0) goto L_0x00c2
            r6.close()     // Catch:{ IOException -> 0x00c2 }
        L_0x00c2:
            throw r9     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p299c.p300a.C5854c.mo12285a(com.bumptech.glide.load.a.av, java.io.File, com.bumptech.glide.load.s):boolean");
    }
}
