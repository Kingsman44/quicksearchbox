package com.google.android.apps.gsa.shared.p6974ae;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.C1839z;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4534f.C59081b;

/* renamed from: com.google.android.apps.gsa.shared.ae.d */
/* compiled from: PG */
public final class C89095d {

    /* renamed from: a */
    private static final C59071e f241523a = C59071e.m91332i("com.google.android.apps.gsa.shared.ae.d");

    /* renamed from: a */
    public static C1839z m144923a(Context context, String str) {
        C1839z zVar = new C1839z(context, (String) null);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (str == null || "0".equals(str)) {
            C59081b.m91349a(C58979ad.FULL, "stack size");
            zVar.f5675F = m144924b(notificationManager, context, str);
        } else {
            if (notificationManager.getNotificationChannel(str) == null) {
                C59052c cVar = (C59052c) f241523a.mo56226d();
                cVar.mo56380ai(C58979ad.FULL);
                ((C59052c) cVar.mo56372aa(10772)).mo56389s("Received notification with un-created category [%s]", str);
                str = m144924b(notificationManager, context, str);
            }
            zVar.f5675F = str;
        }
        return zVar;
    }

    /* renamed from: b */
    static String m144924b(NotificationManager notificationManager, Context context, String str) {
        int i;
        if (str != null && notificationManager.getNotificationChannel(str) != null) {
            return str;
        }
        String num = Integer.toString(27);
        if (notificationManager.getNotificationChannel(num) == null) {
            String string = context.getResources().getString(R.string.miscellaneous_notification_channel);
            String string2 = context.getResources().getString(R.string.miscellaneous_notification_channel);
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string2);
            if (notificationChannel == null) {
                i = 2;
            } else {
                int importance = notificationChannel.getImportance();
                notificationManager.deleteNotificationChannel(string2);
                i = importance;
            }
            notificationManager.createNotificationChannel(new NotificationChannel(num, string, i));
        }
        return num;
    }
}
