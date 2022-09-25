package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.w */
/* compiled from: PG */
public final /* synthetic */ class C36595w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C36557ac f95427a;

    /* renamed from: b */
    public final /* synthetic */ StatusBarNotification f95428b;

    /* renamed from: c */
    public final /* synthetic */ NotificationListenerService.RankingMap f95429c;

    public /* synthetic */ C36595w(C36557ac acVar, StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.f95427a = acVar;
        this.f95428b = statusBarNotification;
        this.f95429c = rankingMap;
    }

    public final void run() {
        C36557ac acVar = this.f95427a;
        acVar.mo40219h().mo21533e(this.f95428b, this.f95429c);
    }
}
