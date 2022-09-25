package com.google.android.gms.cloudmessaging;

import android.os.IBinder;

/* renamed from: com.google.android.gms.cloudmessaging.g */
/* compiled from: PG */
public final /* synthetic */ class C143680g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143682i f389529a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f389530b;

    public /* synthetic */ C143680g(C143682i iVar, IBinder iBinder) {
        this.f389529a = iVar;
        this.f389530b = iBinder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        r0.mo119051g(r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002a, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x0009, B:8:0x000e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            com.google.android.gms.cloudmessaging.i r0 = r3.f389529a
            android.os.IBinder r1 = r3.f389530b
            monitor-enter(r0)
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "Null service connection"
            r0.mo119051g(r1)     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x000e:
            com.google.android.gms.cloudmessaging.j r2 = new com.google.android.gms.cloudmessaging.j     // Catch:{ RemoteException -> 0x001f }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x001f }
            r0.f389534c = r2     // Catch:{ RemoteException -> 0x001f }
            r1 = 2
            r0.f389532a = r1     // Catch:{ all -> 0x001d }
            r0.mo119045a()     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r1 = move-exception
            goto L_0x0029
        L_0x001f:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x001d }
            r0.mo119051g(r1)     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.C143680g.run():void");
    }
}
