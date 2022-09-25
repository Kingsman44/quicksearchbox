package com.google.android.gms.cloudmessaging;

import android.os.Handler;

/* renamed from: com.google.android.gms.cloudmessaging.e */
/* compiled from: PG */
public final /* synthetic */ class C143678e implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C143682i f389526a;

    public /* synthetic */ C143678e(C143682i iVar) {
        this.f389526a = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        r6 = r6.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (r6.getBoolean("unsupported", false) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        r3.mo119054a(new com.google.android.gms.cloudmessaging.C143685l("Not supported by GmsCore", (java.lang.Throwable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        r3.mo119055b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Received response for unknown request: "
            com.google.android.gms.cloudmessaging.i r1 = r5.f389526a
            int r2 = r6.arg1
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0022
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Received response to request: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r4 = "MessengerIpcClient"
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L_0x0022:
            monitor-enter(r1)
            android.util.SparseArray r3 = r1.f389536e     // Catch:{ all -> 0x0067 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0067 }
            com.google.android.gms.cloudmessaging.k r3 = (com.google.android.gms.cloudmessaging.C143684k) r3     // Catch:{ all -> 0x0067 }
            if (r3 != 0) goto L_0x0040
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r6.<init>(r0)     // Catch:{ all -> 0x0067 }
            r6.append(r2)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0067 }
            android.util.Log.w(r0, r6)     // Catch:{ all -> 0x0067 }
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            goto L_0x0065
        L_0x0040:
            android.util.SparseArray r0 = r1.f389536e     // Catch:{ all -> 0x0067 }
            r0.remove(r2)     // Catch:{ all -> 0x0067 }
            r1.mo119048d()     // Catch:{ all -> 0x0067 }
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            android.os.Bundle r6 = r6.getData()
            java.lang.String r0 = "unsupported"
            r1 = 0
            boolean r0 = r6.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x0062
            com.google.android.gms.cloudmessaging.l r6 = new com.google.android.gms.cloudmessaging.l
            java.lang.String r0 = "Not supported by GmsCore"
            r1 = 0
            r6.<init>(r0, r1)
            r3.mo119054a(r6)
            goto L_0x0065
        L_0x0062:
            r3.mo119055b(r6)
        L_0x0065:
            r6 = 1
            return r6
        L_0x0067:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.C143678e.handleMessage(android.os.Message):boolean");
    }
}
