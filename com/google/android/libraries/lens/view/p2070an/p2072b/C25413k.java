package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.graphics.Bitmap;
import android.graphics.RectF;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.an.b.k */
/* compiled from: PG */
public final /* synthetic */ class C25413k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C25417o f69254a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f69255b;

    /* renamed from: c */
    public final /* synthetic */ RectF f69256c;

    public /* synthetic */ C25413k(C25417o oVar, Bitmap bitmap, RectF rectF) {
        this.f69254a = oVar;
        this.f69255b = bitmap;
        this.f69256c = rectF;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r12 = this;
            com.google.android.libraries.lens.view.an.b.o r0 = r12.f69254a
            android.graphics.Bitmap r8 = r12.f69255b
            android.graphics.RectF r1 = r12.f69256c
            android.util.Size r2 = new android.util.Size
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            r2.<init>(r3, r4)
            android.graphics.Rect r9 = com.google.android.libraries.lens.view.p2070an.p2072b.C25417o.m46835b(r2, r1)
            android.util.Size r1 = new android.util.Size
            int r3 = r9.width()
            int r4 = r9.height()
            r1.<init>(r3, r4)
            com.google.android.libraries.lens.view.an.b.f r3 = r0.f69266b
            android.util.Size r3 = r3.mo30465a(r1)
            boolean r2 = r2.equals(r1)
            boolean r4 = r1.equals(r3)
            r5 = 1
            r4 = r4 ^ r5
            com.google.android.libraries.f.a r6 = r0.f69270f
            long r10 = r6.mo26873e()
            r2 = r2 ^ r5
            if (r2 != 0) goto L_0x0042
            if (r4 == 0) goto L_0x0040
            goto L_0x0043
        L_0x0040:
            r1 = r8
            goto L_0x0092
        L_0x0042:
            r5 = r4
        L_0x0043:
            java.lang.String r2 = "compressor/resize"
            android.os.Trace.beginSection(r2)
            if (r5 == 0) goto L_0x006a
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            int r4 = r3.getWidth()
            float r4 = (float) r4
            int r5 = r1.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r3 = r3.getHeight()
            float r3 = (float) r3
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r3 = r3 / r1
            r2.setScale(r4, r3)
            r6 = r2
            goto L_0x0070
        L_0x006a:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r6 = r1
        L_0x0070:
            int r2 = r9.left
            int r3 = r9.top
            int r4 = r9.width()
            int r5 = r9.height()
            r7 = 1
            r1 = r8
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)
            android.graphics.Bitmap$Config r2 = r1.getConfig()
            if (r2 != 0) goto L_0x008f
            android.graphics.Bitmap$Config r2 = r8.getConfig()
            r1.setConfig(r2)
        L_0x008f:
            android.os.Trace.endSection()
        L_0x0092:
            android.content.Context r2 = r0.f69267c
            android.telephony.TelephonyManager r3 = com.google.android.libraries.lens.view.utils.C28137z.m52435a(r2)
            r4 = 0
            if (r3 != 0) goto L_0x009c
            goto L_0x00a9
        L_0x009c:
            java.lang.String r5 = "android.permission.READ_PHONE_STATE"
            boolean r2 = com.google.android.libraries.lens.view.utils.C28137z.m52439e(r2, r5)
            if (r2 != 0) goto L_0x00a5
            goto L_0x00a9
        L_0x00a5:
            java.lang.Integer r4 = com.google.android.libraries.lens.view.utils.C28137z.m52438d(r3)
        L_0x00a9:
            if (r4 == 0) goto L_0x00b6
            int r2 = r4.intValue()
            r3 = 20
            if (r2 != r3) goto L_0x00b6
            r2 = 50
            goto L_0x00bf
        L_0x00b6:
            com.google.android.libraries.lens.view.flags.b r2 = r0.f69265a
            com.google.android.libraries.lens.view.flags.a r3 = com.google.android.libraries.lens.view.flags.C26239a.PREFETCH_COMPRESSION_QUALITY
            long r2 = r2.mo31456b(r3)
            int r2 = (int) r2
        L_0x00bf:
            com.google.android.libraries.lens.view.an.b.g r3 = com.google.android.libraries.lens.view.p2070an.p2072b.C25411i.m46824h()
            r3.mo30430c(r1)
            r4 = r3
            com.google.android.libraries.lens.view.an.b.a r4 = (com.google.android.libraries.lens.view.p2070an.p2072b.C25390a) r4
            r4.f69164a = r9
            r3.mo30431d(r2)
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r5 = new android.os.StrictMode$ThreadPolicy$Builder     // Catch:{ all -> 0x0142 }
            r5.<init>(r4)     // Catch:{ all -> 0x0142 }
            android.os.StrictMode$ThreadPolicy$Builder r5 = r5.permitCustomSlowCalls()     // Catch:{ all -> 0x0142 }
            android.os.StrictMode$ThreadPolicy r5 = r5.build()     // Catch:{ all -> 0x0142 }
            android.os.StrictMode.setThreadPolicy(r5)     // Catch:{ all -> 0x0142 }
            com.google.android.libraries.lens.view.h.c.a r5 = r0.f69268d     // Catch:{ all -> 0x0142 }
            byte[] r2 = r5.mo32034a(r1, r2)     // Catch:{ IOException -> 0x0139 }
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90833j(r2)     // Catch:{ all -> 0x0142 }
            r5 = r3
            com.google.android.libraries.lens.view.an.b.a r5 = (com.google.android.libraries.lens.view.p2070an.p2072b.C25390a) r5     // Catch:{ all -> 0x0142 }
            r5.f69166c = r2     // Catch:{ all -> 0x0142 }
            android.os.StrictMode.setThreadPolicy(r4)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            com.google.android.libraries.f.a r0 = r0.f69270f
            long r4 = r0.mo26873e()
            long r4 = r4 - r10
            r2.toMicros(r4)
            com.google.android.libraries.lens.view.an.b.i r0 = r3.mo30466e()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.getWidth()
            r8.getHeight()
            r1.getWidth()
            r1.getHeight()
            com.google.common.base.ax r2 = r0.mo30451d()
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x012a
            com.google.common.base.ax r2 = r0.mo30451d()
            java.lang.Object r2 = r2.mo56107c()
            byte[] r2 = (byte[]) r2
            int r2 = r2.length
        L_0x012a:
            r0.mo30448a()
            android.graphics.Bitmap r2 = r0.mo30449b()
            if (r1 == r2) goto L_0x0138
            if (r1 == r8) goto L_0x0138
            r1.recycle()
        L_0x0138:
            return r0
        L_0x0139:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = "Failed compression"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0142 }
            throw r1     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2070an.p2072b.C25413k.call():java.lang.Object");
    }
}
