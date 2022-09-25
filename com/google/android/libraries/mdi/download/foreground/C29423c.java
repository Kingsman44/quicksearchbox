package com.google.android.libraries.mdi.download.foreground;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C1800aq;
import androidx.core.app.C1831r;
import androidx.core.app.C1839z;
import androidx.core.content.C1880f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p11029ao.p11030a.C147798a;

/* renamed from: com.google.android.libraries.mdi.download.foreground.c */
/* compiled from: PG */
public final class C29423c {
    /* renamed from: a */
    public static C1839z m54378a(Context context) {
        C1839z l = m54389l(context);
        l.f5685e = C1839z.m5037c(context.getResources().getString(R.string.mdd_foreground_service_notification_title));
        l.f5679J.icon = 17301629;
        return l;
    }

    /* renamed from: b */
    public static C1839z m54379b(Context context, int i, String str, String str2) {
        C1839z l = m54389l(context);
        l.f5685e = C1839z.m5037c(str);
        l.f5686f = C1839z.m5037c(str2);
        l.f5679J.icon = 17301633;
        l.mo5015d(2, true);
        l.mo5020i(i, 0, false);
        return l;
    }

    /* renamed from: c */
    public static String m54380c(Context context) {
        return context.getResources().getString(R.string.mdd_notification_download_failed);
    }

    /* renamed from: d */
    public static String m54381d(Context context) {
        return context.getResources().getString(R.string.mdd_notification_download_paused);
    }

    /* renamed from: e */
    public static String m54382e(Context context) {
        return context.getResources().getString(R.string.mdd_notification_download_paused_wifi);
    }

    /* renamed from: f */
    public static String m54383f(Context context) {
        return context.getResources().getString(R.string.mdd_notification_download_success);
    }

    /* renamed from: g */
    public static void m54384g(Context context, String str) {
        C1800aq aqVar = new C1800aq(context);
        aqVar.f5622a.cancel((String) null, str.hashCode());
    }

    /* renamed from: h */
    public static void m54385h(Context context, Class cls, String str, C1839z zVar, int i) {
        Intent intent = new Intent(context, cls);
        intent.setPackage(context.getPackageName());
        intent.putExtra("cancel-action", i);
        intent.putExtra("key", str);
        PendingIntent foregroundService = PendingIntent.getForegroundService(context, i, C147798a.m240896b(intent, 1140850688, 0), 1140850688);
        String string = context.getResources().getString(R.string.mdd_notification_action_cancel);
        foregroundService.getClass();
        zVar.mo5017f(new C1831r(17301642, string, foregroundService).mo5008a());
    }

    /* renamed from: i */
    public static void m54386i(Context context) {
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("download-notification-channel-id", context.getResources().getString(R.string.mdd_download_notification_channel_name), 3));
    }

    /* renamed from: j */
    public static void m54387j(Context context, Class cls, String str) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("key", str);
        C1880f.m5134a(context, intent);
    }

    /* renamed from: k */
    public static void m54388k(Context context, Class cls, String str) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("stop-service", true);
        intent.putExtra("key", str);
        C1880f.m5134a(context, intent);
    }

    /* renamed from: l */
    private static C1839z m54389l(Context context) {
        C1839z zVar = new C1839z(context, "download-notification-channel-id");
        zVar.f5705y = "service";
        zVar.mo5015d(8, true);
        return zVar;
    }
}
