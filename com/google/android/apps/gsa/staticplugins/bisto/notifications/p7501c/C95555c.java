package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7501c;

import android.service.notification.StatusBarNotification;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.c.c */
/* compiled from: PG */
public final class C95555c implements C95554b {
    /* renamed from: a */
    public final boolean mo89446a(StatusBarNotification statusBarNotification) {
        if (!"com.google.android.talk".equals(statusBarNotification.getPackageName()) || !statusBarNotification.isOngoing() || "msg".equals(statusBarNotification.getNotification().category) || !C95553a.m158154a(statusBarNotification, 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo89447b(StatusBarNotification statusBarNotification) {
        return statusBarNotification.getTag() != null && statusBarNotification.getTag().equals("com.google.android.talk:hangouts_ring_notification") && C95553a.m158154a(statusBarNotification, 2);
    }
}
