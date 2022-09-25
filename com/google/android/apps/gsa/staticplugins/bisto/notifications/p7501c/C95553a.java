package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7501c;

import android.app.Notification;
import android.service.notification.StatusBarNotification;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.c.a */
/* compiled from: PG */
public final /* synthetic */ class C95553a {
    /* renamed from: a */
    public static boolean m158154a(StatusBarNotification statusBarNotification, int i) {
        Notification.Action[] actionArr = statusBarNotification.getNotification().actions;
        return actionArr != null && actionArr.length == i;
    }
}
