package com.google.android.apps.gsa.notificationlistener;

import android.content.ComponentName;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.notificationlistener.d */
/* compiled from: PG */
public final class C83387d {

    /* renamed from: a */
    public final Context f227268a;

    public C83387d(Context context) {
        this.f227268a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[LOOP:0: B:10:0x003d->B:13:0x0049, LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m132712b(android.content.Context r3, com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b r4) {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.apps.gsa.notificationlistener.C83391h.f227274b
            java.lang.Object r0 = r0.get()
            com.google.android.apps.gsa.notificationlistener.h r0 = (com.google.android.apps.gsa.notificationlistener.C83391h) r0
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1 = 1
            if (r0 == 0) goto L_0x0023
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f227278f
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x0023
            java.util.Set r3 = r0.f227277e
            r3.add(r4)
            com.google.android.apps.gsa.notificationlistener.g r3 = new com.google.android.apps.gsa.notificationlistener.g
            r3.<init>(r4)
            r4.mo21535g(r3)
            goto L_0x007a
        L_0x0023:
            r4 = 0
            if (r0 != 0) goto L_0x0032
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.Class<com.google.android.apps.gsa.notificationlistener.GsaNotificationListenerService> r1 = com.google.android.apps.gsa.notificationlistener.GsaNotificationListenerService.class
            r0.<init>(r3, r1)
            android.service.notification.NotificationListenerService.requestRebind(r0)
        L_0x0030:
            r1 = 0
            goto L_0x007a
        L_0x0032:
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.apps.gsa.notificationlistener.C83391h.f227276d
            com.google.android.apps.gsa.notificationlistener.f r2 = new com.google.android.apps.gsa.notificationlistener.f
            r2.<init>(r3)
            com.google.common.base.cr r3 = com.google.common.base.C58886cw.m90973a(r2)
        L_0x003d:
            r2 = 0
            boolean r2 = r0.compareAndSet(r2, r3)
            if (r2 == 0) goto L_0x0045
            goto L_0x004b
        L_0x0045:
            java.lang.Object r2 = r0.get()
            if (r2 == 0) goto L_0x003d
        L_0x004b:
            com.google.android.apps.gsa.notificationlistener.ad r3 = com.google.android.apps.gsa.notificationlistener.C83391h.m132723b()
            if (r3 == 0) goto L_0x0030
            android.content.Context r0 = r3.f227260b
            boolean r0 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r0)
            if (r0 != 0) goto L_0x005a
            goto L_0x0030
        L_0x005a:
            r3.mo76683a()
            java.lang.Object r0 = r3.f227263e
            monitor-enter(r0)
            r3.f227264f = r4     // Catch:{ all -> 0x0077 }
            r3.f227266h = r1     // Catch:{ all -> 0x0077 }
            com.google.common.util.concurrent.db r1 = r3.f227262d     // Catch:{ all -> 0x0077 }
            com.google.android.apps.gsa.notificationlistener.ac r2 = new com.google.android.apps.gsa.notificationlistener.ac     // Catch:{ all -> 0x0077 }
            r2.<init>(r3)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.Callable r2 = com.google.apps.tiktok.tracing.C47810es.m84978r(r2)     // Catch:{ all -> 0x0077 }
            com.google.common.util.concurrent.cx r1 = r1.mo19399b(r2)     // Catch:{ all -> 0x0077 }
            r3.f227265g = r1     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            goto L_0x0030
        L_0x0077:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            throw r3
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.notificationlistener.C83387d.m132712b(android.content.Context, com.google.android.libraries.search.assistant.t.c.b):boolean");
    }

    /* renamed from: c */
    public static final void m132713c() {
        GsaNotificationListenerService a = C83391h.m132722a();
        if (a != null && a.mo17754z().f227277e.isEmpty()) {
            a.requestUnbind();
        }
    }

    /* renamed from: d */
    public static final void m132714d(C83382ab abVar) {
        C83391h.f227275c.add(abVar);
    }

    /* renamed from: e */
    public static final StatusBarNotification[] m132715e(Optional optional) {
        optional.orElse(C58485gu.m89845m());
        return C83391h.m132727g(optional);
    }

    /* renamed from: f */
    public static final boolean m132716f(String str) {
        GsaNotificationListenerService a = C83391h.m132722a();
        if (a == null) {
            return false;
        }
        a.cancelNotification(str);
        return true;
    }

    /* renamed from: g */
    public static final void m132717g(C83382ab abVar) {
        C83391h.f227275c.remove(abVar);
    }

    /* renamed from: a */
    public final void mo76689a() {
        GsaNotificationListenerService.requestRebind(new ComponentName(this.f227268a, GsaNotificationListenerService.class));
    }
}
