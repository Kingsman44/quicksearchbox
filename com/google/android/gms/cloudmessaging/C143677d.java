package com.google.android.gms.cloudmessaging;

/* renamed from: com.google.android.gms.cloudmessaging.d */
/* compiled from: PG */
public final /* synthetic */ class C143677d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143682i f389525a;

    public /* synthetic */ C143677d(C143682i iVar) {
        this.f389525a = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        android.util.Log.d("MessengerIpcClient", "Sending ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r2 = r0.f389537f.f389544a;
        r3 = r0.f389533b;
        r4 = android.os.Message.obtain();
        r4.what = 1;
        r4.arg1 = r1.f389540a;
        r4.replyTo = r3;
        r3 = new android.os.Bundle();
        r3.putBoolean("oneWay", r1.mo119056c());
        r3.putString("pkg", r2.getPackageName());
        r3.putBundle("data", r1.f389542c);
        r4.setData(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r0.f389534c;
        r2 = r1.f389538a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r2 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        r2.send(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0092, code lost:
        r1 = r1.f389539b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0094, code lost:
        if (r1 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        r1.mo119031b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a2, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        r0.mo119051g(r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.cloudmessaging.i r0 = r7.f389525a
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f389532a     // Catch:{ all -> 0x00ad }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            return
        L_0x000a:
            java.util.Queue r1 = r0.f389535d     // Catch:{ all -> 0x00ad }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ad }
            if (r1 == 0) goto L_0x0017
            r0.mo119048d()     // Catch:{ all -> 0x00ad }
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            return
        L_0x0017:
            java.util.Queue r1 = r0.f389535d     // Catch:{ all -> 0x00ad }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00ad }
            com.google.android.gms.cloudmessaging.k r1 = (com.google.android.gms.cloudmessaging.C143684k) r1     // Catch:{ all -> 0x00ad }
            android.util.SparseArray r2 = r0.f389536e     // Catch:{ all -> 0x00ad }
            int r3 = r1.f389540a     // Catch:{ all -> 0x00ad }
            r2.put(r3, r1)     // Catch:{ all -> 0x00ad }
            com.google.android.gms.cloudmessaging.n r2 = r0.f389537f     // Catch:{ all -> 0x00ad }
            java.util.concurrent.ScheduledExecutorService r2 = r2.f389545b     // Catch:{ all -> 0x00ad }
            com.google.android.gms.cloudmessaging.f r3 = new com.google.android.gms.cloudmessaging.f     // Catch:{ all -> 0x00ad }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x00ad }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ad }
            r5 = 30
            r2.schedule(r3, r5, r4)     // Catch:{ all -> 0x00ad }
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = "MessengerIpcClient"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x0053
            java.lang.String r2 = "MessengerIpcClient"
            java.lang.String r3 = "Sending "
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r3 = r3.concat(r4)
            android.util.Log.d(r2, r3)
        L_0x0053:
            com.google.android.gms.cloudmessaging.n r2 = r0.f389537f
            android.content.Context r2 = r2.f389544a
            android.os.Messenger r3 = r0.f389533b
            android.os.Message r4 = android.os.Message.obtain()
            r5 = 1
            r4.what = r5
            int r5 = r1.f389540a
            r4.arg1 = r5
            r4.replyTo = r3
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r5 = "oneWay"
            boolean r6 = r1.mo119056c()
            r3.putBoolean(r5, r6)
            java.lang.String r5 = "pkg"
            java.lang.String r2 = r2.getPackageName()
            r3.putString(r5, r2)
            java.lang.String r2 = "data"
            android.os.Bundle r1 = r1.f389542c
            r3.putBundle(r2, r1)
            r4.setData(r3)
            com.google.android.gms.cloudmessaging.j r1 = r0.f389534c     // Catch:{ RemoteException -> 0x00a3 }
            android.os.Messenger r2 = r1.f389538a     // Catch:{ RemoteException -> 0x00a3 }
            if (r2 == 0) goto L_0x0092
            r2.send(r4)     // Catch:{ RemoteException -> 0x00a3 }
            goto L_0x0002
        L_0x0092:
            com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat r1 = r1.f389539b     // Catch:{ RemoteException -> 0x00a3 }
            if (r1 == 0) goto L_0x009b
            r1.mo119031b(r4)     // Catch:{ RemoteException -> 0x00a3 }
            goto L_0x0002
        L_0x009b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00a3 }
            java.lang.String r2 = "Both messengers are null"
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x00a3 }
            throw r1     // Catch:{ RemoteException -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.mo119051g(r1)
            goto L_0x0002
        L_0x00ad:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            goto L_0x00b1
        L_0x00b0:
            throw r1
        L_0x00b1:
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.C143677d.run():void");
    }
}
