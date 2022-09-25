package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C36555aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C36557ac f95345a;

    /* renamed from: b */
    public final /* synthetic */ StatusBarNotification f95346b;

    /* renamed from: c */
    public final /* synthetic */ NotificationListenerService.RankingMap f95347c;

    public /* synthetic */ C36555aa(C36557ac acVar, StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.f95345a = acVar;
        this.f95346b = statusBarNotification;
        this.f95347c = rankingMap;
    }

    public final void run() {
        C36557ac acVar = this.f95345a;
        acVar.mo40219h().mo21534f(this.f95346b, this.f95347c);
    }
}
