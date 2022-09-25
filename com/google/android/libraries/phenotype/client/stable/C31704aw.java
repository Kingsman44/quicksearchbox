package com.google.android.libraries.phenotype.client.stable;

import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.phenotype.client.stable.aw */
/* compiled from: PG */
final class C31704aw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C60888db f85242a;

    /* renamed from: b */
    final /* synthetic */ long f85243b;

    /* renamed from: c */
    final /* synthetic */ TimeUnit f85244c;

    public C31704aw(C60888db dbVar, long j, TimeUnit timeUnit) {
        this.f85242a = dbVar;
        this.f85243b = j;
        this.f85244c = timeUnit;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.lang.String r0 = "PhenotypeProcessReaper"
            android.app.ActivityManager$RunningAppProcessInfo r1 = new android.app.ActivityManager$RunningAppProcessInfo
            r1.<init>()
            r2 = 0
            android.app.ActivityManager.getMyMemoryState(r1)     // Catch:{ RuntimeException -> 0x0026 }
            int r3 = r1.importance
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Memory state is: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.i(r0, r3)
            int r1 = r1.importance
            r3 = 400(0x190, float:5.6E-43)
            if (r1 < r3) goto L_0x002c
            r1 = 1
            goto L_0x002d
        L_0x0026:
            r1 = move-exception
            java.lang.String r3 = "Failed to retrieve memory state, not killing process."
            android.util.Log.w(r0, r3, r1)
        L_0x002c:
            r1 = 0
        L_0x002d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0046
            java.lang.String r1 = "Killing process to refresh experiment configuration"
            android.util.Log.i(r0, r1)
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            java.lang.System.exit(r2)
        L_0x0046:
            com.google.common.util.concurrent.db r0 = r6.f85242a
            long r1 = r6.f85243b
            java.util.concurrent.TimeUnit r3 = r6.f85244c
            com.google.common.util.concurrent.cz r0 = r0.mo29164d(r6, r1, r3)
            com.google.android.libraries.phenotype.client.stable.C31703av.m59037a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.stable.C31704aw.run():void");
    }
}
