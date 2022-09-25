package com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14077e;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14098z;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.d.a.ab */
/* compiled from: PG */
public final class C14160ab {

    /* renamed from: a */
    public static final C58485gu f42906a = C58485gu.m89850r("UNKNOWN", "ALL", "PRIORITY", "NONE", "ALARMS");

    /* renamed from: b */
    private static final C59071e f42907b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.d.a.ab");

    /* renamed from: a */
    public static void m30480a(Context context, C14077e eVar) {
        int i = eVar.f42733a;
        if ((i & 1) == 0 && (i & 2) == 0) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        if ((i & 2) != 0) {
            C14098z zVar = eVar.f42736d;
            if (zVar == null) {
                zVar = C14098z.f42765e;
            }
            m30484e(context, new NotificationManager.Policy(zVar.f42767a, zVar.f42768b, zVar.f42769c, zVar.f42770d));
        }
        if ((eVar.f42733a & 1) != 0) {
            m30483d(context, eVar.f42735c);
        }
    }

    /* renamed from: b */
    public static boolean m30481b(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            return notificationManager.isNotificationPolicyAccessGranted();
        }
        C59104x c = f42907b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.NotiAccessHelper");
        ((C59052c) ((C59052c) c).mo56372aa(45865)).mo56386p("#maybeSetNotificationPolicy: Failed to get system NotificationManager.");
        return false;
    }

    /* renamed from: c */
    public static boolean m30482c(Context context) {
        return C36619a.m65148d(context);
    }

    /* renamed from: d */
    public static boolean m30483d(Context context, int i) {
        if (!m30486g(i)) {
            C59104x d = f42907b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.NotiAccessHelper");
            ((C59052c) ((C59052c) d).mo56372aa(45869)).mo56387q("#maybeSetInterruptionFilter: Tried to set an invalid interruption filter (%d), aborting.", i);
            return false;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            C59104x c = f42907b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.NotiAccessHelper");
            ((C59052c) ((C59052c) c).mo56372aa(45868)).mo56386p("#maybeSetInterruptionFilter: Failed to get system NotificationManager.");
            return false;
        }
        int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
        C58976aa aaVar = C58975e.f156826a;
        C58485gu guVar = f42906a;
        guVar.get(currentInterruptionFilter);
        guVar.get(i);
        if (!m30481b(context)) {
            C59104x d2 = f42907b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.NotiAccessHelper");
            ((C59052c) ((C59052c) d2).mo56372aa(45867)).mo56386p("#maybeSetInterruptionFilter: Notification Policy Access NOT granted!");
            return false;
        }
        notificationManager.setInterruptionFilter(i);
        return true;
    }

    /* renamed from: e */
    public static boolean m30484e(Context context, NotificationManager.Policy policy) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            C59104x c = f42907b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.NotiAccessHelper");
            ((C59052c) ((C59052c) c).mo56372aa(45871)).mo56386p("#maybeSetNotificationPolicy: Failed to get system NotificationManager.");
            return false;
        } else if (!m30481b(context)) {
            C59104x d = f42907b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.NotiAccessHelper");
            ((C59052c) ((C59052c) d).mo56372aa(45870)).mo56386p("#maybeSetNotificationPolicy: Notification Policy Access NOT granted!");
            return false;
        } else {
            notificationManager.setNotificationPolicy(policy);
            return true;
        }
    }

    /* renamed from: f */
    public static boolean m30485f(Context context) {
        int i;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            i = -1;
        } else {
            i = notificationManager.getCurrentInterruptionFilter();
        }
        return i == 3 || i == 4;
    }

    /* renamed from: g */
    public static boolean m30486g(int i) {
        return i > 0 && i < ((C58724pq) f42906a).f156474d;
    }
}
