package com.google.android.apps.gsa.notificationlistener;

import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.notificationlistener.s */
/* compiled from: PG */
final class C83403s implements C83402r {
    /* renamed from: a */
    public final List mo76698a(List list) {
        C83405u uVar = C83405u.f227299a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
            if (C90366ae.m146964c(statusBarNotification.getNotification()) != null) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }
}
