package com.google.android.play.core.p3534f;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.google.android.play.core.p3534f.p3537c.C45094c;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.play.core.f.a */
/* compiled from: PG */
public final class C45081a {

    /* renamed from: a */
    private final C45097e f117739a;

    public C45081a(C45097e eVar) {
        this.f117739a = eVar;
    }

    /* renamed from: b */
    public static final int m80244b(AssetManager assetManager, File file) {
        int intValue = ((Integer) C45094c.m80262c(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        Log.d("SplitCompat", "addAssetPath completed with " + intValue);
        return intValue;
    }

    /* renamed from: a */
    public final synchronized void mo48913a(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m80244b(assets, (File) it.next());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028 A[Catch:{ Exception -> 0x0046 }, LOOP:0: B:14:0x0022->B:16:0x0028, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[SYNTHETIC, Splitter:B:19:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042 A[DONT_GENERATE] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo48914c(android.content.Context r5, java.util.Set r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()     // Catch:{ Exception -> 0x0010 }
            android.os.StrictMode.allowThreadDiskReads()     // Catch:{ Exception -> 0x000c }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ Exception -> 0x000c }
            goto L_0x0019
        L_0x000c:
            r1 = move-exception
            goto L_0x0012
        L_0x000e:
            r5 = move-exception
            goto L_0x005d
        L_0x0010:
            r1 = move-exception
            r0 = 0
        L_0x0012:
            java.lang.String r2 = "SplitCompat"
            java.lang.String r3 = "Unable to set up strict mode."
            android.util.Log.i(r2, r3, r1)     // Catch:{ all -> 0x000e }
        L_0x0019:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ Exception -> 0x0046 }
            r1.<init>()     // Catch:{ Exception -> 0x0046 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0046 }
        L_0x0022:
            boolean r2 = r6.hasNext()     // Catch:{ Exception -> 0x0046 }
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r6.next()     // Catch:{ Exception -> 0x0046 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0046 }
            com.google.android.play.core.f.e r3 = r4.f117739a     // Catch:{ Exception -> 0x0046 }
            java.io.File r2 = r3.mo48933f(r2)     // Catch:{ Exception -> 0x0046 }
            r1.add(r2)     // Catch:{ Exception -> 0x0046 }
            goto L_0x0022
        L_0x0038:
            r4.mo48913a(r5, r1)     // Catch:{ Exception -> 0x0046 }
            if (r0 == 0) goto L_0x0042
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x000e }
            monitor-exit(r4)
            return
        L_0x0042:
            monitor-exit(r4)
            return
        L_0x0044:
            r5 = move-exception
            goto L_0x0057
        L_0x0046:
            r5 = move-exception
            java.lang.String r6 = "SplitCompat"
            java.lang.String r1 = "Error installing additional splits"
            android.util.Log.e(r6, r1, r5)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0055
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x000e }
            monitor-exit(r4)
            return
        L_0x0055:
            monitor-exit(r4)
            return
        L_0x0057:
            if (r0 == 0) goto L_0x005c
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x000e }
        L_0x005c:
            throw r5     // Catch:{ all -> 0x000e }
        L_0x005d:
            monitor-exit(r4)
            goto L_0x0060
        L_0x005f:
            throw r5
        L_0x0060:
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p3534f.C45081a.mo48914c(android.content.Context, java.util.Set):void");
    }
}
