package com.google.android.libraries.search.assistant.proactive;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.service.notification.StatusBarNotification;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4537i.C59294s;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.DesugarArrays;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.search.assistant.proactive.aw */
/* compiled from: PG */
public final class C36227aw implements C36221aq {

    /* renamed from: a */
    public static final C59071e f94636a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.aw");

    /* renamed from: b */
    private final NotificationManager f94637b;

    /* renamed from: c */
    private final Executor f94638c;

    public C36227aw(NotificationManager notificationManager, Executor executor) {
        this.f94637b = notificationManager;
        this.f94638c = executor;
    }

    /* renamed from: a */
    public final NotificationChannel mo40029a(String str) {
        return this.f94637b.getNotificationChannel(str);
    }

    /* renamed from: b */
    public final C58833ax mo40030b(long j) {
        C58833ax axVar;
        StatusBarNotification[] activeNotifications = this.f94637b.getActiveNotifications();
        if (activeNotifications == null) {
            return C58836b.f156633a;
        }
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            Bundle bundle = statusBarNotification.getNotification().extras;
            if (bundle == null) {
                axVar = C58836b.f156633a;
            } else {
                axVar = bundle.containsKey("opa.uniqueNotificationId") ? C58833ax.m90834k(Long.valueOf(bundle.getLong("opa.uniqueNotificationId"))) : C58836b.f156633a;
            }
            if (axVar.mo56113h() && ((Long) axVar.mo56107c()).equals(Long.valueOf(j))) {
                return C58833ax.m90834k(statusBarNotification);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public final List mo40031c() {
        return this.f94637b.getNotificationChannelGroups();
    }

    /* renamed from: d */
    public final void mo40032d(NotificationChannel notificationChannel) {
        try {
            this.f94637b.createNotificationChannel(notificationChannel);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof RemoteException)) {
                C59104x d = f94636a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "NTF.OpaNotificationMgr");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(52241)).mo56389s("Calling createNotificationChannel on O with illegal channel name: %s", notificationChannel);
                return;
            }
            C59104x c = f94636a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NTF.OpaNotificationMgr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(52240)).mo56389s("Calling createNotificationChannel on O with illegal channel name: %s", notificationChannel);
        }
    }

    /* renamed from: e */
    public final void mo40033e(String str) {
        this.f94637b.deleteNotificationChannel(str);
    }

    /* renamed from: f */
    public final void mo40034f(int i, String str) {
        C36226av avVar = new C36226av(this, i, str);
        C60870cx l = C60856cj.m92903l(C47810es.m84977q(avVar), this.f94638c);
        C36222ar arVar = new C36222ar();
        C60846c.m92878g(l, Throwable.class, C47810es.m84963c(arVar), this.f94638c);
    }

    /* renamed from: g */
    public final void mo40035g(String str, int i) {
        List list;
        if (!C58837ba.m90859h(str) && !str.equals("opa_proactive")) {
            StatusBarNotification[] activeNotifications = this.f94637b.getActiveNotifications();
            if (C58837ba.m90859h(str) || activeNotifications == null) {
                list = new ArrayList();
            } else {
                list = (List) DesugarArrays.stream((T[]) activeNotifications).filter(new C36223as(str)).filter(C36224at.f94631a).collect(Collectors.toCollection(C36225au.f94632a));
            }
            if (list.isEmpty() || (list.size() == 1 && ((StatusBarNotification) list.get(0)).getId() == i)) {
                C58976aa aaVar = C58975e.f156826a;
                mo40039k(C59294s.m92134d().mo56759a(str, Charset.forName("UTF-8")).mo56771a());
            }
        }
    }

    /* renamed from: h */
    public final boolean mo40036h() {
        return this.f94637b.areNotificationsEnabled();
    }

    /* renamed from: i */
    public final boolean mo40037i(String str) {
        NotificationChannelGroup notificationChannelGroup = this.f94637b.getNotificationChannelGroup(str);
        return notificationChannelGroup == null || !notificationChannelGroup.isBlocked();
    }

    /* renamed from: j */
    public final StatusBarNotification[] mo40038j() {
        return this.f94637b.getActiveNotifications();
    }

    /* renamed from: k */
    public final void mo40039k(int i) {
        this.f94637b.cancel("oc", i);
    }

    /* renamed from: l */
    public final void mo40040l(CharSequence charSequence) {
        this.f94637b.createNotificationChannelGroup(new NotificationChannelGroup("assistant_notification_channels", charSequence));
    }

    /* renamed from: m */
    public final boolean mo40041m(int i, Notification notification) {
        try {
            this.f94637b.notify("oc", i, notification);
            return true;
        } catch (SecurityException e) {
            C59104x c = f94636a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NTF.OpaNotificationMgr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(52243)).mo56386p("Failed to notify");
            return false;
        }
    }
}
