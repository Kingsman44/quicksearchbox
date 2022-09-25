package com.google.android.apps.gsa.staticplugins.opa.samson.p8434i;

import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.notificationlistener.C83390g;
import com.google.android.apps.gsa.notificationlistener.C83405u;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89622at;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.i.e */
/* compiled from: PG */
public final class C110183e implements C36599b {

    /* renamed from: a */
    public final C89622at f307019a;

    /* renamed from: b */
    private final C22871g f307020b;

    /* renamed from: c */
    private final List f307021c = new ArrayList();

    /* renamed from: d */
    private final C88483e f307022d;

    public C110183e(C89622at atVar, C22871g gVar, C88483e eVar) {
        this.f307019a = atVar;
        this.f307020b = gVar;
        this.f307022d = eVar;
    }

    /* renamed from: i */
    private final void m183481i(C87739bu buVar, Bundle bundle) {
        C88489j jVar = new C88489j(buVar);
        jVar.mo82015c(bundle);
        ClientEventData a = jVar.mo82013a();
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.OPA_ANDROID;
        gVar.f239204f = "opa_ambient";
        this.f307022d.mo82004b(new ClientConfig(gVar), a, 50000);
    }

    /* renamed from: a */
    public final void mo21529a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f307019a.mo83488c();
    }

    /* renamed from: b */
    public final void mo21530b(boolean z) {
        this.f307020b.mo28212l("onDisconnected", new C110179a(this));
    }

    /* renamed from: c */
    public final void mo21531c(int i) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: d */
    public final void mo21532d(int i) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: e */
    public final void mo21533e(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.f307020b.mo28212l("onNotificationPosted", new C110180b(this));
    }

    /* renamed from: f */
    public final void mo21534f(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.f307020b.mo28212l("onNotificationRemoved", new C110182d(this, statusBarNotification));
    }

    /* renamed from: g */
    public final void mo21535g(C83390g gVar) {
        this.f307020b.mo28212l("onConnected", new C110181c(this, gVar));
    }

    /* renamed from: h */
    public final void mo98458h(int i, StatusBarNotification... statusBarNotificationArr) {
        StatusBarNotification[] statusBarNotificationArr2;
        C58976aa aaVar = C58975e.f156826a;
        if (statusBarNotificationArr.length != 0) {
            Bundle bundle = new Bundle();
            if (i - 1 != 0) {
                bundle.putParcelable("removed_notifications", statusBarNotificationArr[0]);
                m183481i(C87739bu.DELIVER_REMOVED_NOTIFICATIONS, bundle);
                return;
            }
            List<C83405u> list = this.f307021c;
            ArrayList arrayList = new ArrayList();
            if (!list.isEmpty()) {
                for (C83405u c : list) {
                    arrayList.addAll(c.mo76699c(Arrays.asList(statusBarNotificationArr)));
                }
            } else {
                arrayList = new ArrayList(Arrays.asList(statusBarNotificationArr));
            }
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                StatusBarNotification statusBarNotification = (StatusBarNotification) arrayList.get(i2);
                if (!statusBarNotification.isGroup()) {
                    arrayList2.add(statusBarNotification);
                } else if (!hashMap.containsKey(statusBarNotification.getGroupKey())) {
                    hashMap.put(statusBarNotification.getGroupKey(), Integer.valueOf(arrayList2.size()));
                    arrayList2.add(statusBarNotification);
                } else {
                    Integer num = (Integer) hashMap.get(statusBarNotification.getGroupKey());
                    if (num != null) {
                        arrayList2.set(num.intValue(), statusBarNotification);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                statusBarNotificationArr2 = new StatusBarNotification[0];
            } else {
                StatusBarNotification[] statusBarNotificationArr3 = new StatusBarNotification[arrayList2.size()];
                arrayList2.toArray(statusBarNotificationArr3);
                statusBarNotificationArr2 = statusBarNotificationArr3;
            }
            if (statusBarNotificationArr2.length != 0) {
                bundle.putParcelableArray("active_notifications", statusBarNotificationArr2);
                m183481i(C87739bu.DELIVER_ACTIVE_NOTIFICATIONS, bundle);
            }
        }
    }
}
