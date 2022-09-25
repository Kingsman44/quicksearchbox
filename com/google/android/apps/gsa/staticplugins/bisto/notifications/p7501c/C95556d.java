package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7501c;

import android.service.notification.StatusBarNotification;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.c.d */
/* compiled from: PG */
public final class C95556d implements C95554b {
    /* renamed from: a */
    public final boolean mo89446a(StatusBarNotification statusBarNotification) {
        String group = statusBarNotification.getNotification().getGroup();
        if (!"com.whatsapp".equals(statusBarNotification.getPackageName()) || !statusBarNotification.isOngoing() || statusBarNotification.isClearable() || group != null || !C95553a.m158154a(statusBarNotification, 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo89447b(StatusBarNotification statusBarNotification) {
        String group = statusBarNotification.getNotification().getGroup();
        return group != null && group.equals("call_notification_group") && statusBarNotification.isOngoing() && !statusBarNotification.isClearable() && C95553a.m158154a(statusBarNotification, 2);
    }
}
