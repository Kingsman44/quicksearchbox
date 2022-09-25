package com.google.android.apps.search.googleapp.p10535w;

import android.graphics.Bitmap;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.w.a */
/* compiled from: PG */
public final /* synthetic */ class C139855a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f380157a;

    /* renamed from: b */
    public final /* synthetic */ File f380158b;

    public /* synthetic */ C139855a(Bitmap bitmap, File file) {
        this.f380157a = bitmap;
        this.f380158b = file;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f380157a
            java.io.File r1 = r7.f380158b
            r2 = 0
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0049 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0049 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x0049 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0049 }
            r1 = 1
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ all -> 0x002d }
            r5 = 100
            r0.compress(r4, r5, r3)     // Catch:{ all -> 0x002d }
            r3.close()     // Catch:{ IOException -> 0x0049 }
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.p10535w.C139856b.f380159a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r2 = "Saved screenshot to storage."
            r3 = 40965(0xa005, float:5.7404E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x005b
        L_0x002d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0048
        L_0x0032:
            r3 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0048 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r2] = r5     // Catch:{ Exception -> 0x0048 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x0048 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0048 }
            r1[r2] = r3     // Catch:{ Exception -> 0x0048 }
            r4.invoke(r0, r1)     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            throw r0     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.p10535w.C139856b.f380159a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Unable to save screenshot."
            r3 = 40966(0xa006, float:5.7406E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10535w.C139855a.call():java.lang.Object");
    }
}
