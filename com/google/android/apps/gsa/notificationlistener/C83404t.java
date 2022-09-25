package com.google.android.apps.gsa.notificationlistener;

import android.service.notification.StatusBarNotification;
import com.google.common.p4522b.C58528ij;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.notificationlistener.t */
/* compiled from: PG */
public final class C83404t implements C83402r {

    /* renamed from: a */
    private final Set f227298a;

    public C83404t(String[] strArr) {
        this.f227298a = C58528ij.m90008H(strArr);
    }

    /* renamed from: a */
    public final List mo76698a(List list) {
        C83405u uVar = C83405u.f227299a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
            if (this.f227298a.contains(statusBarNotification.getPackageName())) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }
}
