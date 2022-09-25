package com.google.android.apps.gsa.staticplugins.p7930es;

import android.graphics.Bitmap;
import com.bumptech.glide.C5514ad;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.w */
/* compiled from: PG */
public final class C100668w {

    /* renamed from: a */
    private static final C59071e f281496a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.es.w");

    /* renamed from: b */
    private static final double f281497b = Math.sqrt(0.5d);

    /* renamed from: c */
    private final C5514ad f281498c;

    public C100668w(C5514ad adVar) {
        this.f281498c = adVar;
    }

    /* renamed from: b */
    private static final byte[] m166830b(Bitmap bitmap, byte[] bArr, int i) {
        int length;
        int i2 = 69;
        int i3 = 101;
        while (i3 - i2 > 1) {
            int i4 = (i2 + i3) >> 1;
            try {
                byte[] a = C100667v.m166829a(bitmap, i4);
                if (a == null || (length = a.length) > i) {
                    i3 = i4;
                } else {
                    double d = (double) i;
                    Double.isNaN(d);
                    if (((double) length) >= d * 0.95d) {
                        return a;
                    }
                    i2 = i4;
                    bArr = a;
                }
            } catch (OutOfMemoryError unused) {
            }
        }
        return bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f281496a.mo56225c()).mo56372aa(33965)).mo56389s("Glide was unable to load image. Uri: %s", r8);
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0043 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo92004a(android.net.Uri r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            int r0 = java.lang.Math.max(r9, r10)
            r1 = 8192(0x2000, float:1.14794E-41)
            r2 = 0
            if (r0 <= r1) goto L_0x0016
            long r0 = (long) r0
            long r3 = (long) r9
            r5 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 * r5
            long r3 = r3 / r0
            int r9 = (int) r3
            long r3 = (long) r10
            long r3 = r3 * r5
            long r3 = r3 / r0
            int r10 = (int) r3
        L_0x0016:
            r0 = r2
            r1 = r0
        L_0x0018:
            com.bumptech.glide.ad r3 = r7.f281498c     // Catch:{ InterruptedException | ExecutionException -> 0x0043 }
            com.bumptech.glide.z r3 = r3.mo11864b()     // Catch:{ InterruptedException | ExecutionException -> 0x0043 }
            com.bumptech.glide.z r3 = r3.mo12445g(r8)     // Catch:{ InterruptedException | ExecutionException -> 0x0043 }
            com.bumptech.glide.f.j r4 = new com.bumptech.glide.f.j     // Catch:{ InterruptedException | ExecutionException -> 0x0043 }
            r4.<init>()     // Catch:{ InterruptedException | ExecutionException -> 0x0043 }
            r5 = 100
            com.bumptech.glide.f.a r4 = r4.mo11951D(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0043 }
            com.bumptech.glide.f.j r4 = (com.bumptech.glide.p287f.C5593j) r4     // Catch:{ InterruptedException | ExecutionException -> 0x0043 }
            com.bumptech.glide.f.a r4 = r4.mo11985v()     // Catch:{ InterruptedException | ExecutionException -> 0x0043 }
            com.bumptech.glide.z r3 = r3.mo11982o(r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0043 }
            com.bumptech.glide.f.d r3 = r3.mo12453q(r9, r10)     // Catch:{ InterruptedException | ExecutionException -> 0x0043 }
            java.lang.Object r3 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0043 }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ InterruptedException | ExecutionException -> 0x0043 }
            r0 = r3
            goto L_0x0052
        L_0x0043:
            com.google.common.f.e r3 = f281496a     // Catch:{ OutOfMemoryError -> 0x0059 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ OutOfMemoryError -> 0x0059 }
            java.lang.String r4 = "Glide was unable to load image. Uri: %s"
            r5 = 33965(0x84ad, float:4.7595E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56389s(r4, r8)     // Catch:{ OutOfMemoryError -> 0x0059 }
            r0 = r2
        L_0x0052:
            r3 = 69
            byte[] r1 = com.google.android.apps.gsa.staticplugins.p7930es.C100667v.m166829a(r0, r3)     // Catch:{ OutOfMemoryError -> 0x0059 }
            goto L_0x005a
        L_0x0059:
        L_0x005a:
            if (r1 == 0) goto L_0x0060
            int r3 = r1.length
            if (r3 > r11) goto L_0x0060
            goto L_0x0077
        L_0x0060:
            double r3 = f281497b
            double r5 = (double) r9
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r3
            int r9 = (int) r5
            double r5 = (double) r10
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r3
            int r10 = (int) r5
            r3 = 32
            if (r9 < r3) goto L_0x0077
            if (r10 < r3) goto L_0x0077
            goto L_0x0018
        L_0x0077:
            if (r0 == 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            int r8 = r1.length
            if (r8 <= r11) goto L_0x007f
            goto L_0x0084
        L_0x007f:
            byte[] r8 = m166830b(r0, r1, r11)
            return r8
        L_0x0084:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7930es.C100668w.mo92004a(android.net.Uri, int, int, int):byte[]");
    }
}
