package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.p291h.C5623j;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.manager.z */
/* compiled from: PG */
final class C5994z {

    /* renamed from: b */
    private static volatile C5994z f17670b;

    /* renamed from: a */
    final Set f17671a = new HashSet();

    /* renamed from: c */
    private boolean f17672c;

    /* renamed from: d */
    private final C5993y f17673d;

    private C5994z(Context context) {
        this.f17673d = new C5993y(new C5623j(new C5989u(context)), new C5990v(this));
    }

    /* renamed from: a */
    static C5994z m15431a(Context context) {
        if (f17670b == null) {
            synchronized (C5994z.class) {
                if (f17670b == null) {
                    f17670b = new C5994z(context.getApplicationContext());
                }
            }
        }
        return f17670b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12435b(com.bumptech.glide.manager.C5971c r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Set r0 = r3.f17671a     // Catch:{ all -> 0x0050 }
            r0.add(r4)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.f17672c     // Catch:{ all -> 0x0050 }
            if (r4 != 0) goto L_0x004e
            java.util.Set r4 = r3.f17671a     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0013
            goto L_0x004e
        L_0x0013:
            com.bumptech.glide.manager.y r4 = r3.f17673d     // Catch:{ all -> 0x0050 }
            com.bumptech.glide.h.k r0 = r4.f17668c     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.mo12074a()     // Catch:{ all -> 0x0050 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x0050 }
            android.net.Network r0 = r0.getActiveNetwork()     // Catch:{ all -> 0x0050 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            r4.f17666a = r0     // Catch:{ all -> 0x0050 }
            com.bumptech.glide.h.k r0 = r4.f17668c     // Catch:{ RuntimeException -> 0x0038 }
            java.lang.Object r0 = r0.mo12074a()     // Catch:{ RuntimeException -> 0x0038 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ RuntimeException -> 0x0038 }
            android.net.ConnectivityManager$NetworkCallback r4 = r4.f17669d     // Catch:{ RuntimeException -> 0x0038 }
            r0.registerDefaultNetworkCallback(r4)     // Catch:{ RuntimeException -> 0x0038 }
            goto L_0x004a
        L_0x0038:
            r4 = move-exception
            java.lang.String r0 = "ConnectivityMonitor"
            r1 = 5
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "ConnectivityMonitor"
            java.lang.String r1 = "Failed to register callback"
            android.util.Log.w(r0, r1, r4)     // Catch:{ all -> 0x0050 }
        L_0x0049:
            r1 = 0
        L_0x004a:
            r3.f17672c = r1     // Catch:{ all -> 0x0050 }
            monitor-exit(r3)
            return
        L_0x004e:
            monitor-exit(r3)
            return
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.C5994z.mo12435b(com.bumptech.glide.manager.c):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12436c(com.bumptech.glide.manager.C5971c r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Set r0 = r1.f17671a     // Catch:{ all -> 0x0029 }
            r0.remove(r2)     // Catch:{ all -> 0x0029 }
            boolean r2 = r1.f17672c     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0027
            java.util.Set r2 = r1.f17671a     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r2 != 0) goto L_0x0013
            goto L_0x0027
        L_0x0013:
            com.bumptech.glide.manager.y r2 = r1.f17673d     // Catch:{ all -> 0x0029 }
            com.bumptech.glide.h.k r0 = r2.f17668c     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.mo12074a()     // Catch:{ all -> 0x0029 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x0029 }
            android.net.ConnectivityManager$NetworkCallback r2 = r2.f17669d     // Catch:{ all -> 0x0029 }
            r0.unregisterNetworkCallback(r2)     // Catch:{ all -> 0x0029 }
            r2 = 0
            r1.f17672c = r2     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            return
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.C5994z.mo12436c(com.bumptech.glide.manager.c):void");
    }
}
