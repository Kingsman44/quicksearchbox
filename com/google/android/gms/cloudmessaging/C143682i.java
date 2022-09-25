package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10781d.C143860a;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.cloudmessaging.i */
/* compiled from: PG */
final class C143682i implements ServiceConnection {

    /* renamed from: a */
    int f389532a = 0;

    /* renamed from: b */
    final Messenger f389533b = new Messenger(new C144861c(Looper.getMainLooper(), new C143678e(this)));

    /* renamed from: c */
    C143683j f389534c;

    /* renamed from: d */
    final Queue f389535d = new ArrayDeque();

    /* renamed from: e */
    final SparseArray f389536e = new SparseArray();

    /* renamed from: f */
    final /* synthetic */ C143687n f389537f;

    public C143682i(C143687n nVar) {
        this.f389537f = nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo119045a() {
        this.f389537f.f389545b.execute(new C143677d(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo119046b() {
        if (this.f389532a == 1) {
            mo119051g("Timed out while binding");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo119047c(int i) {
        C143684k kVar = (C143684k) this.f389536e.get(i);
        if (kVar != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i);
            this.f389536e.remove(i);
            kVar.mo119054a(new C143685l("Timed out waiting for response", (Throwable) null));
            mo119048d();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo119048d() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f389532a     // Catch:{ all -> 0x0037 }
            r1 = 2
            if (r0 != r1) goto L_0x0035
            java.util.Queue r0 = r2.f389535d     // Catch:{ all -> 0x0037 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0035
            android.util.SparseArray r0 = r2.f389536e     // Catch:{ all -> 0x0037 }
            int r0 = r0.size()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0037 }
        L_0x0025:
            r0 = 3
            r2.f389532a = r0     // Catch:{ all -> 0x0037 }
            com.google.android.gms.common.d.a r0 = com.google.android.gms.common.p10781d.C143860a.m233845a()     // Catch:{ all -> 0x0037 }
            com.google.android.gms.cloudmessaging.n r1 = r2.f389537f     // Catch:{ all -> 0x0037 }
            android.content.Context r1 = r1.f389544a     // Catch:{ all -> 0x0037 }
            r0.mo119311b(r1, r2)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x0035:
            monitor-exit(r2)
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.C143682i.mo119048d():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo119050f(String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        int i = this.f389532a;
        if (i == 0) {
            throw new IllegalStateException();
        } else if (i == 1 || i == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f389532a = 4;
            C143860a.m233845a().mo119311b(this.f389537f.f389544a, this);
            C143685l lVar = new C143685l(str, th);
            for (C143684k a : this.f389535d) {
                a.mo119054a(lVar);
            }
            this.f389535d.clear();
            for (int i2 = 0; i2 < this.f389536e.size(); i2++) {
                ((C143684k) this.f389536e.valueAt(i2)).mo119054a(lVar);
            }
            this.f389536e.clear();
        } else if (i == 3) {
            this.f389532a = 4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo119051g(String str) {
        mo119050f(str, (Throwable) null);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f389537f.f389545b.execute(new C143680g(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f389537f.f389545b.execute(new C143681h(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized boolean mo119049e(C143684k kVar) {
        int i = this.f389532a;
        boolean z = false;
        if (i == 0) {
            this.f389535d.add(kVar);
            if (this.f389532a == 0) {
                z = true;
            }
            C143919bh.m233966i(z);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f389532a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!C143860a.m233845a().mo119313d(this.f389537f.f389544a, intent, this, 1)) {
                    mo119051g("Unable to bind to service");
                } else {
                    this.f389537f.f389545b.schedule(new C143676c(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e) {
                mo119050f("Unable to bind to service", e);
            }
        } else if (i == 1) {
            this.f389535d.add(kVar);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f389535d.add(kVar);
            mo119045a();
            return true;
        }
        return true;
    }
}
