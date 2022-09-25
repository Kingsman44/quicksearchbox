package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import android.service.notification.StatusBarNotification;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.h */
/* compiled from: PG */
public final /* synthetic */ class C95612h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95615k f267581a;

    /* renamed from: b */
    public final /* synthetic */ StatusBarNotification f267582b;

    public /* synthetic */ C95612h(C95615k kVar, StatusBarNotification statusBarNotification) {
        this.f267581a = kVar;
        this.f267582b = statusBarNotification;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.k r0 = r5.f267581a
            android.service.notification.StatusBarNotification r1 = r5.f267582b
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f267596i
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x000d
            return
        L_0x000d:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.app.Notification r2 = r1.getNotification()
            r3 = 0
            r2.largeIcon = r3
            r2.bigContentView = r3
            r2.contentView = r3
            r2.headsUpContentView = r3
            r2.tickerView = r3
            r2.audioAttributes = r3
            r2.fullScreenIntent = r3
            r2.contentIntent = r3
            r2.deleteIntent = r3
            android.os.Bundle r3 = r2.extras
            java.lang.String r4 = "android.largeIcon"
            r3.remove(r4)
            android.os.Bundle r2 = r2.extras
            java.lang.String r3 = "android.largeIcon.big"
            r2.remove(r3)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.u r2 = r0.f267594g
            java.lang.String r3 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146966e(r1)
            java.util.Set r4 = r2.f267624d
            r4.remove(r3)
            monitor-enter(r2)
            java.lang.String r4 = r2.f267625e     // Catch:{ all -> 0x006b }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x0051
            android.os.Vibrator r3 = r2.f267622b     // Catch:{ all -> 0x006b }
            r3.cancel()     // Catch:{ all -> 0x006b }
            java.lang.String r3 = ""
            r2.f267625e = r3     // Catch:{ all -> 0x006b }
        L_0x0051:
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            java.lang.Object r3 = r0.f267588a
            monitor-enter(r3)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.b r0 = r0.f267591d     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0066
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.aw r2 = r0.f267565c     // Catch:{ all -> 0x0068 }
            boolean r1 = r2.mo89557g(r1)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x0066
            r0.mo89559a()     // Catch:{ all -> 0x0068 }
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            return
        L_0x0066:
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            return
        L_0x0068:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            throw r0
        L_0x006b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95612h.run():void");
    }
}
