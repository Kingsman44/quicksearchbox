package com.google.android.libraries.web.contrib.p3388h;

import android.graphics.Bitmap;
import com.google.common.util.concurrent.C60930r;
import java.io.File;

/* renamed from: com.google.android.libraries.web.contrib.h.c */
/* compiled from: PG */
public final /* synthetic */ class C43611c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ File f113832a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f113833b;

    public /* synthetic */ C43611c(File file, Bitmap bitmap) {
        this.f113832a = file;
        this.f113833b = bitmap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r7 = this;
            java.io.File r0 = r7.f113832a
            android.graphics.Bitmap r1 = r7.f113833b
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x004f }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004f }
            r3.<init>(r0)     // Catch:{ IOException -> 0x004f }
            r2.<init>(r3)     // Catch:{ IOException -> 0x004f }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ all -> 0x0031 }
            r4 = 100
            r1.compress(r3, r4, r2)     // Catch:{ all -> 0x0031 }
            r2.close()     // Catch:{ IOException -> 0x004f }
            com.google.common.f.e r1 = com.google.android.libraries.web.contrib.p3388h.C43612d.f113834a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r0 = r0.getAbsolutePath()
            r2 = 54107(0xd35b, float:7.582E-41)
            java.lang.String r3 = "Saved screenshot to storage at %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56389s(r3, r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            com.google.apps.tiktok.tracing.contrib.b.f r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r0)
            goto L_0x0066
        L_0x0031:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0036 }
            goto L_0x004e
        L_0x0036:
            r1 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x004e }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x004e }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x004e }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x004e }
            r2[r5] = r1     // Catch:{ Exception -> 0x004e }
            r3.invoke(r0, r2)     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            throw r0     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.libraries.web.contrib.p3388h.C43612d.f113834a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Unable to save screenshot."
            r3 = 54108(0xd35c, float:7.5821E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            com.google.apps.tiktok.tracing.contrib.b.f r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r0)
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.contrib.p3388h.C43611c.mo18058a():com.google.common.util.concurrent.cx");
    }
}
