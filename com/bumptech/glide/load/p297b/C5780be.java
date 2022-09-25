package com.bumptech.glide.load.p297b;

import com.bumptech.glide.load.C5819c;
import com.bumptech.glide.load.p293a.p294a.C5640b;

/* renamed from: com.bumptech.glide.load.b.be */
/* compiled from: PG */
public final class C5780be implements C5819c {

    /* renamed from: a */
    private final C5640b f17376a;

    public C5780be(C5640b bVar) {
        this.f17376a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[SYNTHETIC, Splitter:B:24:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051 A[SYNTHETIC, Splitter:B:29:0x0051] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean mo12285a(java.lang.Object r5, java.io.File r6, com.bumptech.glide.load.C5960s r7) {
        /*
            r4 = this;
            java.lang.String r7 = "StreamEncoder"
            java.io.InputStream r5 = (java.io.InputStream) r5
            com.bumptech.glide.load.a.a.b r0 = r4.f17376a
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r0 = r0.mo12105a(r1, r2)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0037 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0037 }
        L_0x0017:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x0032, all -> 0x002f }
            r2 = -1
            if (r6 == r2) goto L_0x0022
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x0032, all -> 0x002f }
            goto L_0x0017
        L_0x0022:
            r3.close()     // Catch:{ IOException -> 0x0032, all -> 0x002f }
            r3.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            com.bumptech.glide.load.a.a.b r5 = r4.f17376a
            r5.mo12107c(r0)
            r1 = 1
            goto L_0x004e
        L_0x002f:
            r5 = move-exception
            r2 = r3
            goto L_0x004f
        L_0x0032:
            r5 = move-exception
            r2 = r3
            goto L_0x0038
        L_0x0035:
            r5 = move-exception
            goto L_0x004f
        L_0x0037:
            r5 = move-exception
        L_0x0038:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x0035 }
            if (r6 == 0) goto L_0x0044
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch:{ all -> 0x0035 }
        L_0x0044:
            if (r2 == 0) goto L_0x0049
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            com.bumptech.glide.load.a.a.b r5 = r4.f17376a
            r5.mo12107c(r0)
        L_0x004e:
            return r1
        L_0x004f:
            if (r2 == 0) goto L_0x0054
            r2.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            com.bumptech.glide.load.a.a.b r6 = r4.f17376a
            r6.mo12107c(r0)
            goto L_0x005b
        L_0x005a:
            throw r5
        L_0x005b:
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p297b.C5780be.mo12285a(java.lang.Object, java.io.File, com.bumptech.glide.load.s):boolean");
    }
}
