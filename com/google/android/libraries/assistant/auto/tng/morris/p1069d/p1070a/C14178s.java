package com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.d.a.s */
/* compiled from: PG */
public final /* synthetic */ class C14178s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ NotificationListenerService.RankingMap f42946a;

    public /* synthetic */ C14178s(NotificationListenerService.RankingMap rankingMap) {
        this.f42946a = rankingMap;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return !C14180u.m30543h((StatusBarNotification) obj, this.f42946a);
    }
}
