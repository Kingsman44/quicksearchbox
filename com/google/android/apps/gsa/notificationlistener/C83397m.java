package com.google.android.apps.gsa.notificationlistener;

import android.service.notification.NotificationListenerService;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.notificationlistener.m */
/* compiled from: PG */
class C83397m extends NotificationListenerService implements C68288b {

    /* renamed from: a */
    private volatile C68326i f227289a;

    /* renamed from: b */
    private final Object f227290b = new Object();

    /* renamed from: c */
    private boolean f227291c = false;

    /* renamed from: b */
    public final C68326i mo76696b() {
        if (this.f227289a == null) {
            synchronized (this.f227290b) {
                if (this.f227289a == null) {
                    this.f227289a = new C68326i(this);
                }
            }
        }
        return this.f227289a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo76696b().mo17653jN();
    }

    public void onCreate() {
        if (!this.f227291c) {
            this.f227291c = true;
            mo76696b().mo17653jN();
            GsaNotificationListenerService gsaNotificationListenerService = (GsaNotificationListenerService) this;
        }
        super.onCreate();
    }
}
