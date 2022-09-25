package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import androidx.core.app.C1837x;
import androidx.core.app.C1839z;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.ar */
/* compiled from: PG */
public final class C96460ar {

    /* renamed from: a */
    public static final C96459aq f269854a = new C96459aq("Bisto_Min", R.string.notification_channel_headset_min, -2, 0, false);

    /* renamed from: b */
    public static final C96459aq f269855b = new C96459aq("Bisto_Low", R.string.notification_channel_headset_info, 0, 1, false);

    /* renamed from: c */
    public static final C96459aq f269856c = new C96459aq("Bisto_High", R.string.notification_channel_headset_important, 2, 2, true);

    /* renamed from: a */
    public static C1839z m159821a(Context context, C58833ax axVar) {
        String string = context.getString(R.string.foreground_notification_title);
        String string2 = context.getString(R.string.foreground_notification_text);
        if (axVar.mo56113h() && C124719q.GACS_DEVICE.equals(axVar.mo56107c())) {
            string2 = context.getString(R.string.foreground_notification_watch_text);
        }
        C1837x xVar = new C1837x();
        xVar.f5669a = C1839z.m5037c(string2);
        xVar.f5580f = C1839z.m5037c(string);
        C1839z c = m159823c(context, string, string2, f269854a, axVar);
        c.f5671B = 0;
        c.mo5022k(xVar);
        c.f5705y = "service";
        return c;
    }

    /* renamed from: b */
    public static C1839z m159822b(Context context, CharSequence charSequence, CharSequence charSequence2, C96459aq aqVar, C58833ax axVar) {
        C1839z c = m159823c(context, charSequence, charSequence2, aqVar, axVar);
        C1837x xVar = new C1837x();
        xVar.f5669a = C1839z.m5037c(charSequence2);
        c.mo5022k(xVar);
        c.f5688h = BitmapFactory.decodeResource(context.getResources(), R.drawable.logo_assistant_notifications_48);
        return c;
    }

    /* renamed from: c */
    private static C1839z m159823c(Context context, CharSequence charSequence, CharSequence charSequence2, C96459aq aqVar, C58833ax axVar) {
        int i = aqVar.f269852d;
        int i2 = i != 0 ? i != 1 ? 4 : 2 : 1;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel(aqVar.f269849a, context.getString(aqVar.f269850b), i2);
        notificationChannel.enableVibration(aqVar.f269853e);
        notificationChannel.enableLights(aqVar.f269853e);
        int i3 = 0;
        notificationChannel.setShowBadge(i2 > 1);
        notificationChannel.setImportance(i2);
        notificationChannel.setName(context.getString(aqVar.f269850b));
        notificationManager.createNotificationChannel(notificationChannel);
        C1839z zVar = new C1839z(context, aqVar.f269849a);
        boolean h = axVar.mo56113h();
        int i4 = R.drawable.quantum_ic_headset_black_24;
        if (h) {
            if (true == C124719q.CAR_ACCESSORY.equals(axVar.mo56107c())) {
                i4 = R.drawable.ic_herbie_grey;
            }
            if (C124719q.GACS_DEVICE.equals(axVar.mo56107c())) {
                i4 = R.drawable.quantum_ic_watch_black_24;
            }
        }
        zVar.f5685e = C1839z.m5037c(charSequence);
        zVar.f5686f = C1839z.m5037c(charSequence2);
        zVar.f5679J.icon = i4;
        zVar.f5670A = context.getResources().getColor(R.color.google_blue);
        zVar.f5690j = aqVar.f269851c;
        zVar.f5671B = 1;
        if (true == aqVar.f269853e) {
            i3 = -1;
        }
        zVar.mo5019h(i3);
        zVar.f5694n = C1839z.m5037c(context.getString(R.string.assistant_branding));
        return zVar;
    }
}
