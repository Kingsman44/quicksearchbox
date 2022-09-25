package com.google.p3723ar.core;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.play.core.install.p3544b.C45200a;
import com.google.p3723ar.core.ArCoreApk;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.ar.core.s */
/* compiled from: PG */
final class C47913s extends C47908n {

    /* renamed from: a */
    public C45200a f124054a;

    /* renamed from: b */
    private final Queue f124055b = new ArrayDeque();

    /* renamed from: c */
    private Context f124056c;

    /* renamed from: d */
    private final ServiceConnection f124057d = new C47909o(this);

    /* renamed from: e */
    private volatile int f124058e = 1;

    /* renamed from: a */
    public final synchronized void mo52254a(Context context) {
        this.f124056c = context;
        if (context.bindService(new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending"), this.f124057d, 1)) {
            this.f124058e = 2;
            return;
        }
        this.f124058e = 1;
        this.f124056c = null;
        Log.w("ARCore-InstallService", "bindService returned false.");
        context.unbindService(this.f124057d);
    }

    /* renamed from: b */
    public final synchronized void mo52255b(Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        try {
            m85117f(new C47911q(this, context, iCheckAvailabilityCallback));
        } catch (C47912r unused) {
            Log.e("ARCore-InstallService", "Play Store install service could not be bound.");
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    /* renamed from: c */
    public final synchronized void mo52256c() {
        int i = this.f124058e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1 || i2 == 2) {
            this.f124056c.unbindService(this.f124057d);
            this.f124056c = null;
            this.f124058e = 1;
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo52260d(android.os.IBinder r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0005
            r3 = 0
            goto L_0x0019
        L_0x0005:
            java.lang.String r0 = "com.google.android.play.core.install.protocol.IInstallService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)     // Catch:{ all -> 0x003d }
            boolean r1 = r0 instanceof com.google.android.play.core.install.p3544b.C45200a     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x0013
            r3 = r0
            com.google.android.play.core.install.b.a r3 = (com.google.android.play.core.install.p3544b.C45200a) r3     // Catch:{ all -> 0x003d }
            goto L_0x0019
        L_0x0013:
            com.google.android.play.core.install.b.a r0 = new com.google.android.play.core.install.b.a     // Catch:{ all -> 0x003d }
            r0.<init>(r3)     // Catch:{ all -> 0x003d }
            r3 = r0
        L_0x0019:
            java.lang.String r0 = "ARCore-InstallService"
            java.lang.String r1 = "Install service connected"
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x003d }
            r2.f124054a = r3     // Catch:{ all -> 0x003d }
            r3 = 3
            r2.f124058e = r3     // Catch:{ all -> 0x003d }
            java.util.Queue r3 = r2.f124055b     // Catch:{ all -> 0x003d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x003d }
        L_0x002b:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x003d }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x003d }
            r0.run()     // Catch:{ all -> 0x003d }
            goto L_0x002b
        L_0x003b:
            monitor-exit(r2)
            return
        L_0x003d:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x0041
        L_0x0040:
            throw r3
        L_0x0041:
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p3723ar.core.C47913s.mo52260d(android.os.IBinder):void");
    }

    /* renamed from: e */
    public final synchronized void mo52261e() {
        Log.i("ARCore-InstallService", "Install service disconnected");
        this.f124058e = 1;
        this.f124054a = null;
    }

    /* renamed from: f */
    private final synchronized void m85117f(Runnable runnable) {
        int i = this.f124058e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            throw new C47912r();
        } else if (i2 == 1) {
            this.f124055b.offer(runnable);
        } else if (i2 == 2) {
            runnable.run();
        }
    }
}
